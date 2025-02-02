package rocks.zipcode.assessment2.objectorientation;

import java.util.concurrent.Delayed;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private  String addressLine1;
    private  String addressLine2;
    private  String city;
    private  String state;
    private  String zipcode;

    public Address() {
        addressLine2 = "818 woodlawn ave";
        addressLine1 = "34 Arden ave";
        city = "Wilmington";
        state = "Delaware";
        zipcode = "19720";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public String toString()
    {
        return addressLine1 + ": " + addressLine2 +"," + city + ", " + state + " " + zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        Address check = (Address)o;
        return addressLine1.equals(check.addressLine1)
                && addressLine2.equals(check.addressLine2)
                && city.equals(check.city)
                && state.equals(check.state)
                && zipcode.equals(check.zipcode);
    }
}
