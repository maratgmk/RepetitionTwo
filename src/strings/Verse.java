package strings;

import java.util.Arrays;
/*
3 Дано стихотворение. Подсчитайте, сколько в нём строк, слов в каждой строке, гласных букв, согласных букв, знаков препинания.
 */
public class Verse {
    public static void main(String[] args) {
        String verse = "Люблю грозу в начале мая,\n" +
                "Когда весенний, первый гром,\n" +
                "Как бы резвяся и играя,\n" +
                "Грохочет в небе голубом.\n" +
                "Гремят раскаты молодые,\n" +
                "Вот дождик брызнул, пыль летит,\n" +
                "Повисли перлы дождевые,\n" +
                "И солнце нити золотит.\n" +
                "С горы бежит поток проворный,\n" +
                "В лесу не молкнет птичий гам,\n" +
                "И гам лесной, и шум нагорный –\n" +
                "Все вторит весело громам.\n" +
                "Ты скажешь: ветреная Геба,\n" +
                "Кормя Зевесова орла,\n" +
                "Громокипящий кубок с неба,\n" +
                "Смеясь, на землю пролила!";
        String[] lines =  verse.split("\n");
        // System.out.println(Arrays.toString(lines));
        System.out.println("Количество строк " + lines.length);
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Количество слов в строке номер " + (i+1) + " равно " + lines[i].split(" ").length);

        }
        System.out.println("Количество знаков препинания " + countSymbol(verse));
        System.out.println("Количество гласных " + countVowel(verse));
        System.out.println("Количество согласных " + countConsonant(verse));
    }

    private static int countSymbol(String verse){
        char[] chars = verse.toCharArray();
        int symbols = 0;
        for (char c : chars) {
            if(c == '.' || c == ',' || c == '!' || c == '?' || c == ':' || c == '-')symbols++;
        }
        return symbols;
    }
    private static int countVowel(String verse){
        char[] chars = verse.toCharArray();
        int vowel  = 0;
        for (char c : chars) {
            if (Character.isAlphabetic(c)){
                if(c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ю' || c == 'я' || c == 'ы' ||
                c == 'А' || c == 'Е' || c == 'Ё' || c == 'И' || c == 'О' || c == 'У' || c == 'Ю' || c == 'Я')vowel++;
            }
        }
        return vowel;
    }
    private static int countConsonant(String verse){
        char[] chars = verse.toCharArray();
        int consonant  = 0;
        for (char c : chars) {
            if (Character.isAlphabetic(c)){
                if(!(c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ю' || c == 'я' || c == 'ы' ||
                        c == 'А' || c == 'Е' || c == 'Ё' || c == 'И' || c == 'О' || c == 'У' || c == 'Ю' || c == 'Я'))consonant++;
            }
        }
        return consonant;
    }
}
