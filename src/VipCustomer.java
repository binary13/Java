import org.omg.CORBA.Object;

/**
 * Created by justin on 2/11/2016.
 */
public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default_email@mail.com:");
    }

    public VipCustomer(String name) {
        this(name, 10_000, "default_email@mail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
