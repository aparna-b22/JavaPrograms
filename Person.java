import java.util.Scanner;



public class Person {
    public static void main(String args[]){
        //System.out.println("Enter the name of the person: ");
        Scanner sc= new java.util.Scanner(System.in);
//        String name= sc.nextLine();
//        System.out.println( "Hello ,"+name);
//        System.out.println("Welcome to java");
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Age: "+age);
//        System.out.println("Enter your college name: ");
//        String collegeName= sc.nextLine();
//        System.out.println("College: "+collegeName);
//// next find some
//        System.out.println("Enter two numbers ");
//        int a = sc.nextInt();
//        int b= sc.nextInt();
//        int c= a+b;
//        System.out.println("Sum is: "+c);
//        //....area of circle
//        System.out.println("Enter the radius");
//        int radius = sc.nextInt();
//        double area= 3.14*radius*radius;
//        System.out.println("Area is:"+area);
//        //swap two numbers
//        int d=10;
//        int e= 5;
//        int f=d;
//         d=e;
//        e=f;
//        System.out.println(d+","+ e);
        //Check even number
//        System.out.println("Enter 2 numbers");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        if((a%2)==0){
//            System.out.println(a+" number is even");
//        }
//        else {
//            System.out.println(a+" number is odd");
//        }
//        String out =(b%2==0)?b+"number is even": b+"number is odd";
//        System.out.println(out);
////find largest number
//        System.out.println("enter any two different numbers: ");
//        int d= sc.nextInt();
//        int e= sc.nextInt();
//        if(d>e){
//            System.out.println("greatest number is"+d);
//
//        }
//        else{
//            System.out.println("Second number is greatest: "+e);
//        }
// number type check
        System.out.println("enter a number");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("number is positive");

        }
        else if(num<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("Number is Zero");
        }

    }
}
