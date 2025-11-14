package com.libraryofstuff;


public class ElectronicDevice extends Item {
    private String powerSource;
    private int voltage;

   
    public ElectronicDevice(String id, String name, String description, String location,
                           String powerSource, int voltage) {
        super(id, name, description, "Electronic Device", location);
        this.powerSource = powerSource;
        this.voltage = voltage;
    }

    // Getters
    public String getPowerSource() {
        return powerSource;
    }

    public int getVoltage() {
        return voltage;
    }

    // Setters
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    
    @Override
    public void printDetails() {
        System.out.println("========================================");
        System.out.println("Item ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Location: " + getLocation());
        System.out.println("Power Source: " + powerSource);
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Status: " + (isBorrowed() ? "Borrowed" : "Available"));
        System.out.println("========================================");
    }
}