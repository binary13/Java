/**
 * Created by justin on 2/9/2016.
 */
public class SwitchCase {

    public static void main(String[] args) {
        char myChar = 'A';

        switch(myChar) {
            case 'A':
                System.out.println("MyChar is 'A'.");
                break;
            case 'B':
                System.out.println("MyChar is 'B'.");
                break;
            case 'C':
                System.out.println("MyChar is 'C'.");
                break;
            case 'D':
                System.out.println("MyChar is 'D'.");
                break;
            case 'E':
                System.out.println("MyChar is 'E'.");
                break;
            default:
                System.out.println("Not Found!");
        }
    }
}
