package id27336.q1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        try {
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();
            System.out.print("Enter unit price: ");
            double unitPrice = sc.nextDouble();
            System.out.print("Enter stock quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter sold quantity: ");
            int soldQty = sc.nextInt();
            
            StockReport report = new StockReport(1, now, now, "Main Warehouse", "Kigali", "0781234567", "Electronics", "ELEC001", "TechSupply", "tech@supply.com", "0787654321", productName, unitPrice, 100, quantity, 10, now, quantity + 50, "TechSupply", new Date(System.currentTimeMillis() - 86400000), soldQty, "Customer A", quantity, quantity * unitPrice, now, "Monthly report");
            
            System.out.println("\n" + report.generateReport());
            System.out.println("27336 Product: " + report.getProductName() + ", Price: $" + report.getUnitPrice() + ", Available: " + report.getQuantityAvailable());
            
        } catch (IllegalArgumentException e) {
            System.out.println("VALIDATION ERROR: " + e.getMessage());
            System.out.println("Program terminated due to validation failure.");
            return;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return;
        } finally {
            sc.close();
        }
    }
}