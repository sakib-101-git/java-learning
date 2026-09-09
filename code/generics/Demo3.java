public class Demo3 {
    public static void main(String[] args) {
        
        // Different types of datatype together in generic
        Pair<String, Integer> p = new Pair<>("Name", 5);

        System.out.println(p.first + ", " + p.second);
    }
}


class Pair<S, I> {
    S first;
    I second;

    Pair(S first, I second) {
        this.first = first;
        this.second = second;
    }
}