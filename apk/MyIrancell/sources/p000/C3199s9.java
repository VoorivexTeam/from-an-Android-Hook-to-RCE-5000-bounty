package p000;

/* renamed from: s9 */
/* loaded from: classes.dex */
public class C3199s9 {

    /* renamed from: a */
    private float f13052a;

    /* renamed from: b */
    private int f13053b;

    /* renamed from: a */
    public void m15386a(float f) {
        float f2 = this.f13052a + f;
        this.f13052a = f2;
        int i = this.f13053b + 1;
        this.f13053b = i;
        if (i == Integer.MAX_VALUE) {
            this.f13052a = f2 / 2.0f;
            this.f13053b = i / 2;
        }
    }
}
