public class Demo4 {
    public static void main(String[] args) {
        // Integer y = getResult(69);
        // System.out.println(y);

        printPair(11, "bro chill");
    }

    public static <T> T getResult(T x){ //<T> Type parameter
        return x;
    }

    public static <T,U> void printPair(T first, U second){
        System.out.println(first + " "+ second);
    }
}


// Generic methods
// <T> returnType methodName(T parameter)
/*
    class Box<T>{ // can work with all type of data types
        T value;
    }

    Box<String> b1 = new Box<>("Sakib");
    
    // but we want to restrict to some specific datatypes
    //Bound generics
    

*/