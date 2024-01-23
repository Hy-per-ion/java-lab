package exp4;

import java.util.Scanner;
class Employee
{
    String emp_id,emp_name;
    Employee(String emp_id, String emp_name)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
}
class Salary extends Employee
{
    String designation;
    double monthly_salary;
    Salary(String emp_id, String emp_name, String designation, double monthly_salary)
    {
        super(emp_id, emp_name);
        this.designation = designation;
        this.monthly_salary = monthly_salary;
    }
    void displayDetails()
    {
        System.out.format("%-10s %-15s %-20s %-15s %n", emp_id, emp_name, designation, monthly_salary);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        Salary[] employees = new Salary[numberOfEmployees];
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Employee ID: ");
            String emp_id = scanner.next();
            System.out.print("Employee Name: ");
            String emp_name = scanner.next();
            System.out.print("Designation: ");
            String designation = scanner.next();
            System.out.print("Monthly Salary: ");
            double monthly_salary = scanner.nextDouble();
            employees[i] = new Salary(emp_id, emp_name, designation, monthly_salary);
        }
        System.out.format("%-10s %-15s %-20s %-15s %n", "Emp ID", "Emp Name", "Designation", "Monthly Salary");
        System.out.println("---------------------------------------------------------");
        for (Salary employee : employees) {
            employee.displayDetails();
        }
    }
}