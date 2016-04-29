package collections;

/**
 * Created by justin on 4/27/16.
 */
public class Main
{
    public static void main(String[] args)
    {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        theatre.printAvailable();

        theatre.reserveSeat("H11");
        theatre.reserveSeat("Z24");

        theatre.printReserved();

        theatre.cancelSeat("H11");
        theatre.cancelSeat("A01");

        theatre.printReserved();


    }
}
