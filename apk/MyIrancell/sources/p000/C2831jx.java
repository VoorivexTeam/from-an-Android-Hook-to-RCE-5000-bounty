package p000;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.android.R$string;

/* renamed from: jx */
/* loaded from: classes.dex */
public final class C2831jx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f11552k = {R$string.button_sms, R$string.button_mms};

    public C2831jx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f11552k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C3183ry c3183ry = (C3183ry) m12276g();
        String str = c3183ry.m15297d()[0];
        if (i == 0) {
            m12259a(str, c3183ry.m15296c());
        } else {
            if (i != 1) {
                return;
            }
            m12260a(str, c3183ry.m15298e(), c3183ry.m15296c());
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return f11552k.length;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: e */
    public CharSequence mo3200e() {
        C3183ry c3183ry = (C3183ry) m12276g();
        String[] m15297d = c3183ry.m15297d();
        String[] strArr = new String[m15297d.length];
        for (int i = 0; i < m15297d.length; i++) {
            strArr[i] = PhoneNumberUtils.formatNumber(m15297d[i]);
        }
        StringBuilder sb = new StringBuilder(50);
        AbstractC2914ly.m13943a(strArr, sb);
        AbstractC2914ly.m13942a(c3183ry.m15298e(), sb);
        AbstractC2914ly.m13942a(c3183ry.m15296c(), sb);
        return sb.toString();
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_sms;
    }
}
