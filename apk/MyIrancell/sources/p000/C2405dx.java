package p000;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* renamed from: dx */
/* loaded from: classes.dex */
public final class C2405dx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f9882k = {R$string.button_show_map, R$string.button_get_directions};

    public C2405dx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f9882k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C2570hy c2570hy = (C2570hy) m12276g();
        if (i == 0) {
            m12274e(c2570hy.m12285c());
        } else {
            if (i != 1) {
                return;
            }
            m12256a(c2570hy.m12286d(), c2570hy.m12287e());
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return f9882k.length;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_geo;
    }
}
