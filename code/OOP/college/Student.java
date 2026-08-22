package college;
// this package is auto generated saying all the classes i create will 
// automatically go under this college package, as they are in this folder

public class Student {
    public void print () {
        System.out.println("College Student");
    }
}

class Teacher {
    public void print() {
        Student s1 = new Student();
        s1.print();
    }
}