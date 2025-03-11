class Employee {  
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

class Department {
    private String departmentName;
    private Employee[] employees;
    private int employeeCount;

    public Department(String departmentName, int maxEmployees) {
        this.departmentName = departmentName;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Department is full, cannot add more employees.");
        }
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployeeInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 101);
        Employee employee2 = new Employee("Bob", 102);
        Employee employee3 = new Employee("Charlie", 103);
        
        Department department = new Department("HR", 5);  

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        
        department.displayDepartmentInfo();
    }
}
