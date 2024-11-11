package p000;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* renamed from: fx */
/* loaded from: classes.dex */
public final class C2489fx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f10158k = {R$string.button_product_search, R$string.button_web_search, R$string.button_custom_product_search};

    public C2489fx(Activity activity, AbstractC2914ly abstractC2914ly, C2488fw c2488fw) {
        super(activity, abstractC2914ly, c2488fw);
    }

    /* renamed from: a */
    private static String m11844a(AbstractC2914ly abstractC2914ly) {
        if (abstractC2914ly instanceof C3006ny) {
            return ((C3006ny) abstractC2914ly).m14398c();
        }
        if (abstractC2914ly instanceof C2490fy) {
            return ((C2490fy) abstractC2914ly).m11847c();
        }
        throw new IllegalArgumentException(abstractC2914ly.getClass().toString());
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f10158k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        String m11844a = m11844a(m12276g());
        if (i == 0) {
            m12275f(m11844a);
        } else if (i == 1) {
            m12284l(m11844a);
        } else {
            if (i != 2) {
                return;
            }
            m12277g(m12271c(m11844a));
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return m12281i() ? f10158k.length : f10158k.length - 1;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_product;
    }
}
