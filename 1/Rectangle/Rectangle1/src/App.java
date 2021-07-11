class Rectangle{
    int length;
    int breath;

    Rectangle(int x, int y){
        length = x;
        breath = y;
    }

    int cal_area(){
        return (length*breath);
    }
}

class App{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);

        System.out.println("Rectangle area: " + r1.cal_area());
    }
}