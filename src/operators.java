/**
 * Created by justin on 2/4/2016.
 */
public class operators {

    public static void main(String args[]){
        double fstdoub = 20;
        double secdoub = 80;
        double result = (fstdoub + secdoub) * 25;
        double remainder = result % 40;

        if (remainder <= 20)
            System.out.print("Total was over the limit.");
    }
}
