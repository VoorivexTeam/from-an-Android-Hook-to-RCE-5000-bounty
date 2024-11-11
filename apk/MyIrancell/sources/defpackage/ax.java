package defpackage;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.zxing.client.android.R$string;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ax extends hx {
    private static final DateFormat[] m;
    private static final int[] n;
    private final boolean[] k;
    private int l;

    static {
        DateFormat[] dateFormatArr = {new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH), new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH)};
        m = dateFormatArr;
        for (DateFormat dateFormat : dateFormatArr) {
            dateFormat.setLenient(false);
        }
        n = new int[]{R$string.button_add_contact, R$string.button_show_map, R$string.button_dial, R$string.button_email};
    }

    public ax(Activity activity, ly lyVar) {
        super(activity, lyVar);
        yx yxVar = (yx) lyVar;
        String[] d = yxVar.d();
        boolean z = (d == null || d.length <= 0 || d[0] == null || d[0].isEmpty()) ? false : true;
        String[] n2 = yxVar.n();
        boolean z2 = n2 != null && n2.length > 0;
        String[] g = yxVar.g();
        boolean z3 = g != null && g.length > 0;
        this.k = r4;
        boolean[] zArr = {true, z, z2, z3};
        this.l = 0;
        for (int i = 0; i < 4; i++) {
            if (this.k[i]) {
                this.l++;
            }
        }
    }

    private int c(int i) {
        if (i < this.l) {
            int i2 = -1;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.k[i3]) {
                    i2++;
                }
                if (i2 == i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    private static Date m(String str) {
        for (DateFormat dateFormat : m) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.hx
    public int a(int i) {
        return n[c(i)];
    }

    @Override // defpackage.hx
    public void b(int i) {
        yx yxVar = (yx) g();
        String[] d = yxVar.d();
        String str = (d == null || d.length < 1) ? null : d[0];
        String[] c = yxVar.c();
        String str2 = (c == null || c.length < 1) ? null : c[0];
        int c2 = c(i);
        if (c2 == 0) {
            a(yxVar.j(), yxVar.k(), yxVar.p(), yxVar.n(), yxVar.o(), yxVar.g(), yxVar.f(), yxVar.l(), yxVar.i(), str, str2, yxVar.m(), yxVar.q(), yxVar.r(), yxVar.e(), yxVar.h());
            return;
        }
        if (c2 == 1) {
            i(str);
        } else if (c2 == 2) {
            a(yxVar.n()[0]);
        } else {
            if (c2 != 3) {
                return;
            }
            a(yxVar.g(), null, null, null, null);
        }
    }

    @Override // defpackage.hx
    public int c() {
        return this.l;
    }

    @Override // defpackage.hx
    public CharSequence e() {
        Date m2;
        yx yxVar = (yx) g();
        StringBuilder sb = new StringBuilder(100);
        ly.a(yxVar.j(), sb);
        int length = sb.length();
        String p = yxVar.p();
        if (p != null && !p.isEmpty()) {
            sb.append("\n(");
            sb.append(p);
            sb.append(')');
        }
        ly.a(yxVar.q(), sb);
        ly.a(yxVar.m(), sb);
        ly.a(yxVar.d(), sb);
        String[] n2 = yxVar.n();
        if (n2 != null) {
            for (String str : n2) {
                if (str != null) {
                    ly.a(PhoneNumberUtils.formatNumber(str), sb);
                }
            }
        }
        ly.a(yxVar.g(), sb);
        ly.a(yxVar.r(), sb);
        String e = yxVar.e();
        if (e != null && !e.isEmpty() && (m2 = m(e)) != null) {
            ly.a(DateFormat.getDateInstance(2).format(Long.valueOf(m2.getTime())), sb);
        }
        ly.a(yxVar.l(), sb);
        if (length <= 0) {
            return sb.toString();
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, length, 0);
        return spannableString;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_address_book;
    }
}
