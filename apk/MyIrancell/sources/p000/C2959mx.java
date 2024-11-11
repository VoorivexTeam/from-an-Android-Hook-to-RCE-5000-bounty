package p000;

import android.app.Activity;
import com.google.zxing.client.android.C2264m;
import com.google.zxing.client.android.R$string;
import java.util.Locale;

/* renamed from: mx */
/* loaded from: classes.dex */
public final class C2959mx extends AbstractC2569hx {

    /* renamed from: k */
    private static final String[] f12194k = {"otpauth:"};

    /* renamed from: l */
    private static final int[] f12195l = {R$string.button_open_browser, R$string.button_share_by_email, R$string.button_share_by_sms, R$string.button_search_book_contents};

    public C2959mx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f12195l[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public boolean mo12264a() {
        String lowerCase = ((C3455xy) m12276g()).m16523c().toLowerCase(Locale.ENGLISH);
        for (String str : f12194k) {
            if (lowerCase.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        String m16523c = ((C3455xy) m12276g()).m16523c();
        if (i == 0) {
            m12277g(m16523c);
            return;
        }
        if (i == 1) {
            m12282j(m16523c);
        } else if (i == 2) {
            m12283k(m16523c);
        } else {
            if (i != 3) {
                return;
            }
            m12279h(m16523c);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return C2264m.m10900a(((C3455xy) m12276g()).m16523c()) ? f12195l.length : f12195l.length - 1;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: d */
    public Integer mo12272d() {
        return 0;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_uri;
    }
}
