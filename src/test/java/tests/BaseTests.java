package tests;

import api.CarsAPI;
import api.UserAPI;
import dto.UserDTO;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;

public class BaseTests {

    UserAPI userAPI = new UserAPI();
    CarsAPI carsAPI = new CarsAPI();


    UserDTO user = new UserDTO()
            .withUsername("p744@gmail.com")
            .withPassword("Aa12345$");

    String token = "";

    @BeforeSuite
    public void getToken() {

        Response response = userAPI.getResponceLoginUser(user);
        System.out.println(response.getStatusCode());
        token = userAPI.getTokenFromResponse(response);
        System.out.println(token);
    }


    /*

     */
}
