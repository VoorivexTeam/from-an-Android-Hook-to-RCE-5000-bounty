package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC0570d;
import com.bumptech.glide.load.InterfaceC0576j;
import com.bumptech.glide.load.InterfaceC0577k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C0021ah;
import p000.C0479bg;
import p000.C0480bh;
import p000.C0522ch;
import p000.C2586ib;
import p000.C2898li;
import p000.C2936ma;
import p000.C3123qd;
import p000.C3256tb;
import p000.C3437xg;
import p000.C3486yg;
import p000.C3528zg;
import p000.InterfaceC0020ag;
import p000.InterfaceC2890la;
import p000.InterfaceC3031od;
import p000.InterfaceC3081pd;
import p000.InterfaceC3283u1;
import p000.InterfaceC3353vb;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public class C0563h {

    /* renamed from: a */
    private final C3123qd f3237a;

    /* renamed from: b */
    private final C3437xg f3238b;

    /* renamed from: c */
    private final C0480bh f3239c;

    /* renamed from: d */
    private final C0522ch f3240d;

    /* renamed from: e */
    private final C2936ma f3241e;

    /* renamed from: f */
    private final C0479bg f3242f;

    /* renamed from: g */
    private final C3486yg f3243g;

    /* renamed from: h */
    private final C0021ah f3244h = new C0021ah();

    /* renamed from: i */
    private final C3528zg f3245i = new C3528zg();

    /* renamed from: j */
    private final InterfaceC3283u1<List<Throwable>> f3246j;

    /* renamed from: com.bumptech.glide.h$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }
    }

    /* renamed from: com.bumptech.glide.h$d */
    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.h$e */
    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C0563h() {
        InterfaceC3283u1<List<Throwable>> m13871b = C2898li.m13871b();
        this.f3246j = m13871b;
        this.f3237a = new C3123qd(m13871b);
        this.f3238b = new C3437xg();
        this.f3239c = new C0480bh();
        this.f3240d = new C0522ch();
        this.f3241e = new C2936ma();
        this.f3242f = new C0479bg();
        this.f3243g = new C3486yg();
        m3902a(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C2586ib<Data, TResource, Transcode>> m3894c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3239c.m3394b(cls, cls2)) {
            for (Class cls5 : this.f3242f.m3388b(cls4, cls3)) {
                arrayList.add(new C2586ib(cls, cls4, cls5, this.f3239c.m3391a(cls, cls4), this.f3242f.m3386a(cls4, cls5), this.f3246j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0563h m3895a(ImageHeaderParser imageHeaderParser) {
        this.f3243g.m16628a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public <Data> C0563h m3896a(Class<Data> cls, InterfaceC0570d<Data> interfaceC0570d) {
        this.f3238b.m16492a(cls, interfaceC0570d);
        return this;
    }

    /* renamed from: a */
    public <TResource> C0563h m3897a(Class<TResource> cls, InterfaceC0577k<TResource> interfaceC0577k) {
        this.f3240d.m3678a(cls, interfaceC0577k);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> C0563h m3898a(Class<TResource> cls, Class<Transcode> cls2, InterfaceC0020ag<TResource, Transcode> interfaceC0020ag) {
        this.f3242f.m3387a(cls, cls2, interfaceC0020ag);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> C0563h m3899a(Class<Data> cls, Class<TResource> cls2, InterfaceC0576j<Data, TResource> interfaceC0576j) {
        m3901a("legacy_append", cls, cls2, interfaceC0576j);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> C0563h m3900a(Class<Model> cls, Class<Data> cls2, InterfaceC3081pd<Model, Data> interfaceC3081pd) {
        this.f3237a.m15061a(cls, cls2, interfaceC3081pd);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> C0563h m3901a(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC0576j<Data, TResource> interfaceC0576j) {
        this.f3239c.m3392a(str, interfaceC0576j, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final C0563h m3902a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3239c.m3393a(arrayList);
        return this;
    }

    /* renamed from: a */
    public C0563h m3903a(InterfaceC2890la.a<?> aVar) {
        this.f3241e.m14097a(aVar);
        return this;
    }

    /* renamed from: a */
    public <X> InterfaceC0577k<X> m3904a(InterfaceC3353vb<X> interfaceC3353vb) {
        InterfaceC0577k<X> m3677a = this.f3240d.m3677a(interfaceC3353vb.mo3385d());
        if (m3677a != null) {
            return m3677a;
        }
        throw new d(interfaceC3353vb.mo3385d());
    }

    /* renamed from: a */
    public List<ImageHeaderParser> m3905a() {
        List<ImageHeaderParser> m16627a = this.f3243g.m16627a();
        if (m16627a.isEmpty()) {
            throw new b();
        }
        return m16627a;
    }

    /* renamed from: a */
    public <Model> List<InterfaceC3031od<Model, ?>> m3906a(Model model) {
        List<InterfaceC3031od<Model, ?>> m15060a = this.f3237a.m15060a((C3123qd) model);
        if (m15060a.isEmpty()) {
            throw new c(model);
        }
        return m15060a;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C3256tb<Data, TResource, Transcode> m3907a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C3256tb<Data, TResource, Transcode> m16923a = this.f3245i.m16923a(cls, cls2, cls3);
        if (this.f3245i.m16925a(m16923a)) {
            return null;
        }
        if (m16923a == null) {
            List<C2586ib<Data, TResource, Transcode>> m3894c = m3894c(cls, cls2, cls3);
            m16923a = m3894c.isEmpty() ? null : new C3256tb<>(cls, cls2, cls3, m3894c, this.f3246j);
            this.f3245i.m16924a(cls, cls2, cls3, m16923a);
        }
        return m16923a;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> m3908b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m153a = this.f3244h.m153a(cls, cls2, cls3);
        if (m153a == null) {
            m153a = new ArrayList<>();
            Iterator<Class<?>> it = this.f3237a.m15059a((Class<?>) cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f3239c.m3394b(it.next(), cls2)) {
                    if (!this.f3242f.m3388b(cls4, cls3).isEmpty() && !m153a.contains(cls4)) {
                        m153a.add(cls4);
                    }
                }
            }
            this.f3244h.m154a(cls, cls2, cls3, Collections.unmodifiableList(m153a));
        }
        return m153a;
    }

    /* renamed from: b */
    public <X> InterfaceC2890la<X> m3909b(X x) {
        return this.f3241e.m14096a((C2936ma) x);
    }

    /* renamed from: b */
    public boolean m3910b(InterfaceC3353vb<?> interfaceC3353vb) {
        return this.f3240d.m3677a(interfaceC3353vb.mo3385d()) != null;
    }

    /* renamed from: c */
    public <X> InterfaceC0570d<X> m3911c(X x) {
        InterfaceC0570d<X> m16491a = this.f3238b.m16491a(x.getClass());
        if (m16491a != null) {
            return m16491a;
        }
        throw new e(x.getClass());
    }
}
