package com.eclectics.farmEasepro.farmers;

public class Farmer {
    private Long id;

    private String firstName;

    private String lastName;



    private String email;

    private int  phoneNumber;


//    constructor class


    public Farmer(Long id, String firstName, String lastName, String email, int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    to_string

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}


