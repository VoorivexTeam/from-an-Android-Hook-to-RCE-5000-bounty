package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.C1006h;

/* loaded from: classes.dex */
public final class zzb {

    /* renamed from: a */
    private SharedPreferences f5470a;

    public zzb(Context context) {
        try {
            Context m7002c = C1006h.m7002c(context);
            this.f5470a = m7002c == null ? null : m7002c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f5470a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m6346a(String str, float f) {
        try {
            if (this.f5470a == null) {
                return 0.0f;
            }
            return this.f5470a.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m6347a(String str, String str2) {
        try {
            return this.f5470a == null ? str2 : this.f5470a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            if (this.f5470a == null) {
                return false;
            }
            return this.f5470a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
