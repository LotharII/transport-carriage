package rest.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import services.TrySpring;


/**
 * Created by oleksii.khilkevych on 3/2/2016.
 */
@Controller
public class TryRest {

    @Autowired
    private TrySpring trySpring;

    @RequestMapping(value = "/try", method = RequestMethod.GET)
    public @ResponseBody
    String getHello() {
        return "TryRest hello" + trySpring.getMessage();
    }

}
