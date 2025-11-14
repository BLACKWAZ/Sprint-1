package com.libraryofstuff;


public class Item {
    private String id;
    private String name;
    private String description;
    private String category;
    private String location;
    private boolean isBorrowed;

   
    public Item(String id, String name, String description, String category, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.location = location;
        this.isBorrowed = false;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Marks the item as borrowed.
     */
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Item '" + name + "' has been borrowed successfully.");
        } else {
            System.out.println("Item '" + name + "' is already borrowed.");
        }
    }

    /**
     * Marks the item as returned and available for borrowing.
     */
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Item '" + name + "' has been returned successfully.");
        } else {
            System.out.println("Item '" + name + "' was not borrowed.");
        }
    }

    /**
     * Prints the details of the item in a user-friendly format.
     */
    public void printDetails() {
        System.out.println("========================================");
        System.out.println("Item ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Location: " + location);
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
        System.out.println("========================================");
    }
}