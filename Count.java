import java.util.Scanner;

public class Count {
    public static void main(String [] args){
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
       int num= sc.nextInt();
       int count= 0;
//        while(num>0){
//            num=num/10;
//            count= count+1;
//        }
//        System.out.println(count);

        if(num==0){
            count=1;
        }
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
