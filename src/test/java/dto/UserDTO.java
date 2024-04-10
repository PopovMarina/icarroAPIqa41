package dto;

public class UserDTO {

    String username;
    String password;
    String firstName;
    String lastName;

    public UserDTO() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserDTO withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDTO withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDTO withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /*
"username": "pilgrim7474@gmail.com",
  "password": "L3<c%xu<RKDS>S5//r:]J[OQneOm<4S)9c=Uz2OM~ E, {",
  "firstName": "string",
  "lastName": "string"
}

             */
}
