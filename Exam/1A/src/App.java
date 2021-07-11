class Sample {

}

class App {
    public static void main(String[] args) {
        /* Sample s1=new Sample();
        Sample s2;
        s2=s1;
        Sample s3=new Sample();
        s1=s3; */

        Sample s1=new Sample(),s2;
        Sample s3=new Sample();
        s2=s3;
        s3=new Sample();
        s2=s3;
    }
}
