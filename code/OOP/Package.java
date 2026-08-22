// this file is for school and college folders file access
// thus we have to import college and school packages

//syntax: import packageName.className
//import school.Student;


public class Package {
    public static void main(String[] args) {

        school.Student s1 = new school.Student();
        s1.print();

        college.Student s2 = new college.Student();
        s2.print();
    }
}


/* 
    Packages in java

    2 types of packages -> User-defined packages, in-built package

    in built packages ->
    import java.util.ArrayList -> Arraylist
    import java.util.* -> all the util packages
    import java.io -> input output

*/ 
