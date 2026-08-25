
package inoutput;

//import java.io.*;
import java.util.Scanner;

public class Standard {
    public static void main(String[] args){ // throws IOException 
        // // System.out.println("Hello");

        // // System.err.println("Bye");

        // int x = System.in.read();

        
        // // read() reads one byte at a time
        // System.out.println((char)x);


        // InputStreamReader isr = new InputStreamReader(System.in);

        // BufferedReader br = new BufferedReader(isr);

        // String name = br.readLine();
        // System.out.println(name);
        /*
            1. Sakib
            2. OS Buffer (83,97,107,105,98) // convers to ascii code
            3. System.in (Input Stream) // receives bytes
            4. InputStreamReader --> stream of bytes into streams of characters
            5. BufferedReader --> readLine --> Sakib --> name
            6. Sakib output
        */

        // take input from keyboard
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        // take input from file
        Scanner sc1 = new Scanner("sample.txt");
        System.out.println(sc1);

        // take input from string
        Scanner sc2 = new Scanner("20, 40, 60");
        System.out.println(sc2);

    }
}


/*

Types of Input/Output->
1. Console I/o
2. Files I/O
3. Network I/O
4. Memory I/O

1. Console Input Output:

System.out.println("...");
// println is a method
// out is a reference variable that is calling the method 
println of an object
// System is a class
// there is a variable named out inside the class System

class System {
    static X out // out is a reference variable referring to println method


}

class PrintStream {

    void println() {

    }

}

Thus we can write System.out.

*** Overall out is a static variable in System class that is an object on some other class 
suppose 'X' and there is a method called println in that class

thus, we can write System.out.println("Hell")

now what is this X class?
-> PrintStream is the actual class where  

System class is defined in java.lang package 
java.lang package is always imported by default

there are many methods in PrintStream 
-> println -> new line
-> print -> without new line
-> printf -> formatted output

// err --> error (to print error messages)
// out --> output (to print Business logic)


HOW TO TAKE INPUT FROM USER

Scanner class

System.in -> object of InputStream class 

Strams--> Flow of data

InputStream -> data flow into program
OutputStream -> data flow out of program

These are java classes. Both are abstract classes 
because they only tell read() and write() but does not 
say how to write or where to read etc.

System.in -> input stream
System.out and System.err -> output stream

PrintStream is a child class of OutputStream


*** JAVA input output is completely stream based
All of them are "Stream of Bytes"


Input Stream (Abstract) --> read()
    -> FileInputStream
    -> ByteArrayInputStream
    -> BufferedInputStream
    -> DataInputStream

Output Stream (Abstract) --> write()
    -> FIleOutputStream
    -> ByteArrayOutputStream
    -> BufferedOutputStream 
    -> PrintStream (System.out, System.err)

System.in --> takes input from keyboard by default

input flow --> InputStream --> read() --> stream of bytes

Input -> A -> OS will give ASCII value of 'A' --> converted to a 
stream of bytes and there is a byte storing 'A' ASCII value


Reader class was created to remove the redundant work of char

Reader (Abstract) -->

    -> BufferedReader 
        -> Read a chunk of characters from OS buffer
        -> Store it in memory
        -> Give them to program when required

    * BufferedReader is not compatible with InputStream 
        cause InputStream works with stream of byte and 
        BufferedReader works with stream of characters

    to solve this comes InputStreamReader

    InputStreamReader 
        -> converts stream of bytes to stream of characters so that 
        BufferedReader can read chunk of characters altogether


    Limitations of BufferedReader
    1. only reads string, always needs typecasting
    2. code becomes complicated

    solution -> java introduces Scanner class in Java 1.5

    Scanner 
        -> Simplify (Input)
        -> int, double, boolean, string read individually

    *** Scanner does not come in java.io class. It comes from java.util class
    Scanner methods:
    sc.next() -> reads the first word before the first space
    sc.nextLine() -> reads the whole line
    sc.nextInt() -> takes integer
    like this there are all datatypes

    *** Scanner class is slower than BufferedReader
    because Scanner class internally tokenize, uses regex, type conversions
    BufferedReader doesnt do all that

    BufferedReader is preferred when optimization and speed is the priority
    
*/