package han.nl.dea.spotitubebackend;


import han.nl.dea.spotitubebackend.dto.ErrorDTO;
import han.nl.dea.spotitubebackend.dto.TokenDTO;
import han.nl.dea.spotitubebackend.dto.UserDTO;
import han.nl.dea.spotitubebackend.resources.LoginController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;
import javax.ws.rs.core.Response;

public class LoginControllerTest {
    private LoginController sut;

    @BeforeEach
    void setUp(){
        sut = new LoginController();
    }


    @Test
    void loginSucces(){
        UserDTO userDTO = new UserDTO("Jorrit", "MyPass!23");
        Response actualResult = sut.loginUser(userDTO);
        assertEquals(Response.Status.OK.getStatusCode(), actualResult.getStatus());

        TokenDTO tokenDTO = (TokenDTO) actualResult.getEntity();
        assertEquals("Jorrit Overeem",  tokenDTO.getUser());
        assertEquals("1234-1234-1234", tokenDTO.getToken());

    }

    @Test
    void loginFailure(){
        UserDTO userDTO = new UserDTO("Jorit", "MyPass!23");
        Response actualResult = sut.loginUser(userDTO);
        assertEquals(Response.Status.UNAUTHORIZED.getStatusCode(), actualResult.getStatus());

        ErrorDTO errorDTO = (ErrorDTO) actualResult.getEntity();
        assertEquals("Login failed for user" + userDTO.getUsername(), errorDTO.getMessage());
    }
}
