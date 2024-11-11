package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class fx extends hx {
    private static final int[] k = {R$string.button_product_search, R$string.button_web_search, R$string.button_custom_product_search};

    public fx(Activity activity, ly lyVar, fw fwVar) {
        super(activity, lyVar, fwVar);
    }

    private static String a(ly lyVar) {
        if (lyVar instanceof ny) {
            return ((ny) lyVar).c();
        }
        if (lyVar instanceof fy) {
            return ((fy) lyVar).c();
        }
        throw new IllegalArgumentException(lyVar.getClass().toString());
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        String a = a(g());
        if (i == 0) {
            f(a);
        } else if (i == 1) {
            l(a);
        } else {
            if (i != 2) {
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
        return R$string.result_product;
    }
}
