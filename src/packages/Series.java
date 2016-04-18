package packages;

/**
 * Created by justin on 4/17/2016.
 */
public class Series {
    public static int nSum(int n) {
        int result = 0;
        for(int i = 0; i<=n; i++) {
            result += i;
        }
        return result;
    }

    public static int factorial(int n) {
        if(n==0) return 0;
        int result = 1;
        for(int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if(n==1) return 1;
        int a=0, b=1, c = 1;
        for(int count = 1; count<n; count++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibRecursive(int n) {
        if(n==1 || n==2) return 1;
        return fibRecursive(n-1) + fibRecursive(n-2);
    }

}
