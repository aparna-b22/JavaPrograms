import java.util.Scanner;
public class CaLculatorOverLoading {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        CaLculatorOverLoading calOvr= new CaLculatorOverLoading();
        calOvr.cal(num1,num2);
        calOvr.cal(num1,num2,num3);
    }
    public void cal( int num1,int num2){
        System.out.println("sum is "+ (num1+num2));
    }
    public void cal(int num1, int num2,int num3){
        System.out.println("sum "+ (num1+num2+num3));
    }
}
