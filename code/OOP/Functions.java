public class Functions {
    public static void main(String[] args) {
        // Functions in Java
        greet();
        sayHello("Sakib");
        System.out.println(getNumber());
        System.out.println(multiply(69,420));
    }

    //No input, no output
    static void greet () {
        System.out.println("Hello");
        // return; // optional
    }

    // Yes input, no output
    static void sayHello(String name) { //Number of parameters can be anything
        System.out.println("Hello " + name); //printing is not output. by output we mean 'return'
    }

    // No input, yes output
    static int getNumber() {
        return 69;
    }

    //Yes input, yes output
    static int multiply(int a, int b) {
        return a*b;
    }

}
