import java.util.Scanner;
public class Students {
    String name;
    int age;
    String course;
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        Students std = new Students();
        std.display();

    }

    public void display(){
        System.out.println("Enter the name: ");
        name=sc.nextLine();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the course: ");
        course =sc.nextLine();
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Course is: "+course);

    }
}
