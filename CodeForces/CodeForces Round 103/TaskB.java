package mypackage;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import niyazio.FastScanner;
import niyazio.FastPrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, FastScanner in, FastPrinter out) {
        int x0 = in.nextInt();
        int y0 = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        if (x0 > w) {
            int t = x0;
            x0 = w;
            w = t;
        }
        if (y0 > h) {
            int t = y0;
            y0 = h;
            h = t;
        }
        w -= x0;
        h -= y0;
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt() - x0;
            y[i] = in.nextInt() - y0;
            r[i] = in.nextInt();
        }
        int ans = 0;
        for (int curY = 0; curY <= h; curY++) {
            for (int curX = 0; curX <= w; curX++) {
                if (curX != 0 && curX != w && curY != 0 && curY != h) {
                    continue;
                }
                boolean ok = false;
                for (int b = 0; b < n; b++) {
                    int dx = curX - x[b];
                    int dy = curY - y[b];
                    if (dx * dx + dy * dy <= r[b] * r[b]) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    ans++;
                }
            }
        }
        out.println(ans);
    }

}
