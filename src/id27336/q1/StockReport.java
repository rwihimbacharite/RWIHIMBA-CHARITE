package id27336.q1;

import java.util.Date;

public final class StockReport extends Inventory {
    private Date reportDate;
    private String remarks;
    
    public StockReport(int id, Date createdDate, Date updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String purchaseSupplierName, Date saleDate, int soldQuantity, String customerName, int totalItems, double stockValue, Date reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, purchaseSupplierName, saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate; this.remarks = remarks;
    }
    
    public String generateReport() {
        return "27336 - Stock Report: Total Items: " + getTotalItems() + ", Stock Value: $" + getStockValue() + ", Sales: " + getSoldQuantity() + " units";
    }
    
    public Date getReportDate() { return reportDate; }
    public String getRemarks() { return remarks; }
}