package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import p000.AbstractC3306uh;
import p000.C2595ih;
import p000.C2854kb;
import p000.C3127qh;
import p000.InterfaceC0475bc;
import p000.InterfaceC2553hh;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public class C0560e extends ContextWrapper {

    /* renamed from: j */
    static final AbstractC0566k<?, ?> f3227j = new C0557b();

    /* renamed from: a */
    private final InterfaceC0475bc f3228a;

    /* renamed from: b */
    private final C0563h f3229b;

    /* renamed from: c */
    private final C3127qh f3230c;

    /* renamed from: d */
    private final C2595ih f3231d;

    /* renamed from: e */
    private final List<InterfaceC2553hh<Object>> f3232e;

    /* renamed from: f */
    private final Map<Class<?>, AbstractC0566k<?, ?>> f3233f;

    /* renamed from: g */
    private final C2854kb f3234g;

    /* renamed from: h */
    private final boolean f3235h;

    /* renamed from: i */
    private final int f3236i;

    public C0560e(Context context, InterfaceC0475bc interfaceC0475bc, C0563h c0563h, C3127qh c3127qh, C2595ih c2595ih, Map<Class<?>, AbstractC0566k<?, ?>> map, List<InterfaceC2553hh<Object>> list, C2854kb c2854kb, boolean z, int i) {
        super(context.getApplicationContext());
        this.f3228a = interfaceC0475bc;
        this.f3229b = c0563h;
        this.f3230c = c3127qh;
        this.f3231d = c2595ih;
        this.f3232e = list;
        this.f3233f = map;
        this.f3234g = c2854kb;
        this.f3235h = z;
        this.f3236i = i;
    }

    /* renamed from: a */
    public InterfaceC0475bc m3885a() {
        return this.f3228a;
    }

    /* renamed from: a */
    public <T> AbstractC0566k<?, T> m3886a(Class<T> cls) {
        AbstractC0566k<?, T> abstractC0566k = (AbstractC0566k) this.f3233f.get(cls);
        if (abstractC0566k == null) {
            for (Map.Entry<Class<?>, AbstractC0566k<?, ?>> entry : this.f3233f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC0566k = (AbstractC0566k) entry.getValue();
                }
            }
        }
        return abstractC0566k == null ? (AbstractC0566k<?, T>) f3227j : abstractC0566k;
    }

    /* renamed from: a */
    public <X> AbstractC3306uh<ImageView, X> m3887a(ImageView imageView, Class<X> cls) {
        return this.f3230c.m15096a(imageView, cls);
    }

    /* renamed from: b */
    public List<InterfaceC2553hh<Object>> m3888b() {
        return this.f3232e;
    }

    /* renamed from: c */
    public C2595ih m3889c() {
        return this.f3231d;
    }

    /* renamed from: d */
    public C2854kb m3890d() {
        return this.f3234g;
    }

    /* renamed from: e */
    public int m3891e() {
        return this.f3236i;
    }

    /* renamed from: f */
    public C0563h m3892f() {
        return this.f3229b;
    }

    /* renamed from: g */
    public boolean m3893g() {
        return this.f3235h;
    }
}
