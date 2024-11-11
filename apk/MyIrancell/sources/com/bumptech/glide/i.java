package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import defpackage.dh;
import defpackage.eh;
import defpackage.ei;
import defpackage.fh;
import defpackage.gh;
import defpackage.hh;
import defpackage.ih;
import defpackage.jb;
import defpackage.ji;
import defpackage.kh;
import defpackage.ki;
import defpackage.lh;
import defpackage.th;
import defpackage.uh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i<TranscodeType> extends dh<i<TranscodeType>> implements Cloneable {
    private final Context B;
    private final j C;
    private final Class<TranscodeType> D;
    private final e E;
    private k<?, ? super TranscodeType> F;
    private Object G;
    private List<hh<TranscodeType>> H;
    private i<TranscodeType> I;
    private i<TranscodeType> J;
    private Float K;
    private boolean L = true;
    private boolean M;
    private boolean N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new ih().a(jb.b).a(g.LOW).a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    public i(c cVar, j jVar, Class<TranscodeType> cls, Context context) {
        this.C = jVar;
        this.D = cls;
        this.B = context;
        this.F = jVar.b(cls);
        this.E = cVar.f();
        a(jVar.g());
        a((dh<?>) jVar.h());
    }

    private fh a(th<TranscodeType> thVar, hh<TranscodeType> hhVar, dh<?> dhVar, gh ghVar, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2, Executor executor) {
        Context context = this.B;
        e eVar = this.E;
        return kh.b(context, eVar, this.G, this.D, dhVar, i, i2, gVar, thVar, hhVar, this.H, ghVar, eVar.d(), kVar.a(), executor);
    }

    private fh a(th<TranscodeType> thVar, hh<TranscodeType> hhVar, dh<?> dhVar, Executor executor) {
        return a(thVar, hhVar, (gh) null, this.F, dhVar.r(), dhVar.o(), dhVar.n(), dhVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private fh a(th<TranscodeType> thVar, hh<TranscodeType> hhVar, gh ghVar, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2, dh<?> dhVar, Executor executor) {
        gh ghVar2;
        gh ghVar3;
        if (this.J != null) {
            ghVar3 = new eh(ghVar);
            ghVar2 = ghVar3;
        } else {
            ghVar2 = null;
            ghVar3 = ghVar;
        }
        fh b = b(thVar, hhVar, ghVar3, kVar, gVar, i, i2, dhVar, executor);
        if (ghVar2 == null) {
            return b;
        }
        int o = this.J.o();
        int n = this.J.n();
        if (ki.b(i, i2) && !this.J.F()) {
            o = dhVar.o();
            n = dhVar.n();
        }
        i<TranscodeType> iVar = this.J;
        eh ehVar = ghVar2;
        ehVar.a(b, iVar.a(thVar, hhVar, ghVar2, iVar.F, iVar.r(), o, n, this.J, executor));
        return ehVar;
    }

    @SuppressLint({"CheckResult"})
    private void a(List<hh<Object>> list) {
        Iterator<hh<Object>> it = list.iterator();
        while (it.hasNext()) {
            a((hh) it.next());
        }
    }

    private boolean a(dh<?> dhVar, fh fhVar) {
        return !dhVar.z() && fhVar.g();
    }

    private g b(g gVar) {
        int i = a.b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + r());
    }

    private i<TranscodeType> b(Object obj) {
        this.G = obj;
        this.M = true;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [dh] */
    private fh b(th<TranscodeType> thVar, hh<TranscodeType> hhVar, gh ghVar, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2, dh<?> dhVar, Executor executor) {
        i<TranscodeType> iVar = this.I;
        if (iVar == null) {
            if (this.K == null) {
                return a(thVar, hhVar, dhVar, ghVar, kVar, gVar, i, i2, executor);
            }
            lh lhVar = new lh(ghVar);
            lhVar.a(a(thVar, hhVar, dhVar, lhVar, kVar, gVar, i, i2, executor), a(thVar, hhVar, dhVar.mo1clone().a(this.K.floatValue()), lhVar, kVar, b(gVar), i, i2, executor));
            return lhVar;
        }
        if (this.N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        k<?, ? super TranscodeType> kVar2 = iVar.L ? kVar : iVar.F;
        g r = this.I.A() ? this.I.r() : b(gVar);
        int o = this.I.o();
        int n = this.I.n();
        if (ki.b(i, i2) && !this.I.F()) {
            o = dhVar.o();
            n = dhVar.n();
        }
        int i3 = o;
        int i4 = n;
        lh lhVar2 = new lh(ghVar);
        fh a2 = a(thVar, hhVar, dhVar, lhVar2, kVar, gVar, i, i2, executor);
        this.N = true;
        i iVar2 = (i<TranscodeType>) this.I;
        fh a3 = iVar2.a(thVar, hhVar, lhVar2, kVar2, r, i3, i4, iVar2, executor);
        this.N = false;
        lhVar2.a(a2, a3);
        return lhVar2;
    }

    private <Y extends th<TranscodeType>> Y b(Y y, hh<TranscodeType> hhVar, dh<?> dhVar, Executor executor) {
        ji.a(y);
        if (!this.M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        fh a2 = a(y, hhVar, dhVar, executor);
        fh c = y.c();
        if (!a2.b(c) || a(dhVar, c)) {
            this.C.a((th<?>) y);
            y.a(a2);
            this.C.a(y, a2);
            return y;
        }
        a2.b();
        ji.a(c);
        if (!c.isRunning()) {
            c.a();
        }
        return y;
    }

    @Override // defpackage.dh
    public i<TranscodeType> a(dh<?> dhVar) {
        ji.a(dhVar);
        return (i) super.a(dhVar);
    }

    public i<TranscodeType> a(hh<TranscodeType> hhVar) {
        if (hhVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(hhVar);
        }
        return this;
    }

    public i<TranscodeType> a(Object obj) {
        b(obj);
        return this;
    }

    public i<TranscodeType> a(String str) {
        b(str);
        return this;
    }

    @Override // defpackage.dh
    public /* bridge */ /* synthetic */ dh a(dh dhVar) {
        return a((dh<?>) dhVar);
    }

    public <Y extends th<TranscodeType>> Y a(Y y) {
        a((i<TranscodeType>) y, (hh) null, ei.b());
        return y;
    }

    <Y extends th<TranscodeType>> Y a(Y y, hh<TranscodeType> hhVar, Executor executor) {
        b(y, hhVar, this, executor);
        return y;
    }

    public uh<ImageView, TranscodeType> a(ImageView imageView) {
        dh<?> dhVar;
        ki.a();
        ji.a(imageView);
        if (!E() && C() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    dhVar = mo1clone().H();
                    break;
                case 2:
                case 6:
                    dhVar = mo1clone().I();
                    break;
                case 3:
                case 4:
                case 5:
                    dhVar = mo1clone().J();
                    break;
            }
            uh<ImageView, TranscodeType> a2 = this.E.a(imageView, this.D);
            b(a2, null, dhVar, ei.b());
            return a2;
        }
        dhVar = this;
        uh<ImageView, TranscodeType> a22 = this.E.a(imageView, this.D);
        b(a22, null, dhVar, ei.b());
        return a22;
    }

    @Override // defpackage.dh
    /* renamed from: clone */
    public i<TranscodeType> mo1clone() {
        i<TranscodeType> iVar = (i) super.mo1clone();
        iVar.F = (k<?, ? super TranscodeType>) iVar.F.m2clone();
        return iVar;
    }
}
