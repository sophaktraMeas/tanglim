package Util;
class Car {
    public void speedUp(){
        System.out.println("Ford is super car");
    }
    public void slownDown(){
        System.out.println("BMW is modern car ");
    }

    }
class Ford extends Car{
    @Override
    public void speedUp() {
        System.out.println("Ford is speeding car");
    }
}
class BMW extends Car{
    @Override
    public void slownDown() {
        System.out.println(" BMW is modern car");
    }
}
public class ModelCar{
    public static void main(String[] args) {
       Car bmw = new BMW();
       Car ford = new Ford();
       ford.speedUp();
       bmw.slownDown();
    }

}
