import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length= sc.nextInt();
        int[] num= new int[length];
        int max=num[0];
        System.out.println("Enter the value of array: ");
        for(int i=0; i<=length-1; i++){
            num[i]= sc.nextInt();

            }
        for(int i=1;i<length;i++){
            if(i!=length){
                if(num[i]>max){
                    max=num[i];
                }

        }

        }



        System.out.println("Largest number in array is:"+max);
}
}
