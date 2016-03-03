package rest.config;

import rest.resources.TryRest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */
@ApplicationPath("/rest")
public class ApplicationRestConfig extends Application {

    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(
                TryRest.class
        ));
    }

}
