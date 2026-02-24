import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int j= sc.nextInt();
        int sum=0, r=0;
        int org=j;
        if(j<10){
            System.out.println("no valid number");

        }
        else{
            while(j>0) {
                r = j % 10;
                sum = sum * 10 + r;
                j = j / 10;
            }
        }
        if(org==sum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
