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
        fizzBuzz.checkResult(13);
    }
}
