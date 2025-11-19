package id27336.q1;

import java.util.Date;

public class Purchase extends StockItem {
    private Date purchaseDate;
    private int purchasedQuantity;
    private String purchaseSupplierName;
    
    public Purchase(int id, Date createdDate, Date updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("Quantity must be > 0");
        if (purchaseDate == null) throw new IllegalArgumentException("Date cannot be null");
        this.purchaseDate = purchaseDate; this.purchasedQuantity = purchasedQuantity; this.purchaseSupplierName = purchaseSupplierName;
    }
    
    public Date getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getPurchaseSupplierName() { return purchaseSupplierName; }
}