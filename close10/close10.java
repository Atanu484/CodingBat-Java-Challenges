package close10;

public class close10 {
    public static int close10(int a, int b) {

        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(close10(10,12));
        System.out.println(close10(1,12));
        System.out.println(close10(24,12));
    }
}
