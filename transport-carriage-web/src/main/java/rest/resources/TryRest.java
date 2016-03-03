package rest.resources;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;
import services.TrySpring;
import services.config.SpringConfig;

/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */
@Path("/try")
public class TryRest {

    @Autowired
    private TrySpring trySpring;

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "TryRest hello" + trySpring.getMessage();
    }
}
