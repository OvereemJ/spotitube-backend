package han.nl.dea.spotitubebackend;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/login")
public class LoginController {

    private static Map<TokenDTO, UserDTO> loginMap = new HashMap<>();

    public LoginController (){

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUser(UserDTO user){
        if(user.getUsername().equals("Jorrit") && user.getPassword().equals("MyPass!23")){
            //        return Response.status(200)
//                .header("Access-Control-Allow-Origin","*")
//                .header("Access-Control-Allow-Credentials","true")
//                .header("Access-Control-Allow-Headers","origin,content-type,accept,authorization")
//                .header("Access-Control-Allow-Methods","GET,POST,DELETE,OPTIONS,HEAD")
//                .entity(new TokenDTO("123-123-123", "Jorrit Overeem"))
//                .build();

            return Response.ok(new TokenDTO("1234-1234-1234", "Meron Brouwer")).build();
        } else{
            return null;
        }
    }


}
