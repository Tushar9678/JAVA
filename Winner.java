import java.util.*;

public class Winner {

    public int Find_Winner(int n, int k) {
        Queue<Integer> circle = new LinkedList<>();

        // Initialize the queue with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        // Continue until only one person remains
        while (circle.size() > 1) {
            // Move the first k-1 elements to the end of the queue
            for (int i = 0; i < k - 1; i++) {
                circle.add(circle.poll());
            }
            // Remove the k-th element
            circle.poll();
        }
        // The last remaining person is the winner
        return circle.peek();
    }

    public static void main(String[] args) {
        Winner obj = new Winner();
        int n = 5;
        int k = 2;
        // Output should be 3
        System.out.println(obj.Find_Winner(n, k));
    }
}
