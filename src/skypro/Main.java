package skypro;

public class Main {
    public static void main(String[] args) {

        short cansOfTotalPaint = 120;
        short cansOfWhitePaint = 2;
        short cansOfBrownPaint = 4;
        int numberOfClass = cansOfTotalPaint / (cansOfWhitePaint + cansOfBrownPaint);
        System.out.println("В школе, где " + numberOfClass +
                " классов, нужно " + numberOfClass * cansOfWhitePaint +
                " банок белой краски и " + numberOfClass * cansOfBrownPaint +
                " банок коричневой краски.");

    }
}
