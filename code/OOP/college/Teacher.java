package college;


// here public access modifier is used for making an object using 
// a class Student from a different file
public class Teacher {
    void print() {
        Student s1 = new Student();
        s1.print();
    }
}
