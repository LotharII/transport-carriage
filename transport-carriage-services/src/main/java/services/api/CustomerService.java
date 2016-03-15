package services.api;

import model.Customer;
import view.CustomerView;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public interface CustomerService {

    void insertCustomer(CustomerView customer);


    CustomerView getCustomerByMail(String email);
}
