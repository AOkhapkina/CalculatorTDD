import calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static calculator.Calculator.*;
import static calculator.Calculator.Command.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    private Command command;
    private int argument1;
    private int argument2;
    private int actualResult;


    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    private void inputArgs(int number1, int number2) {
        this.argument1 = number1;
        this.argument2 = number2;
    }

    private void callCommand(Command command) {
        this.actualResult = calculator.calculate(command, argument1, argument2);
    }

    private void expectedResult(int expectedResult) {
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSum() {
        inputArgs(2, 2);
        callCommand(SUM);
        expectedResult(4);
    }

    @Test
    public void testSumABS() {
        inputArgs(2, -2);
        callCommand(SUB_ABS);
        expectedResult(4);
    }

    @Test
    public void testSub() {
        inputArgs(6,2);
        callCommand(SUB);
        expectedResult(4);
    }

    @Test
    public void testSubABS() {
        inputArgs(2,-2);
        callCommand(SUB_ABS);
        expectedResult(0);
    }
    @Test
    public void testMult() {
        inputArgs(2, 3);
        callCommand(MULT);
        expectedResult(6);
    }

    @Test
    public void testMultABS() {
        inputArgs(2, -2);
        callCommand(MULT_ABS);
        expectedResult(-4);
    }

    @Test
    public void testDiv() {
        inputArgs(2,-2);
        callCommand(DIV);
        expectedResult(4);
    }

    @Test
    public void testDivABS() {
        inputArgs(2,-2);
        callCommand(DIV_ABS);
        expectedResult(1);
    }

    @After
    public void tearDown() {
        calculator = null;
    }

}

