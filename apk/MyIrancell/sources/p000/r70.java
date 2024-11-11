package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class r70 {

    /* renamed from: j */
    private static final Pattern f12914j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f12915k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f12916l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f12917m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f12918a;

    /* renamed from: b */
    private final String f12919b;

    /* renamed from: c */
    private final long f12920c;

    /* renamed from: d */
    private final String f12921d;

    /* renamed from: e */
    private final String f12922e;

    /* renamed from: f */
    private final boolean f12923f;

    /* renamed from: g */
    private final boolean f12924g;

    /* renamed from: h */
    private final boolean f12925h;

    /* renamed from: i */
    private final boolean f12926i;

    private r70(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12918a = str;
        this.f12919b = str2;
        this.f12920c = j;
        this.f12921d = str3;
        this.f12922e = str4;
        this.f12923f = z;
        this.f12924g = z2;
        this.f12926i = z3;
        this.f12925h = z4;
    }

    /* renamed from: a */
    private static int m15212a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m15213a(String str, int i, int i2) {
        int m15212a = m15212a(str, i, i2, false);
        Matcher matcher = f12917m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m15212a < i2) {
            int m15212a2 = m15212a(str, m15212a + 1, i2, true);
            matcher.region(m15212a, m15212a2);
            if (i4 == -1 && matcher.usePattern(f12917m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f12916l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f12915k).matches()) {
                i6 = f12915k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(f12914j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            m15212a = m15212a(str, m15212a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(o80.f12440n);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: a */
    private static String m15214a(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String m14445a = o80.m14445a(str);
        if (m14445a != null) {
            return m14445a;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static List<r70> m15215a(z70 z70Var, y70 y70Var) {
        List<String> m16597b = y70Var.m16597b("Set-Cookie");
        int size = m16597b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            r70 m15217a = m15217a(z70Var, m16597b.get(i));
            if (m15217a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m15217a);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    @javax.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static p000.r70 m15216a(long r23, p000.z70 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r70.m15216a(long, z70, java.lang.String):r70");
    }

    @Nullable
    /* renamed from: a */
    public static r70 m15217a(z70 z70Var, String str) {
        return m15216a(System.currentTimeMillis(), z70Var, str);
    }

    /* renamed from: a */
    private static boolean m15218a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !o80.m14474d(str);
    }

    /* renamed from: b */
    private static long m15219b(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public String m15220a() {
        return this.f12918a;
    }

    /* renamed from: a */
    String m15221a(boolean z) {
        String m11567a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12918a);
        sb.append('=');
        sb.append(this.f12919b);
        if (this.f12925h) {
            if (this.f12920c == Long.MIN_VALUE) {
                m11567a = "; max-age=0";
            } else {
                sb.append("; expires=");
                m11567a = e90.m11567a(new Date(this.f12920c));
            }
            sb.append(m11567a);
        }
        if (!this.f12926i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f12921d);
        }
        sb.append("; path=");
        sb.append(this.f12922e);
        if (this.f12923f) {
            sb.append("; secure");
        }
        if (this.f12924g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public String m15222b() {
        return this.f12919b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj;
        return r70Var.f12918a.equals(this.f12918a) && r70Var.f12919b.equals(this.f12919b) && r70Var.f12921d.equals(this.f12921d) && r70Var.f12922e.equals(this.f12922e) && r70Var.f12920c == this.f12920c && r70Var.f12923f == this.f12923f && r70Var.f12924g == this.f12924g && r70Var.f12925h == this.f12925h && r70Var.f12926i == this.f12926i;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f12918a.hashCode()) * 31) + this.f12919b.hashCode()) * 31) + this.f12921d.hashCode()) * 31) + this.f12922e.hashCode()) * 31;
        long j = this.f12920c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f12923f ? 1 : 0)) * 31) + (!this.f12924g ? 1 : 0)) * 31) + (!this.f12925h ? 1 : 0)) * 31) + (!this.f12926i ? 1 : 0);
    }

    public String toString() {
        return m15221a(false);
    }
}
