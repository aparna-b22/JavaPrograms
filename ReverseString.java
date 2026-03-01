import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("enter the string") ;
       String value= sc.next();
       String reverse="";
        for(int i=value.length()-1; i>=0; i--){
            reverse= reverse + value.charAt(i);
        }
        System.out.println("Reversed value is : "+reverse);
    }
}
