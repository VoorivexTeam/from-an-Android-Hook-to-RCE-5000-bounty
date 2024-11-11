package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o1 implements n1 {
    private static o1 c;

    @Nullable
    private final Context a;

    @Nullable
    private final ContentObserver b;

    private o1() {
        this.a = null;
        this.b = null;
    }

    private o1(Context context) {
        this.a = context;
        this.b = new q1(this, null);
        context.getContentResolver().registerContentObserver(e1.a, true, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o1 a(Context context) {
        o1 o1Var;
        synchronized (o1.class) {
            if (c == null) {
                c = androidx.core.content.c.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new o1(context) : new o1();
            }
            o1Var = c;
        }
        return o1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (o1.class) {
            if (c != null && c.a != null && c.b != null) {
                c.a.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.n1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) m1.a(new p1(this, str) { // from class: com.google.android.gms.internal.measurement.r1
                private final o1 a;
                private final String b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.b = str;
                }

                @Override // com.google.android.gms.internal.measurement.p1
                public final Object zza() {
                    return this.a.b(this.b);
                }
            });
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String b(String str) {
        return e1.a(this.a.getContentResolver(), str, (String) null);
    }
}
