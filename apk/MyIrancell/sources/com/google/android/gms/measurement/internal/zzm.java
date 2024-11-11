package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

/* loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C1707da();

    /* renamed from: b */
    public final String f8231b;

    /* renamed from: c */
    public final String f8232c;

    /* renamed from: d */
    public final String f8233d;

    /* renamed from: e */
    public final String f8234e;

    /* renamed from: f */
    public final long f8235f;

    /* renamed from: g */
    public final long f8236g;

    /* renamed from: h */
    public final String f8237h;

    /* renamed from: i */
    public final boolean f8238i;

    /* renamed from: j */
    public final boolean f8239j;

    /* renamed from: k */
    public final long f8240k;

    /* renamed from: l */
    public final String f8241l;

    /* renamed from: m */
    public final long f8242m;

    /* renamed from: n */
    public final long f8243n;

    /* renamed from: o */
    public final int f8244o;

    /* renamed from: p */
    public final boolean f8245p;

    /* renamed from: q */
    public final boolean f8246q;

    /* renamed from: r */
    public final boolean f8247r;

    /* renamed from: s */
    public final String f8248s;

    /* renamed from: t */
    public final Boolean f8249t;

    /* renamed from: u */
    public final long f8250u;

    /* renamed from: v */
    public final List<String> f8251v;

    /* renamed from: w */
    public final String f8252w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C1057u.m7296b(str);
        this.f8231b = str;
        this.f8232c = TextUtils.isEmpty(str2) ? null : str2;
        this.f8233d = str3;
        this.f8240k = j;
        this.f8234e = str4;
        this.f8235f = j2;
        this.f8236g = j3;
        this.f8237h = str5;
        this.f8238i = z;
        this.f8239j = z2;
        this.f8241l = str6;
        this.f8242m = j4;
        this.f8243n = j5;
        this.f8244o = i;
        this.f8245p = z3;
        this.f8246q = z4;
        this.f8247r = z5;
        this.f8248s = str7;
        this.f8249t = bool;
        this.f8250u = j6;
        this.f8251v = list;
        this.f8252w = str8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f8231b = str;
        this.f8232c = str2;
        this.f8233d = str3;
        this.f8240k = j3;
        this.f8234e = str4;
        this.f8235f = j;
        this.f8236g = j2;
        this.f8237h = str5;
        this.f8238i = z;
        this.f8239j = z2;
        this.f8241l = str6;
        this.f8242m = j4;
        this.f8243n = j5;
        this.f8244o = i;
        this.f8245p = z3;
        this.f8246q = z4;
        this.f8247r = z5;
        this.f8248s = str7;
        this.f8249t = bool;
        this.f8250u = j6;
        this.f8251v = list;
        this.f8252w = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f8231b, false);
        C1053b.m7266a(parcel, 3, this.f8232c, false);
        C1053b.m7266a(parcel, 4, this.f8233d, false);
        C1053b.m7266a(parcel, 5, this.f8234e, false);
        C1053b.m7256a(parcel, 6, this.f8235f);
        C1053b.m7256a(parcel, 7, this.f8236g);
        C1053b.m7266a(parcel, 8, this.f8237h, false);
        C1053b.m7269a(parcel, 9, this.f8238i);
        C1053b.m7269a(parcel, 10, this.f8239j);
        C1053b.m7256a(parcel, 11, this.f8240k);
        C1053b.m7266a(parcel, 12, this.f8241l, false);
        C1053b.m7256a(parcel, 13, this.f8242m);
        C1053b.m7256a(parcel, 14, this.f8243n);
        C1053b.m7255a(parcel, 15, this.f8244o);
        C1053b.m7269a(parcel, 16, this.f8245p);
        C1053b.m7269a(parcel, 17, this.f8246q);
        C1053b.m7269a(parcel, 18, this.f8247r);
        C1053b.m7266a(parcel, 19, this.f8248s, false);
        C1053b.m7261a(parcel, 21, this.f8249t, false);
        C1053b.m7256a(parcel, 22, this.f8250u);
        C1053b.m7278c(parcel, 23, this.f8251v, false);
        C1053b.m7266a(parcel, 24, this.f8252w, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
