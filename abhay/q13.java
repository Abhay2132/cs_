package abhay;

public class q13 {

    static void printArr(int [] arr, String name){
        System.out.print(name+"("+arr.length+") = [");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.println("]");
    }

    static int [] revArray(int [] arr){
        int rarr []= new int[arr.length];
        for(int i=rarr.length-1;i>=0;i--) rarr[i] = arr[arr.length - i -1]; 
        return rarr;
    }

    public static void main(String[] args) {
        int [] arr = q12.newArray("Array");
        int [] rev = revArray(arr);
        System.out.println("Reversed Array :- ");
        printArr(rev, "Reversed");
    }
}