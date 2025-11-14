package com.libraryofstuff;


public class Appliance extends Item {
    private String brand;
    private double powerConsumption;

    
    public Appliance(String id, String name, String description, String location,
                    String brand, double powerConsumption) {
        super(id, name, description, "Appliance", location);
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

   
    @Override
    public void printDetails() {
        System.out.println("========================================");
        System.out.println("Item ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Location: " + getLocation());
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption + "W");
        System.out.println("Status: " + (isBorrowed() ? "Borrowed" : "Available"));
        System.out.println("========================================");
    }
}