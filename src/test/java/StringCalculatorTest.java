import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The class is test harness to run the test workflow.
 *
 * @author DeWayne Dantzler dewayne.dantler@bellevuecollege.edu
 */
public class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test//Assert IllegalArgumentException if "startWord" <= 0
    public void testGeSubStrings2() {
        assertThrows(IllegalArgumentException.class, () -> {add("-1,100").;});
    }
}
