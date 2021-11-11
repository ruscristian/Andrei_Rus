package tema.sci.java8_homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tema.sci.IO.AthletesDataProcessing;

import java.io.File;
import java.util.Set;

import static org.mockito.Mockito.*;

public class ProcessingTest {
    @InjectMocks
    Processing processing;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateDataFromCsv() {
        processing.updateDataFromCsv();
    }

    @Test
    public void testGetStudentFroamCsvLine() {
        Student result = processing.getStudentFromCsvLine("firstName, lastName, 01.01.1990");
        processing.getStudentList().add(result);

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetStudentFromCsvLine() {
        //given
        String inputLine = "Dorel";
        //when
        processing.getStudentFromCsvLine(inputLine);
    }

    @Test
    public void testMoveStudentDataToFile() {
        processing.moveStudentDataToFile(5);
    }
}

