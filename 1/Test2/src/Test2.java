class Test1 {
    int a,b;
    
    void setData(int x, int y){
        a = x;
        b = y;
    }

    void display(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}

class Test2{
    public static void main(String args[]){
        Test1 t1=new Test1();
        t1.setData(1, 2);
        t1.display();
        Test1 t2=new Test1();
        t2.a=10;
        t2.b=20;
        t2.display();
    }
}
