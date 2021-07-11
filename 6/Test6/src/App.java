// an interface can extend multiple interfaces: 
interface IN1 {
    void getName();
}

interface IN2 {
    void getInst();
}

interface IN3 extends IN1, IN2 {
    void getBranch();
}

class App implements IN3 {
    public void getName() {
        System.out.println("Subhasis");
    }

    public void getInst() {
        System.out.println("Jadavpur");
    }

    public void getBranch() {
        System.out.println("IT");
    }

    public static void main(String args[]) {
        App ob = new App();
        ob.getName();
        ob.getInst();
        ob.getBranch();
    }
}