package strings;

import java.util.Arrays;

/**
 * 2 Дана строка, в которой между словами может быть больше одного пробела. Напишите метод, который убирает дублирование пробелов.
 */
public class DeleteEmptyDuplicate {
    public static void main(String[] args) {
        String line = new String("        Don't         throw exceptions   in            the      unknown places         .    ");
        System.out.println(line);
        String line1 = line.strip(); // TODO trim strip the same?
        System.out.println(line1);
        System.out.println(Arrays.toString(line1.toCharArray()));
        System.out.println(delDuplicateBlank(line1));

    }
    private static String delDuplicateBlank(String line) {
        StringBuilder sb = new StringBuilder(line);
        String[] words = line.split(" ");
        for (String w : words) {
            if (w.equals(" " + "," + " ")) {
                int begin = sb.indexOf(w);
                if (begin < 0) continue;
                sb.replace(sb.indexOf(w), sb.indexOf(w) + w.length(), " ");
            }
        }
        return sb.toString();
    }
}
