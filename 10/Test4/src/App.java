/* import java.util.*;   // Both the packages have a class
import java.sql.*;    // Date; ambiguous case

public class App {
	public static void main(String args[])
	{
		Date ob=new Date(); // The ambiguity arises
	}

} */

//Solution:

public class App {
	public static void main(String args[])
	{
		java.util.Date ob1=new java.util.Date();
		java.sql.Date ob2=new java.sql.Date(20211115); 
		System.out.println(ob1);
        System.out.println(ob2);
	}
}
