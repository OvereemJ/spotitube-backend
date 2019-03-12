package han.nl.dea.spotitubebackend;

import java.util.List;

public class PlaylistsDTO {
    private List<PlaylistDTO> playlists;
    private int lengthInSeconds;

    public PlaylistsDTO() {

    }

    public PlaylistsDTO(List<PlaylistDTO> playlists, int lengthInSeconds) {
        this.playlists = playlists;
        this.lengthInSeconds = lengthInSeconds;
    }

    public List<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
}
