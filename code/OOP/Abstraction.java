public class Abstraction {
    public static void main(String[] args) {

        Car car2 = new FuelCar();
        car2.start();
        car2.accelerate();
        car2.brake();

        System.out.print("\n");
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();


    }
}

abstract class Car {
    
    abstract void start();

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {

    //Annotations
    @Override
    void start() {
        System.out.println("Fuel car has started");
    }
    @Override
    void accelerate() {
        System.out.println("car running but fuel is decreasing");
    }

    @Override
    void brake() {
        System.out.println("car stopped but still fuel decreasing");
    }
}

class ElectricCar extends Car {

    @Override
    void start() {
        System.out.println("oreee sudanirfuar tesla durer dee!!");
    }

    @Override
    void accelerate() {
        System.out.println("teslar maarebap");
    }
    @Override
    void brake() {
        System.out.println("tesla tham!! tor maarebap");
    }

}

/*
    Abstraction 
    -> The process of focusing on what something does, while ignoring how it does that.
    car -> drives, breaks, accelerates these are what it does, how it does it is not our concern
    OOP does not represent reality, it represents how human think about reality. the idea of an object
    
    Abstraction does 2 things ->
    1. represent whatever is necessary
    2. even what we model, we dont want everyone to know how everything works, we just want them to use it.

    basically abstracting or somewhat hiding how we are doing something. we just expose what it does

    In Java abstraction is implemented in 2 ways: 
    1. Low level abstraction -> hiding implementation details
    ex:
    class Main {
        main() {
            Car c = new Car();
            c.start(); // this call does not know how this method is being implemented
            c.accelerate(); // upore
            c.brake(); // upore
        }
    }

    class Car {
        String type;
        ...
        ..

        start() { }
        accelerate() { }
        brake() { }
    }

    2. High level abstraction -> seperate WHAT from HOW
    ex: 
    -> Abstract classes
    -> Interfaces
    ex:

    // These are concrete classes

    class Main {
        main() {

            // here object c is tightly coupled with the class
            Car c = new Car();

            // now we are abstracting the parent class by creating an object
            // with reference to child class

            Car tesla = new ElectricCar();

            
            // c.start(), accelerate(), brake() these WHAT methods are very close to the HOW methods
            // this is a problem because the start can be of different type for different cars
            // like kickstart, pushbuttonstart, keystart etc.

            c.start(); // this call does not know how this method is being implemented
            c.accelerate(); // upore
            c.brake(); // upore
             
        }
    }
    class Car {
        String type;
        ...
        ..

        start() { }
        accelerate() { }
        brake() { }
    }

    class ElectricCar extends Car { }
    class FuelCar extends Car { }


    this is where Abstract Classes come in:

    class Car {
        String type;
        ...
        ..

        start() { }
        // concrete method
        accelerate() { // something generic}
        
        // so we have to do it in different way
        abstract accelerate() { }
        brake() { }
    }

    // now in java if any method is abstract, we have to make the whole class abstract
    // so the Car class would be abstract

    abstract class Car {
        ...
        ...
    }

    class FuelCar extends Car {
        accelerate() {
            //implementation code is different here
        }
    }

    class ElectricCar extends Car {
        accelerate() {
            //implementation code is different here too
        }
    }



    ***INERFACES
    -> looks similar to abstract class
    class -> blueprint of object
    interface -> no relation to object
    interface is contractual

    //interfaces are by default abstract
    interface Car {
        void start();
        void accelerate();
        void brake(); 
    }

    //inheriting interface
    class FuelCar implements Car {
        define start();
        ...
        ...
    }

    class Main{
        main() {
            //same way we call an object
        }
    }


    why we need interface?
    -> pure what.. nothing about how (pure abstraction)

    abstract classes are partial what & how

    the difference is in the intention
    -> Interface's main job is to represent contracts
    -> Interface declares what a class's responsibility/role/capability is
    -> *** MULTIPLE INHERITANCE CAN BE IMPLEMENTED WITH INTERFACE
    -> Abstract classes are families of similar objects
    

    Comparable Interface
    Serializable Interface
    Flyable Interface
    Walkable Interface
    Runnable Interface
    

    all interfaces are 'able' suffix ending

    interface flyable 
    class Aeroplane flies 
    class Bird flies


*/