package tests;

import com.reversedBinary.Reader;
import com.reversedBinary.Solver;
import org.junit.Test;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class SolverTest {

    @Test
    public void solve_should_returnCorrectAnswer_When_Case1() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./tests/resources/1.in"));
        String expectedAnswer = Utils.ReadResourceString("./tests/resources/1.out");
        Solver solver = new Solver(reader);

        // Act
        String answer = solver.solve();

        // Assert
        org.junit.Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void solve_should_returnCorrectAnswer_When_Case2() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./tests/resources/2.in"));
        String expectedAnswer = Utils.ReadResourceString("./tests/resources/2.out");
        Solver solver = new Solver(reader);

        // Act
        String answer = solver.solve();

        // Assert
        org.junit.Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void testCalculate() throws Exception {
        // Arrange
        int expected = 11;

        // Act
        int result = Solver.calculate(13);

        // Assert
        org.junit.Assert.assertEquals(expected, result);
    }
}
