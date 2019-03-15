package han.nl.dea.spotitubebackend.resources;

import han.nl.dea.spotitubebackend.dto.PlaylistDTO;
import han.nl.dea.spotitubebackend.dto.PlaylistsDTO;
import han.nl.dea.spotitubebackend.dto.TrackDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("playlists")
public class PlaylistsController {
    private static List<PlaylistDTO> playlist = new ArrayList<>();
    private static List<TrackDTO> tracklist = new ArrayList<>();
    private static Map<PlaylistsDTO, String> playlistsMap = new HashMap<>();

    public PlaylistsController() {
        playlist.add(new PlaylistDTO(1, "Death Metal", true, tracklist));
        playlist.add(new PlaylistDTO(2, "Pop", true, tracklist));
        playlistsMap.put(new PlaylistsDTO(playlist, 123445), "1");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlaylists(){
            return Response.ok(playlistsMap.values()).build();
    }
}
