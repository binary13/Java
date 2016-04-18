package packages;

/**
 * Created by justin on 4/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Cumulative sums of numbers 0 up to 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ": " + Series.nSum(i));
        }

        System.out.println("\nFactorials for numbers 0 through 10:");
        for(int i=0; i<=10; i++) {
            System.out.println(i + ": " + Series.factorial(i));
        }

        System.out.println("\nFibonacci numbers 1 - 20: ");
        for(int i = 1; i<= 20; i++){
            System.out.println(i + ": " + Series.fibonacci(i));
        }

        System.out.println("\nFibonacci numbers 1 - 20: ");
        for(int i = 1; i<= 20; i++){
            System.out.println(i + ": " + Series.fibRecursive(i));
        }
    }
}

