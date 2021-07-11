/* Rules for constructing generic methods in Java:
1. All generic method declarations have a type parameter section delimited by angular brackets that preceedes the method's return type..
2. Each type parameter section contains one or more type parameters separated by commas..
3. The type parameters can be used to declare the return type and act as placeholders for the types of arguments passed to the generic method..
4. The type parameters can represent only reference types, not primitive types (int, char, double).... */

public class App {
    static<T> void display(T[] obj){
        System.out.println();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] iArr = {1,2,3,4,5,6,7};
        Double[] dArr= {1.2,2.3,3.4,4.5,5.6,6.7};
		Character[] cArr= {'a','e','i','o','u'};
		String[] sArr= {"Ab","Bc","CD"};

        display(iArr);
        display(dArr);
		display(cArr);
		display(sArr);
    }
}
