public class Generics {
    public static void main(String[] args) {
        // Upcasting -> specific value to general value
        String s = "Hello";
        Object obj = s;

        System.out.println(obj);

        // Downcasting -> generic value to specific value
        Object obj2 = "Adiiiii";
        //String s2 = obj2; //Generics.java:11: error: incompatible types: Object cannot be converted to String

        String s2 = (String)obj2;
        System.out.println(s2);

    }
}

/*
    Type safety -> Java is a typed language
    Upcasting & downcasting
    int x = 4;
    long l = x; // Upcasting

    long y = 57;
    int z = y; // Downcasting 

    Animal is a parent class
    Dog is a child class

    if an object of animal points to an object of dog that is upcasting

    Object obj = "Hello";
    String s = obj; // Compiler error

    String s = (String)obj; // Downcasting

    the parent Object can hold many types of object but casting directly to String the compiler cannot tell what it is being converted into


*/