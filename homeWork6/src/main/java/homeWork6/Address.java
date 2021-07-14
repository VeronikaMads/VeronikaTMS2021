package homeWork6;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
//
//    public Address(String cityCityzens, String countryCityzens) {
//        this.city = cityCityzens;
//        this.country = countryCityzens;
//    }

    public String getCity() {
        return city;
    }

//    public void setCity(String city) {
//        this.city = city;
//    }

    public String getCountry() {
        return country;
    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
