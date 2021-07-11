public class App {
    public static void main(String[] args) {
        /* StringBuffer s = new StringBuffer();
        System.out.println(s.length());
        System.out.println(s.capacity()); */

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Substring: " + sb.substring(1, 4));

        String s = "Hii";
        if(s.compareToIgnoreCase("Hii") == 0){
            System.out.println("CompareToIgnorecase: Yes");
        }

        sb.ensureCapacity(16);
        System.out.println("Available capacity: " + sb.capacity());

        System.out.println("Insert: " + s.insert(0, "oo"));

        //System.out.println("Replace: " + s.replace(2, 4, "oo"));
    }
}
