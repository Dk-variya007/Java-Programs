import java.util.Stack;

class main {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reveresStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reveresStack(s);
        pushAtBottom(s, top);
    }

    public static void reversString(String str) {
        Stack<Character> s = new Stack<>();
        if (str.length() == 1 || str.isEmpty()) {
            return;
        }
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        int top;
    }

    public static void main(String[] args) {
        int i = 0;
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reveresStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
