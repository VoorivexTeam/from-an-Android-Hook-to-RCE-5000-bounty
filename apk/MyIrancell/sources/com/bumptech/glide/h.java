package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.ag;
import defpackage.ah;
import defpackage.bg;
import defpackage.bh;
import defpackage.ch;
import defpackage.ib;
import defpackage.la;
import defpackage.li;
import defpackage.ma;
import defpackage.od;
import defpackage.pd;
import defpackage.qd;
import defpackage.tb;
import defpackage.u1;
import defpackage.vb;
import defpackage.xg;
import defpackage.yg;
import defpackage.zg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h {
    private final qd a;
    private final xg b;
    private final bh c;
    private final ch d;
    private final ma e;
    private final bg f;
    private final yg g;
    private final ah h = new ah();
    private final zg i = new zg();
    private final u1<List<Throwable>> j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        u1<List<Throwable>> b2 = li.b();
        this.j = b2;
        this.a = new qd(b2);
        this.b = new xg();
        this.c = new bh();
        this.d = new ch();
        this.e = new ma();
        this.f = new bg();
        this.g = new yg();
        a(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<ib<Data, TResource, Transcode>> c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.b(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new ib(cls, cls4, cls5, this.c.a(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public h a(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public <Data> h a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.b.a(cls, dVar);
        return this;
    }

    public <TResource> h a(Class<TResource> cls, com.bumptech.glide.load.k<TResource> kVar) {
        this.d.a(cls, kVar);
        return this;
    }

    public <TResource, Transcode> h a(Class<TResource> cls, Class<Transcode> cls2, ag<TResource, Transcode> agVar) {
        this.f.a(cls, cls2, agVar);
        return this;
    }

    public <Data, TResource> h a(Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.j<Data, TResource> jVar) {
        a("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Model, Data> h a(Class<Model> cls, Class<Data> cls2, pd<Model, Data> pdVar) {
        this.a.a(cls, cls2, pdVar);
        return this;
    }

    public <Data, TResource> h a(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.j<Data, TResource> jVar) {
        this.c.a(str, jVar, cls, cls2);
        return this;
    }

    public final h a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.a(arrayList);
        return this;
    }

    public h a(la.a<?> aVar) {
        this.e.a(aVar);
        return this;
    }

    public <X> com.bumptech.glide.load.k<X> a(vb<X> vbVar) {
        com.bumptech.glide.load.k<X> a2 = this.d.a(vbVar.d());
        if (a2 != null) {
            return a2;
        }
        throw new d(vbVar.d());
    }

    public List<ImageHeaderParser> a() {
        List<ImageHeaderParser> a2 = this.g.a();
        if (a2.isEmpty()) {
            throw new b();
        }
        return a2;
    }

    public <Model> List<od<Model, ?>> a(Model model) {
        List<od<Model, ?>> a2 = this.a.a((qd) model);
        if (a2.isEmpty()) {
            throw new c(model);
        }
        return a2;
    }

    public <Data, TResource, Transcode> tb<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        tb<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        if (this.i.a(a2)) {
            return null;
        }
        if (a2 == null) {
            List<ib<Data, TResource, Transcode>> c2 = c(cls, cls2, cls3);
            a2 = c2.isEmpty() ? null : new tb<>(cls, cls2, cls3, c2, this.j);
            this.i.a(cls, cls2, cls3, a2);
        }
        return a2;
    }

    public <Model, TResource, Transcode> List<Class<?>> b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a2 = this.h.a(cls, cls2, cls3);
        if (a2 == null) {
            a2 = new ArrayList<>();
            Iterator<Class<?>> it = this.a.a((Class<?>) cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.c.b(it.next(), cls2)) {
                    if (!this.f.b(cls4, cls3).isEmpty() && !a2.contains(cls4)) {
                        a2.add(cls4);
                    }
                }
            }
            this.h.a(cls, cls2, cls3, Collections.unmodifiableList(a2));
        }
        return a2;
    }

    public <X> la<X> b(X x) {
        return this.e.a((ma) x);
    }

    public boolean b(vb<?> vbVar) {
        return this.d.a(vbVar.d()) != null;
    }

    public <X> com.bumptech.glide.load.d<X> c(X x) {
        com.bumptech.glide.load.d<X> a2 = this.b.a(x.getClass());
        if (a2 != null) {
            return a2;
        }
        throw new e(x.getClass());
    }
}
