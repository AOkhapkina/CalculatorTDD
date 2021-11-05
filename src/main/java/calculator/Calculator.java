package calculator;

public class Calculator {

    public enum Command {
        SUM,
        SUM_ABS,
        SUB,
        SUB_ABS,
        MULT,
        MULT_ABS,
        DIV,
        DIV_ABS
    }

    public int calculate(Command command, int argument1, int argument2) {
        int arg1 = argument1;
        int arg2 = argument2;
        int argABS1 = Math.abs(argument1);
        int argABS2 = Math.abs(argument2);
        switch (command) {
            case SUM: return sum(arg1, arg2);
            case SUM_ABS: return sum(argABS1, argABS2);
            case SUB: return sub(arg1, arg2);
            case SUB_ABS: return sub(argABS1, argABS2);
            case MULT: return mult(arg1, arg2);
            case MULT_ABS: return mult(argABS1, argABS2);
            case DIV: return div(arg1, arg2);
            case DIV_ABS: return div(argABS1, argABS2);
            default: return 0;
        }
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }

    public int div(int divined, int divisor) {
        if(divisor ==0)
            throw new IllegalCallerException("Divisor can not be zero!");
        else {
            return divined/ divisor;
        }
    }

    public int mult(int number1, int number2) {
        return number1 * number2;

    }

}
