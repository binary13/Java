/**
 * Created by justin on 1/14/2016.
 */
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        byte mybyte = 12;
        short shortvar = 462;
        int myint = -29;
        long my_long_val = 50000L + 10 * (mybyte + shortvar + myint);

        System.out.println("My long value is " + my_long_val);
    }
}
