package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.measurement.internal.j7;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a implements j7 {
    private final /* synthetic */ ld a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ld ldVar) {
        this.a = ldVar;
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final String a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final List<Bundle> a(String str, String str2) {
        return this.a.b(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final Map<String, Object> a(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void a(Bundle bundle) {
        this.a.a(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void a(String str) {
        this.a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void a(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void a(String str, String str2, Object obj) {
        this.a.a(str, str2, obj);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final int b(String str) {
        return this.a.d(str);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final String b() {
        return this.a.b();
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void b(String str, String str2, Bundle bundle) {
        this.a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void b(boolean z) {
        this.a.a(z);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final long c() {
        return this.a.c();
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final void c(String str) {
        this.a.c(str);
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final String zza() {
        return this.a.d();
    }

    @Override // com.google.android.gms.measurement.internal.j7
    public final String zzb() {
        return this.a.e();
    }
}
