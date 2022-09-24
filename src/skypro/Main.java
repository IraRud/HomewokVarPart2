package skypro;

public class Main {
    public static void main(String[] args) {

        int numberBananas = 5;
        int weightBanana = 80;
        int totalWeightBananas = numberBananas * weightBanana;
        int numberMilk = 2;
        int weightMilk = 105;
        int totalWeightMilk = numberMilk * weightMilk;
        int numberIceCream = 2;
        int weightIceCream = 100;
        int totalWeightIceCream = numberIceCream * weightIceCream;
        int numberEggs = 4;
        int weightEggs = 70;
        int totalWeightEggs = numberEggs * weightEggs;
        float totalWeightBreakfast = (totalWeightEggs + totalWeightBananas + totalWeightIceCream
                + totalWeightMilk) / 1000f;
        System.out.println("Общий вес завтрака " + totalWeightBreakfast + " кг.");


    }
}
