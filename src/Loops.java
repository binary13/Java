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

        primesInRange(10, 50);
        evensInRange(10, 50);

    }

    public static double calcInterest(double balance, double rate) {
        return (balance * (rate/100));
    }

    public static boolean isPrime(int n) {

        if(n==1) return false;

        for(int i=2; i<=n/2; i++) {
            if(n%i==0) return false;
        }

        return true;
    }

    public static int primesInRange(int lower, int upper) {
        int primesCount = 0;

        for(int i = lower; i<=upper; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime.");
                primesCount++;
            }
            //if(primesCount >= 3) break;
        }

        System.out.println(String.format("There are %d prime numbers between %d and %d.", primesCount, lower, upper));

        return primesCount;
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static int evensInRange(int lower, int upper) {

        int count = 0;
        int i = lower;
        do {
            if (isEven(i)) {
                System.out.println(i + " is even.");
                count++;
            }
            i++;
        } while (i<=upper);

        System.out.println(String.format("There are %d even numbers between %d and %d.", count, lower, upper));

        return count;
    }


}


