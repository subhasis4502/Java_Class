class Test1 <U, V>{
    U obj1;
    V obj2;

    public Test1(U obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class App {
    public static void main(String[] args) {
        Test1<Integer, Double> iob = new Test1<Integer, Double>(5, 10.2);
        iob.print();

        Test1<Double, String> dob=new Test1<Double,String> (10.5, "JU IT");
		dob.print();
		
		Test1<String, Integer> sob=new Test1<String, Integer> ("OOS", 15);
		sob.print();
    }
}