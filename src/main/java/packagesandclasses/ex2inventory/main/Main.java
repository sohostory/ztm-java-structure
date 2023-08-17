package packagesandclasses.ex2inventory.main;

import packagesandclasses.ex2inventory.inventory.Product;
import packagesandclasses.ex2inventory.inventory.Inventory;
import packagesandclasses.ex2inventory.inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 1001;
        product.productName = "Apple";
        product.price = 1.99;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 50;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 2001;
        warehouse.warehouseName = "Storage";
        warehouse.inventories = "Placeholder";

        System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
        System.out.println("Inventory Quantity: " + inventory.quantity);
        System.out.println("Warehouse ID: " + warehouse.warehouseId + ", Name: " + warehouse.warehouseName);    }
}
