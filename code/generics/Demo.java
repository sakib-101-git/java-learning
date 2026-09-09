public class Demo {
    public static void main(String[] args) {
        
        
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        // System.out.println(b1.getValue() + 5); // cant add object and integer
        

        // Downcasting
        Integer x = (Integer) b1.getValue();
        String s = (String) b2.getValue();

        System.out.println(x + 5);
        System.out.println(s + " Motto");


        


    }
}

// class Box {
//     private int value;

//     Box(int value){
//         this.value = value;
//     }

//     public int getValue() {
//         return this.value;
//     }

//     public void setValue(int value) {
//         this.value = value;
//     }
// }

class Box {

    private Object value;
    Box(Object value){
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

/*
    Generics

    -> Object class is too generic

    Limitations of using Object as Universal Type
        -> Type information is lost
        -> Wrong object could be inserted
        -> Casting became necessary when reading
        -> many errors shift to runtime

    
*/