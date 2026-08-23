public class Equals {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        System.out.println(x == y); // prints true

        Integer a = 200;
        Integer b = 200;

        System.out.println(a == b); // prints false
        // '==' for objects compare reference variables
        // now there are two different reference variables with 
        // wrapper class Integer a and b. But when the values are 
        // in the range -128 to 127, it is considered in the caching
        // layer, where all the values are prestored and pointed
        // Suppose we write a = 10 and b = 10, compiles will use caching
        // and print this true cause both reference a and b will point to 
        // some pre-existing cache storage already pointing to the
        // value 10. 
        // But to compare in the right way we have to use
        // a.intValue() == b.intValue()

        System.out.println(a.intValue() == b.intValue()); // prints true
        // because we are not comparing reference variables anymore.. we are
        // directly comparing the values

        System.out.println(a.equals(b)); // prints true
        // This is another method for wrapper class .equals() which
        // directly compares the values

    }
}

/*
    //Conceptually visualizing Integer class

    public final class Integer {
        private int value;

        // Constructor
        public Integer(int value) {
            this.value = value;
        }

        // Getter
        public int intValue() {
            return value;
        }

        // converts to object
        public static Integer valueOf(int x) {
            // give object Integer of x // uses caching to convert int x to Integer 
        }
        
        // checks to compare x with y and returns boolean result true or false
        public boolean equals(Integer x) {
            return (x.intValue() == y.intValue());
        }
    }

*/