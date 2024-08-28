package sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * * 2 Дан массив символов. В массиве могут быть только заглавные буквы английского алфавита.
 * * Символы могут повторяться. Напишите сортировку, которая отсортирует символы по алфавиту.
 */
public class ArrayOfSymbols {
    public static void main(String[] args) {
        Random random = new Random();
        char[] chars = new char[16];
        for (int i = 0; i < 16; i++) {
            chars[i] = (char) random.nextInt(65, 91);
        }
        System.out.println("Массив chars изначально : " + Arrays.toString(chars));

        int[] inches = new int[16];
        for (int i = 0; i < 16; i++) {
            inches[i] = chars[i];
        }
        System.out.println("Массив inches изначально : " + Arrays.toString(inches));
        // массивы chars and inches эквивалентны

        System.out.println();
        quickSort(inches,0,15);
        System.out.println("Массив inches после сортировки : " + Arrays.toString(inches));

        for (int i = 0; i < 16; i++) {
            chars[i] = (char) inches[i];
        }
        System.out.println("Массив chars после сортировки : " + Arrays.toString(chars));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left > right) return;
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
