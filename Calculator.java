import java.util.Scanner;
public class Calculator {

    public static void  add(int number1, int number2){//void returns nothing
        int sum= number1+number2;
        System.out.println("Sum: "+sum);

    }
    public void substract(int number1, int number2){
        int sub= number1-number2;
        System.out.println("Sub:"+sub);
    }
    public void mul(int number1, int number2){
        int mul= number2*number1;
        System.out.println("mul: "+mul);
    }
    public void div(int number1, int number2){
        int div= number1/number2;
        System.out.println("div: "+div);
    }

    public static void main(String[] args){
        System.out.println("Enter the numbers");
        Scanner sc= new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        Calculator cal= new Calculator();
        add(number1,number2);//not need to create object because the method is static
        cal.mul(number1,number2);
        cal.div(number1,number2);
        cal.substract(number1,number2);
    }
}
