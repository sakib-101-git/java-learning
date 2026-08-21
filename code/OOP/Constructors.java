



public class Constructors {

    public static void main(String[] args) {
        
        // //Calls the hardcoded Student constructor
        // Student s1 = new Student(); 
        

        // Calls parameterized constructor

        Student s1 = new Student("Sakib", 24, 283, "MCU");
        s1.print();
        s1.markAttendance();
        
        Student s2 = new Student("Rakib", 25, 300);
        s2.print();
        s2.markAttendance();

        Student s3 = new Student("Akib", 26);
        s3.print();
        s3.markAttendance();

        // Student is user defined data type
        // s1 is reference variable located on memory
        // new allocates object in the heap memory
        // Student() calls the Constructor of the Student class

    }
    
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;


    // // HARDCODED
    // Student() {
    //     name = "Sakib";
    //     age = 24;
    //     rollNumber = 283;
    //     college = "MCU";
    //     markAttendance();
    //     print();

    // }

  
    // // parameterized constructor
    // Student(String n, int a, int r, String c){
    //     name = n;
    //     age = a;
    //     rollNumber = r;
    //     college = c;
    // }


    // this keyword and chaining
    //Constructor for s1
    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("I am in First Constructor");
    }

    // overloading
    //Constructor for s2
    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        System.out.println("I am in Second Constructor");
    }

    // constructor for s3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("I am in Third Constructor");
    }

    void markAttendance() {
        System.out.println("Attendance Marked by " + name);
    }

    void print() {
        System.out.println("Student Information: " + name + ", " + age + ", " + rollNumber + ", " + college);
    }


    // Constructor
    /* when this does not exist, default constructor is returned to Student() 
    call in main function, and later updated on the main function
    */ 
    
}



/* 
Default Values

Primitive data types
Integers -> 0
Floating Points -> 0.0
Bolean -> False

Non-primitive data types
String -> null (nothing)


RULES OF CONSTRUCTOR:
-> same name as class and inside the class
-> no return type (not even void)
-> automatically called during object creation
-> used to initialize an object
-> it can also be overloaded
*/

/*

*** Constructors can not be called manually.
Constructors can only be called while creating an Object 
and while using this keyword.


*** Run-time Exception will be thrown when there is not enough 
space available in Heap memory. There might be other objects 
that are taking and eating all the heap memory storage

*/