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