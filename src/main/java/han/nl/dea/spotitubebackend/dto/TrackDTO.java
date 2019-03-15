package han.nl.dea.spotitubebackend.dto;

public class TrackDTO {
    private int number;
    private String name;

    public TrackDTO() {
    }

    public TrackDTO(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
