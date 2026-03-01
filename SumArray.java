import java.util.Scanner;
public class SumArray {
    public static void main(String [] args){
        System.out.println("Enter the array length : ");
        Scanner sc= new Scanner(System.in);
        int length= sc.nextInt();

        int[] numArray= new int[length];
        int sum=0;
        System.out.println("Enter the array elements : ");
        for(int i=0; i<length; i++){
            numArray[i]= sc.nextInt();
            sum=sum+numArray[i];
        }
        System.out.println("Sum of array values is "+sum);
    }
}
