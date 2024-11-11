package p000;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.android.R$string;

/* renamed from: kx */
/* loaded from: classes.dex */
public final class C2876kx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f11770k = {R$string.button_dial, R$string.button_add_contact};

    public C2876kx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f11770k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C3323uy c3323uy = (C3323uy) m12276g();
        if (i == 0) {
            m12267b(c3323uy.m15874d());
            m12265b().finish();
        } else {
            if (i != 1) {
                return;
            }
            m12270b(new String[]{c3323uy.m15873c()}, (String[]) null);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return f11770k.length;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: e */
    public CharSequence mo3200e() {
        return PhoneNumberUtils.formatNumber(m12276g().mo3459a().replace("\r", ""));
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_tel;
    }
}
