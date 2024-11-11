package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0840h;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.internal.C1022e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
/* loaded from: classes.dex */
final class C0821f extends C0859a.a<C0840h, GoogleSignInOptions> {
    @Override // com.google.android.gms.common.api.C0859a.a
    /* renamed from: a */
    public final /* synthetic */ C0840h mo6386a(Context context, Looper looper, C1022e c1022e, GoogleSignInOptions googleSignInOptions, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        return new C0840h(context, looper, c1022e, googleSignInOptions, bVar, cVar);
    }

    @Override // com.google.android.gms.common.api.C0859a.e
    /* renamed from: a */
    public final /* synthetic */ List mo6387a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m6420l();
    }
}
