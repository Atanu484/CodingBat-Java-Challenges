package backAround;

public class backAround {
    public static String backAround(String str) {
        String lastChar = str.substring(str.length() -1);
        return lastChar + str + lastChar;
    }

    public static void main(String[] args) {
        System.out.println(backAround("Apple"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("A"));
    }
}
