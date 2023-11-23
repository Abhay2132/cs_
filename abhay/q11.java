package abhay;
import java.util.Scanner;

public class q11 {
    static int arr[] = new int[100];
    static int size = 0;
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Array Size : ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        System.out.print("Array Elements :-\n>> ");
        for(int i=0; i<size; i++){
             arr[i] = sc.nextInt();
             sum += arr[i];
        }
        System.out.println("Sum of array : "+sum);
    }
}