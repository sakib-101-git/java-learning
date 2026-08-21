class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));;
    }

    static int fibonacci(int n) {
        
        // Base Case
        if(n==0 || n==1) return 1;

        int x = fibonacci(n-1);
        int y = fibonacci(n-2);

        return x+y;
    }
}