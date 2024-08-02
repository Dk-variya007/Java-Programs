
class ab {
    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    ab() {
        System.out.println("constructor of ab");
    }

    ab(int a) {
        System.out.println("constructor of ab" + a);
    }
}

class bc extends ab {
    public void sum(int a, int b, int c) {
        super.sum(1, 2, 3);
        System.out.println("abc");
    }

    bc() {
        super(1);
        System.out.println("constructor of bc");
    }
}

class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a / b;
        System.out.println(c);
    }
}


