import java.util.ArrayList;
import java.util.List;

public class Employee {
    
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    private int id;
    private String name;
    private double salary;

    
    static {
        System.out.println("Employee management system initialized.");
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

       
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void applyRaise(List<Employee> employees, double percentage) {
        for (Employee emp : employees) {
            double raiseAmount = emp.salary * (percentage / 100);
            emp.salary += raiseAmount;
            totalSalaryExpense += raiseAmount;
        }
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

  public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary; // Adjust total salary expense
        this.salary = newSalary;
    }

  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

  
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: " + salary + "]";
    }


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 50000));
        employees.add(new Employee(2, "Jane Smith", 60000));
        employees.add(new Employee(3, "Alice Johnson", 55000));

        int choice;
        do {
            System.out.println("\nEmployee Management Menu:");
            System.out.println("1. Display All Employees");
            System.out.println("2. Apply Raise to All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Get Total Employees");
            System.out.println("5. Get Total Salary Expense");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.println("\nEmployee Details:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 2:
                    System.out.print("Enter raise percentage: ");
                    double percentage = Double.parseDouble(System.console().readLine());
                    applyRaise(employees, percentage);
                    System.out.println("Salary raise applied.");
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update salary: ");
                    int id = Integer.parseInt(System.console().readLine());
                    for (Employee emp : employees) {
                        if (emp.getId() == id) {
                            System.out.print("Enter new salary: ");
                            double newSalary = Double.parseDouble(System.console().readLine());
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated for " + emp.getName());
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Total Employees: " + getTotalEmployees());
                    break;

                case 5:
                    System.out.println("Total Salary Expense: $" + calculateTotalSalaryExpense());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}
