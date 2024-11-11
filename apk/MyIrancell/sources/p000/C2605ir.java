package p000;

/* renamed from: ir */
/* loaded from: classes.dex */
final class C2605ir extends AbstractC2563hr {

    /* renamed from: a */
    private final C2523gr f10669a = new C2523gr();

    @Override // p000.AbstractC2563hr
    /* renamed from: a */
    public final void mo11633a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f10669a.m12039a(th, true).add(th2);
    }
}
