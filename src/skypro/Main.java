package skypro;

public class Main {
    public static void main(String[] args) {

        int salaryMasha = 67_760;
        float newSalaryMasha = salaryMasha + salaryMasha * 0.1f;
        int yearSalaryMasha = salaryMasha * 12;
        float yearNewSalaryMasha = newSalaryMasha * 12;
        float differenceSalaryMasha = yearNewSalaryMasha - yearSalaryMasha;
        System.out.println("Зарплата Маши после повышения " + newSalaryMasha +
                " руб/месяц.\nГодовая зарплата Маши после повышения " + yearNewSalaryMasha +
                " руб/год.\nРазница в зарплате составляет " + differenceSalaryMasha +
                " руб/год.");

        int salaryDenis = 83_690;
        float newSalaryDenis = salaryDenis + salaryDenis * 0.1f;
        int yearSalaryDenis = salaryDenis * 12;
        float yearNewSalaryDenis = newSalaryDenis * 12;
        float differenceSalaryDenis = yearNewSalaryDenis - yearSalaryDenis;
        System.out.println("\nЗарплата Дениса после повышения " + newSalaryDenis +
                " руб/месяц.\nГодовая зарплата Дениса после повышения " + yearNewSalaryDenis +
                " руб/год.\nРазница в зарплате составляет " + differenceSalaryDenis +
                " руб/год.");

    }
}
