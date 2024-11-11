package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1191a;
import com.google.android.gms.internal.measurement.C1443r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* loaded from: classes.dex */
public final class C1942y3 extends C1191a implements InterfaceC1920w3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1942y3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9616a(zzm zzmVar, boolean z) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzmVar);
        C1443r.m8261a(m7503a, z);
        Parcel m7504a = m7504a(7, m7503a);
        ArrayList createTypedArrayList = m7504a.createTypedArrayList(zzkq.CREATOR);
        m7504a.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzv> mo9617a(String str, String str2, zzm zzmVar) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8260a(m7503a, zzmVar);
        Parcel m7504a = m7504a(16, m7503a);
        ArrayList createTypedArrayList = m7504a.createTypedArrayList(zzv.CREATOR);
        m7504a.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzv> mo9618a(String str, String str2, String str3) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        m7503a.writeString(str3);
        Parcel m7504a = m7504a(17, m7503a);
        ArrayList createTypedArrayList = m7504a.createTypedArrayList(zzv.CREATOR);
        m7504a.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9619a(String str, String str2, String str3, boolean z) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        m7503a.writeString(str3);
        C1443r.m8261a(m7503a, z);
        Parcel m7504a = m7504a(15, m7503a);
        ArrayList createTypedArrayList = m7504a.createTypedArrayList(zzkq.CREATOR);
        m7504a.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9620a(String str, String str2, boolean z, zzm zzmVar) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8261a(m7503a, z);
        C1443r.m8260a(m7503a, zzmVar);
        Parcel m7504a = m7504a(14, m7503a);
        ArrayList createTypedArrayList = m7504a.createTypedArrayList(zzkq.CREATOR);
        m7504a.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9621a(long j, String str, String str2, String str3) {
        Parcel m7503a = m7503a();
        m7503a.writeLong(j);
        m7503a.writeString(str);
        m7503a.writeString(str2);
        m7503a.writeString(str3);
        m7505b(10, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9622a(zzan zzanVar, zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzanVar);
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(1, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9623a(zzan zzanVar, String str, String str2) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzanVar);
        m7503a.writeString(str);
        m7503a.writeString(str2);
        m7505b(5, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9624a(zzkq zzkqVar, zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzkqVar);
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(2, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9625a(zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(6, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9626a(zzv zzvVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzvVar);
        m7505b(13, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9627a(zzv zzvVar, zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzvVar);
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(12, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final byte[] mo9628a(zzan zzanVar, String str) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzanVar);
        m7503a.writeString(str);
        Parcel m7504a = m7504a(9, m7503a);
        byte[] createByteArray = m7504a.createByteArray();
        m7504a.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: b */
    public final String mo9630b(zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzmVar);
        Parcel m7504a = m7504a(11, m7503a);
        String readString = m7504a.readString();
        m7504a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: c */
    public final void mo9631c(zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(18, m7503a);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: d */
    public final void mo9632d(zzm zzmVar) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, zzmVar);
        m7505b(4, m7503a);
    }
}
