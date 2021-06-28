public class HomeWork4 {
    public static void main(String[] args) {
        int[] mass = {2, 3, 4, 5, 198};
        int count = 0;
        for (int i : mass) {
            count += i;
            System.out.println(count);
        }
        double c = (double) count / mass.length;
        System.out.println(c);
    }
}



