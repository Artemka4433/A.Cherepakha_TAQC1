import java.util.Collections;
import java.util.Random;

public class Employees_Activity {
    public Employees_Activity(String type_name, int type_code) {
        Employee employee = new Employee(type_name, type_code);
        System.out.println("Employee id: "+ employee.id);
        System.out.println("Age: "+ employee.age);
        System.out.println("Employee type: "+ employee.type);
        employee.countSalary(type_code);
    }
}

class Employee {
    String type;
    int id;
    int age;

    public Employee(String type_name, int type_code) {
        this.type = type_name;
        id = generateId(type_code);
        age = (int)(16 + Math.random() * 70);
    }

    public static int generateId(int type) {
        if (type == 1) {
            return (int) (100000 + Math.random() * 900000);
        } else if (type == 2) {
            return (int) (100000000 + Math.random() * 900000000);
        }
        return -1;
    }

    public void countSalary(int type_code) {
        if (type_code == 1) {
            System.out.println("Salary: " + (int)(this.age * 0.8) + 15000);
        } else if (type_code == 2) {
            System.out.println("Salary: " + (int) (this.age * 0.5) + 20000);
        }
    }
}

