package han.nl.dea.spotitubebackend;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("login")
public class LoginController {

    private static Map<String, User> loginMap = new HashMap<>();

    public LoginController (){

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response LoginUser(User user){
        loginMap.put(user.generateToken(user.getUsername(), user.getPassword()), user);
        Response.ok(user).build();
        return null;
    }
}
