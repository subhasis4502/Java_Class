// Hierarchical Inheritance
class Employee{
    public static int basic = 20000;
    int salary(){
        return basic;
    }
}

class Manager extends Employee{
    int salary(){
        return (basic + 20000);
    }
}

class Clerk extends Employee{
    int salary(){
        return (basic + 10000);
    }
}

class App{
    public static void main(String[] args) {
        Clerk c = new Clerk();
        System.out.println("The salary of the clerk: " + c.salary() );

        Manager m = new Manager();
        System.out.println("The salary of the manager: " + m.salary() );
    }
}