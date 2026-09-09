

public class Wildcards {
    public static void main(String[] args) {
        
        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        // Dog[] dogs = new Dog[10];
        // Animal[] animal = dogs;
        
        // animal[0] = new Animal();


        // //Exception in thread "main" java.lang.ArrayStoreException: Animal at Wildcards.main(Wildcards.java:12)

        // for(Animal animals : animal) {
        //     animals.eat();
        // }

    }
}


class Animal {
    void eat() {
        System.out.println("Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
/*
    Generics break parent-child relationship and hierarchy
    List<Integer> list = new ArrayList<>();

    Dog is an animal
    List<Dog> is a List<Animal> --> this is not possible, no relation
    Generic<Dog> is not subtype of Generic<Animal>
    because typesafety will break

    for this typesafe problem there is a solution named wildcards
    List<?> list = new ArrayList<Animal>();

*/