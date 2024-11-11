package p000;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* renamed from: lx */
/* loaded from: classes.dex */
public final class C2913lx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f11930k = {R$string.button_web_search, R$string.button_share_by_email, R$string.button_share_by_sms, R$string.button_custom_product_search};

    public C2913lx(Activity activity, AbstractC2914ly abstractC2914ly, C2488fw c2488fw) {
        super(activity, abstractC2914ly, c2488fw);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f11930k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        String mo3459a = m12276g().mo3459a();
        if (i == 0) {
            m12284l(mo3459a);
            return;
        }
        if (i == 1) {
            m12282j(mo3459a);
        } else if (i == 2) {
            m12283k(mo3459a);
        } else {
            if (i != 3) {
                return;
            }
            m12277g(m12271c(mo3459a));
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return m12281i() ? f11930k.length : f11930k.length - 1;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_text;
    }
}
