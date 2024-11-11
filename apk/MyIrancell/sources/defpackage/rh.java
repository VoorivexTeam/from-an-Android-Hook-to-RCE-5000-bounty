package defpackage;

@Deprecated
/* loaded from: classes.dex */
public abstract class rh<Z> extends mh<Z> {
    private final int b;
    private final int c;

    public rh() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public rh(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.th
    public void a(sh shVar) {
    }

    @Override // defpackage.th
    public final void b(sh shVar) {
        if (ki.b(this.b, this.c)) {
            shVar.a(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.b + " and height: " + this.c + ", either provide dimensions in the constructor or call override()");
    }
}
