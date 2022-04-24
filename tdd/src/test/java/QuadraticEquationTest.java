import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEquationTest {

    // x^2+1 = 0
    @Test
    void firstTest() {
        double[] answers = QuadraticEquation.solve(1, 0, 1);

        Assertions.assertEquals(0, answers.length);
    }

    // x^2-1 = 0
    @Test
    void secondTest() {
        double[] answers = QuadraticEquation.solve(1, 0, -1);

        Assertions.assertEquals(2, answers.length);
        Assertions.assertEquals(-1, answers[0]);
        Assertions.assertEquals(1, answers[1]);
    }

    // x^2+2x+1 = 0
    @Test
    void thirdTest() {
        double[] answers = QuadraticEquation.solve(1, 2, 1);

        Assertions.assertEquals(1, answers.length);
        Assertions.assertEquals(-1, answers[0]);
    }

    // a = 0
    @Test
    void fourthTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> QuadraticEquation.solve(0, 0, 0));
    }

}
