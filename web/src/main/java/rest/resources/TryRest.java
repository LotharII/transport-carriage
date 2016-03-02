package rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */
@Path("/try")
public class TryRest {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "TryRest hello";
    }
}
