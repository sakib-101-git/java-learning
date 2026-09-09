public class Interfaces {
    public static void main(String[] args) {
        // Car c = new Toyota();
        // c.drive(); 

        Payment p1 = new DebitCard();
        Payment p2 = new CreditCard();
        p1.pay();
        p2.pay();
    }
}

interface Car {
    void drive(); // methods are by default public
}

abstract class Toyota implements Car {
    // @Override 
    // public void drive() {
    //     System.out.println("Toyota is too fast");
    // }

    // if you dont want to override

    abstract public void drive();
}

interface Payment {
    void pay();
}


class CreditCard implements Payment {
    @Override 
    public void pay(){
        System.out.println("Paying Via Credit Card");
    }
}

class DebitCard implements Payment {
    @Override 
    public void pay(){
        System.out.println("Paying Via Debit Card");
    }
}
/*

    syntax -> interface Car {...}

    definition -> interfaces defines what an object can do without telling how it does that

    interface Car {
        void drive();
    }

    we implement interfaces
    interace is a blueprint of behavior
    you cant define methods in interface
    the defining is done in class
    interface is a contract

    interface uses polymorphism perfectly

*/