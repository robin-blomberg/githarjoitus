package fi.academy.Main;

public class Person {
    String address;
    String city;
    Integer postcode;

    public Person() {
    }

    public Person(String address, String city, Integer postcode) {
        this.address = address;
        this.city = city;
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + postcode + '\'' +
                '}';
    }
}