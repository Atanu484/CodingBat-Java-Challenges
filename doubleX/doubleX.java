package doubleX;

public class doubleX {
    public static boolean doubleX(String str) {
           if(str.indexOf(1) == str.indexOf(3)){
               return true;
           }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
}
