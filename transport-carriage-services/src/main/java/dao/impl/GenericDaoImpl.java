package dao.impl;

import dao.api.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
@Service
public abstract class GenericDaoImpl<T> implements GenericDao<T> {


    @Autowired
    private MongoOperations mongoTemplate;

    public void persist(T entity) {
        mongoTemplate.insert(entity);
    }

    public T findById(String id) {
        return mongoTemplate.findById(id, getEntityClass());
    }

    public void update(T entity) {
       mongoTemplate.save(entity);
    }

    public void deleteById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, getEntityClass());
    }

    protected final Class<T> getEntityClass() {
        Class clazz = getClass();
        do {
            if (clazz.getGenericSuperclass() instanceof ParameterizedType) {
                return (Class<T>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];
            } else {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
        return null;
    }

    public MongoOperations getMongoTemplate(){
        return mongoTemplate;
    }
}
