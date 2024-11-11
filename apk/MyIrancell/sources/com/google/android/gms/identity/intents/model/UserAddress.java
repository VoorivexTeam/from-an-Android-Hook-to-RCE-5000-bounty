package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C1138b();

    /* renamed from: b */
    private String f6394b;

    /* renamed from: c */
    private String f6395c;

    /* renamed from: d */
    private String f6396d;

    /* renamed from: e */
    private String f6397e;

    /* renamed from: f */
    private String f6398f;

    /* renamed from: g */
    private String f6399g;

    /* renamed from: h */
    private String f6400h;

    /* renamed from: i */
    private String f6401i;

    /* renamed from: j */
    private String f6402j;

    /* renamed from: k */
    private String f6403k;

    /* renamed from: l */
    private String f6404l;

    /* renamed from: m */
    private String f6405m;

    /* renamed from: n */
    private boolean f6406n;

    /* renamed from: o */
    private String f6407o;

    /* renamed from: p */
    private String f6408p;

    UserAddress() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f6394b = str;
        this.f6395c = str2;
        this.f6396d = str3;
        this.f6397e = str4;
        this.f6398f = str5;
        this.f6399g = str6;
        this.f6400h = str7;
        this.f6401i = str8;
        this.f6402j = str9;
        this.f6403k = str10;
        this.f6404l = str11;
        this.f6405m = str12;
        this.f6406n = z;
        this.f6407o = str13;
        this.f6408p = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f6394b, false);
        C1053b.m7266a(parcel, 3, this.f6395c, false);
        C1053b.m7266a(parcel, 4, this.f6396d, false);
        C1053b.m7266a(parcel, 5, this.f6397e, false);
        C1053b.m7266a(parcel, 6, this.f6398f, false);
        C1053b.m7266a(parcel, 7, this.f6399g, false);
        C1053b.m7266a(parcel, 8, this.f6400h, false);
        C1053b.m7266a(parcel, 9, this.f6401i, false);
        C1053b.m7266a(parcel, 10, this.f6402j, false);
        C1053b.m7266a(parcel, 11, this.f6403k, false);
        C1053b.m7266a(parcel, 12, this.f6404l, false);
        C1053b.m7266a(parcel, 13, this.f6405m, false);
        C1053b.m7269a(parcel, 14, this.f6406n);
        C1053b.m7266a(parcel, 15, this.f6407o, false);
        C1053b.m7266a(parcel, 16, this.f6408p, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
