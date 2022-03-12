package delDel;

public class delDel {
    public static String delDel(String str) {
        String result = "";
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            result = str.substring(0, 1) + str.substring(4);
            return result;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println();
    }
}
