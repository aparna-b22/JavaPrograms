import java.util.Scanner;
public class carConst {
    public carConst(String carName){
        System.out.println("Amount is 12000");
    }

    public static void main(String[] args){
        System.out.println("Enter the car name: ");
        Scanner sc= new Scanner(System.in);
        String carName= sc.nextLine();
        carConst car= new carConst(carName);

    }


}
