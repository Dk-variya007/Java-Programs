import java.util.Stack;

class main {
    public static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i <= stock.length - 1; i++) {
            int currentPrice = stock[i];
            while (!s.isEmpty() && currentPrice >= stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int highPrev = s.peek();
                span[i] = i - highPrev;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] spans = new int[stocks.length];
        stockSpan(stocks,spans);
        // Print the results
        for (int i = 0; i < spans.length; i++) {
            System.out.println(spans[i]);
        }
    }
}
