import java.util.Scanner;
public class ReverseNum {
    public static void main(String []args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int s=0;
        int r=0;
        if(num==0){
            System.out.println("Number is: "+0);

        }
        while(num>0){
            r=num%10;
            s=s*10+r;
            num=num/10;


        }
        System.out.println(s);
    }
}
