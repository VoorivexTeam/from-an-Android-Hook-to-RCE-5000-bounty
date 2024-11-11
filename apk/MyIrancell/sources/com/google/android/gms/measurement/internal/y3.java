package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y3 extends com.google.android.gms.internal.measurement.a implements w3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(zzm zzmVar, boolean z) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        com.google.android.gms.internal.measurement.r.a(a, z);
        Parcel a2 = a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkq.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzv> a(String str, String str2, zzm zzmVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        Parcel a2 = a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzv> a(String str, String str2, String str3) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(String str, String str2, String str3, boolean z) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        com.google.android.gms.internal.measurement.r.a(a, z);
        Parcel a2 = a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkq.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(String str, String str2, boolean z, zzm zzmVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        com.google.android.gms.internal.measurement.r.a(a, z);
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        Parcel a2 = a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkq.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(long j, String str, String str2, String str3) {
        Parcel a = a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        b(10, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzan zzanVar, zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzanVar);
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(1, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzan zzanVar, String str, String str2) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzanVar);
        a.writeString(str);
        a.writeString(str2);
        b(5, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzkq zzkqVar, zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzkqVar);
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(2, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(6, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzv zzvVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzvVar);
        b(13, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzv zzvVar, zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzvVar);
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(12, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final byte[] a(zzan zzanVar, String str) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzanVar);
        a.writeString(str);
        Parcel a2 = a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final String b(zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        Parcel a2 = a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void c(zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(18, a);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void d(zzm zzmVar) {
        Parcel a = a();
        com.google.android.gms.internal.measurement.r.a(a, zzmVar);
        b(4, a);
    }
}
