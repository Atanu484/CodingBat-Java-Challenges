package nearHundred;

public class nearHundred {
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(133));
        System.out.println(nearHundred(13));
        System.out.println(nearHundred(89));
    }
}
