package oops.polymorphism;


public class method_overloading {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        method_overloading mo = new method_overloading();
        System.out.println(mo.sum(1, 2));
        System.out.println(mo.sum(1.2f, 3.5F));
        System.out.println(mo.sum(1,2,3));
    }
}
