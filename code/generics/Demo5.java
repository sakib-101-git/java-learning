public class Demo5 {
    public static void main(String[] args) {
        
        Box<Integer> b1 = new Box<>();
        // Box<String> b2 = new Box<>(); // error cause String is not a subtype of Number

    }
}

class Box<T extends Number> { // number is a subclass containing all the integer float double.. numeric datatypes

    T value;

    public void printDouble() {
        System.out.println(value);

    }
}

/*
    Bounds in Generics
    -> Upper Bound

    // <T extends Class & Interface1, Interface2>

*/