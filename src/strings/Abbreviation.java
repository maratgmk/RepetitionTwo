package strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * * 1 Пользователь вводит название. Программа должна создать аббревиатуру для названия. Например,
 * * ввод: Life’s good; вывод: LG
 * * ввод: Kentucky Fried Chicken; вывод: KFC
 * * ввод: New York; вывод: NY
 */
public class Abbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название чего-либо из нескольких слов");
        String userInput = scanner.nextLine();
        String[] array = userInput.trim().split(" ");
        StringBuilder abr = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            abr.append(array[i].toUpperCase().charAt(0));
        }
        System.out.println(abr.toString());
    }
}

