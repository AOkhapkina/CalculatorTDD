package fizz_buzz;

/* На вход программе подается числовой параметр,
если он делится (без остатка) и на 3, и на 5, то вывести "FizzBuzz",
если только на 3 - то "Fizz",
если только на 5 - то "Buzz",
а если не делится ни на 3, ни на 5 - то вывести само число.
 */
public class FizzBuzz {
    int number;
    String result1 = "FizzBuzz";
    String result2 = "Fizz";
    String result3 = "Buzz";
    int result4 = number;

    public void checkResult(int number) {
        Boolean a = number % 3 == 0 && number % 5 == 0;
        Boolean b = number % 3 == 0 && !(number % 5 == 0);
        Boolean c = number % 5 == 0 && !(number % 3 == 0);
        Boolean d = !a && !b && !c;

        if (a) {
            System.out.println(result1);
        };

        if (b) {
            System.out.println(result2);
        };

        if (c) {
            System.out.println(result3);
        };

        if (d) {
            System.out.println(result4);
        };

    }
}



