package p000;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gt */
/* loaded from: classes.dex */
public final class RunnableC2525gt implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C2485ft f10339b;

    /* renamed from: c */
    private final /* synthetic */ Callable f10340c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2525gt(C2485ft c2485ft, Callable callable) {
        this.f10339b = c2485ft;
        this.f10340c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10339b.m11818a((C2485ft) this.f10340c.call());
        } catch (Exception e) {
            this.f10339b.m11817a(e);
        }
    }
}
