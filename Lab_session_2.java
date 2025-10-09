import java.util.Scanner;

class Employee{
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("---------x---------");
    }

    void salaryupdate(double increment){
        salary += increment;
    }
}

public class Lab_session_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Department: ");
        String department = sc.nextLine();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, department, salary);

        if (args.length > 0){
            double increment = Double.parseDouble(args[0]);
            emp.salaryupdate(increment);
            System.out.println("Salary updated by: " + increment + " Rupees.");
        }

        emp.display();
        sc.close();
    }
}