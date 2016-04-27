package collections;

import java.util.ArrayList;
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

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    private class Seat {
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber()
        {
            return seatNumber;
        }

        public boolean reserve() {
            if(!reserved) {
                reserved = true;
                System.out.println("Seat " + this.getSeatNumber() + " reserved.");
                return reserved;
            } else {
                System.out.println("Seat " + this.getSeatNumber() + " is already reserved.");
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
