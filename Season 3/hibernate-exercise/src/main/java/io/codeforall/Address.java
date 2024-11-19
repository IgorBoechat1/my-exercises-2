package io.codeforall;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;

    @Embeddable
public class Address {

    @Id
    private Integer zipcode;
    @Embedded
    private String street;
    private String city;
    private String state;

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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
}
