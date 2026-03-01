import java.util.Scanner;
public class SerachArray {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int length= sc.nextInt();
        System.out.println("Enter the values");

        int[] arrayi= new int[length];
        for(int i=0;i<length;i++){
            arrayi[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search");
        boolean flag= false;
        int search= sc.nextInt();
        for(int i=0;i<length;i++){
           if(arrayi[i]==search) {
               System.out.println("number at "+ i+ "th index");
               flag= true;
               break;
           }

        }
        if(flag==false){
            System.out.println("number no found");

        }
    }
}
