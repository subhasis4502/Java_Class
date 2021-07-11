class Test{ //The name of the class must be start with a capital letter
    int a,b;
    void getData(){ //The name of the method can be start with a small letter
        a=10;
        b=20;
    }

    void  display(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void  main(String args[]){
        //Test t1; //Only declare the reference variable
        //t1 = new Test(); // Allocate a Test object to the memory

        Test t1 = new Test(); //Efficient way
        t1.getData();
        t1.display();
    }
}
