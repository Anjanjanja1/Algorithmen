package UE07_Rekursion;

public class Rekursion02 {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(3));
        System.out.println(factorialForLoop(3));
        System.out.println(factorialRecursionWithHelper(3));
    }

    public static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    public static int factorialForLoop(int n) {
        int product = n;
        for (int i = (n - 1); i > 0; i--) {
            product = product * i;
        }
        return product;
    }

    public static int factorialRecursionWithHelper(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int temp = factorialRecursionWithHelper(n - 1);
            return n * temp;
        }
    }
}
