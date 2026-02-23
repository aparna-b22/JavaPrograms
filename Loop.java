import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        System.out.println("Enter the number ");
        Scanner sc= new Scanner(System.in);
//        int num= sc.nextInt();
//        for(int i=1; i<=num; i++){
//        System.out.println(i);
        // print the number in reverse order
          //  int num= sc.nextInt();
//            for(int i=num; i>0; i--){
//                System.out.println(i);
//                //print the even number from 1 to 100
//                for(int j=1; j<=100; j++){
//                    if(j%2==0){
//                        System.out.println("Even numbers are:");
//                        System.out.println(j);
//                    }
//                    else{
//                        System.out.println("Odd numbers are:");
//                        System.out.println(j);
//                    }
//                    for(int k=2; k<=100; k++){
//                        System.out.println(k);
//                    }
//                }
//            }
        //sum n numbers
        int n= sc.nextInt();
//int i=0;
//int sum =0;
//        while(i<=n){
//            i++;
//           sum= sum+i;
//
//        }
//        System.out.println(sum);
        // multiple
        int mul=5 ;
        int ne=0;
        for(int k=1; k<=10; k++){
            ne = k*mul;
            System.out.println(ne);
        }
      }
    }



