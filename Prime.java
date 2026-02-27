import java.util.Scanner;
public class Prime {
    public static void main(String []args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        int r=0;
       for(int i=1; i<=num; i++){
           r=num%i;
           if(r==0){
               count++;
           }

       }
       if(count==2){
           System.out.println("number is prime");
       }
       else{
           System.out.println("number is not prime");
       }
    }

}
