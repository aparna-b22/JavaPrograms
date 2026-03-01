import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array");
        int[] arrayNew= new int[5];
        for(int i=0;i<5;i++){
            arrayNew[i]=sc.nextInt();
        }
        int max= arrayNew[0];
        int secondMax=arrayNew[0];
        for(int i=1;i<5;i++){
           if(arrayNew[i]>max){
               secondMax= max;
               max=arrayNew[i];
           }
else if((arrayNew[i]>secondMax)&& (arrayNew[i]!=max)){
    secondMax= arrayNew[i];
           }
           }
        System.out.println("second largest is "+secondMax + " largest is "+ max );

        }
    }

