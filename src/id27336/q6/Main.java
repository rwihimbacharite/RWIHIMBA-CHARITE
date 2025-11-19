package id27336.q6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        try {
            System.out.print("Enter employee name: ");
            String fullName = sc.nextLine();
            System.out.print("Enter employee ID (>=1000): ");
            int employeeID = sc.nextInt();
            System.out.print("Enter basic salary: ");
            double basicPay = sc.nextDouble();
            System.out.print("Enter transport allowance: ");
            double transport = sc.nextDouble();
            System.out.print("Enter housing allowance: ");
            double housing = sc.nextDouble();
            
            double rssbContribution = basicPay * 0.05;
            double payeTax = basicPay * 0.3;
            double grossSalary = basicPay + transport + housing;
            double totalDeductions = rssbContribution + payeTax;
            double netSalary = grossSalary - totalDeductions;
            
            Payslip payslip = new Payslip(1, now, now, "ABC Corporation", "ABC001", "12345678", "info@abc.com", "IT Department", "IT001", "John Manager", employeeID, fullName, "Developer", basicPay, true, 1, 2024, now, now, basicPay, transport, housing, rssbContribution, payeTax, 0, 0, 0, 0, grossSalary, totalDeductions, netSalary, "PAY001", now);
            
            System.out.println("\n" + payslip.generatePayslip());
            System.out.println("\n27336 All employee data displayed above");
            
        } catch (IllegalArgumentException e) {
            System.out.println("VALIDATION ERROR: " + e.getMessage());
            System.out.println("Payroll processing terminated due to validation failure.");
            return;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return;
        } finally {
            sc.close();
        }
    }
}