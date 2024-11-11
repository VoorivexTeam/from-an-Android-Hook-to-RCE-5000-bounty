package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class l0 {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private l0(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    static l0 a(ColorStateList colorStateList) {
        return new l0(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static l0 a(Resources resources, int i, Resources.Theme theme) {
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
            return a(k0.a(resources, xml, asAttributeSet, theme));
        }
        if (c == 1) {
            return a(n0.a(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static l0 a(Shader shader) {
        return new l0(shader, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 b(int i) {
        return new l0(null, null, i);
    }

    public static l0 b(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public boolean a(int[] iArr) {
        if (d()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public Shader b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean e() {
        return c() || this.c != 0;
    }
}
