package methods;
/*
1 Сделайте перегруженные методы для нахождения среднего числа из 2-х, 3-х и 4-х чисел.
 */
public class Average {
    public static void main(String[] args) {
        System.out.println(getAverage(7, 8));
        System.out.println(getAverage(7, 8, 9));
        System.out.println(getAverage(7, 8, 9, 10));

    }

    public static int getAverage(int num1, int num2){
         return (num1 + num2)/2;
    }

    public static int getAverage(int num1, int num2, int num3){
        return (num1 + num2+ num3)/3;
    }
    public static int getAverage(int num1, int num2,int num3,int num4){
        return (num1 + num2 + num3 + num4)/4;
    }

}
