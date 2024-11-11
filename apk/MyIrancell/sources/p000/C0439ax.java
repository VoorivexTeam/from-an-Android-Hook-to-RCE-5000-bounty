package p000;

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

/* renamed from: ax */
/* loaded from: classes.dex */
public final class C0439ax extends AbstractC2569hx {

    /* renamed from: m */
    private static final DateFormat[] f2650m;

    /* renamed from: n */
    private static final int[] f2651n;

    /* renamed from: k */
    private final boolean[] f2652k;

    /* renamed from: l */
    private int f2653l;

    static {
        DateFormat[] dateFormatArr = {new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH), new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH)};
        f2650m = dateFormatArr;
        for (DateFormat dateFormat : dateFormatArr) {
            dateFormat.setLenient(false);
        }
        f2651n = new int[]{R$string.button_add_contact, R$string.button_show_map, R$string.button_dial, R$string.button_email};
    }

    public C0439ax(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
        C3503yx c3503yx = (C3503yx) abstractC2914ly;
        String[] m16671d = c3503yx.m16671d();
        boolean z = (m16671d == null || m16671d.length <= 0 || m16671d[0] == null || m16671d[0].isEmpty()) ? false : true;
        String[] m16681n = c3503yx.m16681n();
        boolean z2 = m16681n != null && m16681n.length > 0;
        String[] m16674g = c3503yx.m16674g();
        boolean z3 = m16674g != null && m16674g.length > 0;
        this.f2652k = r4;
        boolean[] zArr = {true, z, z2, z3};
        this.f2653l = 0;
        for (int i = 0; i < 4; i++) {
            if (this.f2652k[i]) {
                this.f2653l++;
            }
        }
    }

    /* renamed from: c */
    private int m3195c(int i) {
        if (i < this.f2653l) {
            int i2 = -1;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.f2652k[i3]) {
                    i2++;
                }
                if (i2 == i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* renamed from: m */
    private static Date m3196m(String str) {
        for (DateFormat dateFormat : f2650m) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f2651n[m3195c(i)];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C3503yx c3503yx = (C3503yx) m12276g();
        String[] m16671d = c3503yx.m16671d();
        String str = (m16671d == null || m16671d.length < 1) ? null : m16671d[0];
        String[] m16670c = c3503yx.m16670c();
        String str2 = (m16670c == null || m16670c.length < 1) ? null : m16670c[0];
        int m3195c = m3195c(i);
        if (m3195c == 0) {
            m12262a(c3503yx.m16677j(), c3503yx.m16678k(), c3503yx.m16683p(), c3503yx.m16681n(), c3503yx.m16682o(), c3503yx.m16674g(), c3503yx.m16673f(), c3503yx.m16679l(), c3503yx.m16676i(), str, str2, c3503yx.m16680m(), c3503yx.m16684q(), c3503yx.m16685r(), c3503yx.m16672e(), c3503yx.m16675h());
            return;
        }
        if (m3195c == 1) {
            m12280i(str);
        } else if (m3195c == 2) {
            m12258a(c3503yx.m16681n()[0]);
        } else {
            if (m3195c != 3) {
                return;
            }
            m12263a(c3503yx.m16674g(), null, null, null, null);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return this.f2653l;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: e */
    public CharSequence mo3200e() {
        Date m3196m;
        C3503yx c3503yx = (C3503yx) m12276g();
        StringBuilder sb = new StringBuilder(100);
        AbstractC2914ly.m13943a(c3503yx.m16677j(), sb);
        int length = sb.length();
        String m16683p = c3503yx.m16683p();
        if (m16683p != null && !m16683p.isEmpty()) {
            sb.append("\n(");
            sb.append(m16683p);
            sb.append(')');
        }
        AbstractC2914ly.m13942a(c3503yx.m16684q(), sb);
        AbstractC2914ly.m13942a(c3503yx.m16680m(), sb);
        AbstractC2914ly.m13943a(c3503yx.m16671d(), sb);
        String[] m16681n = c3503yx.m16681n();
        if (m16681n != null) {
            for (String str : m16681n) {
                if (str != null) {
                    AbstractC2914ly.m13942a(PhoneNumberUtils.formatNumber(str), sb);
                }
            }
        }
        AbstractC2914ly.m13943a(c3503yx.m16674g(), sb);
        AbstractC2914ly.m13943a(c3503yx.m16685r(), sb);
        String m16672e = c3503yx.m16672e();
        if (m16672e != null && !m16672e.isEmpty() && (m3196m = m3196m(m16672e)) != null) {
            AbstractC2914ly.m13942a(DateFormat.getDateInstance(2).format(Long.valueOf(m3196m.getTime())), sb);
        }
        AbstractC2914ly.m13942a(c3503yx.m16679l(), sb);
        if (length <= 0) {
            return sb.toString();
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, length, 0);
        return spannableString;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_address_book;
    }
}
