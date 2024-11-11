package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0899g;
import java.util.Iterator;
import p000.C3366vo;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
/* loaded from: classes.dex */
public final class C0841i {

    /* renamed from: a */
    private static C3366vo f5648a = new C3366vo("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m6468a(Context context, GoogleSignInOptions googleSignInOptions) {
        f5648a.m16040a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: a */
    public static AbstractC0866h<Status> m6469a(AbstractC0864f abstractC0864f, Context context, boolean z) {
        f5648a.m16040a("Revoking access", new Object[0]);
        String m6452d = C0834b.m6442a(context).m6452d();
        m6470a(context);
        return z ? RunnableC0837e.m6456a(m6452d) : abstractC0864f.mo6558b((AbstractC0864f) new C0842j(abstractC0864f));
    }

    /* renamed from: a */
    private static void m6470a(Context context) {
        C0845m.m6474a(context).m6476a();
        Iterator<AbstractC0864f> it = AbstractC0864f.m6549h().iterator();
        while (it.hasNext()) {
            it.next().mo6564g();
        }
        C0899g.m6698d();
    }
}
