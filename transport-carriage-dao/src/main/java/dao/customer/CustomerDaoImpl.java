package dao.customer;

import dao.generic.GenericDaoImpl;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
@Service
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao {

    public Customer findByEmail(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where(CustomerConstants.EMAIL_QUERY_FIELD).is(email));
        return getMongoTemplate().findOne(query, getEntityClass());
    }
}
