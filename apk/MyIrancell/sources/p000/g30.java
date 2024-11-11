package p000;

/* loaded from: classes.dex */
public final class g30 extends C2568hw {

    /* renamed from: c */
    private final float f10200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g30(float f, float f2, float f3) {
        super(f, f2);
        this.f10200c = f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m11880a(float f, float f2, float f3) {
        if (Math.abs(f2 - m12249b()) > f || Math.abs(f3 - m12248a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f10200c);
        return abs <= 1.0f || abs <= this.f10200c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public g30 m11881b(float f, float f2, float f3) {
        return new g30((m12248a() + f2) / 2.0f, (m12249b() + f) / 2.0f, (this.f10200c + f3) / 2.0f);
    }
}
