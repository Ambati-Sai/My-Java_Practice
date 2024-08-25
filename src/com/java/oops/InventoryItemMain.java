package com.java.oops;

public class InventoryItemMain {
    public static void main(String[] args) {
        // Create an instance of InventoryItem for the first item
        InventoryItem inventoryitem = new InventoryItem();

        // Set the properties of the first inventory item
        inventoryitem.itemName = "Laptop";                // Name of the item
        inventoryitem.itemCode = "V2024";                 // Unique code for the item
        inventoryitem.quantity = 500;                     // Quantity in stock
        inventoryitem.itemPrize = 40000;                  // Price of the item in dollars
        inventoryitem.itemCategory = "Electronic";        // Category of the item

        // Print details of the first inventory item
        System.out.println("Item Name :" + inventoryitem.itemName);
        System.out.println("Item Code :" + inventoryitem.itemCode);
        System.out.println("Total Quantity :" + inventoryitem.quantity);
        System.out.println("Item Prize :" + inventoryitem.itemPrize);
        System.out.println("Item Category :" + inventoryitem.itemCategory);

        // Create an instance of InventoryItem for the second item
        InventoryItem inventoryitem1 = new InventoryItem();

        // Set the properties of the second inventory item
        inventoryitem1.itemName = "TV";                    // Name of the item
        inventoryitem1.itemCode = "M275";                  // Unique code for the item
        inventoryitem1.quantity = 100;                     // Quantity in stock
        inventoryitem1.itemPrize = 70000;                  // Price of the item in dollars
        inventoryitem1.itemCategory = "Electronic";        // Category of the item

        // Print a blank line for readability between item details
        System.out.println();

        // Print details of the second inventory item
        System.out.println("Item Name :" + inventoryitem1.itemName);
        System.out.println("Item Code :" + inventoryitem1.itemCode);
        System.out.println("Total Quantity :" + inventoryitem1.quantity);
        System.out.println("Item Prize :" + inventoryitem1.itemPrize);
        System.out.println("Item Category :" + inventoryitem1.itemCategory);
    }
}

