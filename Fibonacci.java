import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for(int i = 2; i < number; i++){
            int next = first + second;
            System.out.println(next);

            first = second;
            second = next;
}
            }
        }

