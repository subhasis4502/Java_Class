/* 
forName() method of Class:
1. It is used to load the class dynamically..
2. It returns the instance of the class- Class..
3. It should be used only if we know the fully qualified name of class. 
This cannot be used for primitive types (not even wrapper classes).  
*/
class Sample{

}

class App{
    public static void main(String[] args) {
        try{
            Class c = Class.forName("Sample");
            System.out.println(c.getName());

            Class c2 = App.class;
            System.out.println(c2.getName());

            Class c1 = Class.forName("int"); //Throws class not found exception
            System.out.println(c1.getName());
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
