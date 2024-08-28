package arrays;
import java.util.Arrays;

/**
 * * 1 Дан двумерный массив 10x10. Заполните его символами в порядке возрастания их кодов.
 *  * Начать нужно с символа &. Все виды скобок – (), {}, [] нужно заменить на символ %.
 */
public class TwoDimensionArray {
    public static void main(String[] args) {
        char ch = '&';
        int a = ch;
        System.out.println(ch + " " + a);
        int[] ints = new int[100];
        for (int i = 0; i < 100; i++) {
            ints[i] = i + 38;
        }
      //  System.out.println(Arrays.toString(ints));
        char[] chars = new char[100];
        for (int i = 0; i < 100; i++) {
            chars[i] = (char) ints[i];
        }
        System.out.println(Arrays.toString(chars));
        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = i + 38 + j*10;
            }
        }
       //    System.out.println(Arrays.deepToString(array));
        char[][] chars2 = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                chars2[i][j] = (char) array[j][i];
                if(chars2[i][j] == '(' || chars2[i][j] ==')' || chars2[i][j] =='{'|| chars2[i][j] =='}'
                        || chars2[i][j] =='['|| chars2[i][j] ==']') chars2[i][j] = '%';
            }
        }
        System.out.println(Arrays.deepToString(chars2));


    }
}
