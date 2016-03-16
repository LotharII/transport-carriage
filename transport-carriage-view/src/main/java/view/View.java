package view;

import dao.generic.Entity;

import java.io.Serializable;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public abstract class View implements Serializable {


    protected String id;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

}
