package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class cx extends hx {
    private static final int[] k = {R$string.button_email, R$string.button_add_contact};

    public cx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        cy cyVar = (cy) g();
        if (i == 0) {
            a(cyVar.g(), cyVar.e(), cyVar.c(), cyVar.f(), cyVar.d());
        } else {
            if (i != 1) {
                return;
            }
            a(cyVar.g(), (String[]) null);
        }
    }

    @Override // defpackage.hx
    public int c() {
        return k.length;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_email_address;
    }
}
