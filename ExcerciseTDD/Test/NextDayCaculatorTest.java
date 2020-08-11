import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCaculatorTest {

    @org.junit.jupiter.api.Test
    void nextDay() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String check = NextDayCaculator.nextDay(day,month,year);
        String expected = "1/1/2021";
        assertEquals(check,expected);
    }
}