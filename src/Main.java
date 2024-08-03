
class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Working on add feature");
        }
    }

    void work() {
        while (true) {
            System.out.println("working");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("working on a search feature");
        }
    }

    void eat() {
        while (true) {
            System.out.println("eating");
        }
    }
}

class main {
    public static void main(String[] args) {
        MyThread1 a = new MyThread1();
        MyThread2 b = new MyThread2();
        //a.start();
        a.work();
        //b.start();
        b.eat();
    }
}


