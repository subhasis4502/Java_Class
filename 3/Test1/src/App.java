class App{
    public static void main(String[] args) {
        //Two types of string declaration
        String s1 = new String("Hello");
        String s2 = "hii";

        //Different string methods
        System.out.println("Length of the string: " + s1.length());
        System.out.println("The character at s1[2]: " + s1.charAt(2));
        System.out.println("The substring from the 3rd index to the last character: " + s1.substring(2));
        System.out.println("The substring from the 1th index to (4-1) index: " + s1.substring(1,4));
        if(s1.equals("Hello"))
		    System.out.println("The string is equal");
        if(s1.equalsIgnoreCase("heLLo"))
            System.out.println("The string is equal ignoring the case");
        System.out.println(s1.compareTo(s2)); //returns negative integer when s1 is alphabetically before s2
        System.out.println(s1.compareToIgnoreCase(s2)); //case insensitive comparison
        System.out.println("Concatinating two string: " + s1.concat(s2));
        System.out.println("The index value of 'll' in s1: " + s1.indexOf("ll")); //returns the index of the first occurrence of the specified string
        System.out.println("'o' in s1 after 3rd index: "+ s1.indexOf("o",3)); //returns the index of the first occurrence of the specified string starting at the specified index (i-th) within the main string
        System.out.println("The last place where 'l' is present: " + s1.lastIndexOf('l'));
        System.out.println("Lower case: " + s1.toLowerCase());
        System.out.println("Upper case: " + s1.toUpperCase());
        String s3 = "     hhoo   hhkk k  ";
        System.out.println("After removing whitespaces from both ends: " + s3.trim());
        
        if(s1.startsWith("H"))
            System.out.println("Yes, s1 is start with H");
        if(s1.endsWith("o"))
            System.out.println("Yes, s1 is ends with o");
    }
}