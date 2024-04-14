package dto;

import java.util.List;

public class AllCarsDTO {
    List<CarsDetailsDTO> cars;

    public AllCarsDTO() {
    }

    public AllCarsDTO(List<CarsDetailsDTO> cars) {
        this.cars = cars;
    }

    public List<CarsDetailsDTO> getCars() {
        return cars;
    }

    public void setCars(List<CarsDetailsDTO> cars) {
        this.cars = cars;
    }

}

/*
{
  "cars": [
    {
      "serialNumber": "string",
      "manufacture": "string",
      "model": "string",
      "year": "string",
      "fuel": "string",
      "seats": 0,
      "carClass": "string",
      "pricePerDay": 0,
      "about": "string",
      "city": "string",
      "lat": 0,
      "lng": 0,
      "image": "string",
      "owner": "string",
      "bookedPeriods": [
        {
          "email": "string",
          "startDate": "2024-04-14",
          "endDate": "2024-04-14"
        }
      ]
    }
  ]
}
No links
400
Bad Request


 */