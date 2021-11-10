package arrayTask;

import java.sql.Array;

/*
На вход программе подается какой-то массив чисел (как отрицательных, так и положительных).
Кроме того, у тебя есть заранее неизвестное число X. Надо поочередно сложить все элементы массива,
при этом каждый (промежуточный результат + X) не должен быть меньше единицы.
Требуется найти минимальное значение X для заданного массива.
Пример: [1,-2,10,-14,33]
Решение:
  первый элемент 1, но больше не меньше единицы, пока X = 0;
  прибавляем второй элемент, сумма -1, до 1 не хватает 2, X = 2;
  прибавляем третий элемент, сумма 9, больше 1, X = 2;
  прибавляем четвертый, сумма -5, до 1 не хватает 6, X = 6;
  прибавляем последний - сумма 28
ответ: 6

 */
public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {1, -2, 10, -14, 33};
        int x = 0;
        int result;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i] + x;
            while (sum < 1) {
//                for (x = 0;sum<1; x++)
                    x=x+1;
                break;
            }
        }
        System.out.println(sum);
    }
}

//class ArrayTest {
////    public static void main(String[] args) {
////        ArrayTask arrayTaskRezult = new ArrayTask();
////        arrayTaskRezult.getX({1,-2,10,-14,33});
////        }
////    }
//}
