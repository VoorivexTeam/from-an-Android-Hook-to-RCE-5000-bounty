package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class dx extends hx {
    private static final int[] k = {R$string.button_show_map, R$string.button_get_directions};

    public dx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        hy hyVar = (hy) g();
        if (i == 0) {
            e(hyVar.c());
        } else {
            if (i != 1) {
                return;
            }
            a(hyVar.d(), hyVar.e());
        }
    }

    @Override // defpackage.hx
    public int c() {
        return k.length;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_geo;
    }
}
