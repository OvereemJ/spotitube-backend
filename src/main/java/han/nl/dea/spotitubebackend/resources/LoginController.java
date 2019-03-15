package han.nl.dea.spotitubebackend.resources;

import han.nl.dea.spotitubebackend.dto.ErrorDTO;
import han.nl.dea.spotitubebackend.dto.TokenDTO;
import han.nl.dea.spotitubebackend.dto.UserDTO;
//import han.nl.dea.spotitubebackend.persistence.UserDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("login")
public class LoginController {

    //private UserDAO authorizedUser = new UserDAO();
    private Map<String, UserDTO> userDTOMap = new HashMap<>();
    public LoginController (){
        userDTOMap.put("Jorrit", new UserDTO("Jorrit", ""));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUser(UserDTO user){

        if(user.getUsername().equals("Jorrit") && user.getPassword().equals("MyPass!23") ){
            return Response.ok(new TokenDTO("1234-1234-1234", "Jorrit Overeem")).build();
        } else{
            return Response.status(Response.Status.UNAUTHORIZED)
                    .entity(new ErrorDTO("Login failed for user" + user.getUsername()))
                    .build();
        }

    }


}
