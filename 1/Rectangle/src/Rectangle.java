class RectangleCreation {
    
    int length, width;

    void getData(int x, int y){
        length = x;
        width = y;
    }

    int calArea(){
        return (length*width);
    }

}

class Rectangle{
    public static void main(String[] args) {
        RectangleCreation r1 = new RectangleCreation();
        RectangleCreation r2 = new RectangleCreation();

        r1.length=10;
        r1.width=5;
        int area1 = r1.calArea();
        System.out.println("Rectangle 1 area: " + area1);

        r2.getData(15, 10);
        System.out.println("Rectangle 2 area: " + r2.calArea());

    }
}
