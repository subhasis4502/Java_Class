// 2D Array of strings: 
public class App {
    public static void main(String[] args) throws Exception {

        //1st way: 
        String s1[][]=new String[3][];
        s1[0]=new String[2];
        s1[1]=new String[1];
        s1[2]=new String[3];
        s1[2][0]="Java";
        s1[2][1]="C++";
        s1[2][2]="Python";
        System.out.println(s1[2][0]+s1[2][1]+s1[2][2]);

        //2nd way:
        String s2[][]=new String[3][2];
        s2[0]=new String[2];
        s2[1]=new String[2];
        s2[2]=new String[2];
        s2[2][0]="Java";
        s2[2][1]="C++";
        System.out.println(s2[2][0]+s2[2][1]);
    }
}
