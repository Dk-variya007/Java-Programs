package oops.polymorphism;

class base{
    void eat(){
        System.out.println("eating..... base");
    }
}
class derived extends  base{
    void eat(){
        System.out.println("eating....derived");
    }
}
public class methd_overriding {
    public static void main(String[] args) {
        derived d=new derived();
        d.eat();
        base b=new base();
        b.eat();
    }
}
