package p000;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e90 {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f9948a = new C2422a();

    /* renamed from: b */
    private static final String[] f9949b;

    /* renamed from: c */
    private static final DateFormat[] f9950c;

    /* renamed from: e90$a */
    /* loaded from: classes.dex */
    class C2422a extends ThreadLocal<DateFormat> {
        C2422a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(o80.f12440n);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f9949b = strArr;
        f9950c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static String m11567a(Date date) {
        return f9948a.get().format(date);
    }

    /* renamed from: a */
    public static Date m11568a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f9948a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f9949b) {
            int length = f9949b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f9950c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f9949b[i], Locale.US);
                    dateFormat.setTimeZone(o80.f12440n);
                    f9950c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
