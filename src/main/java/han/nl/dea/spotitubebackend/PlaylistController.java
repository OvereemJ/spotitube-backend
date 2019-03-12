package han.nl.dea.spotitubebackend;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;


@Path("/playlists")
public class PlaylistController {
    //private static Map<TokenDTO, UserDTO> loginMap = new HashMap<>();

    public PlaylistController(){

    }


    @GET
    @Produces(MediaType.APPLICATION_JSON);
    public Response getPlayList(@QueryParam("token") TokenDTO token){
        if(token.getToken().equals("1234-1234-1234")){
            return Response.ok(token).build();
        } else {
            return null;
        }

    }

}
