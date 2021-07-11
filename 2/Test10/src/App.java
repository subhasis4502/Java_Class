class Sample {
    public static String s1 = "info";
    public static void test(String s2) {
        s1 = s1 + ' ' + s2; //Updating the static variable
    }

    void display(){
        System.out.println(s1);
        this.show(); //Calling a static method from non-static method is possible
    }

    static void show(){
        System.out.println(s1);
        //this.display(); //Calling a non-static method from static method is not possible
    }
}

class App{
    public static void main(String[] args) {
        Sample.test("edge");
        System.out.println(Sample.s1);

        Sample s = new Sample();
        s.test("IT");
        System.out.println(s.s1);
        s.display();
    }
}
