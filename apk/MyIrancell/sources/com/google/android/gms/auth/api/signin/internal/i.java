package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import defpackage.vo;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {
    private static vo a = new vo("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static com.google.android.gms.common.api.h<Status> a(com.google.android.gms.common.api.f fVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String d = b.a(context).d();
        a(context);
        return z ? e.a(d) : fVar.b((com.google.android.gms.common.api.f) new j(fVar));
    }

    private static void a(Context context) {
        m.a(context).a();
        Iterator<com.google.android.gms.common.api.f> it = com.google.android.gms.common.api.f.h().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
        com.google.android.gms.common.api.internal.g.d();
    }
}
