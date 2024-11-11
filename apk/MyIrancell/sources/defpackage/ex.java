package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class ex extends hx {
    private static final int[] k = {R$string.button_product_search, R$string.button_book_search, R$string.button_search_book_contents, R$string.button_custom_product_search};

    public ex(Activity activity, ly lyVar, fw fwVar) {
        super(activity, lyVar, fwVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        jy jyVar = (jy) g();
        if (i == 0) {
            f(jyVar.c());
            return;
        }
        if (i == 1) {
            d(jyVar.c());
        } else if (i == 2) {
            h(jyVar.c());
        } else {
            if (i != 3) {
                return;
            }
            g(c(jyVar.c()));
        }
    }

    @Override // defpackage.hx
    public int c() {
        return i() ? k.length : k.length - 1;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_isbn;
    }
}
