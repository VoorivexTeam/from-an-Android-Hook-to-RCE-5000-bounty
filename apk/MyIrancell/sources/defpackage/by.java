package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class by extends ly {
    private static final Pattern k = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
    private static final long[] l = {604800000, 86400000, 3600000, 60000, 1000};
    private static final Pattern m = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    private final String b;
    private final Date c;
    private final boolean d;
    private final Date e;
    private final boolean f;
    private final String g;
    private final String h;
    private final String[] i;
    private final String j;

    public by(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(my.CALENDAR);
        this.b = str;
        try {
            this.c = a(str2);
            if (str3 == null) {
                long a = a((CharSequence) str4);
                this.e = a < 0 ? null : new Date(this.c.getTime() + a);
            } else {
                try {
                    this.e = a(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            this.d = str2.length() == 8;
            this.f = str3 != null && str3.length() == 8;
            this.g = str5;
            this.h = str6;
            this.i = strArr;
            this.j = str7;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    private static long a(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = k.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (i < l.length) {
            int i2 = i + 1;
            if (matcher.group(i2) != null) {
                j += l[i] * Integer.parseInt(r4);
            }
            i = i2;
        }
        return j;
    }

    private static String a(boolean z, Date date) {
        if (date == null) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(date);
    }

    private static Date a(String str) {
        if (!m.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            return l().parse(str);
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return m().parse(str);
        }
        Date parse = m().parse(str.substring(0, 15));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long time = parse.getTime() + gregorianCalendar.get(15);
        gregorianCalendar.setTime(new Date(time));
        return new Date(time + gregorianCalendar.get(16));
    }

    private static DateFormat l() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private static DateFormat m() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        ly.a(this.b, sb);
        ly.a(a(this.d, this.c), sb);
        ly.a(a(this.f, this.e), sb);
        ly.a(this.g, sb);
        ly.a(this.h, sb);
        ly.a(this.i, sb);
        ly.a(this.j, sb);
        return sb.toString();
    }

    public String[] c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public Date e() {
        return this.e;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public Date h() {
        return this.c;
    }

    public String i() {
        return this.b;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.d;
    }
}
