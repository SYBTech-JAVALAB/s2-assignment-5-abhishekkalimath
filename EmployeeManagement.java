class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayRole() {
        System.out.println("General Employee");
    }

    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displayRole() {
        System.out.println("Role   : Manager");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        try {
            Manager m = new Manager("Abhishek", 50000);

            if (m.name.isEmpty())
                throw new Exception("Name cannot be empty");

            if (m.salary < 0)
                throw new Exception("Salary cannot be negative");

            m.displayRole();
            m.displayDetails();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
