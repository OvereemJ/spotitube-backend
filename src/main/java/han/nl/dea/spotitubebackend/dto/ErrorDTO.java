package han.nl.dea.spotitubebackend.dto;

public class ErrorDTO {
    private String message;

    public ErrorDTO(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
