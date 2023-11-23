// Program to print Palindromic pyramid pattern printing
package abhay;

import java.util.Scanner;

public class q9 {
    public static String pstr (int size){
        String str="";
        int n=1;
        for(int i=1; i<=size; i++){
            str += String.valueOf(n%10)+" ";
            if(size %2 == 0)
                if(i == size/2) continue;
            n += (i <= size/2 ? 1 : -1); 
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.print("Pyrimid Size : ");
        int size = (new Scanner(System.in)).nextInt();
        for(int i=1; i<=size; i++){
            System.out.println((new String(new char[size - i +1]).replace("\0", " "))+pstr(i));
        }
    }
}