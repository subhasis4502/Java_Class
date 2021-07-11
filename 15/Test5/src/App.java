import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* File class:
__________

Useful methods of File class:

canRead()-> checks if the file is readable by the current user..  

canWrite()-> checks if the file is writable by the current user..  

getAbsolutePath()-> returns absolute path as a string 

exists()-> whether the file exists

isDirectory()-> checks if the file is a directory 

isFile()-> checks if it is a file
___________________________________________________________________________________________

FileStreams:
______________

-> File object can be used to create FileInputStream, FileOutputStream, FileReader, FileWriter
-> We can simple pass the File object into one of the appropriate constructors..
 */

// Code to implement FileReader..

public class App {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Subhasis Das\\Documents\\fund.txt");

        try {
            int nextByte;
            FileReader fr = new FileReader(f1);

            while((nextByte = fr.read()) != -1){
                System.out.print((char)nextByte);
            }
        }

        catch(IOException e){
            System.out.println("Exception handled");
        }

    }
}