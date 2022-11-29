package practice1;
import java.util.Scanner;
public class ucheba2
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        //ввод длины массива
        System.out.print("Enter the length of array: ");
        int n = enter.nextInt();
        int[] array;
        array = new int[n];
        System.out.print("while(1) or do...while(2)? ");
        int choice = enter.nextInt();
        int Sum = 0, i = 0;
        if (choice == 1)
        {
            while (i < array.length)
            {
                array[i] = enter.nextInt();
                Sum = Sum + array[i];
                i++;
            }
        } else if (choice == 2)
        {
            do
            {
                array[i] = enter.nextInt();
                Sum = Sum + array[i];
                i++;
            } while (i < array.length);
        }
        System.out.print("Sum of array element values - " + Sum);
        //поиск максимального значения элемента массива
        int Max = 0;
        for (i = 0; i < array.length; i++)
        {
            if (Max < array[i]) Max = array[i];
        }
        System.out.print("\n" + "The maximum value of an array element - " + Max);
        //поиск минимального значения элемента массива
        int Min = 0;
        for (i = 0; i < array.length; i++)
        {
            if (Min > array[i]) Min = array[i];
        }
        System.out.print("\n" + "The minimum value of an array element - " + Min);
    }
}