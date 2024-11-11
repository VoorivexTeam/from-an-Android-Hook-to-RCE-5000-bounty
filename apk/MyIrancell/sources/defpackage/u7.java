package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.q;
import defpackage.a6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class u7 extends n7 {
    private final Paint A;
    private final Map<c6, List<r4>> B;
    private final f0<String> C;
    private final u5 D;
    private final f E;
    private final d F;
    private h5<Integer, Integer> G;
    private h5<Integer, Integer> H;
    private h5<Float, Float> I;
    private h5<Float, Float> J;
    private h5<Float, Float> K;
    private final StringBuilder w;
    private final RectF x;
    private final Matrix y;
    private final Paint z;

    /* loaded from: classes.dex */
    class a extends Paint {
        a(u7 u7Var, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    class b extends Paint {
        b(u7 u7Var, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a6.a.values().length];
            a = iArr;
            try {
                iArr[a6.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a6.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a6.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(f fVar, q7 q7Var) {
        super(fVar, q7Var);
        j6 j6Var;
        j6 j6Var2;
        i6 i6Var;
        i6 i6Var2;
        this.w = new StringBuilder(2);
        this.x = new RectF();
        this.y = new Matrix();
        this.z = new a(this, 1);
        this.A = new b(this, 1);
        this.B = new HashMap();
        this.C = new f0<>();
        this.E = fVar;
        this.F = q7Var.a();
        u5 a2 = q7Var.q().a();
        this.D = a2;
        a2.a(this);
        a(this.D);
        s6 r = q7Var.r();
        if (r != null && (i6Var2 = r.a) != null) {
            h5<Integer, Integer> a3 = i6Var2.a();
            this.G = a3;
            a3.a(this);
            a(this.G);
        }
        if (r != null && (i6Var = r.b) != null) {
            h5<Integer, Integer> a4 = i6Var.a();
            this.H = a4;
            a4.a(this);
            a(this.H);
        }
        if (r != null && (j6Var2 = r.c) != null) {
            h5<Float, Float> a5 = j6Var2.a();
            this.I = a5;
            a5.a(this);
            a(this.I);
        }
        if (r == null || (j6Var = r.d) == null) {
            return;
        }
        h5<Float, Float> a6 = j6Var.a();
        this.J = a6;
        a6.a(this);
        a(this.J);
    }

    private float a(String str, b6 b6Var, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            c6 b2 = this.F.b().b(c6.a(str.charAt(i), b6Var.a(), b6Var.c()));
            if (b2 != null) {
                double d = f3;
                double b3 = b2.b();
                double d2 = f;
                Double.isNaN(d2);
                double d3 = b3 * d2;
                double a2 = u9.a();
                Double.isNaN(a2);
                double d4 = d3 * a2;
                double d5 = f2;
                Double.isNaN(d5);
                Double.isNaN(d);
                f3 = (float) (d + (d4 * d5));
            }
        }
        return f3;
    }

    private String a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.C.a(j)) {
            return this.C.c(j);
        }
        this.w.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.w.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.w.toString();
        this.C.c(j, sb);
        return sb;
    }

    private List<r4> a(c6 c6Var) {
        if (this.B.containsKey(c6Var)) {
            return this.B.get(c6Var);
        }
        List<j7> a2 = c6Var.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new r4(this.E, this, a2.get(i)));
        }
        this.B.put(c6Var, arrayList);
        return arrayList;
    }

    private List<String> a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void a(a6.a aVar, Canvas canvas, float f) {
        float f2;
        int i = c.a[aVar.ordinal()];
        if (i == 2) {
            f2 = -f;
        } else if (i != 3) {
            return;
        } else {
            f2 = (-f) / 2.0f;
        }
        canvas.translate(f2, 0.0f);
    }

    private void a(a6 a6Var, Matrix matrix, b6 b6Var, Canvas canvas) {
        h5<Float, Float> h5Var = this.K;
        float floatValue = (h5Var == null ? a6Var.c : h5Var.f().floatValue()) / 100.0f;
        float a2 = u9.a(matrix);
        String str = a6Var.a;
        float a3 = a6Var.f * u9.a();
        List<String> a4 = a(str);
        int size = a4.size();
        for (int i = 0; i < size; i++) {
            String str2 = a4.get(i);
            float a5 = a(str2, b6Var, floatValue, a2);
            canvas.save();
            a(a6Var.d, canvas, a5);
            canvas.translate(0.0f, (i * a3) - (((size - 1) * a3) / 2.0f));
            a(str2, a6Var, matrix, b6Var, canvas, a2, floatValue);
            canvas.restore();
        }
    }

    private void a(a6 a6Var, b6 b6Var, Matrix matrix, Canvas canvas) {
        float a2 = u9.a(matrix);
        Typeface a3 = this.E.a(b6Var.a(), b6Var.c());
        if (a3 == null) {
            return;
        }
        String str = a6Var.a;
        q p = this.E.p();
        if (p != null) {
            p.a(str);
            throw null;
        }
        this.z.setTypeface(a3);
        h5<Float, Float> h5Var = this.K;
        this.z.setTextSize((h5Var == null ? a6Var.c : h5Var.f().floatValue()) * u9.a());
        this.A.setTypeface(this.z.getTypeface());
        this.A.setTextSize(this.z.getTextSize());
        float a4 = a6Var.f * u9.a();
        List<String> a5 = a(str);
        int size = a5.size();
        for (int i = 0; i < size; i++) {
            String str2 = a5.get(i);
            a(a6Var.d, canvas, this.A.measureText(str2));
            canvas.translate(0.0f, (i * a4) - (((size - 1) * a4) / 2.0f));
            a(str2, a6Var, canvas, a2);
            canvas.setMatrix(matrix);
        }
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(c6 c6Var, Matrix matrix, float f, a6 a6Var, Canvas canvas) {
        Paint paint;
        List<r4> a2 = a(c6Var);
        for (int i = 0; i < a2.size(); i++) {
            Path c2 = a2.get(i).c();
            c2.computeBounds(this.x, false);
            this.y.set(matrix);
            this.y.preTranslate(0.0f, (-a6Var.g) * u9.a());
            this.y.preScale(f, f);
            c2.transform(this.y);
            if (a6Var.k) {
                a(c2, this.z, canvas);
                paint = this.A;
            } else {
                a(c2, this.A, canvas);
                paint = this.z;
            }
            a(c2, paint, canvas);
        }
    }

    private void a(String str, a6 a6Var, Canvas canvas) {
        Paint paint;
        if (a6Var.k) {
            a(str, this.z, canvas);
            paint = this.A;
        } else {
            a(str, this.A, canvas);
            paint = this.z;
        }
        a(str, paint, canvas);
    }

    private void a(String str, a6 a6Var, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String a2 = a(str, i);
            i += a2.length();
            a(a2, a6Var, canvas);
            float measureText = this.z.measureText(a2, 0, 1);
            float f2 = a6Var.e / 10.0f;
            h5<Float, Float> h5Var = this.J;
            if (h5Var != null) {
                f2 += h5Var.f().floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    private void a(String str, a6 a6Var, Matrix matrix, b6 b6Var, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            c6 b2 = this.F.b().b(c6.a(str.charAt(i), b6Var.a(), b6Var.c()));
            if (b2 != null) {
                a(b2, matrix, f2, a6Var, canvas);
                float b3 = ((float) b2.b()) * f2 * u9.a() * f;
                float f3 = a6Var.e / 10.0f;
                h5<Float, Float> h5Var = this.J;
                if (h5Var != null) {
                    f3 += h5Var.f().floatValue();
                }
                canvas.translate(b3 + (f3 * f), 0.0f);
            }
        }
    }

    private void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private boolean a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // defpackage.n7, defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.F.a().width(), this.F.a().height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n7, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5<?, ?> h5Var;
        h5<?, ?> h5Var2;
        super.a((u7) t, (x9<u7>) x9Var);
        if (t == k.a) {
            h5Var2 = this.G;
            if (h5Var2 == null) {
                if (x9Var == 0) {
                    if (h5Var2 != null) {
                        b(h5Var2);
                    }
                    this.G = null;
                    return;
                } else {
                    w5 w5Var = new w5(x9Var);
                    this.G = w5Var;
                    w5Var.a(this);
                    h5Var = this.G;
                    a(h5Var);
                }
            }
            h5Var2.a((x9<?>) x9Var);
            return;
        }
        if (t == k.b) {
            h5Var2 = this.H;
            if (h5Var2 == null) {
                if (x9Var == 0) {
                    if (h5Var2 != null) {
                        b(h5Var2);
                    }
                    this.H = null;
                    return;
                } else {
                    w5 w5Var2 = new w5(x9Var);
                    this.H = w5Var2;
                    w5Var2.a(this);
                    h5Var = this.H;
                    a(h5Var);
                }
            }
            h5Var2.a((x9<?>) x9Var);
            return;
        }
        if (t == k.o) {
            h5Var2 = this.I;
            if (h5Var2 == null) {
                if (x9Var == 0) {
                    if (h5Var2 != null) {
                        b(h5Var2);
                    }
                    this.I = null;
                    return;
                } else {
                    w5 w5Var3 = new w5(x9Var);
                    this.I = w5Var3;
                    w5Var3.a(this);
                    h5Var = this.I;
                    a(h5Var);
                }
            }
            h5Var2.a((x9<?>) x9Var);
            return;
        }
        if (t == k.p) {
            h5Var2 = this.J;
            if (h5Var2 == null) {
                if (x9Var == 0) {
                    if (h5Var2 != null) {
                        b(h5Var2);
                    }
                    this.J = null;
                    return;
                } else {
                    w5 w5Var4 = new w5(x9Var);
                    this.J = w5Var4;
                    w5Var4.a(this);
                    h5Var = this.J;
                }
            }
            h5Var2.a((x9<?>) x9Var);
            return;
        }
        if (t != k.B) {
            return;
        }
        if (x9Var == 0) {
            h5<Float, Float> h5Var3 = this.K;
            if (h5Var3 != null) {
                b(h5Var3);
            }
            this.K = null;
            return;
        }
        w5 w5Var5 = new w5(x9Var);
        this.K = w5Var5;
        w5Var5.a(this);
        h5Var = this.K;
        a(h5Var);
    }

    @Override // defpackage.n7
    void b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.E.v()) {
            canvas.setMatrix(matrix);
        }
        a6 f = this.D.f();
        b6 b6Var = this.F.f().get(f.b);
        if (b6Var == null) {
            canvas.restore();
            return;
        }
        h5<Integer, Integer> h5Var = this.G;
        if (h5Var != null) {
            this.z.setColor(h5Var.f().intValue());
        } else {
            this.z.setColor(f.h);
        }
        h5<Integer, Integer> h5Var2 = this.H;
        if (h5Var2 != null) {
            this.A.setColor(h5Var2.f().intValue());
        } else {
            this.A.setColor(f.i);
        }
        int intValue = ((this.u.c() == null ? 100 : this.u.c().f().intValue()) * 255) / 100;
        this.z.setAlpha(intValue);
        this.A.setAlpha(intValue);
        h5<Float, Float> h5Var3 = this.I;
        if (h5Var3 != null) {
            this.A.setStrokeWidth(h5Var3.f().floatValue());
        } else {
            this.A.setStrokeWidth(f.j * u9.a() * u9.a(matrix));
        }
        if (this.E.v()) {
            a(f, matrix, b6Var, canvas);
        } else {
            a(f, b6Var, matrix, canvas);
        }
        canvas.restore();
    }
}
