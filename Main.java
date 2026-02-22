public class Main{

    // method  without argument and without retrun type
    static void display(){
        System.out.println("Display method is called");
    }
    // method with argument without return type
    static void argument(int a, int b){
        System.out .println("the sume of " + a + "and " + b +"is : "+(a+b));
    }
    // method without argument  and with return type
    static  int value(){
        return 11;
    }
    // method with retunr type and argument
    static String everything(int a, int b, String c){
      int d= a+b;
        return "sum is "+d +"String is"+ c;
    }
    static void rec(){
        System.out.println("hihhh");
        rec();
    }
    public static void main(String args[]){
        System.out.println("hi");
        display();
        argument(2,3);
        System.out.println(value());// to get the retun value as output we have call that method inside print funvtion
        System.out.println(everything(5,6,"hello"));
        rec();
    }
}
