package practice1;
import java.util.Scanner;
public class ucheba {
        public static void main(String[] args)
        {
            Scanner enter = new Scanner(System.in);
            //ввод длины массива
            System.out.print("Enter the length of array: ");
            int n = enter.nextInt();
            int[] array;
            array = new int[n];
            //ввод значений элементов массива
            System.out.print("Enter the elements of array: ");
            for (int i = 0; i < array.length; i++) array[i] = enter.nextInt();
            //сумма значений элементов массива
            System.out.print("Sum of array element values - ");
            int Sum = 0;
            for (int i = 0; i < array.length; i++) Sum = Sum + array[i];
            System.out.print(Sum);
            System.out.println("");
            //среднее арифметическое значений элементов массива
            System.out.print("Average of array element values - ");
            int k = 0;
            double Average;
            for (int i = 0; i < array.length; i++) k++;
            Average = Sum / k;
            System.out.print(Average);
        }
    }