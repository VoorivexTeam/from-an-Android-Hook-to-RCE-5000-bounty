package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
public abstract class AbstractC1032j {

    /* renamed from: a */
    private static final Object f6227a = new Object();

    /* renamed from: b */
    private static AbstractC1032j f6228b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f */
        private static final Uri f6229f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        private final String f6230a;

        /* renamed from: b */
        private final String f6231b;

        /* renamed from: c */
        private final ComponentName f6232c;

        /* renamed from: d */
        private final int f6233d;

        /* renamed from: e */
        private final boolean f6234e;

        public a(String str, String str2, int i) {
            this(str, str2, i, false);
        }

        public a(String str, String str2, int i, boolean z) {
            C1057u.m7296b(str);
            this.f6230a = str;
            C1057u.m7296b(str2);
            this.f6231b = str2;
            this.f6232c = null;
            this.f6233d = i;
            this.f6234e = z;
        }

        /* renamed from: a */
        public final ComponentName m7162a() {
            return this.f6232c;
        }

        /* renamed from: a */
        public final Intent m7163a(Context context) {
            if (this.f6230a == null) {
                return new Intent().setComponent(this.f6232c);
            }
            if (this.f6234e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.f6230a);
                Bundle call = context.getContentResolver().call(f6229f, "serviceIntentCall", (String) null, bundle);
                r1 = call != null ? (Intent) call.getParcelable("serviceResponseIntentKey") : null;
                if (r1 == null) {
                    String valueOf = String.valueOf(this.f6230a);
                    if (valueOf.length() != 0) {
                        "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        new String("Dynamic lookup for intent failed for action: ");
                    }
                }
            }
            return r1 == null ? new Intent(this.f6230a).setPackage(this.f6231b) : r1;
        }

        /* renamed from: b */
        public final String m7164b() {
            return this.f6231b;
        }

        /* renamed from: c */
        public final int m7165c() {
            return this.f6233d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C1050s.m7205a(this.f6230a, aVar.f6230a) && C1050s.m7205a(this.f6231b, aVar.f6231b) && C1050s.m7205a(this.f6232c, aVar.f6232c) && this.f6233d == aVar.f6233d && this.f6234e == aVar.f6234e;
        }

        public final int hashCode() {
            return C1050s.m7203a(this.f6230a, this.f6231b, this.f6232c, Integer.valueOf(this.f6233d), Boolean.valueOf(this.f6234e));
        }

        public final String toString() {
            String str = this.f6230a;
            return str == null ? this.f6232c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static AbstractC1032j m7158a(Context context) {
        synchronized (f6227a) {
            if (f6228b == null) {
                f6228b = new C1039m0(context.getApplicationContext());
            }
        }
        return f6228b;
    }

    /* renamed from: a */
    public final void m7159a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo7161b(new a(str, str2, i), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo7160a(a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    protected abstract void mo7161b(a aVar, ServiceConnection serviceConnection, String str);
}
