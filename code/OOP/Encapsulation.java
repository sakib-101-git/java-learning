public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.withdraw(2500);
        System.out.println("your current balance is: " + ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    //getter
    public double getBalance () {
        return balance;
    }

    //setter
    //not applicable as we can not change set a balance from code

    //getter setters are used mostly for Encapsulation

}


class Student {

    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.college = college;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    //getters and setters
    //getter returns the name value thats why string not void
    public String getName() {
        return name;
    }

    // setting the name that is why void return type
    public void setName(String name) {
        this.name = name;
    }

}
/*
    ENCAPSULATION
    1. Both data and behavior should be together (encapsulated)
    within an object.
    2. We should not provide unrestricted access of data

    ACESS MODIFIER
    1. who have access to -> variable, method, constructor. class
    2. 4 access modifiers -> public, default, protected, private

    private -> cannot be accessed outside the class it is defined in
    default -> anyone can acess belonging to same package
    -> if there is no access modifier explicitly said.. it is 'default' by default
    *** package -> groups similar classes and interfaces together
    protected -> package + inherited class (child class)
    public -> anyone can access

    most used access modifiers are private and public

    *** root class cannot be private and protected
    *** you can access the private variables by defining methods
    within the class

*/