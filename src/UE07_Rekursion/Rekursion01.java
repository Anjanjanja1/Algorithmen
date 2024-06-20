package UE07_Rekursion;

public class Rekursion01 {
    public static void main(String[] args) {
        System.out.println("*** A ***");
        recursiveFunction(1);
        System.out.println("*** B ***");
        recursiveFunctionB(1);
    }

    public static void recursiveFunction(int num) {
        System.out.printf("%d\n", num);

        if (num >= 4) {
            return;
        } else {
            recursiveFunction(num + 1);
        }
    }

    public static void recursiveFunctionB(int num) {
        if (num >= 4) {
            return;
        } else {
            recursiveFunctionB(num + 1);
        }
        System.out.printf("%d\n", num);
    }
}
