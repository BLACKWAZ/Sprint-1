package com.libraryofstuff;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    
    public static void main(String[] args) {
        
        List<Item> libraryItems = new ArrayList<>();
        
        // Create at least 3 objects of different types
        
        // Create Tool objects
        Tool hammer = new Tool(
            "T001",
            "Claw Hammer",
            "A versatile hammer for general carpentry work",
            "Workshop",
            "Steel and Wood",
            0.5
        );
        
        Tool drill = new Tool(
            "T002",
            "Electric Drill",
            "Cordless power drill with multiple speed settings",
            "Workshop",
            "Metal and Plastic",
            1.2
        );
        
        // Create ElectronicDevice objects
        ElectronicDevice phoneCharger = new ElectronicDevice(
            "E001",
            "USB-C Phone Charger",
            "Fast charging USB-C charger compatible with most smartphones",
            "Out and About",
            "Mains",
            240
        );
        
        ElectronicDevice bicyclePump = new ElectronicDevice(
            "E002",
            "Electric Bicycle Pump",
            "Portable electric pump for bicycle tires with pressure gauge",
            "Garden",
            "Battery",
            12
        );
        
        // Create Appliance objects
        Appliance sewingMachine = new Appliance(
            "A001",
            "Sewing Machine",
            "Computerized sewing machine with multiple stitch patterns",
            "Kitchen",
            "Singer",
            85.0
        );
        
        Appliance coffeeMaker = new Appliance(
            "A002",
            "Coffee Maker",
            "Automatic drip coffee maker with programmable timer",
            "Kitchen",
            "Breville",
            1200.0
        );
        
        // Add all items to the list
        libraryItems.add(hammer);
        libraryItems.add(drill);
        libraryItems.add(phoneCharger);
        libraryItems.add(bicyclePump);
        libraryItems.add(sewingMachine);
        libraryItems.add(coffeeMaker);
        
        // welcome message
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   WELCOME TO LIBRARYOFSTUFF SYSTEM   ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // user-friendly listing of all objects
        System.out.println("Available Items in the Library:\n");
        
        for (int i = 0; i < libraryItems.size(); i++) {
            System.out.println("Item " + (i + 1) + ":");
            libraryItems.get(i).printDetails();
            System.out.println();
        }
        
        // borrowing functionality
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║     DEMONSTRATING BORROW FEATURE     ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        hammer.borrow();
        phoneCharger.borrow();
        sewingMachine.borrow();
        
        System.out.println("\n--- Updated Status After Borrowing ---\n");
        
        hammer.printDetails();
        phoneCharger.printDetails();
        sewingMachine.printDetails();
        
        //  return functionality
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║     DEMONSTRATING RETURN FEATURE     ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        hammer.returnItem();
        
        System.out.println("\n--- Updated Status After Returning ---\n");
        hammer.printDetails();
        
        // Summary
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║            SUMMARY REPORT            ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        int availableCount = 0;
        int borrowedCount = 0;
        
        for (Item item : libraryItems) {
            if (item.isBorrowed()) {
                borrowedCount++;
            } else {
                availableCount++;
            }
        }
        
        System.out.println("Total Items: " + libraryItems.size());
        System.out.println("Available: " + availableCount);
        System.out.println("Borrowed: " + borrowedCount);
        System.out.println("\nThank you for using LibraryOfStuff!\n");
    }
}