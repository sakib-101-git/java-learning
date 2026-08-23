public class POJO {
    
}

/*
    POJO -> Plain Old Java Object
    -> There should not be any hardcoded business logic
    -> allowed
        -> getter/setter
        -> constructor
        -> variables(fields)
        -> Business logic
        -> builder

    POJO -> Anemic Model
                -> getter/setter
                -> constructor
                -> variables(fields)
    POJO -> Rich Domain Model
                -> Business Logic

    // Anemic Model
    class Sample {
        int x;
        String y;

        Sample(int x, String y){
            .. ..
            ..

        }
        
        int getX() {
            return x;
        }
        
        void setX(int x) {
            this.x = x;
        }
    }

    // Business Model
    some class that will represent behaviors

*/