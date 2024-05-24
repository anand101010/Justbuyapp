package com.justbuy.DTO;

public class UserDto {
    private long user_id;
    private String city;
    private String state;
    private String username;
    private String country;
    private int  pincode;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public UserDto(long user_id, String city, String state, String username, String country, int pincode) {
        this.user_id = user_id;
        this.city = city;
        this.state = state;
        this.username = username;
        this.country = country;
        this.pincode = pincode;
    }
}
