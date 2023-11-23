 // Program to check if two arrays are the same or not
package abhay;

import java.util.Scanner;

public class q12 {
    static Scanner sc = new Scanner(System.in);
    public static int [] newArray(String name){
        System.out.print(name+" size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("ELEMENTS :-\n>> ");
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();
        return arr;
    }
    static boolean areSame(int[] arr1, int [] arr2){
        if(arr1.length != arr2.length) return false;
        for(int i=0 ; i<arr1.length; i++) if(arr1[i] != arr2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        int [] arr1 = newArray("Array1");
        int [] arr2 = newArray("Array2");
        
        System.out.println("Array1 and Array2 are "+(areSame(arr1,arr2)?"":"not ")+"same");
    }
}