package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class fm implements Runnable {
    private final hm b;
    private final tl c;
    private final lk d;
    private final pl e;

    private fm(hm hmVar, tl tlVar, lk lkVar, pl plVar) {
        this.b = hmVar;
        this.c = tlVar;
        this.d = lkVar;
        this.e = plVar;
    }

    public static Runnable a(hm hmVar, tl tlVar, lk lkVar, pl plVar) {
        return new fm(hmVar, tlVar, lkVar, plVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        hm.a(this.b, this.c, this.d, this.e);
    }
}
