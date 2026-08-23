public class Autoboxing {
    public static void main(String[] args) {

        // // Autoboxing
        // int x = 10;
        // Integer y = x; // this line is autoboxing
        // //Integer y = Integer.valueOf(x);

        // System.out.println(x);
        // System.out.println(y); //unboxing

        int x = 50;

        // Integer x = null;
        // int y = x;
        // nullPointerException will be shown on the above line

        printInteger(x);
        

    }

    static void printInteger(Integer x) {
        System.out.println(x);
    }
}


/*
    1. Autoboxing is applied on assignment operation
    2. Calling method
*/