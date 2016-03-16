package dao.customer;

import dao.generic.GenericDao;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public interface CustomerDao extends GenericDao<Customer> {

    Customer findByEmail(String email);
}
