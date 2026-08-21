public class OOPIntro {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sakib";
        s1.age = 23;
        s1.rollNumber = 283;
        s1.college = "MIT";    
        s1.markAttendance();
        
        Student s2 = new Student();
        s2.name = "Rampaal";
        s2.age = 27;
        s2.rollNumber = 420;
        s2.college = "Harvard Bissho";
        s2.markAttendance();

        s1.print();
        s2.print();
    }


}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance Marked by " + name);
    }

    void print() {
        System.out.println("\n" + name + ", " + age + ", " + rollNumber + ", " + college);
    }
}



// Java is almost complete Object Oriented programming language