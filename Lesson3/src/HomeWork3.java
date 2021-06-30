public class HomeWork3 {
    public static void main(String[] args) {
        countDevs(i);
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        int p = count % 100;
        int p2 = p / 10;
        if (p2 == 1){
            System.out.println( p+  "программист");
        }




