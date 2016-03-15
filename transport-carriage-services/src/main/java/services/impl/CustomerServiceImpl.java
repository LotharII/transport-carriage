package services.impl;

import converter.service.CustomerConverter;
import dao.api.CustomerDao;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.api.CustomerService;
import view.CustomerView;

/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerConverter customerConverter;

    public void insertCustomer(CustomerView customer){
        customerDao.persist(customerConverter.convertViewToModel(customer));
    }

    public CustomerView getCustomerByMail(String email){
        return customerConverter.convertModelToView(customerDao.findByEmail(email));
    }
}
