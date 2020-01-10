package BMA.src.com.planittesting.gui;

public class Address {

    // Variables declaration
    private String streetName;
    private String streetAddress;
    private String city;
    private String state;
    private String postcode;

    //Getters and Setters
    public String getstreetName() {
        return streetName;
    }
    public void setName(String name) {
        this.streetName = name;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;}

    public String Fulladdress() {
        return getstreetName() + getStreetAddress() + getCity() + getState() + getPostcode();
    }

}







