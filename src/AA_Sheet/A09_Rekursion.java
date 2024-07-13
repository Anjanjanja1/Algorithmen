package AA_Sheet;

public class A09_Rekursion {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int sum = sumOfArray(arr, arr.length);
        System.out.println("Sum of array elements: " + sum);

        int n = 1234; // Change this value to test other cases
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));

        int base = 2;
        int exp = 3; // Change these values to test other cases
        System.out.println(base + " raised to the power of " + exp + " is: " + power(base, exp));

        System.out.println(factorialRecursion(3));

        int a = 0;
        int b = 12;
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is " + greatestCommonDivisor(a, b));

        int num = 10; // Change this value to test other cases
        System.out.println("Fibonacci number F(" + n + ") is: " + fibonacci(num));

        String str = "racecar"; // Change this value to test other cases
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome(str));
    }

    // Recursive method to calculate the sum of elements in the array
    public static int sumOfArray(int[] arr, int n) {
        // Base case
        if (n <= 0) {
            return 0;
        }
        // Recursive case
        return sumOfArray(arr, n - 1) + arr[n - 1];
    }

    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n % 10 + sumOfDigits(n / 10);
    }

    // Recursive method to calculate the power of a number
    public static int power(int base, int exp) {
        // Base case
        if (exp == 0) {
            return 1;
        }
        // Recursive case
        return base * power(base, exp - 1);
    }

    public static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    // Recursive method to find the Greatest Common Divisor of two numbers
    public static int greatestCommonDivisor(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }
        // Recursive case
        return greatestCommonDivisor(b, a % b);
    }

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base cases
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Recursive case
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}


