package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C3186s0;

/* renamed from: i4 */
/* loaded from: classes.dex */
public class C2577i4 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C3186s0.b[]> {

        /* renamed from: a */
        private C3186s0.b[] f10565a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3186s0.b[] evaluate(float f, C3186s0.b[] bVarArr, C3186s0.b[] bVarArr2) {
            if (!C3186s0.m15306a(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            C3186s0.b[] bVarArr3 = this.f10565a;
            if (bVarArr3 == null || !C3186s0.m15306a(bVarArr3, bVarArr)) {
                this.f10565a = C3186s0.m15309a(bVarArr);
            }
            for (int i = 0; i < bVarArr.length; i++) {
                this.f10565a[i].m15317a(bVarArr[i], bVarArr2[i], f);
            }
            return this.f10565a;
        }
    }

    /* renamed from: a */
    private static int m12345a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9921j);
        int i = 0;
        TypedValue m14867b = C3105q0.m14867b(m14861a, xmlPullParser, "value", 0);
        if ((m14867b != null) && m12362a(m14867b.type)) {
            i = 3;
        }
        m14861a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m12346a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m12362a(i3)) || (z2 && m12362a(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: a */
    public static Animator m12347a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m12348a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m12348a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m12349a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m12349a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m12350a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: a */
    private static Animator m12350a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m12351a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m12351a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2577i4.m12351a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m12352a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m12353a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9921j);
        float m14859a = C3105q0.m14859a(m14861a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m14867b = C3105q0.m14867b(m14861a, xmlPullParser, "value", 0);
        boolean z = m14867b != null;
        if (i == 4) {
            i = (z && m12362a(m14867b.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(m14859a, C3105q0.m14866b(m14861a, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m14859a, C3105q0.m14859a(m14861a, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(m14859a) : Keyframe.ofInt(m14859a);
        int m14868c = C3105q0.m14868c(m14861a, xmlPullParser, "interpolator", 1, 0);
        if (m14868c > 0) {
            ofInt.setInterpolator(C2537h4.m12092a(context, m14868c));
        }
        m14861a.recycle();
        return ofInt;
    }

    /* renamed from: a */
    private static ObjectAnimator m12354a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m12357a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m12355a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m12345a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m12353a = m12353a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m12353a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m12353a);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m12352a(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m12352a(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m12361a(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C2799j4.m13398a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m12356a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m12362a(i4)) || (z2 && m12362a(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C2799j4 m13398a = i == 3 ? C2799j4.m13398a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m12362a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m12362a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m12362a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || m13398a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m13398a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C3186s0.b[] m15308a = C3186s0.m15308a(string);
        C3186s0.b[] m15308a2 = C3186s0.m15308a(string2);
        if (m15308a == null && m15308a2 == null) {
            return null;
        }
        if (m15308a == null) {
            if (m15308a2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m15308a2);
            }
            return null;
        }
        a aVar = new a();
        if (m15308a2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m15308a);
        } else {
            if (!C3186s0.m15306a(m15308a, m15308a2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m15308a, m15308a2);
        }
        return ofObject;
    }

    /* renamed from: a */
    private static ValueAnimator m12357a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9918g);
        TypedArray m14861a2 = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9922k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m12359a(valueAnimator, m14861a, m14861a2, f, xmlPullParser);
        int m14868c = C3105q0.m14868c(m14861a, xmlPullParser, "interpolator", 0, 0);
        if (m14868c > 0) {
            valueAnimator.setInterpolator(C2537h4.m12092a(context, m14868c));
        }
        m14861a.recycle();
        if (m14861a2 != null) {
            m14861a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m12358a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m14862a = C3105q0.m14862a(typedArray, xmlPullParser, "pathData", 1);
        if (m14862a == null) {
            objectAnimator.setPropertyName(C3105q0.m14862a(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m14862a2 = C3105q0.m14862a(typedArray, xmlPullParser, "propertyXName", 2);
        String m14862a3 = C3105q0.m14862a(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (m14862a2 != null || m14862a3 != null) {
            m12360a(C3186s0.m15310b(m14862a), objectAnimator, f * 0.5f, m14862a2, m14862a3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: a */
    private static void m12359a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m14866b = C3105q0.m14866b(typedArray, xmlPullParser, "duration", 1, 300);
        long m14866b2 = C3105q0.m14866b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m14866b3 = C3105q0.m14866b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C3105q0.m14865a(xmlPullParser, "valueFrom") && C3105q0.m14865a(xmlPullParser, "valueTo")) {
            if (m14866b3 == 4) {
                m14866b3 = m12346a(typedArray, 5, 6);
            }
            PropertyValuesHolder m12356a = m12356a(typedArray, m14866b3, 5, 6, "");
            if (m12356a != null) {
                valueAnimator.setValues(m12356a);
            }
        }
        valueAnimator.setDuration(m14866b);
        valueAnimator.setStartDelay(m14866b2);
        valueAnimator.setRepeatCount(C3105q0.m14866b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C3105q0.m14866b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m12358a(valueAnimator, typedArray2, m14866b3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m12360a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    /* renamed from: a */
    private static void m12361a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m12362a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m12363a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9920i);
                String m14862a = C3105q0.m14862a(m14861a, xmlPullParser, "propertyName", 3);
                int m14866b = C3105q0.m14866b(m14861a, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m12355a = m12355a(context, resources, theme, xmlPullParser, m14862a, m14866b);
                if (m12355a == null) {
                    m12355a = m12356a(m14861a, m14866b, 0, 1, m14862a);
                }
                if (m12355a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m12355a);
                }
                m14861a.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }
}
