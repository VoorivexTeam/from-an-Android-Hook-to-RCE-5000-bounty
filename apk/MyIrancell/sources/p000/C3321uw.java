package p000;

import android.hardware.Camera;

/* renamed from: uw */
/* loaded from: classes.dex */
public final class C3321uw {

    /* renamed from: a */
    private final int f13506a;

    /* renamed from: b */
    private final Camera f13507b;

    /* renamed from: c */
    private final EnumC3277tw f13508c;

    /* renamed from: d */
    private final int f13509d;

    public C3321uw(int i, Camera camera, EnumC3277tw enumC3277tw, int i2) {
        this.f13506a = i;
        this.f13507b = camera;
        this.f13508c = enumC3277tw;
        this.f13509d = i2;
    }

    /* renamed from: a */
    public Camera m15860a() {
        return this.f13507b;
    }

    /* renamed from: b */
    public EnumC3277tw m15861b() {
        return this.f13508c;
    }

    /* renamed from: c */
    public int m15862c() {
        return this.f13509d;
    }

    public String toString() {
        return "Camera #" + this.f13506a + " : " + this.f13508c + ',' + this.f13509d;
    }
}
