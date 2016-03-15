package converter.service;

import converter.api.Converter;
import model.Customer;
import org.springframework.stereotype.Service;
import view.CustomerView;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
@Service
public class CustomerConverter implements Converter<CustomerView, Customer> {

    public CustomerView convertModelToView(Customer model) {

        CustomerView customerView = new CustomerView();
        customerView.setEmail(model.getEmail());
        customerView.setCustomerID(model.getCustomerID());
        customerView.setName(model.getName());
        return customerView;
    }

    public Customer convertViewToModel(CustomerView customerView){
        Customer customer = new Customer();
        customer.setName(customerView.getName());
        customer.setEmail(customerView.getEmail());
        return customer;
    }
}
