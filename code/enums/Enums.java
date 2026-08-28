/*
    Problems with normal approach
    1. Type Safety
    2. Poor Readability

*/

// enum -> Enumerations (Enumerated type)
// enum -> predefined set of constants

public class Enums {
    public static void main(String[] args) {


        PaymentStatus status = PaymentStatus.PENDING;
        //PaymentStatus status = 100; this produces error cause enum is typesafe

        System.out.println(status.name());
    }

}


enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

/*
    enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

    This converts into the JVM to ->
    
    // Here <Direction> is a generic (learn later)

    final class Direction extends Enum<Direction> {
        public static final Direction NORTH = new Direction();
        public static final Direction SOUTH = new Direction();
        public static final Direction EAST = new Direction();
        public static final Direction WEST = new Direction();

        // constructor kept private so that no outer class cannot
        // create an object of this class Direction
        private Direction() {
        
        }
    }


    enum is nothing but a special type of class

    -> enum overrides java.lang.Enum class
    -> each constants are static and final
    -> enum are objects of class direction


*/