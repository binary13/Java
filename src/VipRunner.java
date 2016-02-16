import java.util.ArrayList;

/**
 * Created by justin on 2/11/2016.
 */
public class VipRunner {
    
    public static void main (String[] args) {
        VipCustomer person1 = new VipCustomer("Bob");
        VipCustomer person2 = new VipCustomer("Tom", 150_000);
        VipCustomer person3 = new VipCustomer("Evan Blainowkowitz", 3_000_000, "blain@mail.com");

        VipCustomer[] myArr = {person1, person2, person3};

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(String.format("Person %d Name: %s, Credit limit: %d, Email address: %s.",
                    i+1, myArr[i].getName(), myArr[i].getCreditLimit(), myArr[i].getEmail()));
        }
        

    }
}
