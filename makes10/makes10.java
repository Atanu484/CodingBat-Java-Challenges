package makes10;

public class makes10 {
    public static boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        }else if(a + b == 10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(makes10(9,10));
        System.out.println(makes10(9,9));
        System.out.println(makes10(1,9));
    }
}
