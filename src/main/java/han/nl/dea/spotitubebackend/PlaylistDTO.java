package han.nl.dea.spotitubebackend;

import java.util.ArrayList;
import java.util.List;

public class PlaylistDTO {
    private int id;
    private String name;
    private Boolean owner;
    private List<TrackDTO> tracks;

    public PlaylistDTO() {
    }

    public PlaylistDTO(int id, String name, Boolean owner, List<TrackDTO> tracks) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.tracks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public List<TrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackDTO> tracks) {
        this.tracks = tracks;
    }
}

