package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C1095a;
import com.google.android.gms.common.util.C1104j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* renamed from: com.google.android.gms.common.v */
/* loaded from: classes.dex */
public class C1116v {

    /* renamed from: d */
    private static final C1116v f6367d = new C1116v(true, null, null);

    /* renamed from: a */
    final boolean f6368a;

    /* renamed from: b */
    private final String f6369b;

    /* renamed from: c */
    private final Throwable f6370c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1116v(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f6368a = z;
        this.f6369b = str;
        this.f6370c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1116v m7430a(String str) {
        return new C1116v(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1116v m7431a(String str, Throwable th) {
        return new C1116v(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1116v m7432a(Callable<String> callable) {
        return new C1118x(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m7433a(String str, AbstractBinderC1073o abstractBinderC1073o, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, C1104j.m7391a(C1095a.m7360a("SHA-1").digest(abstractBinderC1073o.mo7313a())), Boolean.valueOf(z), "12451009.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1116v m7434c() {
        return f6367d;
    }

    @Nullable
    /* renamed from: a */
    String mo7435a() {
        return this.f6369b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7436b() {
        if (this.f6368a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f6370c;
        mo7435a();
        if (th != null) {
        }
    }
}
