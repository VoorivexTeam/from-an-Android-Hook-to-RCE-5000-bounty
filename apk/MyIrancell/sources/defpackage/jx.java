package defpackage;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class jx extends hx {
    private static final int[] k = {R$string.button_sms, R$string.button_mms};

    public jx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        ry ryVar = (ry) g();
        String str = ryVar.d()[0];
        if (i == 0) {
            a(str, ryVar.c());
        } else {
            if (i != 1) {
                return;
            }
            a(str, ryVar.e(), ryVar.c());
        }
    }

    @Override // defpackage.hx
    public int c() {
        return k.length;
    }

    @Override // defpackage.hx
    public CharSequence e() {
        ry ryVar = (ry) g();
        String[] d = ryVar.d();
        String[] strArr = new String[d.length];
        for (int i = 0; i < d.length; i++) {
            strArr[i] = PhoneNumberUtils.formatNumber(d[i]);
        }
        StringBuilder sb = new StringBuilder(50);
        ly.a(strArr, sb);
        ly.a(ryVar.e(), sb);
        ly.a(ryVar.c(), sb);
        return sb.toString();
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_sms;
    }
}
