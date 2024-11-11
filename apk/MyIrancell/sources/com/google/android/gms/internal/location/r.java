package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class r extends c0 {
    private final k G;

    public r(Context context, Looper looper, f.b bVar, f.c cVar, String str, @Nullable com.google.android.gms.common.internal.e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.G = new k(context, this.F);
    }

    public final void a(k.a<com.google.android.gms.location.b> aVar, d dVar) {
        this.G.a(aVar, dVar);
    }

    public final void a(zzbd zzbdVar, com.google.android.gms.common.api.internal.k<com.google.android.gms.location.b> kVar, d dVar) {
        synchronized (this.G) {
            this.G.a(zzbdVar, kVar, dVar);
        }
    }

    public final void a(LocationSettingsRequest locationSettingsRequest, com.google.android.gms.common.api.internal.e<LocationSettingsResult> eVar, @Nullable String str) {
        s();
        com.google.android.gms.common.internal.u.a(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        com.google.android.gms.common.internal.u.a(eVar != null, "listener can't be null.");
        ((g) A()).a(locationSettingsRequest, new t(eVar), str);
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final void b() {
        synchronized (this.G) {
            if (a()) {
                try {
                    this.G.a();
                    this.G.b();
                } catch (Exception unused) {
                }
            }
            super.b();
        }
    }
}
