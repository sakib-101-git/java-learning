public class Nesting {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();
        inner.fun();

    }
}

// Static nested class
class Outer { // outer class 

    static int x = 4;

    int y = 40;
    // // this cannot be accessed by a static method
    // // because static class can access static methods or variable
    static class Inner { // inner class 

        Outer outer;
        Inner(Outer outer) {
            this.outer = outer;
        }
        void fun() {
            System.out.println(x);
            System.out.println(outer.y);
        }

    }
}

/*

    4 types of nested class
    -> Static nested
    -> inner class
    -> local class
    -> anonymous class


    Why need nested class?
    1. Logical Grouping
    2. Better access to outer class

*/