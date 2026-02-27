import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        System.out.println("Enter three numbers");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("greatest number is: "+num1);
            }
            else{
                System.out.println("greatest number is: "+num3);


            }        }
        else if(num2>num3){

            System.out.println("greatest number is: "+num2);
        }
        else{
            System.out.println("greatest number is: "+num3);

        }
    }
}
