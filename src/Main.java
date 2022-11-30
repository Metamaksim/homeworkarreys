import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = getIntFromRange(100_000, 200_000);
        }
        System.out.println(Arrays.toString(array));
        // Задание 1 сумма
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        // Задание 2

        int minimum = array[0]; /// Минимальное значение
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей");

        int maximum = array[0];  // Максимальное значение
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");

        // Задание 3 - найти среднее значение
        double avarage = 0;
        for (int i = 0; i < array.length; i++) {
            avarage = sum / array.length;  // сумма значений уже хранится в переменной sum осталось разделить ей на длинну массива
        }
        System.out.println("Средняя сумма трат за месяц составила " + avarage + " рублей");  // выводим результат

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i= reverseFullName.length - 1;
        for (; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

        static int getIntFromRange (int min,int max){
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
        }


}