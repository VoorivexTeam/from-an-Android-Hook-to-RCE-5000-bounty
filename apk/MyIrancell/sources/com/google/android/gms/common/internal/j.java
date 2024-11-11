package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class j {
    private static final Object a = new Object();
    private static j b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class a {
        private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        private final String a;
        private final String b;
        private final ComponentName c;
        private final int d;
        private final boolean e;

        public a(String str, String str2, int i) {
            this(str, str2, i, false);
        }

        public a(String str, String str2, int i, boolean z) {
            u.b(str);
            this.a = str;
            u.b(str2);
            this.b = str2;
            this.c = null;
            this.d = i;
            this.e = z;
        }

        public final ComponentName a() {
            return this.c;
        }

        public final Intent a(Context context) {
            if (this.a == null) {
                return new Intent().setComponent(this.c);
            }
            if (this.e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.a);
                Bundle call = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
                r1 = call != null ? (Intent) call.getParcelable("serviceResponseIntentKey") : null;
                if (r1 == null) {
                    String valueOf = String.valueOf(this.a);
                    if (valueOf.length() != 0) {
                        "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        new String("Dynamic lookup for intent failed for action: ");
                    }
                }
            }
            return r1 == null ? new Intent(this.a).setPackage(this.b) : r1;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.a(this.a, aVar.a) && s.a(this.b, aVar.b) && s.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return s.a(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.c.flattenToString() : str;
        }
    }

    public static j a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new m0(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}
