interface IN{

}

class Demo implements IN{

}

class App{
    public static void main(String[] args) {
        IN i = new Demo();
        Class c = i.getClass(); //getClass() returns the class name not interface name
        
        System.out.println(c);
    }
}