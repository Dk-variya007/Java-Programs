package oops.inheritance;

class A {
    int a = 5, b = 4, c;

    void sum() {
        System.out.println("Sum is  : " + (c=a+b));
    }
}
class B extends A{
    void mul(){
        System.out.println("mul : "+(c=a*b));
    }
}
class  c extends  B{
    void div(){
        System.out.println("div : "+(c=a/b));
    }
}
public class multilevel {
    public static void main(String[] args) {
        B b =new B();
        c c=new  c();
        b.mul();
        b.sum();
        c.sum();
        c.mul();
        c.div();

    }

}
