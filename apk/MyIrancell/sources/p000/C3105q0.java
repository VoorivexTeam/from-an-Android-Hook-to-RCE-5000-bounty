package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: q0 */
/* loaded from: classes.dex */
public class C3105q0 {
    /* renamed from: a */
    public static float m14859a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m14865a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m14860a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14865a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m14861a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m14862a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m14865a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static C2880l0 m14863a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m14865a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C2880l0.m13769b(typedValue.data);
            }
            C2880l0 m13770b = C2880l0.m13770b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m13770b != null) {
                return m13770b;
            }
        }
        return C2880l0.m13769b(i2);
    }

    /* renamed from: a */
    public static boolean m14864a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m14865a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m14865a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m14866b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14865a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m14867b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m14865a(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    /* renamed from: c */
    public static int m14868c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14865a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
