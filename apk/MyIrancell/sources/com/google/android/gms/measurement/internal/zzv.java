package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C1815ma();

    /* renamed from: b */
    public String f8253b;

    /* renamed from: c */
    public String f8254c;

    /* renamed from: d */
    public zzkq f8255d;

    /* renamed from: e */
    public long f8256e;

    /* renamed from: f */
    public boolean f8257f;

    /* renamed from: g */
    public String f8258g;

    /* renamed from: h */
    public zzan f8259h;

    /* renamed from: i */
    public long f8260i;

    /* renamed from: j */
    public zzan f8261j;

    /* renamed from: k */
    public long f8262k;

    /* renamed from: l */
    public zzan f8263l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(zzv zzvVar) {
        C1057u.m7286a(zzvVar);
        this.f8253b = zzvVar.f8253b;
        this.f8254c = zzvVar.f8254c;
        this.f8255d = zzvVar.f8255d;
        this.f8256e = zzvVar.f8256e;
        this.f8257f = zzvVar.f8257f;
        this.f8258g = zzvVar.f8258g;
        this.f8259h = zzvVar.f8259h;
        this.f8260i = zzvVar.f8260i;
        this.f8261j = zzvVar.f8261j;
        this.f8262k = zzvVar.f8262k;
        this.f8263l = zzvVar.f8263l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(String str, String str2, zzkq zzkqVar, long j, boolean z, String str3, zzan zzanVar, long j2, zzan zzanVar2, long j3, zzan zzanVar3) {
        this.f8253b = str;
        this.f8254c = str2;
        this.f8255d = zzkqVar;
        this.f8256e = j;
        this.f8257f = z;
        this.f8258g = str3;
        this.f8259h = zzanVar;
        this.f8260i = j2;
        this.f8261j = zzanVar2;
        this.f8262k = j3;
        this.f8263l = zzanVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f8253b, false);
        C1053b.m7266a(parcel, 3, this.f8254c, false);
        C1053b.m7260a(parcel, 4, (Parcelable) this.f8255d, i, false);
        C1053b.m7256a(parcel, 5, this.f8256e);
        C1053b.m7269a(parcel, 6, this.f8257f);
        C1053b.m7266a(parcel, 7, this.f8258g, false);
        C1053b.m7260a(parcel, 8, (Parcelable) this.f8259h, i, false);
        C1053b.m7256a(parcel, 9, this.f8260i);
        C1053b.m7260a(parcel, 10, (Parcelable) this.f8261j, i, false);
        C1053b.m7256a(parcel, 11, this.f8262k);
        C1053b.m7260a(parcel, 12, (Parcelable) this.f8263l, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
