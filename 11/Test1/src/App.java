/* 
Exception Handling: Exceptions are exceptional, unusual or abnormal events that occur during the execution of programs. [Runtime errors]

Examples:
_________

1. Division by 0.. [ArithmeticException]
int d=0, res;
res=100/d;

2. int[] a=new int[4]; [ArrayIndexOutOfBoundException]
  a[5]=6;

3. int[] b=new int[-3];  [Negative array index]

4. Null String

String s=null;
int len=s.length();

Five keywords: try, catch, throw, throws, finally......

Exception Handling mechanisms:
________________________________

try
{

//code that may cause exceptions

}

JVM creates an Exception object......

Exception object contains:
. name of thread
. file name
. line of code at which the exception occurred
. name of the exception and its description, etc...

Throwing the exception: Process of creating the object and disclosing it..

Disrupts the normal flow of the program

JVM wants to find the code (handler) that wants to handle (resolve) the exceptional situation..

If found, the newly created Exception object is passed ..... that is catch block..


try
{
//code that may cause exceptions
}

catch(..)
{
//code to handle the exception
}

..catch(ArithmeticException e) //it causes to receive the thrown object which can be accessed through e
..catch(ArrayIndexOutOfBoundException e)

If JVM does not find any suitable catch blocks, it forwards the exception to a default handler which 
prints the exception description, stack trace and terminates the program without executing any further 
instructions..
 */

 class App {
    public static void main(String[] args) {
        int d=0, res;

        try {
            res = 100/d;
        } 
        catch (ArithmeticException e) {
        System.out.println("Exception detected");
        res = 100;
        }
        System.out.println("After catch block " + res);
    }
 }