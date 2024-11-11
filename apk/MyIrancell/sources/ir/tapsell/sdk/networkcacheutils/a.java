package ir.tapsell.sdk.networkcacheutils;

import java.util.Vector;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class a {
    private Semaphore a = new Semaphore(1);
    private Vector<String> b = new Vector<>();

    public void a(String str) {
        while (true) {
            this.a.acquire();
            if (!this.b.contains(str)) {
                this.b.add(str);
                this.a.release();
                return;
            } else {
                this.a.release();
                Thread.yield();
            }
        }
    }

    public void b(String str) {
        this.b.remove(str);
    }
}
