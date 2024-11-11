package com.google.android.gms.common;

import android.util.Log;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes.dex */
public class v {
    private static final v d = new v(true, null, null);
    final boolean a;
    private final String b;
    private final Throwable c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(String str) {
        return new v(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(String str, Throwable th) {
        return new v(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(Callable<String> callable) {
        return new x(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, o oVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, com.google.android.gms.common.util.j.a(com.google.android.gms.common.util.a.a("SHA-1").digest(oVar.a())), Boolean.valueOf(z), "12451009.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v c() {
        return d;
    }

    @Nullable
    String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.c;
        a();
        if (th != null) {
        }
    }
}
