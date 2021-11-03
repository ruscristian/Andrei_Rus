package tema.sci.IO;

public class Main {


    public static void main(String[] args) {

        AthletesDataProcessing athletesDataProcessing = new AthletesDataProcessing();
        athletesDataProcessing.updateDataFromCsv();
        System.out.println(athletesDataProcessing.getAthleteList());
        athletesDataProcessing.firstThreeRanking();

    }
}
