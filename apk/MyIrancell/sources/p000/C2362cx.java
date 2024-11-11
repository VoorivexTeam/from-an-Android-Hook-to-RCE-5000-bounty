package p000;

import android.app.Activity;
import com.google.zxing.client.android.R$string;

/* renamed from: cx */
/* loaded from: classes.dex */
public final class C2362cx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f9602k = {R$string.button_email, R$string.button_add_contact};

    public C2362cx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f9602k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        C2363cy c2363cy = (C2363cy) m12276g();
        if (i == 0) {
            m12263a(c2363cy.m11219g(), c2363cy.m11217e(), c2363cy.m11215c(), c2363cy.m11218f(), c2363cy.m11216d());
        } else {
            if (i != 1) {
                return;
            }
            m12261a(c2363cy.m11219g(), (String[]) null);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return f9602k.length;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_email_address;
    }
}
