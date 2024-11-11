package p000;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: by */
/* loaded from: classes.dex */
public final class C0497by extends AbstractC2914ly {

    /* renamed from: k */
    private static final Pattern f2829k = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: l */
    private static final long[] f2830l = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: m */
    private static final Pattern f2831m = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    private final String f2832b;

    /* renamed from: c */
    private final Date f2833c;

    /* renamed from: d */
    private final boolean f2834d;

    /* renamed from: e */
    private final Date f2835e;

    /* renamed from: f */
    private final boolean f2836f;

    /* renamed from: g */
    private final String f2837g;

    /* renamed from: h */
    private final String f2838h;

    /* renamed from: i */
    private final String[] f2839i;

    /* renamed from: j */
    private final String f2840j;

    public C0497by(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(EnumC2960my.CALENDAR);
        this.f2832b = str;
        try {
            this.f2833c = m3456a(str2);
            if (str3 == null) {
                long m3454a = m3454a((CharSequence) str4);
                this.f2835e = m3454a < 0 ? null : new Date(this.f2833c.getTime() + m3454a);
            } else {
                try {
                    this.f2835e = m3456a(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            this.f2834d = str2.length() == 8;
            this.f2836f = str3 != null && str3.length() == 8;
            this.f2837g = str5;
            this.f2838h = str6;
            this.f2839i = strArr;
            this.f2840j = str7;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: a */
    private static long m3454a(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f2829k.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (i < f2830l.length) {
            int i2 = i + 1;
            if (matcher.group(i2) != null) {
                j += f2830l[i] * Integer.parseInt(r4);
            }
            i = i2;
        }
        return j;
    }

    /* renamed from: a */
    private static String m3455a(boolean z, Date date) {
        if (date == null) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(date);
    }

    /* renamed from: a */
    private static Date m3456a(String str) {
        if (!f2831m.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            return m3457l().parse(str);
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return m3458m().parse(str);
        }
        Date parse = m3458m().parse(str.substring(0, 15));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long time = parse.getTime() + gregorianCalendar.get(15);
        gregorianCalendar.setTime(new Date(time));
        return new Date(time + gregorianCalendar.get(16));
    }

    /* renamed from: l */
    private static DateFormat m3457l() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: m */
    private static DateFormat m3458m() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC2914ly.m13942a(this.f2832b, sb);
        AbstractC2914ly.m13942a(m3455a(this.f2834d, this.f2833c), sb);
        AbstractC2914ly.m13942a(m3455a(this.f2836f, this.f2835e), sb);
        AbstractC2914ly.m13942a(this.f2837g, sb);
        AbstractC2914ly.m13942a(this.f2838h, sb);
        AbstractC2914ly.m13943a(this.f2839i, sb);
        AbstractC2914ly.m13942a(this.f2840j, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String[] m3460c() {
        return this.f2839i;
    }

    /* renamed from: d */
    public String m3461d() {
        return this.f2840j;
    }

    /* renamed from: e */
    public Date m3462e() {
        return this.f2835e;
    }

    /* renamed from: f */
    public String m3463f() {
        return this.f2837g;
    }

    /* renamed from: g */
    public String m3464g() {
        return this.f2838h;
    }

    /* renamed from: h */
    public Date m3465h() {
        return this.f2833c;
    }

    /* renamed from: i */
    public String m3466i() {
        return this.f2832b;
    }

    /* renamed from: j */
    public boolean m3467j() {
        return this.f2836f;
    }

    /* renamed from: k */
    public boolean m3468k() {
        return this.f2834d;
    }
}
