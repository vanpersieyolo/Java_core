import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    Scanner scanner = new Scanner(System.in);
    @Test
    void fizzorBuzz() {
        int enterNum = 34;
        String test = FizzBuzz.fizzorBuzz(enterNum);
        String expected = "34";
        assertEquals(test,expected);
    }
    @Test
    void upfizzorBuzz() {
        int number = 41;
        String test = FizzBuzz.upFizzorBuzz(number);
        String expected = "bốn một ";
        assertEquals(test,expected);
    }


}