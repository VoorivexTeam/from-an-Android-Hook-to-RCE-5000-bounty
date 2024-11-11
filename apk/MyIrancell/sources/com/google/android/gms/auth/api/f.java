package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class f extends a.AbstractC0041a<h, GoogleSignInOptions> {
    @Override // com.google.android.gms.common.api.a.AbstractC0041a
    public final /* synthetic */ h a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, GoogleSignInOptions googleSignInOptions, f.b bVar, f.c cVar) {
        return new h(context, looper, eVar, googleSignInOptions, bVar, cVar);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.l();
    }
}
