import java.util.*;

public class MainThree {
    static int[] parent, left, right;
    static int root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        parent = new int[n + 1];
        left = new int[n + 1];
        right = new int[n + 1];
        root = 1;

        for (int i = 1; i <= n; i++) {
            parent[i] = i / 2;
            left[i] = (2 * i <= n) ? 2 * i : 0;
            right[i] = (2 * i + 1 <= n) ? 2 * i + 1 : 0;
        }

        for (int i = 0; i < q; i++) {
            int v = scanner.nextInt();
            swapWithParent(v);
        }

        printTreeLVR(root);
    }

    public static void swapWithParent(int v) {
        int p = parent[v];
        if (p == 0) return;

        // Swap v and p in the parent's parent
        if (parent[p] != 0) {
            if (left[parent[p]] == p) left[parent[p]] = v;
            else right[parent[p]] = v;
        } else {
            root = v;
        }

        // Swap v and p
        if (left[p] == v) {
            left[p] = left[v];
            if (left[v] != 0) parent[left[v]] = p;
            left[v] = p;
        } else {
            right[p] = right[v];
            if (right[v] != 0) parent[right[v]] = p;
            right[v] = p;
        }

        parent[v] = parent[p];
        parent[p] = v;
    }

    public static void printTreeLVR(int v) {
        if (left[v] != 0) printTreeLVR(left[v]);
        System.out.print(v + " ");
        if (right[v] != 0) printTreeLVR(right[v]);
    }
}
