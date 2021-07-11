//Array of objects creation:
class TestArray {
    int a,b;
  
    TestArray(int x, int y)
        {
            a=x;
            b=y;
        }
    void display()
    {
        System.out.println("a="+a+" b="+b);
    }
}

class App{
    public static void main(String args[])
    {
        TestArray ob[]=new TestArray[5];
        for(int i=0;i<5;i++)                     // If this is omitted, Null Pointer Exception 
            ob[i]=new TestArray(i, i+1);
        
        ob[0].display();
        ob[1].display();
        ob[2].display();
        ob[3].display();
        ob[4].display();
    }
}