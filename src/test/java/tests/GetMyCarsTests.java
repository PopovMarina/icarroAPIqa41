package tests;

import dto.AllCarsDTO;
import dto.CarsDetailsDTO;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class GetMyCarsTests extends BaseTests {
    public void getMyCars() {
        Response response = carsAPI.getAllMyCars(token);
        AllCarsDTO allCarsDTO = response.as(AllCarsDTO.class);
        List<CarsDetailsDTO> detailsList = allCarsDTO.getCars();
        System.out.println("i have: " + detailsList.size() + " cars");
        if(!detailsList.isEmpty()) {
            System.out.println("ser number: " + detailsList.get(0).getSerialNumber());
          // System.out.println((detailsList.get(0).getBookedPeroids().get(0).getEmail()));
        }
    }
}
