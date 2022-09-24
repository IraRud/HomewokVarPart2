package skypro;

public class Main {
    public static void main(String[] args) {

        int requiredWeight = 7 * 1000;
        int lostWeightOne = 250;
        int lostWeightTwo = 500;
        double requiredDaysOne = requiredWeight / lostWeightOne;
        double requiredDaysTwo = requiredWeight / lostWeightTwo;
        System.out.println("Если спортмен в день будет худеть на " +
                lostWeightOne + " грамм, то он сбросит неоходимых 7 кг через " + requiredDaysOne +
                " дней. \nЕсли спортмен в день будет худеть на " + lostWeightTwo +
                " грамм - через " + requiredDaysTwo + ".");

    }
}
