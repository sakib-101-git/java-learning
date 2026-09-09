public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        r1.fun();
    }
}

interface MathConstant {
    public static final double PI_VALUE = 3.14;
    int VALUE = 10;
    void fun();
}

class Random implements MathConstant {
    @Override
    public void fun() {
        System.out.println(PI_VALUE);
    }
}

/*
    Multiple inheritance is not supported in java
    -> java implements multiple inheritance through interfaces
    -> inheritance in class extends some functionality
    -> interfaces implements multiple class functionality 
*/

// interface A {
//     void fun();
// }

// interface B {
//     void nofun();
// }

// class C implements A, B {
//     @Override
//     public void fun() { 

//     }
    
//     @Override
//     public void nofun() {

//     }

// }

// // After java 8

interface Vehicle {

    default void drive(){
        System.out.println(" Vehicle is auto-driving");
    }

    // calling the static methods directly
    static void brake() {
        System.out.println("Vehicle brake kore dise");
    }

    private void accelerate() {
        System.out.println("Vehicle goes brrrrrrrrrrrr");
    }
}

class Car implements Vehicle {

    @Override
    public void drive() {

    }
}

// if nothing overrides the Vehicle interface, it applies the default method
// default method is built for no problem facing during new method declaration. so that we dont always have to @Override every new method

// after Java 9

/*
    Diamond Problem
    -> creates confusion between which parent's method we should inherit
    -> interace solves this with implements cause we dont define on the interfaces
    

*/

/*
    interfaces can have default methods, static methods, private methods
    static and final variables are also possible inside an interface

    how do we seperate interface from abstract classes?
    -> Interfaces are contracts
    -> interface is used to show roles, functionalities
    -> thats why interfaces are used as ability of verbs
    -> runnable, walkable, payable
    -> classA implements Runnable {}
    -> no constructors
    -> no relationship with an object
    -> behaviors and functionalities er shathe relationship ase
    -> can have multiple inheritance
    -> generally by default public classes
    -> Functional Interfaces -> lambda expressions, functional programming
    -> Marker Interfaces -> no methods
    -> java compiler treats interfaces as classes
    

    -> Abstract class hold families of similar similar classes
    -> dog, duck, elephant -->> goes inside a family abstract classs Animal
    -> abstract classes are Is A/AN relationship
    -->> dog is an animal
    -->> elephant is an animal
    -> we can use constructors
    -> no multiple inheritance
    -> can use any access modifiers (public, private, protected)



    


*/