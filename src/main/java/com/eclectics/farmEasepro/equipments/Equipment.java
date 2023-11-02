package com.eclectics.farmEasepro.equipments;

public class Equipment {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int availability;

//    constructor


    public Equipment(Long id, String name, String description, double price, int availability) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }
}
