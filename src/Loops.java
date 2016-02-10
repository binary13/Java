/**
 * Created by justin on 2/10/2016.
 */
public class Loops {

    public static void main(String[] args) {

//        for(int i=2; i<=8; i++){
//            String result = String.format("$10,000 at %d%% interest = $%.2f", i, calcInterest(10000, i));
//            System.out.println(result);
//        }

        for(int i=8; i>=2; i--){
            System.out.println(String.format("$10,000 at %d%% interest = $%.2f", i, calcInterest(10000, i)));
        }
    }

    public static double calcInterest(double balance, double rate) {
        return (balance * (rate/100));
    }
}
