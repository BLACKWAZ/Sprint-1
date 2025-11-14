package com.libraryofstuff;


public class Tool extends Item {
    private String material;
    private double weight;

    
    public Tool(String id, String name, String description, String location, 
                String material, double weight) {
        super(id, name, description, "Tool", location);
        this.material = material;
        this.weight = weight;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void printDetails() {
        System.out.println("========================================");
        System.out.println("Item ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Location: " + getLocation());
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Status: " + (isBorrowed() ? "Borrowed" : "Available"));
        System.out.println("========================================");
    }
}