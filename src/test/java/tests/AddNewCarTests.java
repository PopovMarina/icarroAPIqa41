package tests;

import org.testng.annotations.Test;

import java.util.Optional;

public class AddNewCarTests extends BaseTests{
    @Test
    public void test() {
        System.out.println(Optional.ofNullable(carsAPI.getAllCities().path("cities")));

    }
}
