package test.CollectionTest.map.test;

public class WebSiteUser {
    private String email;
    private String firstName;
    private String lastName;
    private String phone;

    public WebSiteUser(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
