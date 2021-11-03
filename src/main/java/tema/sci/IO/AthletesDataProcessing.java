package tema.sci.IO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.*;


public class AthletesDataProcessing {

    private List<Athlete> athleteList = new ArrayList<>();




    Scanner scanner = null;
    int counter = 0;

    public void updateDataFromCsv() {


        try  {
            scanner = new Scanner(new BufferedReader(new FileReader("src/main/resources/Athletes_In.csv")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {

                String input = scanner.nextLine();
                String[] data = input.split(",");

                String athleteId = data[0];
                String athleteName = data[1];
                String countryList = data[2];
                String time = data[3];
                String firstShooting = data[4];
                String secondShooting =data[5];
                String thirdShooting = data[6];


                athleteList.add(new Athlete(athleteId, athleteName, countryList,
                        time, firstShooting, secondShooting, thirdShooting));
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }


    public void sortAthleteList(){
       athleteList.sort(new Comparator<Athlete>() {
                @Override
                public int compare(Athlete s1, Athlete s2) {
                    return s1.getFinalTimeInSeconds() - s2.getFinalTimeInSeconds();
                }
            });
    }

    public void firstThreeRanking(){

        sortAthleteList();
        System.out.println("\n");
        System.out.println("The first place is: " + athleteList.get(0));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The second place is: " + athleteList.get(1));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The third place is: " + athleteList.get(2));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    public List<Athlete> getAthleteList() {
        return athleteList;
    }

    @Override
    public String toString() {
        return "AthletesDataProcessing{" +
                "athleteList=" + athleteList +
                '}';
    }
}
