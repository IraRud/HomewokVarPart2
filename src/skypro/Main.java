package skypro;

public class Main {
    public static void main(String[] args) {

        byte bottleTwoMinutes = 16;
        int bottleTwentyMinutes = bottleTwoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinutes + " штук бутылок");

        int bottleOneDay = bottleTwoMinutes * 30 * 24;
        System.out.println("За 1 день машина произвела " + bottleOneDay + " штук бутылок");

        int bottleThreeDay = bottleOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottleThreeDay + " штук бутылок");

        int bottleOneMonth = bottleOneDay * 30;
        System.out.println("За 1 месяц (30 дней) машина произвела " + bottleOneMonth + " штук бутылок");

    }
}
