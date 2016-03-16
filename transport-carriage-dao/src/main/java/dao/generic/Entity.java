package dao.generic;

import org.springframework.data.annotation.Id;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
public abstract class Entity {

    @Id
    protected String id;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }
}
