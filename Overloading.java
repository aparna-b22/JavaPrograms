public class Overloading {
    void display(){
        System.out.println("hello first function");
    }
    int  display(int n1, int n2){
        int n3= n1*n2;
        return n3;
    }
    void display(String name){
        System.out.println("Name is "+name);
    }
}
class Newname{
    public static void main(String args[]){
        Overloading ok = new Overloading();
        ok.display();
        ok.display("Adarsh");
        //ok.display(1,2);
        System.out.println(ok.display(2,3));
    }
}