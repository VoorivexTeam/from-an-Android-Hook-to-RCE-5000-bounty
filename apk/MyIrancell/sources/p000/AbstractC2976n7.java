package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0538d;
import com.airbnb.lottie.C0540f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C0507c7;
import p000.C3112q7;

/* renamed from: n7 */
/* loaded from: classes.dex */
public abstract class AbstractC2976n7 implements InterfaceC3190s4, AbstractC2538h5.b, InterfaceC2418e6 {

    /* renamed from: l */
    private final String f12250l;

    /* renamed from: n */
    final C0540f f12252n;

    /* renamed from: o */
    final C3112q7 f12253o;

    /* renamed from: p */
    private C2968n5 f12254p;

    /* renamed from: q */
    private AbstractC2976n7 f12255q;

    /* renamed from: r */
    private AbstractC2976n7 f12256r;

    /* renamed from: s */
    private List<AbstractC2976n7> f12257s;

    /* renamed from: u */
    final C3339v5 f12259u;

    /* renamed from: a */
    private final Path f12239a = new Path();

    /* renamed from: b */
    private final Matrix f12240b = new Matrix();

    /* renamed from: c */
    private final Paint f12241c = new C2967n4(1);

    /* renamed from: d */
    private final Paint f12242d = new C2967n4(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f12243e = new C2967n4(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f12244f = new C2967n4(1);

    /* renamed from: g */
    private final Paint f12245g = new C2967n4(PorterDuff.Mode.CLEAR);

    /* renamed from: h */
    private final RectF f12246h = new RectF();

    /* renamed from: i */
    private final RectF f12247i = new RectF();

    /* renamed from: j */
    private final RectF f12248j = new RectF();

    /* renamed from: k */
    private final RectF f12249k = new RectF();

    /* renamed from: m */
    final Matrix f12251m = new Matrix();

    /* renamed from: t */
    private final List<AbstractC2538h5<?, ?>> f12258t = new ArrayList();

    /* renamed from: v */
    private boolean f12260v = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n7$a */
    /* loaded from: classes.dex */
    public class a implements AbstractC2538h5.b {

        /* renamed from: a */
        final /* synthetic */ C2800j5 f12261a;

        a(C2800j5 c2800j5) {
            this.f12261a = c2800j5;
        }

        @Override // p000.AbstractC2538h5.b
        /* renamed from: b */
        public void mo3322b() {
            AbstractC2976n7.this.m14266a(this.f12261a.m13400i() == 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n7$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12263a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12264b;

        static {
            int[] iArr = new int[C0507c7.a.values().length];
            f12264b = iArr;
            try {
                iArr[C0507c7.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12264b[C0507c7.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12264b[C0507c7.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12264b[C0507c7.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C3112q7.a.values().length];
            f12263a = iArr2;
            try {
                iArr2[C3112q7.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12263a[C3112q7.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12263a[C3112q7.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12263a[C3112q7.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12263a[C3112q7.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12263a[C3112q7.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12263a[C3112q7.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2976n7(C0540f c0540f, C3112q7 c3112q7) {
        Paint paint;
        PorterDuffXfermode porterDuffXfermode;
        this.f12252n = c0540f;
        this.f12253o = c3112q7;
        this.f12250l = c3112q7.m14964g() + "#draw";
        if (c3112q7.m14963f() == C3112q7.b.INVERT) {
            paint = this.f12244f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            paint = this.f12244f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        paint.setXfermode(porterDuffXfermode);
        C3339v5 m15539a = c3112q7.m14978u().m15539a();
        this.f12259u = m15539a;
        m15539a.m15940a((AbstractC2538h5.b) this);
        if (c3112q7.m14962e() != null && !c3112q7.m14962e().isEmpty()) {
            C2968n5 c2968n5 = new C2968n5(c3112q7.m14962e());
            this.f12254p = c2968n5;
            Iterator<AbstractC2538h5<C2540h7, Path>> it = c2968n5.m14232a().iterator();
            while (it.hasNext()) {
                it.next().m12102a(this);
            }
            for (AbstractC2538h5<Integer, Integer> abstractC2538h5 : this.f12254p.m14234c()) {
                m14279a(abstractC2538h5);
                abstractC2538h5.m12102a(this);
            }
        }
        m14277j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC2976n7 m14260a(C3112q7 c3112q7, C0540f c0540f, C0538d c0538d) {
        switch (b.f12263a[c3112q7.m14961d().ordinal()]) {
            case 1:
                return new C3195s7(c0540f, c3112q7);
            case 2:
                return new C3017o7(c0540f, c3112q7, c0538d.m3733c(c3112q7.m14968k()), c0538d);
            case 3:
                return new C3241t7(c0540f, c3112q7);
            case 4:
                return new C3073p7(c0540f, c3112q7);
            case 5:
                return new C3156r7(c0540f, c3112q7);
            case 6:
                return new C3292u7(c0540f, c3112q7);
            default:
                C3116q9.m15002b("Unknown layer type " + c3112q7.m14961d());
                return null;
        }
    }

    /* renamed from: a */
    private void m14261a(Canvas canvas) {
        C0537c.m3721a("Layer#clearLayer");
        RectF rectF = this.f12246h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f12245g);
        C0537c.m3722b("Layer#clearLayer");
    }

    /* renamed from: a */
    private void m14262a(Canvas canvas, Matrix matrix) {
        C0537c.m3721a("Layer#saveLayer");
        C3295u9.m15760a(canvas, this.f12246h, this.f12242d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            canvas.drawColor(0);
        }
        C0537c.m3722b("Layer#saveLayer");
        for (int i = 0; i < this.f12254p.m14233b().size(); i++) {
            C0507c7 c0507c7 = this.f12254p.m14233b().get(i);
            AbstractC2538h5<C2540h7, Path> abstractC2538h5 = this.f12254p.m14232a().get(i);
            AbstractC2538h5<Integer, Integer> abstractC2538h52 = this.f12254p.m14234c().get(i);
            int i2 = b.f12264b[c0507c7.m3604a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f12241c.setColor(-16777216);
                        this.f12241c.setAlpha(255);
                        canvas.drawRect(this.f12246h, this.f12241c);
                    }
                    if (c0507c7.m3607d()) {
                        m14272e(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                    } else {
                        m14273f(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c0507c7.m3607d()) {
                            m14270c(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                        } else {
                            m14263a(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                        }
                    }
                } else if (c0507c7.m3607d()) {
                    m14271d(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                } else {
                    m14268b(canvas, matrix, c0507c7, abstractC2538h5, abstractC2538h52);
                }
            } else if (m14274g()) {
                this.f12241c.setAlpha(255);
                canvas.drawRect(this.f12246h, this.f12241c);
            }
        }
        C0537c.m3721a("Layer#restoreLayer");
        canvas.restore();
        C0537c.m3722b("Layer#restoreLayer");
    }

    /* renamed from: a */
    private void m14263a(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        this.f12241c.setAlpha((int) (abstractC2538h52.mo12108f().intValue() * 2.55f));
        canvas.drawPath(this.f12239a, this.f12241c);
    }

    /* renamed from: a */
    private void m14264a(RectF rectF, Matrix matrix) {
        this.f12247i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m14286e()) {
            int size = this.f12254p.m14233b().size();
            for (int i = 0; i < size; i++) {
                C0507c7 c0507c7 = this.f12254p.m14233b().get(i);
                this.f12239a.set(this.f12254p.m14232a().get(i).mo12108f());
                this.f12239a.transform(matrix);
                int i2 = b.f12264b[c0507c7.m3604a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && c0507c7.m3607d()) {
                    return;
                }
                this.f12239a.computeBounds(this.f12249k, false);
                RectF rectF2 = this.f12247i;
                if (i == 0) {
                    rectF2.set(this.f12249k);
                } else {
                    rectF2.set(Math.min(rectF2.left, this.f12249k.left), Math.min(this.f12247i.top, this.f12249k.top), Math.max(this.f12247i.right, this.f12249k.right), Math.max(this.f12247i.bottom, this.f12249k.bottom));
                }
            }
            if (rectF.intersect(this.f12247i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m14266a(boolean z) {
        if (z != this.f12260v) {
            this.f12260v = z;
            m14276i();
        }
    }

    /* renamed from: b */
    private void m14267b(float f) {
        this.f12252n.m3806e().m3741k().m3853a(this.f12253o.m14964g(), f);
    }

    /* renamed from: b */
    private void m14268b(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        C3295u9.m15759a(canvas, this.f12246h, this.f12242d);
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        this.f12241c.setAlpha((int) (abstractC2538h52.mo12108f().intValue() * 2.55f));
        canvas.drawPath(this.f12239a, this.f12241c);
        canvas.restore();
    }

    /* renamed from: b */
    private void m14269b(RectF rectF, Matrix matrix) {
        if (m14287f() && this.f12253o.m14963f() != C3112q7.b.INVERT) {
            this.f12248j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12255q.mo11276a(this.f12248j, matrix, true);
            if (rectF.intersect(this.f12248j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: c */
    private void m14270c(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        C3295u9.m15759a(canvas, this.f12246h, this.f12241c);
        canvas.drawRect(this.f12246h, this.f12241c);
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        this.f12241c.setAlpha((int) (abstractC2538h52.mo12108f().intValue() * 2.55f));
        canvas.drawPath(this.f12239a, this.f12243e);
        canvas.restore();
    }

    /* renamed from: d */
    private void m14271d(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        C3295u9.m15759a(canvas, this.f12246h, this.f12242d);
        canvas.drawRect(this.f12246h, this.f12241c);
        this.f12243e.setAlpha((int) (abstractC2538h52.mo12108f().intValue() * 2.55f));
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        canvas.drawPath(this.f12239a, this.f12243e);
        canvas.restore();
    }

    /* renamed from: e */
    private void m14272e(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        C3295u9.m15759a(canvas, this.f12246h, this.f12243e);
        canvas.drawRect(this.f12246h, this.f12241c);
        this.f12243e.setAlpha((int) (abstractC2538h52.mo12108f().intValue() * 2.55f));
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        canvas.drawPath(this.f12239a, this.f12243e);
        canvas.restore();
    }

    /* renamed from: f */
    private void m14273f(Canvas canvas, Matrix matrix, C0507c7 c0507c7, AbstractC2538h5<C2540h7, Path> abstractC2538h5, AbstractC2538h5<Integer, Integer> abstractC2538h52) {
        this.f12239a.set(abstractC2538h5.mo12108f());
        this.f12239a.transform(matrix);
        canvas.drawPath(this.f12239a, this.f12243e);
    }

    /* renamed from: g */
    private boolean m14274g() {
        if (this.f12254p.m14232a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f12254p.m14233b().size(); i++) {
            if (this.f12254p.m14233b().get(i).m3604a() != C0507c7.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private void m14275h() {
        if (this.f12257s != null) {
            return;
        }
        if (this.f12256r == null) {
            this.f12257s = Collections.emptyList();
            return;
        }
        this.f12257s = new ArrayList();
        for (AbstractC2976n7 abstractC2976n7 = this.f12256r; abstractC2976n7 != null; abstractC2976n7 = abstractC2976n7.f12256r) {
            this.f12257s.add(abstractC2976n7);
        }
    }

    /* renamed from: i */
    private void m14276i() {
        this.f12252n.invalidateSelf();
    }

    /* renamed from: j */
    private void m14277j() {
        if (this.f12253o.m14960c().isEmpty()) {
            m14266a(true);
            return;
        }
        C2800j5 c2800j5 = new C2800j5(this.f12253o.m14960c());
        c2800j5.m12110h();
        c2800j5.m12102a(new a(c2800j5));
        m14266a(c2800j5.mo12108f().floatValue() == 1.0f);
        m14279a(c2800j5);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f12253o.m14964g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14278a(float f) {
        this.f12259u.m15944b(f);
        if (this.f12254p != null) {
            for (int i = 0; i < this.f12254p.m14232a().size(); i++) {
                this.f12254p.m14232a().get(i).mo12101a(f);
            }
        }
        if (this.f12253o.m14977t() != 0.0f) {
            f /= this.f12253o.m14977t();
        }
        AbstractC2976n7 abstractC2976n7 = this.f12255q;
        if (abstractC2976n7 != null) {
            this.f12255q.mo14278a(abstractC2976n7.f12253o.m14977t() * f);
        }
        for (int i2 = 0; i2 < this.f12258t.size(); i2++) {
            this.f12258t.get(i2).mo12101a(f);
        }
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        C0537c.m3721a(this.f12250l);
        if (!this.f12260v || this.f12253o.m14979v()) {
            C0537c.m3722b(this.f12250l);
            return;
        }
        m14275h();
        C0537c.m3721a("Layer#parentMatrix");
        this.f12240b.reset();
        this.f12240b.set(matrix);
        for (int size = this.f12257s.size() - 1; size >= 0; size--) {
            this.f12240b.preConcat(this.f12257s.get(size).f12259u.m15943b());
        }
        C0537c.m3722b("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * (this.f12259u.m15945c() == null ? 100 : this.f12259u.m15945c().mo12108f().intValue())) / 100.0f) * 255.0f);
        if (!m14287f() && !m14286e()) {
            this.f12240b.preConcat(this.f12259u.m15943b());
            C0537c.m3721a("Layer#drawLayer");
            mo14281b(canvas, this.f12240b, intValue);
            C0537c.m3722b("Layer#drawLayer");
            m14267b(C0537c.m3722b(this.f12250l));
            return;
        }
        C0537c.m3721a("Layer#computeBounds");
        mo11276a(this.f12246h, this.f12240b, false);
        m14269b(this.f12246h, matrix);
        this.f12240b.preConcat(this.f12259u.m15943b());
        m14264a(this.f12246h, this.f12240b);
        if (!this.f12246h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.f12246h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C0537c.m3722b("Layer#computeBounds");
        if (!this.f12246h.isEmpty()) {
            C0537c.m3721a("Layer#saveLayer");
            this.f12241c.setAlpha(255);
            C3295u9.m15759a(canvas, this.f12246h, this.f12241c);
            C0537c.m3722b("Layer#saveLayer");
            m14261a(canvas);
            C0537c.m3721a("Layer#drawLayer");
            mo14281b(canvas, this.f12240b, intValue);
            C0537c.m3722b("Layer#drawLayer");
            if (m14286e()) {
                m14262a(canvas, this.f12240b);
            }
            if (m14287f()) {
                C0537c.m3721a("Layer#drawMatte");
                C0537c.m3721a("Layer#saveLayer");
                C3295u9.m15760a(canvas, this.f12246h, this.f12244f, 19);
                C0537c.m3722b("Layer#saveLayer");
                m14261a(canvas);
                this.f12255q.mo11275a(canvas, matrix, intValue);
                C0537c.m3721a("Layer#restoreLayer");
                canvas.restore();
                C0537c.m3722b("Layer#restoreLayer");
                C0537c.m3722b("Layer#drawMatte");
            }
            C0537c.m3721a("Layer#restoreLayer");
            canvas.restore();
            C0537c.m3722b("Layer#restoreLayer");
        }
        m14267b(C0537c.m3722b(this.f12250l));
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        this.f12246h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m14275h();
        this.f12251m.set(matrix);
        if (z) {
            List<AbstractC2976n7> list = this.f12257s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f12251m.preConcat(this.f12257s.get(size).f12259u.m15943b());
                }
            } else {
                AbstractC2976n7 abstractC2976n7 = this.f12256r;
                if (abstractC2976n7 != null) {
                    this.f12251m.preConcat(abstractC2976n7.f12259u.m15943b());
                }
            }
        }
        this.f12251m.preConcat(this.f12259u.m15943b());
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        if (c2375d6.m11286c(mo3318a(), i)) {
            if (!"__container".equals(mo3318a())) {
                c2375d62 = c2375d62.m11282a(mo3318a());
                if (c2375d6.m11284a(mo3318a(), i)) {
                    list.add(c2375d62.m11281a(this));
                }
            }
            if (c2375d6.m11287d(mo3318a(), i)) {
                mo14282b(c2375d6, i + c2375d6.m11285b(mo3318a(), i), list, c2375d62);
            }
        }
    }

    /* renamed from: a */
    public void m14279a(AbstractC2538h5<?, ?> abstractC2538h5) {
        if (abstractC2538h5 == null) {
            return;
        }
        this.f12258t.add(abstractC2538h5);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        this.f12259u.m15942a(t, c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14280a(AbstractC2976n7 abstractC2976n7) {
        this.f12255q = abstractC2976n7;
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        m14276i();
    }

    /* renamed from: b */
    abstract void mo14281b(Canvas canvas, Matrix matrix, int i);

    /* renamed from: b */
    void mo14282b(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
    }

    /* renamed from: b */
    public void m14283b(AbstractC2538h5<?, ?> abstractC2538h5) {
        this.f12258t.remove(abstractC2538h5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m14284b(AbstractC2976n7 abstractC2976n7) {
        this.f12256r = abstractC2976n7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C3112q7 m14285d() {
        return this.f12253o;
    }

    /* renamed from: e */
    boolean m14286e() {
        C2968n5 c2968n5 = this.f12254p;
        return (c2968n5 == null || c2968n5.m14232a().isEmpty()) ? false : true;
    }

    /* renamed from: f */
    boolean m14287f() {
        return this.f12255q != null;
    }
}
