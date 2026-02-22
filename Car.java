public class Car {
  String carName= "BMW";
  void start(){

    System.out.println("car startted"+carName);

  }}
  class mainClass{
      public static void main(String[]args){
          Car c= new Car();
          System.out.println("the car brand is"+ c.carName);
          c.start();
      }
  }

