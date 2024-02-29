import java.util.*;
import java.io.*;

public class MainOrder {
    static class Order {
        int start, end, cost;
        public Order(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Order[] orders = new Order[n];
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            orders[i] = new Order(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        }
        int q = Integer.parseInt(br.readLine());
        long[] results = new long[q];
        for (int i = 0; i < q; i++) {
            String[] parts = br.readLine().split(" ");
            int start = Integer.parseInt(parts[0]);
            int end = Integer.parseInt(parts[1]);
            int type = Integer.parseInt(parts[2]);
            long sum = 0;
            for (Order order : orders) {
                if (type == 1 && order.start >= start && order.start <= end) {
                    sum += order.cost;
                } else if (type == 2 && order.end >= start && order.end <= end) {
                    sum += order.end - order.start;
                }
            }
            results[i] = sum;
        }
        for (long result : results) {
            System.out.print(result + " ");
        }
    }
}