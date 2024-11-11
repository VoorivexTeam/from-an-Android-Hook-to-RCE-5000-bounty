package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C1092e();

    /* renamed from: b */
    private final int f6330b;

    /* renamed from: c */
    private final long f6331c;

    /* renamed from: d */
    private int f6332d;

    /* renamed from: e */
    private final String f6333e;

    /* renamed from: f */
    private final String f6334f;

    /* renamed from: g */
    private final String f6335g;

    /* renamed from: h */
    private final int f6336h;

    /* renamed from: i */
    private final List<String> f6337i;

    /* renamed from: j */
    private final String f6338j;

    /* renamed from: k */
    private final long f6339k;

    /* renamed from: l */
    private int f6340l;

    /* renamed from: m */
    private final String f6341m;

    /* renamed from: n */
    private final float f6342n;

    /* renamed from: o */
    private final long f6343o;

    /* renamed from: p */
    private final boolean f6344p;

    /* renamed from: q */
    private long f6345q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f6330b = i;
        this.f6331c = j;
        this.f6332d = i2;
        this.f6333e = str;
        this.f6334f = str3;
        this.f6335g = str5;
        this.f6336h = i3;
        this.f6345q = -1L;
        this.f6337i = list;
        this.f6338j = str2;
        this.f6339k = j2;
        this.f6340l = i4;
        this.f6341m = str4;
        this.f6342n = f;
        this.f6343o = j3;
        this.f6344p = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: j */
    public final int mo7344j() {
        return this.f6332d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: k */
    public final long mo7345k() {
        return this.f6331c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: l */
    public final long mo7346l() {
        return this.f6345q;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: m */
    public final String mo7347m() {
        String str = this.f6333e;
        int i = this.f6336h;
        List<String> list = this.f6337i;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.f6340l;
        String str2 = this.f6334f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f6341m;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.f6342n;
        String str4 = this.f6335g;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.f6344p;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str5).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6330b);
        C1053b.m7256a(parcel, 2, mo7345k());
        C1053b.m7266a(parcel, 4, this.f6333e, false);
        C1053b.m7255a(parcel, 5, this.f6336h);
        C1053b.m7278c(parcel, 6, this.f6337i, false);
        C1053b.m7256a(parcel, 8, this.f6339k);
        C1053b.m7266a(parcel, 10, this.f6334f, false);
        C1053b.m7255a(parcel, 11, mo7344j());
        C1053b.m7266a(parcel, 12, this.f6338j, false);
        C1053b.m7266a(parcel, 13, this.f6341m, false);
        C1053b.m7255a(parcel, 14, this.f6340l);
        C1053b.m7254a(parcel, 15, this.f6342n);
        C1053b.m7256a(parcel, 16, this.f6343o);
        C1053b.m7266a(parcel, 17, this.f6335g, false);
        C1053b.m7269a(parcel, 18, this.f6344p);
        C1053b.m7251a(parcel, m7250a);
    }
}
