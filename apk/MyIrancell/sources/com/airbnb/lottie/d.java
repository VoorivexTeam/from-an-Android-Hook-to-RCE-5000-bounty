package com.airbnb.lottie;

import android.graphics.Rect;
import defpackage.b6;
import defpackage.c6;
import defpackage.f0;
import defpackage.g6;
import defpackage.j0;
import defpackage.q7;
import defpackage.q9;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    private Map<String, List<q7>> c;
    private Map<String, g> d;
    private Map<String, b6> e;
    private List<g6> f;
    private j0<c6> g;
    private f0<q7> h;
    private List<q7> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private final n a = new n();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    public Rect a() {
        return this.j;
    }

    public q7 a(long j) {
        return this.h.c(j);
    }

    public void a(int i) {
        this.o += i;
    }

    public void a(Rect rect, float f, float f2, float f3, List<q7> list, f0<q7> f0Var, Map<String, List<q7>> map, Map<String, g> map2, j0<c6> j0Var, Map<String, b6> map3, List<g6> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = f0Var;
        this.c = map;
        this.d = map2;
        this.g = j0Var;
        this.e = map3;
        this.f = list2;
    }

    public void a(String str) {
        q9.b(str);
        this.b.add(str);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public g6 b(String str) {
        this.f.size();
        for (int i = 0; i < this.f.size(); i++) {
            g6 g6Var = this.f.get(i);
            if (g6Var.a(str)) {
                return g6Var;
            }
        }
        return null;
    }

    public j0<c6> b() {
        return this.g;
    }

    public void b(boolean z) {
        this.a.a(z);
    }

    public float c() {
        return (d() / this.m) * 1000.0f;
    }

    public List<q7> c(String str) {
        return this.c.get(str);
    }

    public float d() {
        return this.l - this.k;
    }

    public float e() {
        return this.l;
    }

    public Map<String, b6> f() {
        return this.e;
    }

    public float g() {
        return this.m;
    }

    public Map<String, g> h() {
        return this.d;
    }

    public List<q7> i() {
        return this.i;
    }

    public int j() {
        return this.o;
    }

    public n k() {
        return this.a;
    }

    public float l() {
        return this.k;
    }

    public boolean m() {
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<q7> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().a("\t"));
        }
        return sb.toString();
    }
}
