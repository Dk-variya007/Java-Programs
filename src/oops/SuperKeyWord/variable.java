package oops.SuperKeyWord;
class A{
    int a=10;
}
class B extends A{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class variable {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
