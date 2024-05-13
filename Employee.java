public class Employee {
      private String name;
      private int employeeId;
      private double salary;
  
      public Employee(String name, int employeeId, double salary) {
          this.name = name;
          this.employeeId = employeeId;
          this.salary = salary;
      }
  
      public String getName() {
          return name;
      }
  
      public int getEmployeeId() {
          return employeeId;
      }
  
      public double getSalary() {
          return salary;
      }
  
      public void displayDetails() {
          System.out.println("Employee Name: " + name);
          System.out.println("Employee ID: " + employeeId);
          System.out.println("Salary: $" + salary);
      }
      public static void main(String[] args) {
          Employee emp = new Employee("Amit", 1001, 50000.0);
          emp.displayDetails();
          System.out.println();
      }
  }
  