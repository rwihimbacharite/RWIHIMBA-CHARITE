package id27336.q4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        try {
            System.out.print("Enter supplier name: ");
            String supplierName = sc.nextLine();
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();
            System.out.print("Enter unit price: ");
            double unitPrice = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            
            double totalAmount = unitPrice * quantity;
            
            ProcurementReport report = new ProcurementReport(1, now, now, "ABC Corp", "123 Business St", "info@abc.com", "IT Department", "IT001", supplierName, "123456789", "0781234567", productName, unitPrice, quantity, "PO001", now, totalAmount, now, "Delivery Team", "Inspector A", "Passed", "Good quality", "INV001", totalAmount, now, "Monthly procurement report");
            
            System.out.println("\n27336 Procurement Report Generated!");
            System.out.println("27336 Supplier: " + report.getSupplierName() + ", Product: " + report.getProductName());
            System.out.println("27336 Total Amount: $" + report.calculateTotal());
            
        } catch (IllegalArgumentException e) {
            System.out.println("VALIDATION ERROR: " + e.getMessage());
            System.out.println("Procurement terminated due to validation failure.");
            return;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return;
        } finally {
            sc.close();
        }
    }
}