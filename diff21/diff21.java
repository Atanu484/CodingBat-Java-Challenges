package diff21;

public class diff21 {
    public static int diff21(int n) {
        int result = 21 - n;
        if(n > 21){
            return 2 * - result;
        }else{
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(diff21(21));
        System.out.println(diff21(1));
        System.out.println(diff21(11));
        System.out.println(diff21(10));
    }
}
