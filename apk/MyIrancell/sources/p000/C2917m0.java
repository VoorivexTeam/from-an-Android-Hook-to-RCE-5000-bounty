package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m0 */
/* loaded from: classes.dex */
public class C2917m0 {

    /* renamed from: m0$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: m0$b */
    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final c[] f11973a;

        public b(c[] cVarArr) {
            this.f11973a = cVarArr;
        }

        /* renamed from: a */
        public c[] m13967a() {
            return this.f11973a;
        }
    }

    /* renamed from: m0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final String f11974a;

        /* renamed from: b */
        private int f11975b;

        /* renamed from: c */
        private boolean f11976c;

        /* renamed from: d */
        private String f11977d;

        /* renamed from: e */
        private int f11978e;

        /* renamed from: f */
        private int f11979f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f11974a = str;
            this.f11975b = i;
            this.f11976c = z;
            this.f11977d = str2;
            this.f11978e = i2;
            this.f11979f = i3;
        }

        /* renamed from: a */
        public String m13968a() {
            return this.f11974a;
        }

        /* renamed from: b */
        public int m13969b() {
            return this.f11979f;
        }

        /* renamed from: c */
        public int m13970c() {
            return this.f11978e;
        }

        /* renamed from: d */
        public String m13971d() {
            return this.f11977d;
        }

        /* renamed from: e */
        public int m13972e() {
            return this.f11975b;
        }

        /* renamed from: f */
        public boolean m13973f() {
            return this.f11976c;
        }
    }

    /* renamed from: m0$d */
    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final C2574i1 f11980a;

        /* renamed from: b */
        private final int f11981b;

        /* renamed from: c */
        private final int f11982c;

        public d(C2574i1 c2574i1, int i, int i2) {
            this.f11980a = c2574i1;
            this.f11982c = i;
            this.f11981b = i2;
        }

        /* renamed from: a */
        public int m13974a() {
            return this.f11982c;
        }

        /* renamed from: b */
        public C2574i1 m13975b() {
            return this.f11980a;
        }

        /* renamed from: c */
        public int m13976c() {
            return this.f11981b;
        }
    }

    /* renamed from: a */
    private static int m13959a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m13960a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m13959a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m13961a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m13961a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m13961a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static a m13962a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m13964b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    private static void m13963a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static a m13964b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m13965c(xmlPullParser, resources);
        }
        m13963a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static a m13965c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamily);
        String string = obtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m13963a(xmlPullParser);
            }
            return new d(new C2574i1(string, string2, string3, m13960a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m13966d(xmlPullParser, resources));
                } else {
                    m13963a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: d */
    private static c m13966d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(R$styleable.FontFamilyFont_fontWeight) ? R$styleable.FontFamilyFont_fontWeight : R$styleable.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(R$styleable.FontFamilyFont_fontStyle) ? R$styleable.FontFamilyFont_fontStyle : R$styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(R$styleable.FontFamilyFont_ttcIndex) ? R$styleable.FontFamilyFont_ttcIndex : R$styleable.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(R$styleable.FontFamilyFont_fontVariationSettings) ? R$styleable.FontFamilyFont_fontVariationSettings : R$styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(R$styleable.FontFamilyFont_font) ? R$styleable.FontFamilyFont_font : R$styleable.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m13963a(xmlPullParser);
        }
        return new c(string2, i, z, string, i3, resourceId);
    }
}
