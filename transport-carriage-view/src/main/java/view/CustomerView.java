package view;

import dao.customer.Customer;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public class CustomerView extends View {

    private String name;

    private String email;

    private String password;

    private String lastName;

    public CustomerView(Customer customer) {
        this.password = customer.getPassword();
        this.lastName = customer.getLastName();
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer convertViewToModel(){
        Customer customer = new Customer();
        customer.setLastName(this.lastName);
        customer.setPassword(this.password);
        customer.setName(this.name);
        customer.setEmail(this.email);
        customer.setId(this.id);
        return customer;
    }
}
