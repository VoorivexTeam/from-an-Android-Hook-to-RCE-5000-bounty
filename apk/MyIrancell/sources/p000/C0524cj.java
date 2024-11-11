package p000;

import android.content.Context;

/* renamed from: cj */
/* loaded from: classes.dex */
public class C0524cj {

    /* renamed from: a */
    private String f3017a;

    /* renamed from: b */
    private String f3018b;

    /* renamed from: c */
    private String f3019c;

    /* renamed from: d */
    private int f3020d = 0;

    /* renamed from: e */
    private byte[] f3021e;

    /* renamed from: f */
    private C0482bj f3022f;

    /* renamed from: a */
    public C0482bj m3682a() {
        return this.f3022f;
    }

    /* renamed from: a */
    public void m3683a(int i) {
        this.f3020d = i;
    }

    /* renamed from: a */
    public void m3684a(Context context, byte[] bArr) {
        C0023aj m160a = C0023aj.m160a(context);
        String str = this.f3017a;
        if (bArr != null) {
            m160a.m184b(str, bArr, 6);
        } else {
            m160a.m171a(str, 6);
        }
        this.f3021e = bArr;
    }

    /* renamed from: a */
    public void m3685a(C0482bj c0482bj) {
        this.f3022f = c0482bj;
    }

    /* renamed from: a */
    public void m3686a(String str) {
        this.f3019c = str;
    }

    /* renamed from: a */
    public boolean m3687a(Context context, String str) {
        this.f3017a = str;
        boolean m176a = C0023aj.m160a(context).m176a(str, "startup_images", 6);
        if (!m176a) {
            return m176a;
        }
        byte[] m190d = C0023aj.m160a(context).m190d(str, "startup_images");
        this.f3021e = m190d;
        if (m190d == null) {
            return false;
        }
        return m176a;
    }

    /* renamed from: b */
    public int m3688b() {
        return this.f3020d;
    }

    /* renamed from: b */
    public void m3689b(String str) {
        this.f3018b = str;
    }

    /* renamed from: c */
    public String m3690c() {
        return this.f3019c;
    }

    /* renamed from: d */
    public String m3691d() {
        return this.f3018b;
    }

    /* renamed from: e */
    public byte[] m3692e() {
        return this.f3021e;
    }

    /* renamed from: f */
    public String m3693f() {
        return this.f3017a;
    }
}
