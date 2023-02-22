public class Toplama {
    public static void main(String[] args) {
        topla(3, 2,5,-10);
        //v3 kubra calismalari
    }

    public static void topla(int... a) {
        int top =0;
        for (int w:a) {
            top+= w;
        }
        System.out.println(top);
    }
}