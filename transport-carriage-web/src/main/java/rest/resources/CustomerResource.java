package rest.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import services.customer.CustomerService;
import view.CustomerView;


/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */
@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerService customerServiceImpl;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getHello() {
        return "Ping rest";
    }

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public void registry(
            @RequestParam("dao/customer") CustomerView customerView) {
        customerServiceImpl.insertCustomer(customerView);
    }

    @RequestMapping(value = "/find-by-mail", method = RequestMethod.GET)
    public CustomerView getCustomerByMail(
            @RequestParam(value = "mail") String mail) {
        return customerServiceImpl.getCustomerByMail(mail);
    }

}
