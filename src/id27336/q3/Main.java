package id27336.q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter TIN (9 digits): ");
        String tin = sc.nextLine();
        
        TaxRecord record = new TaxRecord(1, now, now, "RRA", "Kigali", "info@rra.gov.rw", "PAYE", 0.3, "TAX001", tin, "John Taxpayer", "123 Main St, Kigali", "ABC Company", "123456789", "0781234567", employeeName, salary, tin, "January", salary, now, salary * 0.3, now, salary * 0.3, "RCP001", salary * 0.3);
        
        System.out.println("\n27336 Tax Computation Complete!");
        System.out.println("27336 Employee: " + record.getEmployeeName() + ", Salary: $" + record.getSalary());
        System.out.println("27336 Computed Tax: $" + record.computeTax());
        System.out.println("27336 Receipt: " + record.getReceiptNo());
        
        sc.close();
    }
}