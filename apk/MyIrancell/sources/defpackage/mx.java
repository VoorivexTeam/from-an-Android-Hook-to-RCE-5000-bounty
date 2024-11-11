package defpackage;

import android.app.Activity;
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.m;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mx extends hx {
    private static final String[] k = {"otpauth:"};
    private static final int[] l = {R$string.button_open_browser, R$string.button_share_by_email, R$string.button_share_by_sms, R$string.button_search_book_contents};

    public mx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    @Override // defpackage.hx
    public int a(int i) {
        return l[i];
    }

    @Override // defpackage.hx
    public boolean a() {
        String lowerCase = ((xy) g()).c().toLowerCase(Locale.ENGLISH);
        for (String str : k) {
            if (lowerCase.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hx
    public void b(int i) {
        String c = ((xy) g()).c();
        if (i == 0) {
            g(c);
            return;
        }
        if (i == 1) {
            j(c);
        } else if (i == 2) {
            k(c);
        } else {
            if (i != 3) {
                return;
            }
            h(c);
        }
    }

    @Override // defpackage.hx
    public int c() {
        return m.a(((xy) g()).c()) ? l.length : l.length - 1;
    }

    @Override // defpackage.hx
    public Integer d() {
        return 0;
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_uri;
    }
}
