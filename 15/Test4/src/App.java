/* Character Streams:
-> Many times the input or output device that we wish to associate a stream is represented as a sequence of characters..
  Text files, keyboard inputs, terminal o/p...
-> It is difficult to directly deal with the raw bytes of the data when we wish to work with the text in java unicode format..
-> Two abstract classes are there to deal with this.. [Reader ,  Writer]
 
-> Reader and Writer classes have many subclasses.. 
   
InputStreamReader ->  serves as a wrapper for any InputStream objects..
                  -> converts raw bytes as they are read from the InputStream and serves them to the user as unicode characters..
Standard Streams:

System.in (InputStream),  System.out (OutputStream)
  -> they provide methods to print primitive data types as well as Strings..
  -> System.in is of generic type InputStream, so it must be wrapped in order to be useful..

System.err (PrintStream)
_____________________________________________________________________________

//Reading data from the keyboard:
-> InputStreamReader can be wrapped around InputStream in order to make them useful in reading character data..
-> BufferedReader provides a readLine() method for additional functionality...
__________________________________________________________________________________________________
 */

import java.io.*;

class App {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            System.out.println("Give input: ");
            br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println("You entered: " + str);
        }

        catch (IOException e) {
            System.out.println("Error handled");
        }
    }
}