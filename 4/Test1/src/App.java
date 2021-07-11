/* StringBuffer class:
1. used to create mutable(modifiable) string..
2. may have characters and substring inserted at the middle or appended at the last
3. represents growable and writable character sequences 
[string represents fixed length and immutable character sequences] */

public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Hello World";

        //Different Constructors
        StringBuffer sb1 = new StringBuffer(); //Creates an empty StringBuffer with initial capacity of 
        StringBuffer sb2 = new StringBuffer(s1); //creates a StringBuffer with the specified string and reserves room for 16 more characters
        StringBuffer sb3 = new StringBuffer(50); //Creates an empty StringBuffer with the specified capacity as length
        System.out.println("StringBuffer size: " + s1.length()); 
        System.out.println("StringBuffer size: " + sb1.length()); 
        System.out.println("StringBuffer size: " + sb2.length()); 
        System.out.println("StringBuffer size: " + sb3.length()); 

        //All methods
        System.out.println("StringBuffer length: " + sb2.length());
        System.out.println("The current capacity: " + sb1.capacity());
        System.out.println("The character at 4: " + sb2.charAt(4));
        System.out.println("After reversal: " + sb2.reverse());

        System.out.println("Appending an integer as string: " + sb1.append(10));
        System.out.println("Appending a double as string: " + sb1.append(1.5d));
        System.out.println("Appending a float as string: " + sb1.append(2.5f));
        System.out.println("Appending a string: " + sb1.append("Tech"));
        System.out.println("Appending a char in string: " + sb1.append('a'));
        System.out.println("Appending a boolean as string: " + sb1.append(true)); 

        System.out.println("Inserting an integer at 0 index as string: " + sb1.insert(0, 1));
        System.out.println("Inserting a single character string at 1 index as string: " + sb1.insert(1, "a"));
        System.out.println("Inserting a double at 2 index as string: " + sb1.insert(2, 2.5d));
        System.out.println("Inserting a float at 3 index as string: " + sb1.insert(3, 3.5f));
        System.out.println("Inserting a string at 4: " + sb1.insert(4, "Tech"));
        System.out.println("Inserting a character at 5 index as string: " + sb1.insert(5, 'a'));
        System.out.println("Inserting a boolean at 6 index as string: " + sb1.insert(6, true));

        System.out.println("After replacing: " + sb2.replace(1, 3, "ee"));
        System.out.println("From 2 index to last: " + sb2.substring(2,3));
        sb2.setCharAt(0, 'v');
        System.out.println("Replace 0 index with 'v': " + sb2 );
        System.out.println("Index of ll: " + sb2.indexOf("ll"));
        System.out.println("Last index of o: " + sb2.lastIndexOf("o"));
        System.out.println("After deleting index 3 to 9: " + sb1.delete(3, 9));
        System.out.println("Delete charecter at 5: " + sb1.deleteCharAt(5));
    }
}
