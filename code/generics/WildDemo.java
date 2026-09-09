
import java.util.ArrayList;
import java.util.List;



public class WildDemo {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
    }

    static void fun(List<?> animals) {
        for(Object animal: animals) {
            System.out.println(animal.getClass().getName());
        }
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