package han.nl.dea.spotitubebackend.dto;

import han.nl.dea.spotitubebackend.dto.PlaylistDTO;

import java.util.List;

public class PlaylistsDTO {
    private List<PlaylistDTO> playlists;
    private long length;

    public PlaylistsDTO() {

    }

    public PlaylistsDTO(List<PlaylistDTO> playlists, long length) {
        this.playlists = playlists;
        this.length = length;
    }

    public List<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public long getLengthInSeconds() {
        return length;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.length = lengthInSeconds;
    }
}
