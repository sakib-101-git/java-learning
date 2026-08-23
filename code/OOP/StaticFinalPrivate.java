/*
    static classes cannot be Override
    Fields/ Variables cannot be polymorphic
    private methods cannot be Override
    final methods cannot be override

    if a class is final -> you cannot inherit a final class
    
*/

public class StaticFinalPrivate {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        // This prints Hello because override is not allowed with static
    }
}

class A {
    static void fun() {
        System.out.println("Hello");
    }

    // private void fun2() {
    //     System.out.println("Hello");
    // }

    final void fun3() {
        System.out.println("Hello");
    }
}

class B extends A {
    
    static void fun() {
        System.out.println("Bye");
    }

    // // this is a completely new fun2() method 
    // // BECAUSE private METHODS CANNOT BE OVERRIDEN
    // private void fun2() {

    // }

    // compiler error cause Final methods cannot be overriden
    // final's main purpose is to define something once
    void fun3() {
        System.out.println("Bye");
    }
}


// // This outputs Bye cause there is no static keyword anymore
// public class StaticFinalPrivate {
//     public static void main(String[] args) {
//         A a = new B();
//         a.fun();
//         // This prints Hello because override is not allowed with static
//     }
// }

// class A {
//     void fun() {
//         System.out.println("Hello");
//     }

// }

// class B extends A {
    
//     void fun() {
//         System.out.println("Bye");
//     }
// }