public class fib {
    public static void main(String[] args) {
        System.out.println(fibo(100));
    }

    public static int fibo(int n){
        System.out.println(n);
        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
