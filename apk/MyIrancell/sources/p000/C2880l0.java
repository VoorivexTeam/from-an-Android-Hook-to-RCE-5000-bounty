package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: l0 */
/* loaded from: classes.dex */
public final class C2880l0 {

    /* renamed from: a */
    private final Shader f11784a;

    /* renamed from: b */
    private final ColorStateList f11785b;

    /* renamed from: c */
    private int f11786c;

    private C2880l0(Shader shader, ColorStateList colorStateList, int i) {
        this.f11784a = shader;
        this.f11785b = colorStateList;
        this.f11786c = i;
    }

    /* renamed from: a */
    static C2880l0 m13766a(ColorStateList colorStateList) {
        return new C2880l0(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    private static C2880l0 m13767a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        char c = 65535;
        int hashCode = name.hashCode();
        if (hashCode != 89650992) {
            if (hashCode == 1191572447 && name.equals("selector")) {
                c = 0;
            }
        } else if (name.equals("gradient")) {
            c = 1;
        }
        if (c == 0) {
            return m13766a(C2835k0.m13527a(resources, xml, asAttributeSet, theme));
        }
        if (c == 1) {
            return m13768a(C2963n0.m14218a(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: a */
    static C2880l0 m13768a(Shader shader) {
        return new C2880l0(shader, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2880l0 m13769b(int i) {
        return new C2880l0(null, null, i);
    }

    /* renamed from: b */
    public static C2880l0 m13770b(Resources resources, int i, Resources.Theme theme) {
        try {
            return m13767a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public int m13771a() {
        return this.f11786c;
    }

    /* renamed from: a */
    public void m13772a(int i) {
        this.f11786c = i;
    }

    /* renamed from: a */
    public boolean m13773a(int[] iArr) {
        if (m13776d()) {
            ColorStateList colorStateList = this.f11785b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f11786c) {
                this.f11786c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader m13774b() {
        return this.f11784a;
    }

    /* renamed from: c */
    public boolean m13775c() {
        return this.f11784a != null;
    }

    /* renamed from: d */
    public boolean m13776d() {
        ColorStateList colorStateList;
        return this.f11784a == null && (colorStateList = this.f11785b) != null && colorStateList.isStateful();
    }

    /* renamed from: e */
    public boolean m13777e() {
        return m13775c() || this.f11786c != 0;
    }
}
