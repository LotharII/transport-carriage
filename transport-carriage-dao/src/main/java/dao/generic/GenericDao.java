package dao.generic;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public interface GenericDao<T> {

    void persist(T entity);

    T findById(String id);

    void update(T entity);

    void deleteById(String id);


}
