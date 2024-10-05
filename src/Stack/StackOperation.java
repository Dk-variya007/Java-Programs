package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackOperation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackUsingNode {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
    }

    static class StackUsingLL {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.isEmpty();
        }

        public static void push(int data) {

            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void pushAtBottom(Stack<Integer> s, int data) {
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);

        }

        public static String reversString(String str) {
            Stack<Character> s = new Stack<>();
            int idx = 0;
            while (idx < str.length()) {
                s.push(str.charAt(idx));
                idx++;
            }
            StringBuilder newStr = new StringBuilder();
            while (!s.isEmpty()) {
                char curr = s.pop();
                newStr.append(curr);
            }
            return newStr.toString();
        }

        public static void reverseStack(Stack<Integer> s) {
            if (s.isEmpty()) {
                return;
            }
            int top = s.pop();
            //3,2,1
            reverseStack(s);
            pushAtBottom(s, top);
            //1,2,3
        }


        public static void main(String[] args) {
            //using Inbuilt Stack collection
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            //for print stack
           while (!s.isEmpty()){
               System.out.println(s.peek());
               s.pop();
           }

//            while (!s.isEmpty()) {
//                System.out.println(s.peek());
//                s.pop();
//            }
//            pushAtBottom(s, 4);
//            while (!s.isEmpty()) {
//                System.out.println(s.pop());
//            }
//            System.out.println(reversString("abc"));
//            reverseStack(s);
//            while (!s.isEmpty()) {
//                System.out.println(s.pop());
//            }

        }
    }


}
