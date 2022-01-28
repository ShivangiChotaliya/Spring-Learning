/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

/**
 *
 * @author Shivangi
 */
public class User {
    private String fullName;
    private String email;
    private String address;
    private String phoneNumber;

    public User(){
        super();
    }
    public User(String fullName, String email, String address, String phoneNumber) {
        super();
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" + "fullName=" + fullName + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    
       // return "---->>" + fullName;
    }
    
}
