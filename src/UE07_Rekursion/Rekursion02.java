package UE07_Rekursion;

public class Rekursion02 {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(3));
    }

    public static int factorialForLoop(int product) {
        for (int i = (product - 1); i > 0; i--) {
            product = product * i;
        }
        return product; //TODO
    }


    public static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    public static int factorialRecursionWithHelper(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int temp = n * factorialRecursionWithHelper(n - 1);
            return n * temp;
        }
    }
}
