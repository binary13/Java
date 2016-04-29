package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by justin on 4/27/16.
 */
public class Theatre {
    public final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows-1);

        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum<=seatsPerRow; seatNum++) {
                Seat seat = new Seat(row+String.format("%02d", seatNum));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public void printReserved() {
        boolean isEmpty = true;
        System.out.println("The following seats are RESERVED: ");
        for(Seat seat : seats) {
            if(seat.reserved) {
                System.out.println(seat.getSeatNumber());
                isEmpty = false;
            }
        }
        if(isEmpty) {
            System.out.println("*** NONE ***");
        }
    }

    public void printAvailable() {
        boolean isEmpty = true;
        System.out.println("The following seats are AVAILABLE: ");
        for(Seat seat:seats) {
            if(!seat.reserved) {
                System.out.println(seat.getSeatNumber());
                isEmpty = false;
            }
        }
        if(isEmpty) {
            System.out.println("*** NONE ***");
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public boolean cancelSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).cancel();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    private class Seat  implements Comparable<Seat> {
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber()
        {
            return seatNumber;
        }

        public boolean reserve() {
            if(!reserved) {
                reserved = true;
                System.out.println("Seat " + this.getSeatNumber() + " reserved successfully.");
                return reserved;
            } else {
                System.out.println("Sorry, seat " + this.getSeatNumber() + " is already taken.");
                return false;
            }
        }

        public boolean cancel() {
            if(reserved) {
                reserved = false;
                System.out.println("Reservation for seat " + this.getSeatNumber() + " cancelled.");
                return true;
            } else {
                System.out.println("Seat " + this.getSeatNumber() + " is not reserved.");
                return false;
            }
        }
    }
}
