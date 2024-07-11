package oops.inheritance;


class Animal{
    void  eat(){
        System.out.println("eating....");
    }
    void breath(){
        System.out.println("breathing..");
    }
}

class dog extends Animal{
    void barking(){
        System.out.println("barking.....");
    }
}
public class inheritance {
    public static void main(String[] args) {
        dog d=new dog();
        Animal a=new Animal();
        d.eat();d.barking();
        d.breath();
    }
}