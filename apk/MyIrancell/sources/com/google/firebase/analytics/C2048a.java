package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;
import com.google.android.gms.measurement.internal.InterfaceC1776j7;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.analytics.a */
/* loaded from: classes.dex */
final class C2048a implements InterfaceC1776j7 {

    /* renamed from: a */
    private final /* synthetic */ C1370ld f8782a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2048a(C1370ld c1370ld) {
        this.f8782a = c1370ld;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final String mo9431a() {
        return this.f8782a.m8000a();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final List<Bundle> mo9432a(String str, String str2) {
        return this.f8782a.m8012b(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final Map<String, Object> mo9433a(String str, String str2, boolean z) {
        return this.f8782a.m8001a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final void mo9434a(Bundle bundle) {
        this.f8782a.m8004a(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final void mo9435a(String str) {
        this.f8782a.m8013b(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final void mo9436a(String str, String str2, Bundle bundle) {
        this.f8782a.m8014b(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: a */
    public final void mo9437a(String str, String str2, Object obj) {
        this.f8782a.m8009a(str, str2, obj);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: b */
    public final int mo9438b(String str) {
        return this.f8782a.m8017d(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: b */
    public final String mo9439b() {
        return this.f8782a.m8011b();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: b */
    public final void mo9440b(String str, String str2, Bundle bundle) {
        this.f8782a.m8008a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: b */
    public final void mo9441b(boolean z) {
        this.f8782a.m8010a(z);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: c */
    public final long mo9442c() {
        return this.f8782a.m8015c();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    /* renamed from: c */
    public final void mo9443c(String str) {
        this.f8782a.m8016c(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    public final String zza() {
        return this.f8782a.m8018d();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1776j7
    public final String zzb() {
        return this.f8782a.m8019e();
    }
}
