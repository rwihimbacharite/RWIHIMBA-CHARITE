package id27336.q1;

import java.util.Date;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;
    
    public Inventory(int id, Date createdDate, Date updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String purchaseSupplierName, Date saleDate, int soldQuantity, String customerName, int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, purchaseSupplierName, saleDate, soldQuantity, customerName);
        if (totalItems < 0 || stockValue < 0) throw new IllegalArgumentException("Totals must be >= 0");
        this.totalItems = totalItems; this.stockValue = stockValue;
    }
    
    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }
}