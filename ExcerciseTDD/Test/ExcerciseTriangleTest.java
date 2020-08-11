import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcerciseTriangleTest {

    @Test
    void checkTriangleType() {
        int canhA = 19;
        int canhB = 10;
        int canhC = 10;

        String expected = "tam giác đều";
        String result = ExcerciseTriangle.checkTriangleType(canhA,canhB,canhC);

        assertEquals(expected,result);
    }
}