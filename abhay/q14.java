// Program to print Non-repeating characters in a string
package abhay;

import java.util.Arrays;

public class q14 {
    public static void main(String [] args){
        int [] arr = q12.newArray("Array");
        Arrays.sort(arr);
        System.out.print("Non-Repeating chararcter Array :-\n Array[] = [");
        for(int i=0;i<arr.length-1; i++){
            if(arr[i] != arr[i+1]) System.out.print(arr[i]+",");
        }
        //if(arr[arr.length-1] != arr[arr.length-2])System.out.print(arr[arr.length-1]);
        System.out.println(arr[arr.length-1]+"]");
    }
}