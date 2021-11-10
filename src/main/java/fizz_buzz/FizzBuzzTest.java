package fizz_buzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setUp() {
        FizzBuzz fizzBuzzTDD = new FizzBuzz();
    }

    @After
    public void tearDown() {
        fizzBuzz = null;
    }

    @Test
    public void testFizzBuzz() {
        fizzBuzz.checkResult(0);
        fizzBuzz.checkResult(15);
        fizzBuzz.checkResult(75);
        fizzBuzz.checkResult(3);
        fizzBuzz.checkResult(5);
        fizzBuzz.checkResult(19);

    }
}
