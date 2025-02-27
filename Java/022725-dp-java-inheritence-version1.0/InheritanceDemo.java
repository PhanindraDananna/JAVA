// Base class
class Employee {
    String name;
    int empId;
    double salary;

    // Constructor
    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Method to calculate bonus (to be overridden)
    double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }
}

// Derived class (Manager)
class Manager extends Employee {
    double teamPerformanceBonus;

    // Constructor (using super to call base class constructor)
    Manager(String name, int empId, double salary, double teamPerformanceBonus) {
        super(name, empId, salary); // Call parent constructor
        this.teamPerformanceBonus = teamPerformanceBonus;
    }

    // Overriding calculateBonus method
    @Override
    double calculateBonus() {
        return super.calculateBonus() + teamPerformanceBonus; // Base bonus + team performance bonus
    }

    // Additional method
    void manageTeam() {
        System.out.println(name + " is managing the team efficiently.");
    }
}

// Derived class (Developer)
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    Developer(String name, int empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding calculateBonus method
    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get 15% bonus
    }

    // Additional method
    void writeCode() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, 5000);
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        System.out.println("=== Manager Details ===");
        manager.displayDetails();
        System.out.println("Bonus: $" + manager.calculateBonus());
        manager.manageTeam();

        System.out.println("\n=== Developer Details ===");
        developer.displayDetails();
        System.out.println("Bonus: $" + developer.calculateBonus());
        developer.writeCode();
    }
}
