package defpackage;

/* loaded from: classes.dex */
final class ir extends hr {
    private final gr a = new gr();

    @Override // defpackage.hr
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.a.a(th, true).add(th2);
    }
}
