package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.C0238c;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* loaded from: classes.dex */
public final class C1403o1 implements InterfaceC1388n1 {

    /* renamed from: c */
    private static C1403o1 f6784c;

    /* renamed from: a */
    @Nullable
    private final Context f6785a;

    /* renamed from: b */
    @Nullable
    private final ContentObserver f6786b;

    private C1403o1() {
        this.f6785a = null;
        this.f6786b = null;
    }

    private C1403o1(Context context) {
        this.f6785a = context;
        this.f6786b = new C1431q1(this, null);
        context.getContentResolver().registerContentObserver(C1253e1.f6581a, true, this.f6786b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1403o1 m8076a(Context context) {
        C1403o1 c1403o1;
        synchronized (C1403o1.class) {
            if (f6784c == null) {
                f6784c = C0238c.m1469a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1403o1(context) : new C1403o1();
            }
            c1403o1 = f6784c;
        }
        return c1403o1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m8077a() {
        synchronized (C1403o1.class) {
            if (f6784c != null && f6784c.f6785a != null && f6784c.f6786b != null) {
                f6784c.f6785a.getContentResolver().unregisterContentObserver(f6784c.f6786b);
            }
            f6784c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1388n1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String mo7694a(final String str) {
        if (this.f6785a == null) {
            return null;
        }
        try {
            return (String) C1373m1.m8020a(new InterfaceC1417p1(this, str) { // from class: com.google.android.gms.internal.measurement.r1

                /* renamed from: a */
                private final C1403o1 f6857a;

                /* renamed from: b */
                private final String f6858b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f6857a = this;
                    this.f6858b = str;
                }

                @Override // com.google.android.gms.internal.measurement.InterfaceC1417p1
                public final Object zza() {
                    return this.f6857a.m8079b(this.f6858b);
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
    /* renamed from: b */
    public final /* synthetic */ String m8079b(String str) {
        return C1253e1.m7785a(this.f6785a.getContentResolver(), str, (String) null);
    }
}
