package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C0538d;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.C0551q;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0007a6;

/* renamed from: u7 */
/* loaded from: classes.dex */
public class C3292u7 extends AbstractC2976n7 {

    /* renamed from: A */
    private final Paint f13419A;

    /* renamed from: B */
    private final Map<C0506c6, List<C3151r4>> f13420B;

    /* renamed from: C */
    private final C2452f0<String> f13421C;

    /* renamed from: D */
    private final C3288u5 f13422D;

    /* renamed from: E */
    private final C0540f f13423E;

    /* renamed from: F */
    private final C0538d f13424F;

    /* renamed from: G */
    private AbstractC2538h5<Integer, Integer> f13425G;

    /* renamed from: H */
    private AbstractC2538h5<Integer, Integer> f13426H;

    /* renamed from: I */
    private AbstractC2538h5<Float, Float> f13427I;

    /* renamed from: J */
    private AbstractC2538h5<Float, Float> f13428J;

    /* renamed from: K */
    private AbstractC2538h5<Float, Float> f13429K;

    /* renamed from: w */
    private final StringBuilder f13430w;

    /* renamed from: x */
    private final RectF f13431x;

    /* renamed from: y */
    private final Matrix f13432y;

    /* renamed from: z */
    private final Paint f13433z;

    /* renamed from: u7$a */
    /* loaded from: classes.dex */
    class a extends Paint {
        a(C3292u7 c3292u7, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: u7$b */
    /* loaded from: classes.dex */
    class b extends Paint {
        b(C3292u7 c3292u7, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u7$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13434a;

        static {
            int[] iArr = new int[C0007a6.a.values().length];
            f13434a = iArr;
            try {
                iArr[C0007a6.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13434a[C0007a6.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13434a[C0007a6.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3292u7(C0540f c0540f, C3112q7 c3112q7) {
        super(c0540f, c3112q7);
        C2801j6 c2801j6;
        C2801j6 c2801j62;
        C2580i6 c2580i6;
        C2580i6 c2580i62;
        this.f13430w = new StringBuilder(2);
        this.f13431x = new RectF();
        this.f13432y = new Matrix();
        this.f13433z = new a(this, 1);
        this.f13419A = new b(this, 1);
        this.f13420B = new HashMap();
        this.f13421C = new C2452f0<>();
        this.f13423E = c0540f;
        this.f13424F = c3112q7.m14957a();
        C3288u5 mo12378a = c3112q7.m14974q().mo12378a();
        this.f13422D = mo12378a;
        mo12378a.m12102a(this);
        m14279a(this.f13422D);
        C3192s6 m14975r = c3112q7.m14975r();
        if (m14975r != null && (c2580i62 = m14975r.f13028a) != null) {
            AbstractC2538h5<Integer, Integer> mo12378a2 = c2580i62.mo12378a();
            this.f13425G = mo12378a2;
            mo12378a2.m12102a(this);
            m14279a(this.f13425G);
        }
        if (m14975r != null && (c2580i6 = m14975r.f13029b) != null) {
            AbstractC2538h5<Integer, Integer> mo12378a3 = c2580i6.mo12378a();
            this.f13426H = mo12378a3;
            mo12378a3.m12102a(this);
            m14279a(this.f13426H);
        }
        if (m14975r != null && (c2801j62 = m14975r.f13030c) != null) {
            AbstractC2538h5<Float, Float> mo12378a4 = c2801j62.mo12378a();
            this.f13427I = mo12378a4;
            mo12378a4.m12102a(this);
            m14279a(this.f13427I);
        }
        if (m14975r == null || (c2801j6 = m14975r.f13031d) == null) {
            return;
        }
        AbstractC2538h5<Float, Float> mo12378a5 = c2801j6.mo12378a();
        this.f13428J = mo12378a5;
        mo12378a5.m12102a(this);
        m14279a(this.f13428J);
    }

    /* renamed from: a */
    private float m15737a(String str, C0451b6 c0451b6, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C0506c6 m13281b = this.f13424F.m3730b().m13281b(C0506c6.m3595a(str.charAt(i), c0451b6.m3326a(), c0451b6.m3328c()));
            if (m13281b != null) {
                double d = f3;
                double m3597b = m13281b.m3597b();
                double d2 = f;
                Double.isNaN(d2);
                double d3 = m3597b * d2;
                double m15753a = C3295u9.m15753a();
                Double.isNaN(m15753a);
                double d4 = d3 * m15753a;
                double d5 = f2;
                Double.isNaN(d5);
                Double.isNaN(d);
                f3 = (float) (d + (d4 * d5));
            }
        }
        return f3;
    }

    /* renamed from: a */
    private String m15738a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m15750a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f13421C.m11649a(j)) {
            return this.f13421C.m11655c(j);
        }
        this.f13430w.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f13430w.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f13430w.toString();
        this.f13421C.m11656c(j, sb);
        return sb;
    }

    /* renamed from: a */
    private List<C3151r4> m15739a(C0506c6 c0506c6) {
        if (this.f13420B.containsKey(c0506c6)) {
            return this.f13420B.get(c0506c6);
        }
        List<C2802j7> m3596a = c0506c6.m3596a();
        int size = m3596a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3151r4(this.f13423E, this, m3596a.get(i)));
        }
        this.f13420B.put(c0506c6, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m15740a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: a */
    private void m15741a(C0007a6.a aVar, Canvas canvas, float f) {
        float f2;
        int i = c.f13434a[aVar.ordinal()];
        if (i == 2) {
            f2 = -f;
        } else if (i != 3) {
            return;
        } else {
            f2 = (-f) / 2.0f;
        }
        canvas.translate(f2, 0.0f);
    }

    /* renamed from: a */
    private void m15742a(C0007a6 c0007a6, Matrix matrix, C0451b6 c0451b6, Canvas canvas) {
        AbstractC2538h5<Float, Float> abstractC2538h5 = this.f13429K;
        float floatValue = (abstractC2538h5 == null ? c0007a6.f36c : abstractC2538h5.mo12108f().floatValue()) / 100.0f;
        float m15755a = C3295u9.m15755a(matrix);
        String str = c0007a6.f34a;
        float m15753a = c0007a6.f39f * C3295u9.m15753a();
        List<String> m15740a = m15740a(str);
        int size = m15740a.size();
        for (int i = 0; i < size; i++) {
            String str2 = m15740a.get(i);
            float m15737a = m15737a(str2, c0451b6, floatValue, m15755a);
            canvas.save();
            m15741a(c0007a6.f37d, canvas, m15737a);
            canvas.translate(0.0f, (i * m15753a) - (((size - 1) * m15753a) / 2.0f));
            m15748a(str2, c0007a6, matrix, c0451b6, canvas, m15755a, floatValue);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m15743a(C0007a6 c0007a6, C0451b6 c0451b6, Matrix matrix, Canvas canvas) {
        float m15755a = C3295u9.m15755a(matrix);
        Typeface m3777a = this.f13423E.m3777a(c0451b6.m3326a(), c0451b6.m3328c());
        if (m3777a == null) {
            return;
        }
        String str = c0007a6.f34a;
        C0551q m3820p = this.f13423E.m3820p();
        if (m3820p != null) {
            m3820p.m3857a(str);
            throw null;
        }
        this.f13433z.setTypeface(m3777a);
        AbstractC2538h5<Float, Float> abstractC2538h5 = this.f13429K;
        this.f13433z.setTextSize((abstractC2538h5 == null ? c0007a6.f36c : abstractC2538h5.mo12108f().floatValue()) * C3295u9.m15753a());
        this.f13419A.setTypeface(this.f13433z.getTypeface());
        this.f13419A.setTextSize(this.f13433z.getTextSize());
        float m15753a = c0007a6.f39f * C3295u9.m15753a();
        List<String> m15740a = m15740a(str);
        int size = m15740a.size();
        for (int i = 0; i < size; i++) {
            String str2 = m15740a.get(i);
            m15741a(c0007a6.f37d, canvas, this.f13419A.measureText(str2));
            canvas.translate(0.0f, (i * m15753a) - (((size - 1) * m15753a) / 2.0f));
            m15747a(str2, c0007a6, canvas, m15755a);
            canvas.setMatrix(matrix);
        }
    }

    /* renamed from: a */
    private void m15744a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    private void m15745a(C0506c6 c0506c6, Matrix matrix, float f, C0007a6 c0007a6, Canvas canvas) {
        Paint paint;
        List<C3151r4> m15739a = m15739a(c0506c6);
        for (int i = 0; i < m15739a.size(); i++) {
            Path mo49c = m15739a.get(i).mo49c();
            mo49c.computeBounds(this.f13431x, false);
            this.f13432y.set(matrix);
            this.f13432y.preTranslate(0.0f, (-c0007a6.f40g) * C3295u9.m15753a());
            this.f13432y.preScale(f, f);
            mo49c.transform(this.f13432y);
            if (c0007a6.f44k) {
                m15744a(mo49c, this.f13433z, canvas);
                paint = this.f13419A;
            } else {
                m15744a(mo49c, this.f13419A, canvas);
                paint = this.f13433z;
            }
            m15744a(mo49c, paint, canvas);
        }
    }

    /* renamed from: a */
    private void m15746a(String str, C0007a6 c0007a6, Canvas canvas) {
        Paint paint;
        if (c0007a6.f44k) {
            m15749a(str, this.f13433z, canvas);
            paint = this.f13419A;
        } else {
            m15749a(str, this.f13419A, canvas);
            paint = this.f13433z;
        }
        m15749a(str, paint, canvas);
    }

    /* renamed from: a */
    private void m15747a(String str, C0007a6 c0007a6, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String m15738a = m15738a(str, i);
            i += m15738a.length();
            m15746a(m15738a, c0007a6, canvas);
            float measureText = this.f13433z.measureText(m15738a, 0, 1);
            float f2 = c0007a6.f38e / 10.0f;
            AbstractC2538h5<Float, Float> abstractC2538h5 = this.f13428J;
            if (abstractC2538h5 != null) {
                f2 += abstractC2538h5.mo12108f().floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    /* renamed from: a */
    private void m15748a(String str, C0007a6 c0007a6, Matrix matrix, C0451b6 c0451b6, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            C0506c6 m13281b = this.f13424F.m3730b().m13281b(C0506c6.m3595a(str.charAt(i), c0451b6.m3326a(), c0451b6.m3328c()));
            if (m13281b != null) {
                m15745a(m13281b, matrix, f2, c0007a6, canvas);
                float m3597b = ((float) m13281b.m3597b()) * f2 * C3295u9.m15753a() * f;
                float f3 = c0007a6.f38e / 10.0f;
                AbstractC2538h5<Float, Float> abstractC2538h5 = this.f13428J;
                if (abstractC2538h5 != null) {
                    f3 += abstractC2538h5.mo12108f().floatValue();
                }
                canvas.translate(m3597b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m15749a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: a */
    private boolean m15750a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        super.mo11276a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f13424F.m3723a().width(), this.f13424F.m3723a().height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2976n7, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5<?, ?> abstractC2538h5;
        AbstractC2538h5<?, ?> abstractC2538h52;
        super.mo3320a((C3292u7) t, (C3429x9<C3292u7>) c3429x9);
        if (t == InterfaceC0545k.f3155a) {
            abstractC2538h52 = this.f13425G;
            if (abstractC2538h52 == null) {
                if (c3429x9 == 0) {
                    if (abstractC2538h52 != null) {
                        m14283b(abstractC2538h52);
                    }
                    this.f13425G = null;
                    return;
                } else {
                    C3385w5 c3385w5 = new C3385w5(c3429x9);
                    this.f13425G = c3385w5;
                    c3385w5.m12102a(this);
                    abstractC2538h5 = this.f13425G;
                    m14279a(abstractC2538h5);
                }
            }
            abstractC2538h52.m12103a((C3429x9<?>) c3429x9);
            return;
        }
        if (t == InterfaceC0545k.f3156b) {
            abstractC2538h52 = this.f13426H;
            if (abstractC2538h52 == null) {
                if (c3429x9 == 0) {
                    if (abstractC2538h52 != null) {
                        m14283b(abstractC2538h52);
                    }
                    this.f13426H = null;
                    return;
                } else {
                    C3385w5 c3385w52 = new C3385w5(c3429x9);
                    this.f13426H = c3385w52;
                    c3385w52.m12102a(this);
                    abstractC2538h5 = this.f13426H;
                    m14279a(abstractC2538h5);
                }
            }
            abstractC2538h52.m12103a((C3429x9<?>) c3429x9);
            return;
        }
        if (t == InterfaceC0545k.f3169o) {
            abstractC2538h52 = this.f13427I;
            if (abstractC2538h52 == null) {
                if (c3429x9 == 0) {
                    if (abstractC2538h52 != null) {
                        m14283b(abstractC2538h52);
                    }
                    this.f13427I = null;
                    return;
                } else {
                    C3385w5 c3385w53 = new C3385w5(c3429x9);
                    this.f13427I = c3385w53;
                    c3385w53.m12102a(this);
                    abstractC2538h5 = this.f13427I;
                    m14279a(abstractC2538h5);
                }
            }
            abstractC2538h52.m12103a((C3429x9<?>) c3429x9);
            return;
        }
        if (t == InterfaceC0545k.f3170p) {
            abstractC2538h52 = this.f13428J;
            if (abstractC2538h52 == null) {
                if (c3429x9 == 0) {
                    if (abstractC2538h52 != null) {
                        m14283b(abstractC2538h52);
                    }
                    this.f13428J = null;
                    return;
                } else {
                    C3385w5 c3385w54 = new C3385w5(c3429x9);
                    this.f13428J = c3385w54;
                    c3385w54.m12102a(this);
                    abstractC2538h5 = this.f13428J;
                }
            }
            abstractC2538h52.m12103a((C3429x9<?>) c3429x9);
            return;
        }
        if (t != InterfaceC0545k.f3152B) {
            return;
        }
        if (c3429x9 == 0) {
            AbstractC2538h5<Float, Float> abstractC2538h53 = this.f13429K;
            if (abstractC2538h53 != null) {
                m14283b(abstractC2538h53);
            }
            this.f13429K = null;
            return;
        }
        C3385w5 c3385w55 = new C3385w5(c3429x9);
        this.f13429K = c3385w55;
        c3385w55.m12102a(this);
        abstractC2538h5 = this.f13429K;
        m14279a(abstractC2538h5);
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    void mo14281b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f13423E.m3826v()) {
            canvas.setMatrix(matrix);
        }
        C0007a6 mo12108f = this.f13422D.mo12108f();
        C0451b6 c0451b6 = this.f13424F.m3736f().get(mo12108f.f35b);
        if (c0451b6 == null) {
            canvas.restore();
            return;
        }
        AbstractC2538h5<Integer, Integer> abstractC2538h5 = this.f13425G;
        if (abstractC2538h5 != null) {
            this.f13433z.setColor(abstractC2538h5.mo12108f().intValue());
        } else {
            this.f13433z.setColor(mo12108f.f41h);
        }
        AbstractC2538h5<Integer, Integer> abstractC2538h52 = this.f13426H;
        if (abstractC2538h52 != null) {
            this.f13419A.setColor(abstractC2538h52.mo12108f().intValue());
        } else {
            this.f13419A.setColor(mo12108f.f42i);
        }
        int intValue = ((this.f12259u.m15945c() == null ? 100 : this.f12259u.m15945c().mo12108f().intValue()) * 255) / 100;
        this.f13433z.setAlpha(intValue);
        this.f13419A.setAlpha(intValue);
        AbstractC2538h5<Float, Float> abstractC2538h53 = this.f13427I;
        if (abstractC2538h53 != null) {
            this.f13419A.setStrokeWidth(abstractC2538h53.mo12108f().floatValue());
        } else {
            this.f13419A.setStrokeWidth(mo12108f.f43j * C3295u9.m15753a() * C3295u9.m15755a(matrix));
        }
        if (this.f13423E.m3826v()) {
            m15742a(mo12108f, matrix, c0451b6, canvas);
        } else {
            m15743a(mo12108f, c0451b6, matrix, canvas);
        }
        canvas.restore();
    }
}
