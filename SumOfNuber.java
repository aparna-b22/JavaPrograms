import java.util.Scanner;
public class SumOfNuber {
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
       int number=sc.nextInt();
       int remainder=0;
       int sum=0;
       while(number>0){
           remainder= number%10;
           sum= sum+remainder;
           number= number/10;
       }
       System.out.println(sum);
    }
}
