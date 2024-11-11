package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import defpackage.bc;
import defpackage.hh;
import defpackage.ih;
import defpackage.kb;
import defpackage.qh;
import defpackage.uh;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends ContextWrapper {
    static final k<?, ?> j = new b();
    private final bc a;
    private final h b;
    private final qh c;
    private final ih d;
    private final List<hh<Object>> e;
    private final Map<Class<?>, k<?, ?>> f;
    private final kb g;
    private final boolean h;
    private final int i;

    public e(Context context, bc bcVar, h hVar, qh qhVar, ih ihVar, Map<Class<?>, k<?, ?>> map, List<hh<Object>> list, kb kbVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.a = bcVar;
        this.b = hVar;
        this.c = qhVar;
        this.d = ihVar;
        this.e = list;
        this.f = map;
        this.g = kbVar;
        this.h = z;
        this.i = i;
    }

    public bc a() {
        return this.a;
    }

    public <T> k<?, T> a(Class<T> cls) {
        k<?, T> kVar = (k) this.f.get(cls);
        if (kVar == null) {
            for (Map.Entry<Class<?>, k<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        return kVar == null ? (k<?, T>) j : kVar;
    }

    public <X> uh<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    public List<hh<Object>> b() {
        return this.e;
    }

    public ih c() {
        return this.d;
    }

    public kb d() {
        return this.g;
    }

    public int e() {
        return this.i;
    }

    public h f() {
        return this.b;
    }

    public boolean g() {
        return this.h;
    }
}
