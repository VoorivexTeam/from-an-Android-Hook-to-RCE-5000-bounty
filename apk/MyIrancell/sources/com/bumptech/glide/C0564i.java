package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC2389dh;
import p000.AbstractC2809jb;
import p000.AbstractC3306uh;
import p000.C2432eh;
import p000.C2433ei;
import p000.C2595ih;
import p000.C2816ji;
import p000.C2860kh;
import p000.C2861ki;
import p000.C2897lh;
import p000.InterfaceC2473fh;
import p000.InterfaceC2513gh;
import p000.InterfaceC2553hh;
import p000.InterfaceC3262th;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public class C0564i<TranscodeType> extends AbstractC2389dh<C0564i<TranscodeType>> implements Cloneable {

    /* renamed from: B */
    private final Context f3247B;

    /* renamed from: C */
    private final C0565j f3248C;

    /* renamed from: D */
    private final Class<TranscodeType> f3249D;

    /* renamed from: E */
    private final C0560e f3250E;

    /* renamed from: F */
    private AbstractC0566k<?, ? super TranscodeType> f3251F;

    /* renamed from: G */
    private Object f3252G;

    /* renamed from: H */
    private List<InterfaceC2553hh<TranscodeType>> f3253H;

    /* renamed from: I */
    private C0564i<TranscodeType> f3254I;

    /* renamed from: J */
    private C0564i<TranscodeType> f3255J;

    /* renamed from: K */
    private Float f3256K;

    /* renamed from: L */
    private boolean f3257L = true;

    /* renamed from: M */
    private boolean f3258M;

    /* renamed from: N */
    private boolean f3259N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.i$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3260a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3261b;

        static {
            int[] iArr = new int[EnumC0562g.values().length];
            f3261b = iArr;
            try {
                iArr[EnumC0562g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3261b[EnumC0562g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3261b[EnumC0562g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3261b[EnumC0562g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f3260a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3260a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3260a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3260a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3260a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3260a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3260a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3260a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new C2595ih().m11397a(AbstractC2809jb.f11500b).m11390a(EnumC0562g.LOW).m11400a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    public C0564i(ComponentCallbacks2C0558c componentCallbacks2C0558c, C0565j c0565j, Class<TranscodeType> cls, Context context) {
        this.f3248C = c0565j;
        this.f3249D = cls;
        this.f3247B = context;
        this.f3251F = c0565j.m3935b(cls);
        this.f3250E = componentCallbacks2C0558c.m3880f();
        m3915a(c0565j.m3941g());
        mo3921a((AbstractC2389dh<?>) c0565j.m3942h());
    }

    /* renamed from: a */
    private InterfaceC2473fh m3912a(InterfaceC3262th<TranscodeType> interfaceC3262th, InterfaceC2553hh<TranscodeType> interfaceC2553hh, AbstractC2389dh<?> abstractC2389dh, InterfaceC2513gh interfaceC2513gh, AbstractC0566k<?, ? super TranscodeType> abstractC0566k, EnumC0562g enumC0562g, int i, int i2, Executor executor) {
        Context context = this.f3247B;
        C0560e c0560e = this.f3250E;
        return C2860kh.m13702b(context, c0560e, this.f3252G, this.f3249D, abstractC2389dh, i, i2, enumC0562g, interfaceC3262th, interfaceC2553hh, this.f3253H, interfaceC2513gh, c0560e.m3890d(), abstractC0566k.m3946a(), executor);
    }

    /* renamed from: a */
    private InterfaceC2473fh m3913a(InterfaceC3262th<TranscodeType> interfaceC3262th, InterfaceC2553hh<TranscodeType> interfaceC2553hh, AbstractC2389dh<?> abstractC2389dh, Executor executor) {
        return m3914a(interfaceC3262th, interfaceC2553hh, (InterfaceC2513gh) null, this.f3251F, abstractC2389dh.m11415r(), abstractC2389dh.m11412o(), abstractC2389dh.m11411n(), abstractC2389dh, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private InterfaceC2473fh m3914a(InterfaceC3262th<TranscodeType> interfaceC3262th, InterfaceC2553hh<TranscodeType> interfaceC2553hh, InterfaceC2513gh interfaceC2513gh, AbstractC0566k<?, ? super TranscodeType> abstractC0566k, EnumC0562g enumC0562g, int i, int i2, AbstractC2389dh<?> abstractC2389dh, Executor executor) {
        InterfaceC2513gh interfaceC2513gh2;
        InterfaceC2513gh interfaceC2513gh3;
        if (this.f3255J != null) {
            interfaceC2513gh3 = new C2432eh(interfaceC2513gh);
            interfaceC2513gh2 = interfaceC2513gh3;
        } else {
            interfaceC2513gh2 = null;
            interfaceC2513gh3 = interfaceC2513gh;
        }
        InterfaceC2473fh m3919b = m3919b(interfaceC3262th, interfaceC2553hh, interfaceC2513gh3, abstractC0566k, enumC0562g, i, i2, abstractC2389dh, executor);
        if (interfaceC2513gh2 == null) {
            return m3919b;
        }
        int m11412o = this.f3255J.m11412o();
        int m11411n = this.f3255J.m11411n();
        if (C2861ki.m13732b(i, i2) && !this.f3255J.m11382F()) {
            m11412o = abstractC2389dh.m11412o();
            m11411n = abstractC2389dh.m11411n();
        }
        C0564i<TranscodeType> c0564i = this.f3255J;
        C2432eh c2432eh = interfaceC2513gh2;
        c2432eh.m11600a(m3919b, c0564i.m3914a(interfaceC3262th, interfaceC2553hh, interfaceC2513gh2, c0564i.f3251F, c0564i.m11415r(), m11412o, m11411n, this.f3255J, executor));
        return c2432eh;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m3915a(List<InterfaceC2553hh<Object>> list) {
        Iterator<InterfaceC2553hh<Object>> it = list.iterator();
        while (it.hasNext()) {
            m3922a((InterfaceC2553hh) it.next());
        }
    }

    /* renamed from: a */
    private boolean m3916a(AbstractC2389dh<?> abstractC2389dh, InterfaceC2473fh interfaceC2473fh) {
        return !abstractC2389dh.m11423z() && interfaceC2473fh.mo11611g();
    }

    /* renamed from: b */
    private EnumC0562g m3917b(EnumC0562g enumC0562g) {
        int i = a.f3261b[enumC0562g.ordinal()];
        if (i == 1) {
            return EnumC0562g.NORMAL;
        }
        if (i == 2) {
            return EnumC0562g.HIGH;
        }
        if (i == 3 || i == 4) {
            return EnumC0562g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m11415r());
    }

    /* renamed from: b */
    private C0564i<TranscodeType> m3918b(Object obj) {
        this.f3252G = obj;
        this.f3258M = true;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [dh] */
    /* renamed from: b */
    private InterfaceC2473fh m3919b(InterfaceC3262th<TranscodeType> interfaceC3262th, InterfaceC2553hh<TranscodeType> interfaceC2553hh, InterfaceC2513gh interfaceC2513gh, AbstractC0566k<?, ? super TranscodeType> abstractC0566k, EnumC0562g enumC0562g, int i, int i2, AbstractC2389dh<?> abstractC2389dh, Executor executor) {
        C0564i<TranscodeType> c0564i = this.f3254I;
        if (c0564i == null) {
            if (this.f3256K == null) {
                return m3912a(interfaceC3262th, interfaceC2553hh, abstractC2389dh, interfaceC2513gh, abstractC0566k, enumC0562g, i, i2, executor);
            }
            C2897lh c2897lh = new C2897lh(interfaceC2513gh);
            c2897lh.m13865a(m3912a(interfaceC3262th, interfaceC2553hh, abstractC2389dh, c2897lh, abstractC0566k, enumC0562g, i, i2, executor), m3912a(interfaceC3262th, interfaceC2553hh, abstractC2389dh.mo16979clone().m11388a(this.f3256K.floatValue()), c2897lh, abstractC0566k, m3917b(enumC0562g), i, i2, executor));
            return c2897lh;
        }
        if (this.f3259N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC0566k<?, ? super TranscodeType> abstractC0566k2 = c0564i.f3257L ? abstractC0566k : c0564i.f3251F;
        EnumC0562g m11415r = this.f3254I.m11377A() ? this.f3254I.m11415r() : m3917b(enumC0562g);
        int m11412o = this.f3254I.m11412o();
        int m11411n = this.f3254I.m11411n();
        if (C2861ki.m13732b(i, i2) && !this.f3254I.m11382F()) {
            m11412o = abstractC2389dh.m11412o();
            m11411n = abstractC2389dh.m11411n();
        }
        int i3 = m11412o;
        int i4 = m11411n;
        C2897lh c2897lh2 = new C2897lh(interfaceC2513gh);
        InterfaceC2473fh m3912a = m3912a(interfaceC3262th, interfaceC2553hh, abstractC2389dh, c2897lh2, abstractC0566k, enumC0562g, i, i2, executor);
        this.f3259N = true;
        C0564i c0564i2 = (C0564i<TranscodeType>) this.f3254I;
        InterfaceC2473fh m3914a = c0564i2.m3914a(interfaceC3262th, interfaceC2553hh, c2897lh2, abstractC0566k2, m11415r, i3, i4, c0564i2, executor);
        this.f3259N = false;
        c2897lh2.m13865a(m3912a, m3914a);
        return c2897lh2;
    }

    /* renamed from: b */
    private <Y extends InterfaceC3262th<TranscodeType>> Y m3920b(Y y, InterfaceC2553hh<TranscodeType> interfaceC2553hh, AbstractC2389dh<?> abstractC2389dh, Executor executor) {
        C2816ji.m13459a(y);
        if (!this.f3258M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2473fh m3913a = m3913a(y, interfaceC2553hh, abstractC2389dh, executor);
        InterfaceC2473fh mo14107c = y.mo14107c();
        if (!m3913a.mo11602b(mo14107c) || m3916a(abstractC2389dh, mo14107c)) {
            this.f3248C.m3933a((InterfaceC3262th<?>) y);
            y.mo14105a(m3913a);
            this.f3248C.m3934a(y, m3913a);
            return y;
        }
        m3913a.mo11601b();
        C2816ji.m13459a(mo14107c);
        if (!mo14107c.isRunning()) {
            mo14107c.mo11598a();
        }
        return y;
    }

    @Override // p000.AbstractC2389dh
    /* renamed from: a */
    public C0564i<TranscodeType> mo3921a(AbstractC2389dh<?> abstractC2389dh) {
        C2816ji.m13459a(abstractC2389dh);
        return (C0564i) super.mo3921a(abstractC2389dh);
    }

    /* renamed from: a */
    public C0564i<TranscodeType> m3922a(InterfaceC2553hh<TranscodeType> interfaceC2553hh) {
        if (interfaceC2553hh != null) {
            if (this.f3253H == null) {
                this.f3253H = new ArrayList();
            }
            this.f3253H.add(interfaceC2553hh);
        }
        return this;
    }

    /* renamed from: a */
    public C0564i<TranscodeType> m3923a(Object obj) {
        m3918b(obj);
        return this;
    }

    /* renamed from: a */
    public C0564i<TranscodeType> m3924a(String str) {
        m3918b(str);
        return this;
    }

    @Override // p000.AbstractC2389dh
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC2389dh mo3921a(AbstractC2389dh abstractC2389dh) {
        return mo3921a((AbstractC2389dh<?>) abstractC2389dh);
    }

    /* renamed from: a */
    public <Y extends InterfaceC3262th<TranscodeType>> Y m3925a(Y y) {
        m3926a((C0564i<TranscodeType>) y, (InterfaceC2553hh) null, C2433ei.m11613b());
        return y;
    }

    /* renamed from: a */
    <Y extends InterfaceC3262th<TranscodeType>> Y m3926a(Y y, InterfaceC2553hh<TranscodeType> interfaceC2553hh, Executor executor) {
        m3920b(y, interfaceC2553hh, this, executor);
        return y;
    }

    /* renamed from: a */
    public AbstractC3306uh<ImageView, TranscodeType> m3927a(ImageView imageView) {
        AbstractC2389dh<?> abstractC2389dh;
        C2861ki.m13728a();
        C2816ji.m13459a(imageView);
        if (!m11381E() && m11379C() && imageView.getScaleType() != null) {
            switch (a.f3260a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC2389dh = mo16979clone().m11384H();
                    break;
                case 2:
                case 6:
                    abstractC2389dh = mo16979clone().m11385I();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC2389dh = mo16979clone().m11386J();
                    break;
            }
            AbstractC3306uh<ImageView, TranscodeType> m3887a = this.f3250E.m3887a(imageView, this.f3249D);
            m3920b(m3887a, null, abstractC2389dh, C2433ei.m11613b());
            return m3887a;
        }
        abstractC2389dh = this;
        AbstractC3306uh<ImageView, TranscodeType> m3887a2 = this.f3250E.m3887a(imageView, this.f3249D);
        m3920b(m3887a2, null, abstractC2389dh, C2433ei.m11613b());
        return m3887a2;
    }

    @Override // p000.AbstractC2389dh
    /* renamed from: clone */
    public C0564i<TranscodeType> mo16979clone() {
        C0564i<TranscodeType> c0564i = (C0564i) super.mo16979clone();
        c0564i.f3251F = (AbstractC0566k<?, ? super TranscodeType>) c0564i.f3251F.m16980clone();
        return c0564i;
    }
}
