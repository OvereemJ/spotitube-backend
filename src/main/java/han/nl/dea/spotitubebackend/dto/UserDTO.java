package han.nl.dea.spotitubebackend.dto;

public class UserDTO {

    private String user;
    private String password;

    public UserDTO(){

    }

    public UserDTO(String username, String password){
        this.user = username;
        this.password = password;
    }

    public String getUsername() {
        return user;
    }

    public void setUsername(String username) {
        this.user = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
