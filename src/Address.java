/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin-jiahie
 */
public class Address {
 private String street;
    private String city;
    private String state;
    private int posCode;
    private String country;

    public Address(String street, String city, String state, int posCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.posCode = posCode;
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPosCode(int posCode) {
        this.posCode = posCode;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public int getPosCode() {
        return posCode;
    }
    public String getCountry() {
        return country;
    }
    
}
