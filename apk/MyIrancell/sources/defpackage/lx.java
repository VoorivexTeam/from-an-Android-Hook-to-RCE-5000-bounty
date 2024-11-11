package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class lx extends hx {
    private static final int[] k = {R$string.button_web_search, R$string.button_share_by_email, R$string.button_share_by_sms, R$string.button_custom_product_search};

    public lx(Activity activity, ly lyVar, fw fwVar) {
        super(activity, lyVar, fwVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        String a = g().a();
        if (i == 0) {
            l(a);
            return;
        }
        if (i == 1) {
            j(a);
        } else if (i == 2) {
            k(a);
        } else {
            if (i != 3) {
                return;
            }
            g(c(a));
        }
    }

    @Override // defpackage.hx
    public int c() {
        return i() ? k.length : k.length - 1;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_text;
    }
}
