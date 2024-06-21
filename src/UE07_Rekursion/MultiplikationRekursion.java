package UE07_Rekursion;

public class MultiplikationRekursion {
    public static void main(String[] args) {
        System.out.println(multiplikationRekursion(3,4));
    }

    public static int multiplikationRekursion(int multiplicand, int multiplier) {
        if (multiplier == 1) {
            return multiplicand;
        } else {
            return multiplicand + multiplikationRekursion(multiplicand, multiplier - 1); //
        }
    }
}
