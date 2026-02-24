import java.util.Scanner;
public class Fctotial {
    public static void main(String args[]){
        System.out.println("Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int fac=1;
        int r=0;
//while(num>0){
//    r=num%10;
//    fac=fac*r;
//    num=num/10;
        for(int i=1;i<=num;i++){
            fac=fac*i;

        }
        System.out.println(fac);
}

    }

