package sumDouble;

public class sumDouble {
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if( a ==  b){
            return 2 * sum;
        }else{
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(3,2));
        System.out.println(sumDouble(2,2));
    }
}
