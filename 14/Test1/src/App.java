//Generics in Java:
class Test1 <T> {
    T obj;
    public Test1(T obj) {
        this.obj = obj;
    }

    T getObject(){
        return this.obj;
    }
}

class App {
    public static void main(String[] args) {
        Test1<Integer> iT1 = new Test1<Integer>(5);
        System.out.println(iT1.getObject());

        Test1<Double> dT2 = new Test1<Double>(5.2);
        System.out.println(dT2.getObject());

        Test1<String> sT3 = new Test1<String>("JU IT");
        System.out.println(sT3.getObject());
    }
}
