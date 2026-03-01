import java.util.Scanner;
public class ArrayNumber {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int[] A= new int[number];
         System.out.print("Enter the  array values: ");

         for(int i=0; i<number;i++){
              A[i]=sc.nextInt();

         }
        System.out.println("Array are ");
        for(int i=0; i<number;i++){

            System.out.print(A[i]+" ");

        }
    }
}
