public class App {
    /* 
    used to ensure the capacity at least equal to the given minimum
    Or,
    used to increase the capacity of the StringBuffer object

    if(mincapacity<current capacity)
    no change is there.. 
    else if (mincapacity > 2*oldcapacity+2)
    newcapacity=mincapacity ;
    else
    newcapacity=2*oldcapacity+2; */

    public static void main(String[] args) {
    //Case 1: 
    StringBuffer s1=new StringBuffer("JU Info Tech");	
    System.out.println(s1.capacity());//28
    s1.ensureCapacity(20);
    System.out.println(s1.capacity()); //28

    //Case 2: 
    StringBuffer s2=new StringBuffer("JU Info Tech");	
    System.out.println(s2.capacity()); //28
    s2.ensureCapacity(60);
    System.out.println(s2.capacity()); //60

    //Case 3: 
    StringBuffer s3=new StringBuffer("JU Info Tech");	
    System.out.println(s3.capacity()); //28
    s3.ensureCapacity(50);
    System.out.println(s3.capacity()); //58      
    }
        
}
