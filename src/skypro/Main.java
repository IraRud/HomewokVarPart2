package skypro;

public class Main {
    public static void main(String[] args) {
        byte variableByte = 1;
        short variableShort = 1_000;
        int variableInt = 100_000;
        long variableLong = 1_000_000L;
        float variableFloat = 1.25f;
        double variableDouble = 1.256;

        System.out.println("\nЗначение переменной variableByte + с типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort + с типом short равно " + variableShort);
        System.out.println("Значение переменной variableInt + с типом int равно " + variableInt);
        System.out.println("Значение переменной variableLong + с типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat + с типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble + с типом double равно " + variableDouble);
    }
}
