package fizz_buzz;

/* На вход программе подается числовой параметр,
если он делится (без остатка) и на 3, и на 5, то вывести "FizzBuzz",
если только на 3 - то "Fizz",
если только на 5 - то "Buzz",
а если не делится ни на 3, ни на 5 - то вывести само число.
 */
public class FizzBuzz {
    int number;
    final String FIZZ_BUZZ = "FizzBuzz";
    final String FIZZ = "Fizz";
    final String BUZZ = "Buzz";

    public void checkResult(int number) {

        Boolean divOf3 = number % 3 == 0 && !(number % 5 == 0);
        Boolean divOf5 = number % 5 == 0 && !(number % 3 == 0);
        Boolean divOf3And5 = number % 3 == 0 && number % 5 == 0;
        Boolean other = !divOf3And5 && !divOf3 && !divOf5;

        if (divOf3And5) {
            System.out.println(FIZZ_BUZZ);
        };
        if (divOf3) {
            System.out.println(FIZZ);
        };
        if (divOf5) {
            System.out.println(BUZZ);
        };
        if (other) {
            System.out.println(number);
        }
    }
}
//Fedor's

//public class FizzBuzz {
//    public static final String FIZZ = "Fizz";
//    public static final String BUZZ = "Buzz";
//
//    public void printResult(int number) {
//        System.out.println(getResult(number));
//    }
//    public String getResult(int number) {
//        final boolean of3 = number % 3 == 0;
//        final boolean of5 = number % 5 == 0;
//        final StringBuilder result = new StringBuilder();
//
//        if (of3) {
//            result.append(FIZZ);
//        }
//        if (of5) {
//            result.append(BUZZ);
//        }
//        if (!of3 && !of5) {
//            result.append(Integer.toString(number));
//        }
//        return result.toString();
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.printResult(0);
//        fizzBuzz.printResult(15);
//        fizzBuzz.printResult(75);
//        fizzBuzz.printResult(3);
//        fizzBuzz.printResult(5);
//        fizzBuzz.printResult(19);
//    }
//}
