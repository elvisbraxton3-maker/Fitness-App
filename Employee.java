class Employee {
    String name;
    double salary;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Lecture extends Employee {
    String department;
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lecture lec = new Lecture();
        system,out,print("Enter name: ");
        lec.name =sc.nextLine();
        System.out.print("Enter salary: ");
        lec.salary =sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter department: ");
        lec.department = sc.nextLine();
        System.out.println("\n  Lecture Details ");

    }
}