// UNDERSTANDING static KEYWORD

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Sakib", 24, 283);
        Student s2 = new Student("Rakib", 26, 222);
        

        
        System.out.println(s1.name + ", " + s1.age + ", " + s1.rollNumber+ ", " + Student.college + ", " + Student.grade);
        System.out.println(s2.name + ", " + s2.age + ", " + s2.rollNumber+ ", " + Student.college + ", " + Student.grade);
    }   
}

class Student {
    String name;
    int age;
    int rollNumber;

    /* when a variable is not a property of an object instead 
    it is a property of the whole class, we define the variable
    with the 'static' keyword
    ex: suppose we are storing the information of all the students
    that belong to the same college, thus college is universal
    */
    static String college;
    static double grade;
    // void markAttendance() {
    //     System.out.println("Attendance Marked by " + name);
    // }   
    // static keyword can be used on methods and variables

/*
    RULES for static methods:
    1. One static method can only call other static method as no object is created
    2. static method can only access static variables as long as no object is created
    3. does not have access to 'this' keyword
*/

    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        // // static not possible
        // this.college = college;
    }

    // static block used for static variables initialization 
    static{
        college = "IIT BUET";
        grade = 3.46;
    }
}


// Parameters cannot be static cause they are local

// Class cannot be static as root
// but they can be static when they are nested (inside another class)

