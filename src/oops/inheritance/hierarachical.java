package oops.inheritance;

class Eat{
    void  eat(){
        System.out.println("eating..");
    }
}
class man extends Eat{
    void gaming(){
        System.out.println("gaming..");
    }
}
class  Dog extends  Eat{
    void bark(){
        System.out.println("barking..");
    }
}
public class hierarachical {
    public static void main(String[] args) {
        man m=new man();
        m.eat();
        m.gaming();
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
