package services.customer;

import dao.customer.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.customer.CustomerService;
import view.CustomerView;

/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    public void insertCustomer(CustomerView customer){
        customerDao.persist(customer.convertViewToModel());
    }

    public CustomerView getCustomerByMail(String email){
        return new CustomerView(customerDao.findByEmail(email));
    }
}
