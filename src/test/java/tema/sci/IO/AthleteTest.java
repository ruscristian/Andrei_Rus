package tema.sci.IO;

import org.junit.Test;

import static org.junit.Assert.*;

public class AthleteTest {

    @Test
    public void testCalculateResultFromShooting() {
        //given
        Athlete testAthlete = new Athlete("1","John", "GB", "30:00", "xxoxx","ooxxo", "xxxxx");
        //when
        int calculationTest1 = testAthlete.calculateResultFromShooting(testAthlete.getFirstShooting());
        int calculationTest2 = testAthlete.calculateResultFromShooting(testAthlete.getSecondShooting());
        int calculationTest3 = testAthlete.calculateResultFromShooting(testAthlete.getThirdShooting());

        //then
        assertEquals(10, calculationTest1);
        assertEquals(30, calculationTest2);
        assertEquals(0, calculationTest3);
    }

    @Test
    public void testMakeFinalTimeInSeconds() {
        //given
        //when
        Athlete testAthlete = new Athlete("1","John", "GB", "30:00", "xxoxx","ooxxo", "xxxxx");
        //then
        assertEquals(1840, testAthlete.getFinalTimeInSeconds());
    }
}