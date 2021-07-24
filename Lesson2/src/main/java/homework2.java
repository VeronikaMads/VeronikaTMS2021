import static java.lang.Math.max;

public class homework2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println(c);
        c(100, 200);
    }

    public static int c(int a, int b) {
        long c = a + (long) b;
        System.out.println(c);
        if (c > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) c;
    }

}






