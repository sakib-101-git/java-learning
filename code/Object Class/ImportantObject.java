
public class ImportantObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sakib";
        s1.age = 24;

        System.out.println(s1); // Student extends Object classes internally

        Student s2 = new Student();

        s2.name = "sakib";
        s2. age = 24;

        System.out.println(s1.equals(s2)); // because the references are not the same

        Student s3 = null;
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode()==s2.hashCode());
        

        // checks which object it is in run-time
        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());
        System.out.println(s1 instanceof Student);
    }
}

// InstanceOf operator --> checks if an object is an instance of a class 
// or any of its subclass

class Student {

    String name;
    int age;

    @Override
    public String toString() {
        return (name + "," + age);
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null){
            return false;
        }
        Student s = (Student) obj;
        
        return this.name == s.name && this.age == s.age; // this makes it compare the value

    }

    @Override
    public int hashCode() {
        
        // Implementing hashcode with prime number multiplication
        int result = 17;
        result = result*31 + age;
        result = result*31 + ((name == null) ? 0 : name.hashCode());

        return result;

        // alternative way to return hash directly without calculating using Objects class
        // return Objects.hash(age, name);
    }
    
}

/*
    Object class comes from java.lang package (System class)

    Every class in java inherits from Object class

    all java class silently extends Object class
    acts like the root of all classes

    Object 
    -> Common behaviors (Inheritance, Polymorphism etc..)

    Class Object
    -> Core Methods 
        1. toString() 
            -> convert anything to string
            -> string representation of any object
            
        2. equals() 
            -> compare two objects and returns true or false 
            -> if they are same the equals() compare their reference variables
        
        3. hashCode()
            -> returns an integer of an Object in an hexadecimal format
            -> if 2 objects are equal, there hashcode must be equal

        4. getClass()
            -> return runtime class of an object


    -> Cloning 
        1. Clone()
            -> create copy of an object

    -> Garbage Collection
        1. finalize()
    
    -> Threads
        1. wait()
        2. notify()
        3. notifyAll()

*/