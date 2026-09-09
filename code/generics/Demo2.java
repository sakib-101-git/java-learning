public class Demo2 {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(10); // Integer type box in heap memory
        Box<String> b2 = new Box<>("Hello ");
        Box<Boolean> b3 = new Box<>(false);

        // System.out.println(b1.getValue() + 5);
        // System.out.println(b2.getValue() + 5);
        // System.out.println(b3.getValue());

        // String s = (String) b1.getValue(); // now we get the error in compile time
        


    }
}

class Box<T> { // Type Parameter

    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// Type information is not lost

/*
    Generics

    -> Object class is too generic

    Limitations of using Object as Universal Type
        -> Type information is lost
        -> Wrong object could be inserted
        -> Casting became necessary when reading
        -> many errors shift to runtime

    
*/
