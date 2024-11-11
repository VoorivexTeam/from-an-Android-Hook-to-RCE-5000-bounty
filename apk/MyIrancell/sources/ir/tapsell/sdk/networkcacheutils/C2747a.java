package ir.tapsell.sdk.networkcacheutils;

import java.util.Vector;
import java.util.concurrent.Semaphore;

/* renamed from: ir.tapsell.sdk.networkcacheutils.a */
/* loaded from: classes.dex */
public class C2747a {

    /* renamed from: a */
    private Semaphore f11222a = new Semaphore(1);

    /* renamed from: b */
    private Vector<String> f11223b = new Vector<>();

    /* renamed from: a */
    public void m13087a(String str) {
        while (true) {
            this.f11222a.acquire();
            if (!this.f11223b.contains(str)) {
                this.f11223b.add(str);
                this.f11222a.release();
                return;
            } else {
                this.f11222a.release();
                Thread.yield();
            }
        }
    }

    /* renamed from: b */
    public void m13088b(String str) {
        this.f11223b.remove(str);
    }
}
