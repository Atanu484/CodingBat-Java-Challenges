package max1020;

public class max1020 {
    public static int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(max1020(5,1));
        System.out.println(max1020(15,16));
        System.out.println(max1020(13,1));
        System.out.println(max1020(50,13));
    }
}
