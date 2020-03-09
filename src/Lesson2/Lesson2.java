package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson2 {


    public static String[][] stringToArr(String s) throws MyArraySizeException {
        s = s.replaceAll(" ", ",");
        String s1[] = s.split("\n");
        if (s1.length != 4) throw new MyArraySizeException("Кол-во строк в матрице не равно 4x4");

        String my_matrics[][] = new String[4][4];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].trim();
            String single_int[] = s1[i].split(",");

            for (int j = 0; j < single_int.length; j++) {
                my_matrics[i][j] = single_int[j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(my_matrics[i][j] + " ");
            }
            System.out.println("");
        }
        return my_matrics;
    } // Строка в двумерный строковый массив

    public static int[][] stringArrToInt(String[][] s) throws NumberFormatException {
        int[][] arr = new int[4][4];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = Integer.parseInt(s[i][j]);
            }
        }
        return arr;
    } // Двумерный строковый массив в интовый

    public static int sumArray(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    } // сумма двумерного интового массива

    public static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        int div = 0;


        try {
            String[][] str1 = stringToArr(str);
            int[][] arr = stringArrToInt(str1);
            int sum = sumArray(arr);
            System.out.println("Сумма матрицы: " + sum);
            int result = division(sum, div);
            System.out.println("Результат деления: " + result);
        } catch (MyArraySizeException e) {
            e.getMessage();
        } catch (NumberFormatException e) {
            System.out.println("Сложение чисел невозможно, в матрице есть символ/слово");
        } catch (ArithmeticException e) {
            System.out.println("Делить на " + div + " нельзя");
        }
    }
}
