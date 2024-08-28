package sorting;

import java.util.Arrays;

/**
 * 1 Дан массив строк. Напишите сортировку, которая отсортирует строки по длине.
 * Для получения строки используйте метод length().
 */
public class Sorting {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "Мороз и солнце день чудесный, проснись красавица!",
                "Свирепый и злой волк знает в поросятах толк?",
                "В лесу родилась ёлочка!",
                "И зайка серенький по лесу скакал.",
                "Почему у него такие большие уши?",
        };
        int[] array = getArrByLength(strings);

        System.out.println("Изначальный массив до сортировки : " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Массив после сортировки : " + Arrays.toString(array));


        System.out.println("Изначальный массив до сортировки : " + Arrays.toString(strings));
        quickSortString(strings, 0, strings.length - 1);
        System.out.println("Массив после сортировки : " + Arrays.toString(strings));


    }

    public static int[] getArrByLength(String[] strings) {
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = strings[i].length();
        }
        return array;
    }

    public static void quickSortString(String[] strings, int left, int right) {
        if (left > right) return;
        String pivot = strings[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (strings[i].length() < pivot.length()) i++;
            while (strings[j].length() > pivot.length()) j--;
            if (i <= j) {
                StringBuilder temp = new StringBuilder(strings[i]);
                strings[i] = strings[j];
                strings[j] = String.valueOf(temp);
                i++;
                j--;
            }
        }
        quickSortString(strings, left, j);
        quickSortString(strings, i, right);
    }

    public static void quickSort(int[] array, int left, int right) {
        if(left > right) return;
        int pivot = array[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(array,left,j);
        quickSort(array,i,right);
    }
}

