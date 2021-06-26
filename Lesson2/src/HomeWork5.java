public class HomeWork5 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 100, 99};
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) max = Math.max(max, mass[i]);
        System.out.println(max);
    }
}



