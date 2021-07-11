/* 
Package: It is used to group related classes. 

Steps to create and use a package:
    1. First declare the name of the package using the package keyword followed by a package name (pack1)
    2. Define the class within pack1. The file should be saved as A.java and located in a directory named pack. After compilation of the source file (A.java), Jave will create a .class file and store it in the same directory.
    3. The directory having the same name as the package must contain the .class file and this directory should be a subdirectory where the classes that will import the package are located.  
*/
import pack1.A;

class App {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}

// or using fully qualified name
/* class App {
    public static void main(String[] args) {
        pack1.A a = new pack1.A();
        a.display();
    }
} */