//Program to find number of integers which has exactly 9 divisors
package abhay;
public class q16 {
    public static void main(String[] args) {
        q1.print("Enter a number : ");
        int num = q1.sc.nextInt();
        q1.print("The number which has exactly 9 divisors upto "+num+" are \n");
        for(int a = 36; a <= num; a++) {
        	
        int d_count = 2;
        for(int i=2; i<=a/2;i++){
        	if(a%i == 0) d_count += 1;
       }
       
       if(d_count == 9) q1.print(a+" ");
       
       }
       
      q1.print("\n");
    }    
}