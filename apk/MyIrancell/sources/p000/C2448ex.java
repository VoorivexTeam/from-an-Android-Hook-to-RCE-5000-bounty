package p000;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* renamed from: ex */
/* loaded from: classes.dex */
public final class C2448ex extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f10044k = {R$string.button_product_search, R$string.button_book_search, R$string.button_search_book_contents, R$string.button_custom_product_search};

    public C2448ex(Activity activity, AbstractC2914ly abstractC2914ly, C2488fw c2488fw) {
        super(activity, abstractC2914ly, c2488fw);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f10044k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C2832jy c2832jy = (C2832jy) m12276g();
        if (i == 0) {
            m12275f(c2832jy.m13524c());
            return;
        }
        if (i == 1) {
            m12273d(c2832jy.m13524c());
        } else if (i == 2) {
            m12279h(c2832jy.m13524c());
        } else {
            if (i != 3) {
                return;
            }
            m12277g(m12271c(c2832jy.m13524c()));
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return m12281i() ? f10044k.length : f10044k.length - 1;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_isbn;
    }
}
