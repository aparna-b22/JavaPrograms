import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();

        int orginal=number;
        int temp=number;
        int count=0;
        int sum=0;

        while(temp>0){
           temp=temp/10;
           count++;
        }
        temp=number;
        while(temp>0){
            int remainder= temp%10;
            sum= sum+(int)Math.pow(remainder,count);
            temp= temp/10;


        }
        if(number==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");

        }
    }
}
