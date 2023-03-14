public class Recursion {

    public static void main(String[] args) {

        System.out.println(factorial(10));

        System.out.println(power(2, 10));
    }

    private static int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }

}
