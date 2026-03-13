// 2. Write a Java program to create a class called Employee with methods work() and getSalary().
// Create a subclass called HRManager that overrides the work() method and 
// adds a new method addEmployee(). [A]

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("ID: " + id + 
                           ", Name: " + name + 
                           ", Salary: " + salary);
    }
}

class HRManager extends Employee {

    Employee[] employees;
    int count = 0;

    HRManager(int id, String name, double salary, int size) {
        super(id, name, salary);
        employees = new Employee[size];
    }

    @Override  // it's an annotation / decorator used to indicate overriding
    public void work() {
        System.out.println(name + " is managing HR activities");
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
            System.out.println("Employee added: " + e.name);
        } else {
            System.out.println("Employee list is full");
        }
    }

    public void showEmployees() {
        System.out.println("\nEmployee List : ");
        
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
}

public class A2 {
    public static void main(String[] args) {

        HRManager hr = new HRManager(1, "Rahul", 50000, 2);

        Employee e1 = new Employee(101, "Amit", 30000);
        Employee e2 = new Employee(102, "Sneha", 32000);
        Employee e3 = new Employee(103, "Karan", 28000);

        hr.addEmployee(e1);
        hr.addEmployee(e2);
        hr.addEmployee(e3);

        System.out.println();
        hr.work();          
        e1.work();          
        
        hr.showEmployees();
    }
}
