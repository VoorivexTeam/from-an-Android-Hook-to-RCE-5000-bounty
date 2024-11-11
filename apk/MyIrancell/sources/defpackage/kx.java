package defpackage;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class kx extends hx {
    private static final int[] k = {R$string.button_dial, R$string.button_add_contact};

    public kx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        uy uyVar = (uy) g();
        if (i == 0) {
            b(uyVar.d());
            b().finish();
        } else {
            if (i != 1) {
                return;
            }
            b(new String[]{uyVar.c()}, (String[]) null);
        }
    }

    @Override // defpackage.hx
    public int c() {
        return k.length;
    }

    @Override // defpackage.hx
    public CharSequence e() {
        return PhoneNumberUtils.formatNumber(g().a().replace("\r", ""));
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_tel;
    }
}
