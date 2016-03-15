package view;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public class CustomerView implements View {

    private String customerID;

    private String name;

    private String email;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
