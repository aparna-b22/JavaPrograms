import java.util.Scanner;
public class Rectangle {
    int height;
    int width;
    public static void main(String[] args){
        System.out.println("Enter the height: ");
        Scanner sc= new Scanner(System.in);
        Rectangle rec= new Rectangle();

        rec.height= sc.nextInt();
        System.out.println("Enter the width: ");
        rec.width= sc.nextInt();
        rec.area();

    }
    public void area(){
        System.out.println("Area is: "+(height*width));

    }
}
