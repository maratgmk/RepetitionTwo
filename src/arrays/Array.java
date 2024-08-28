package arrays;

import java.util.Arrays;
import java.util.Random;

/*
  1. Создайте массив из 5 случайных целых чисел из интервала [-10;10]. Отсортируйте массив.
   Все элементы с индексом, кратным 3, замените на число 3, а все элементы с индексом, кратным 5,
   замените на 5.
 */

/**
 * * 2 Создайте массив из 5 строк. Каждая строка – это предложение, оканчивающееся одним из знаков
 *  * препинания: . или ! или ? Напишите программу, которая выведет в консоль количество знаков препинания
 *  * каждого типа. Для получения последнего символа строки используйте методы charAt() и length().
 */

public class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(-10,11);
            if (array[i] % 3 == 0) array[i] = 3;
            if (array[i] % 5 == 0) array[i] = 5;
        }
        System.out.println(Arrays.toString(array));

        String[] strings = new String[]{
                "В лесу родилась ёлочка!",
                "И зайка серенький по лесу скакал.",
                "Свирепый волк знает в поросятах толк?",
                "Почему у него такие большие уши?",
                "Мороз и солнце день чудесный!"
        };
        System.out.println(Arrays.toString(strings));
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < strings.length; i++) {
           if(strings[i].charAt(strings[i].length() - 1) == '.') a++;
           if(strings[i].charAt(strings[i].length() - 1) == '!') b++;
           if(strings[i].charAt(strings[i].length() - 1) == '?') c++;
        }
        System.out.println(" . counts = " + a);
        System.out.println(" ! counts = " + b);
        System.out.println(" ? counts = " + c);

    }
}
