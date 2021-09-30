package tema.sci.oop_homework.util;

import org.apache.commons.math3.random.RandomDataGenerator;

public class Generators {

    public static long getGeneratedLong()
    {
        long leftLimit = 1_000_000_000L;
        long rightLimit = 9_999_999_999L;
        return new RandomDataGenerator().nextLong(leftLimit, rightLimit);
    }
}
