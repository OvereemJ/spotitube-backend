package han.nl.dea.spotitubebackend;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("login")
public class LoginController {

    private static Map<TokenDTO, UserDTO> loginMap = new HashMap<>();

    public LoginController (){

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUser(UserDTO user){
        return Response.ok(new TokenDTO("123-123-123", "Jorrit Overeem")).build();
    }
}
