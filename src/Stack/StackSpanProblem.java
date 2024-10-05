package Stack;


import java.util.Stack;

public class StackSpanProblem {

    public static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // The first element always has a span of 1
        s.push(0); // Push index of the first stock price

        // Traverse from the second day to the last
        for (int i = 1; i < stock.length; i++) {
            int currentPrice = stock[i];

            // Pop from the stack while the stack is not empty
            // and the price at the top of the stack is less than or equal to the current price
            while (!s.isEmpty() && currentPrice >= stock[s.peek()]) {
                s.pop();
            }

            // If the stack is empty, all previous prices are smaller, so span is (i + 1)
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, span is the difference between current day and the last highest price
                int highPrev = s.peek();
                span[i] = i - highPrev;
            }

            // Push the current index onto the stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = new int[stockPrices.length];

        stockSpan(stockPrices, spans);

        // Print the results
        for (int i = 0; i < spans.length; i++) {
            System.out.println("Price: " + stockPrices[i] + " Span: " + spans[i]);
        }
    }
}
