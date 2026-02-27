import java.util.Scanner;
public class CountType {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int r=0;
        int even=0;
        int odd=0;

        while(n>0){
            r=n%10;
            if(r%2==0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
        }
        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }
}
