public class Overloading {
    public static void main(String[] args) {
        //Function Overloading
        System.out.println(sum(5,6));
        System.out.println(sum(5,6, 7));
        System.out.println(sum(5.0,6.0));
        greet("Sakib", 24);
        greet(58, "Arshad");
        fun();
        fun2();
    }

    static int sum(int a, int b){
        return a+b;
    }

    // different no. of parameters
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    //different data type
    static int sum(double a, double b){
        return (int)(a+b); //typecasted because can't return double value
    }

    static void greet(String name, int age) {
        System.out.println("Hi " + name + ", Your age is " + age);
    }

    // same parameters with different order  
    static void greet(int age, String name) {
        System.out.println("Hi " + name + ", Your age is " + age);
    }    

    static void fun() {
        System.out.println("Hello from void type");
    }

    static int fun2() {
        System.out.println("Hello from int type");
        return 5;
    }

}
