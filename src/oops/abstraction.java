package oops;

abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eating...");
    }
    abstract void walk(); //bcz abstract method
}
class  Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    @Override
    void walk() {
        System.out.println("walk on 4 lage");
    }
    void changeColor(){
        color="black";
        System.out.println(color);
    }
}
class Chicken extends  Animal{
    Chicken(){
        System.out.println("chicken constructor called");
    }
    @Override
    void walk() {
        System.out.println("walk on 2 lage");
    }
    void changeColor(){
        color="white";
        System.out.println(color);
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);
        h.changeColor();
        Chicken c=new Chicken();
        c.walk();
        c.eat();
        System.out.println(c.color);
        c.changeColor();

    }
}
