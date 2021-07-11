class Employee {
    private double basic_sal;

    Employee(double sal) {
        basic_sal = sal;
    }

    double getSalary(){
        return basic_sal;
    }
}

class Manager extends Employee {
    double manager_sal;
    Manager(double sal){
        super(sal);
        manager_sal = sal*1.45;
    }
    double getSalary() {
        return manager_sal;
    }
}

class Clerk extends Employee {
    double clerk_sal;

    Clerk(double sal){
        super(sal);
        clerk_sal = sal*1.25;
    }
    double getSalary() {
        return clerk_sal;
    }
}

class App {
    public static void main(String[] args) {
        Manager m = new Manager(10000);
        Clerk c = new Clerk(10000);

        System.out.println("Total Salary of a manager: " + m.getSalary());
        System.out.println("Total Salary of a clerk: " + c.getSalary());
    }
}