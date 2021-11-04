package tema.sci.IO;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class AthletesDataProcessingTest {

    @Test
    public void testUpdateDataFromCsv() {
        //given
        AthletesDataProcessing testData = new AthletesDataProcessing();
        //when
        testData.updateDataFromCsv();
        //then
        assertEquals(testData.counter, testData.getAthleteList().size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetAthleteFromCsvLine() {
        //given
        AthletesDataProcessing testData = new AthletesDataProcessing();
        String inputLine = "1,Dorel,RO";
        //when
        testData.getAthleteFromCsvLine(inputLine);
    }
    @Test
    public void testGetAthleteFromCsvLineWithTrim() {
        //given
        AthletesDataProcessing testData = new AthletesDataProcessing();
        String inputLine = "1,Pasca ,RO, 30:34,xxoxo, xxoxx,xxoxo";
        //when
        testData.getAthleteList().add(testData.getAthleteFromCsvLine(inputLine));
        //then
        assertEquals(1, testData.getAthleteList().size());
    }

    @Test
    public void testSortAthleteList() {
        //given
        AthletesDataProcessing testMethodeData = new AthletesDataProcessing();
        AthletesDataProcessing testForComparing = new AthletesDataProcessing();

        //when
        testMethodeData.updateDataFromCsv();
        testForComparing.updateDataFromCsv();
        testMethodeData.sortAthleteList();

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for(Athlete athlete: testMethodeData.getAthleteList()){
            firstList.add(athlete.getFinalTimeInSeconds());
        }
        for(Athlete athlete: testForComparing.getAthleteList()){
            secondList.add(athlete.getFinalTimeInSeconds());
        }

        secondList.sort(Comparator.comparingInt(o -> o));

        //then
       assertArrayEquals(new List[]{firstList}, new List[]{secondList});
    }
}