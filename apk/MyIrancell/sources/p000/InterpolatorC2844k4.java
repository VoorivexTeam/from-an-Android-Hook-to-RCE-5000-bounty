package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: k4 */
/* loaded from: classes.dex */
public class InterpolatorC2844k4 implements Interpolator {

    /* renamed from: a */
    private float[] f11646a;

    /* renamed from: b */
    private float[] f11647b;

    public InterpolatorC2844k4(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public InterpolatorC2844k4(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9923l);
        m13606a(m14861a, xmlPullParser);
        m14861a.recycle();
    }

    /* renamed from: a */
    private void m13604a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m13607a(path);
    }

    /* renamed from: a */
    private void m13605a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m13607a(path);
    }

    /* renamed from: a */
    private void m13606a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C3105q0.m14865a(xmlPullParser, "pathData")) {
            String m14862a = C3105q0.m14862a(typedArray, xmlPullParser, "pathData", 4);
            Path m15310b = C3186s0.m15310b(m14862a);
            if (m15310b != null) {
                m13607a(m15310b);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m14862a);
        }
        if (!C3105q0.m14865a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C3105q0.m14865a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float m14859a = C3105q0.m14859a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float m14859a2 = C3105q0.m14859a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean m14865a = C3105q0.m14865a(xmlPullParser, "controlX2");
        if (m14865a != C3105q0.m14865a(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (m14865a) {
            m13605a(m14859a, m14859a2, C3105q0.m14859a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C3105q0.m14859a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m13604a(m14859a, m14859a2);
        }
    }

    /* renamed from: a */
    private void m13607a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f11646a = new float[min];
        this.f11647b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f11646a[i2] = fArr[0];
            this.f11647b[i2] = fArr[1];
        }
        if (Math.abs(this.f11646a[0]) <= 1.0E-5d && Math.abs(this.f11647b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f11646a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f11647b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f11646a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f11646a[0]);
        sb.append(",");
        sb.append(this.f11647b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f11646a[i6]);
        sb.append(",");
        sb.append(this.f11647b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f11646a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f11646a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f11646a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f11647b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f11647b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }
}
