package com.eclectics.farmEasepro.farmers;

public class Farmer {
    private Long id;

    private String firstName;

    private String lastName;



    private String email;

    private String phoneNumber;




    // toString method
    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +

                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
//constructor class


