package coding;

import ru.ifmo.niyaz.io.FastScanner;
import ru.ifmo.niyaz.io.FastPrinter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskC {

    public void solve(int testNumber, FastScanner in, FastPrinter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        final int[] x = new int[n];
        final int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            x[i] = x1 + x2;
            y[i] = y1 + y2;
        }
        Integer[] order1 = new Integer[n];
        Integer[] order2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            order1[i] = order2[i] = i;
        }
        Arrays.sort(order1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(x[o1], x[o2]);
            }
        });
        Arrays.sort(order2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(y[o1], y[o2]);
            }
        });
        boolean[] was = new boolean[n];
        long ans = Long.MAX_VALUE;
        for (int x1 = 0; x1 <= k; x1++) {
            for (int x2 = Math.max(x1 + 1, n - k); x2 <= n; x2++) {
                for (int y1 = 0; y1 <= k; y1++) {
                    for (int y2 = Math.max(y1 + 1, n - k); y2 <= n; y2++) {
                        int cc = 0;
//                        if (x1 > 0 && x[order1[x1]] == x[order1[x1 - 1]]) continue;
//                        if (x2 < n && x[order1[x2]] == x[order1[x2 - 1]]) continue;
//                        if (y1 > 0 && y[order2[y1]] == y[order2[y1 - 1]]) continue;
//                        if (y2 < n && y[order2[y2]] == y[order2[y2 - 1]]) continue;
                        for (int e = 0; e < x1; e++) {
                            int id = order1[e];
                            if (!was[id]) {
                                ++cc;
                                was[id] = true;
                            }
                        }
                        for (int e = x2; e < n; e++) {
                            int id = order1[e];
                            if (!was[id]) {
                                ++cc;
                                was[id] = true;
                            }
                        }
                        for (int e = 0; e < y1; e++) {
                            int id = order2[e];
                            if (!was[id]) {
                                ++cc;
                                was[id] = true;
                            }
                        }
                        for (int e = y2; e < n; e++) {
                            int id = order2[e];
                            if (!was[id]) {
                                ++cc;
                                was[id] = true;
                            }
                        }
                        if (cc <= k) {
                            long bestDX = Math.max(1, (x[order1[x2 - 1]] - x[order1[x1]] + 1) / 2);
                            long bestDY = Math.max(1, (y[order2[y2 - 1]] - y[order2[y1]] + 1) / 2);
                            ans = Math.min(ans, bestDX * bestDY);
                        }
                        for (int e = 0; e < x1; e++) {
                            was[order1[e]] = false;
                        }
                        for (int e = x2; e < n; e++) {
                            was[order1[e]] = false;
                        }
                        for (int e = 0; e < y1; e++) {
                            was[order2[e]] = false;
                        }
                        for (int e = y2; e < n; e++) {
                            was[order2[e]] = false;
                        }
                    }
                }
            }
        }
        out.println(ans);
    }
}
