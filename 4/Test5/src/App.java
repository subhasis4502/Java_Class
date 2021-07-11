// 2 D Array of Integers: [Jagged Array]
public class App {
    public static void main(String[] args) throws Exception {

        int a[][]=new int[3][];
                
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[4];

        for(int r=0;r<a.length;r++)
            for(int c=0; c<a[r].length;c++)
                a[r][c]=r+c;

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
            
        System.out.println(a[i][j]);
    }
}
