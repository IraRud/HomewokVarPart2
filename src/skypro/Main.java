package skypro;

public class Main {
    public static void main(String[] args) {

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short totalPaper = 480;

        float paperForOne = totalPaper / (studentsAS + studentsLP + studentsEA);
        System.out.println("Количество листов бумаги на одного ученика " + paperForOne);

    }
}
