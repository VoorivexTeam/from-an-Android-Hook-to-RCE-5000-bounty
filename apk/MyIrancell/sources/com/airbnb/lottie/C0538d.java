package com.airbnb.lottie;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0451b6;
import p000.C0506c6;
import p000.C2452f0;
import p000.C2499g6;
import p000.C2795j0;
import p000.C3112q7;
import p000.C3116q9;

/* renamed from: com.airbnb.lottie.d */
/* loaded from: classes.dex */
public class C0538d {

    /* renamed from: c */
    private Map<String, List<C3112q7>> f3069c;

    /* renamed from: d */
    private Map<String, C0541g> f3070d;

    /* renamed from: e */
    private Map<String, C0451b6> f3071e;

    /* renamed from: f */
    private List<C2499g6> f3072f;

    /* renamed from: g */
    private C2795j0<C0506c6> f3073g;

    /* renamed from: h */
    private C2452f0<C3112q7> f3074h;

    /* renamed from: i */
    private List<C3112q7> f3075i;

    /* renamed from: j */
    private Rect f3076j;

    /* renamed from: k */
    private float f3077k;

    /* renamed from: l */
    private float f3078l;

    /* renamed from: m */
    private float f3079m;

    /* renamed from: n */
    private boolean f3080n;

    /* renamed from: a */
    private final C0548n f3067a = new C0548n();

    /* renamed from: b */
    private final HashSet<String> f3068b = new HashSet<>();

    /* renamed from: o */
    private int f3081o = 0;

    /* renamed from: a */
    public Rect m3723a() {
        return this.f3076j;
    }

    /* renamed from: a */
    public C3112q7 m3724a(long j) {
        return this.f3074h.m11655c(j);
    }

    /* renamed from: a */
    public void m3725a(int i) {
        this.f3081o += i;
    }

    /* renamed from: a */
    public void m3726a(Rect rect, float f, float f2, float f3, List<C3112q7> list, C2452f0<C3112q7> c2452f0, Map<String, List<C3112q7>> map, Map<String, C0541g> map2, C2795j0<C0506c6> c2795j0, Map<String, C0451b6> map3, List<C2499g6> list2) {
        this.f3076j = rect;
        this.f3077k = f;
        this.f3078l = f2;
        this.f3079m = f3;
        this.f3075i = list;
        this.f3074h = c2452f0;
        this.f3069c = map;
        this.f3070d = map2;
        this.f3073g = c2795j0;
        this.f3071e = map3;
        this.f3072f = list2;
    }

    /* renamed from: a */
    public void m3727a(String str) {
        C3116q9.m15002b(str);
        this.f3068b.add(str);
    }

    /* renamed from: a */
    public void m3728a(boolean z) {
        this.f3080n = z;
    }

    /* renamed from: b */
    public C2499g6 m3729b(String str) {
        this.f3072f.size();
        for (int i = 0; i < this.f3072f.size(); i++) {
            C2499g6 c2499g6 = this.f3072f.get(i);
            if (c2499g6.m11896a(str)) {
                return c2499g6;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C2795j0<C0506c6> m3730b() {
        return this.f3073g;
    }

    /* renamed from: b */
    public void m3731b(boolean z) {
        this.f3067a.m3854a(z);
    }

    /* renamed from: c */
    public float m3732c() {
        return (m3734d() / this.f3079m) * 1000.0f;
    }

    /* renamed from: c */
    public List<C3112q7> m3733c(String str) {
        return this.f3069c.get(str);
    }

    /* renamed from: d */
    public float m3734d() {
        return this.f3078l - this.f3077k;
    }

    /* renamed from: e */
    public float m3735e() {
        return this.f3078l;
    }

    /* renamed from: f */
    public Map<String, C0451b6> m3736f() {
        return this.f3071e;
    }

    /* renamed from: g */
    public float m3737g() {
        return this.f3079m;
    }

    /* renamed from: h */
    public Map<String, C0541g> m3738h() {
        return this.f3070d;
    }

    /* renamed from: i */
    public List<C3112q7> m3739i() {
        return this.f3075i;
    }

    /* renamed from: j */
    public int m3740j() {
        return this.f3081o;
    }

    /* renamed from: k */
    public C0548n m3741k() {
        return this.f3067a;
    }

    /* renamed from: l */
    public float m3742l() {
        return this.f3077k;
    }

    /* renamed from: m */
    public boolean m3743m() {
        return this.f3080n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C3112q7> it = this.f3075i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m14958a("\t"));
        }
        return sb.toString();
    }
}
