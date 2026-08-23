public class InDepthAbstraction {
    public static void main(String[] args) {
        Animal a = new Dog("Dihh");
        a.makeSound();
    }
}

abstract class Animal {

    String name;
    
    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping");
    }
    
    static void eat() {

    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("makes Barking sound");
    }
}


/*
    Abstract classes
    1. cannot be instantiated directly
    2. can contain abstract method (methods without implementation)
    3. can also contain normal methods.
    4. is meant to be extended.
*/

/*
    Questions
    1. Can abstract classes have constructors? -> YES
    2. Can abstract classes be final? -> NO
    3. Can abstract classes have static methods? -> YES
    static methods can be used on object level even if its part of
    the abstract class.
    4. Can abstract classes have private methods? -> Allowed if defined properly
    but private methods cannot be of abstract -> abstract private void jumps() XXX -> not allowed
    Can abstract classes have final methods? -> Yes, methods defined properly inside the abstract 
    class is correct
    5. Can abstract classes have no abstract methods? -> Yes
*/