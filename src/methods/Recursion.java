package methods;
/*
 * 2 Используя рекурсию, написать метод для вычисления суммы n элементов ряда 1/n.
 * Например, n=5, тогда 1/1 + 1/2 + 1/3 + 1/4 + 1/5 = 2,28333
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(getSumOfSeries(5));

    }
    public static double getSumOfSeries(int num){
        if(num == 1) return 1.0;
        double sum = (double) 1/num;
        num--;
        return sum + getSumOfSeries(num);
    }
}
