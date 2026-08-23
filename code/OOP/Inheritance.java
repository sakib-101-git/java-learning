public class Inheritance {
    public static void main(String[] args) {

        // Student s1 = new Student();
        // s1.markAttendance();

        //not possible because Student is parent class, 
        //cannot extend child class
        //s1.attendLab();

        EngineeringStudent es = new EngineeringStudent();
        es.name = "Sakib";
        es.age = 39;
        es.college = "BUET";
        es.rollNumber = 534;
        es.print();


    }
}


/*

    parent class -> superclass -> Student
    child class -> subclass -> EngineeringStudent

*/
// class Student {
//     String name;
//     int age;
    
//     // protected modifier can be accessed by package and subclasses
//     public void markAttendance() {
//         System.out.println("Attendance marked");
//     }
// }


class Student {
    String name;
    int age;
    int rollNumber;

    Student () { }
    Student (String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNumber); // super is optional
    }
}



class EngineeringStudent extends Student {
    
    String college;
    // void print() {
    //     System.out.println(super.name + ", " + super.age + ", " + super.rollNumber); // super is optional
    // }

    EngineeringStudent() { }

    
    EngineeringStudent(String name, int age, int rollNumber, String college) {
        super(name, age, rollNumber);
        this.college = college;
    }
    void print() {
        super.print();
        System.out.println(college);
    }
}

/*
    INHERITANCE
    -> child class inherits properties, behaviours of parent class
    -> syntax - class Car extends Vehicle {}
    # here Car is the child class and Vehicle is the parent class
    # now Car class has all the behaviours of Vehicle class

    -> Types of Inheritance
        1. Simple Inheritance -> simple parent child relationship
        2. Multi-level Inheritance -> A(root parent) --> B(child of A, parent of C) --> C (child of B)
        3. Hierarchical Inheritance -> A --> B, A --> C (one parent with multiple child)
        4. Multiple Inheritance -> A --> C, B --> C (multiple parent with single child). Not supported in Java. 
        Multiple Parent class A, B and one child class C.
        this is Multiple inheritance, java cannot do this. Due to Diamond problem. child gets confused which method 
        to implement from multiple classes if there are duplicate methods. Java solves this with interfaces.

    this keyword -> this keyword holds the current object's/class' reference
    super keyword -> super keyword holds the parent object's/class' reference

    Uses of super -> 1. To access parent class variable in child class.. super.A;
    2. can access parent class methods in class class
    3. can call parent class constructor... super(); // if not explicitly said.. java does it automatically


*/