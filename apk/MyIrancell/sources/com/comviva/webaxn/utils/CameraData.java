package com.comviva.webaxn.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class CameraData implements Parcelable {
    public static final Parcelable.Creator<CameraData> CREATOR = new C0678a();

    /* renamed from: b */
    private String f4561b;

    /* renamed from: c */
    private String f4562c;

    /* renamed from: d */
    private String f4563d;

    /* renamed from: e */
    private String f4564e;

    /* renamed from: f */
    private String f4565f;

    /* renamed from: g */
    private String f4566g;

    /* renamed from: h */
    private String f4567h;

    /* renamed from: i */
    private String f4568i;

    /* renamed from: j */
    private String f4569j;

    /* renamed from: k */
    private String f4570k;

    /* renamed from: l */
    private String f4571l;

    /* renamed from: m */
    private String f4572m;

    /* renamed from: n */
    private String f4573n;

    /* renamed from: o */
    private String f4574o;

    /* renamed from: p */
    private String f4575p;

    /* renamed from: q */
    private String f4576q;

    /* renamed from: com.comviva.webaxn.utils.CameraData$a */
    /* loaded from: classes.dex */
    static class C0678a implements Parcelable.Creator<CameraData> {
        C0678a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraData createFromParcel(Parcel parcel) {
            return new CameraData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraData[] newArray(int i) {
            return new CameraData[i];
        }
    }

    public CameraData() {
    }

    protected CameraData(Parcel parcel) {
        this.f4575p = parcel.readString();
        this.f4561b = parcel.readString();
        this.f4562c = parcel.readString();
        this.f4563d = parcel.readString();
        this.f4564e = parcel.readString();
        this.f4565f = parcel.readString();
        this.f4566g = parcel.readString();
        this.f4567h = parcel.readString();
        this.f4568i = parcel.readString();
        this.f4569j = parcel.readString();
        this.f4570k = parcel.readString();
        this.f4571l = parcel.readString();
        this.f4572m = parcel.readString();
        this.f4573n = parcel.readString();
        this.f4574o = parcel.readString();
        this.f4576q = parcel.readString();
    }

    /* renamed from: a */
    public String m5188a() {
        return this.f4575p;
    }

    /* renamed from: a */
    public void m5189a(String str) {
        this.f4575p = str;
    }

    /* renamed from: b */
    public String m5190b() {
        return this.f4574o;
    }

    /* renamed from: b */
    public void m5191b(String str) {
        this.f4574o = str;
    }

    /* renamed from: c */
    public String m5192c() {
        return this.f4561b;
    }

    /* renamed from: c */
    public void m5193c(String str) {
        this.f4561b = str;
    }

    /* renamed from: d */
    public String m5194d() {
        return this.f4567h;
    }

    /* renamed from: d */
    public void m5195d(String str) {
        this.f4567h = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m5196e() {
        return this.f4564e;
    }

    /* renamed from: e */
    public void m5197e(String str) {
        this.f4564e = str;
    }

    /* renamed from: f */
    public String m5198f() {
        return this.f4562c;
    }

    /* renamed from: f */
    public void m5199f(String str) {
        this.f4562c = str;
    }

    /* renamed from: g */
    public String m5200g() {
        return this.f4568i;
    }

    /* renamed from: g */
    public void m5201g(String str) {
        this.f4568i = str;
    }

    /* renamed from: h */
    public String m5202h() {
        return this.f4565f;
    }

    /* renamed from: h */
    public void m5203h(String str) {
        this.f4565f = str;
    }

    /* renamed from: i */
    public String m5204i() {
        return this.f4563d;
    }

    /* renamed from: i */
    public void m5205i(String str) {
        this.f4563d = str;
    }

    /* renamed from: j */
    public String m5206j() {
        return this.f4569j;
    }

    /* renamed from: j */
    public void m5207j(String str) {
        this.f4569j = str;
    }

    /* renamed from: k */
    public String m5208k() {
        return this.f4566g;
    }

    /* renamed from: k */
    public void m5209k(String str) {
        this.f4566g = str;
    }

    /* renamed from: l */
    public String m5210l() {
        return this.f4576q;
    }

    /* renamed from: l */
    public void m5211l(String str) {
        this.f4576q = str;
    }

    /* renamed from: m */
    public String m5212m() {
        return this.f4573n;
    }

    /* renamed from: m */
    public void m5213m(String str) {
        this.f4573n = str;
    }

    /* renamed from: n */
    public String m5214n() {
        return this.f4572m;
    }

    /* renamed from: n */
    public void m5215n(String str) {
        this.f4572m = str;
    }

    /* renamed from: o */
    public String m5216o() {
        return this.f4571l;
    }

    /* renamed from: o */
    public void m5217o(String str) {
        this.f4571l = str;
    }

    /* renamed from: p */
    public String m5218p() {
        return this.f4570k;
    }

    /* renamed from: p */
    public void m5219p(String str) {
        this.f4570k = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4575p);
        parcel.writeString(this.f4561b);
        parcel.writeString(this.f4562c);
        parcel.writeString(this.f4563d);
        parcel.writeString(this.f4564e);
        parcel.writeString(this.f4565f);
        parcel.writeString(this.f4566g);
        parcel.writeString(this.f4567h);
        parcel.writeString(this.f4568i);
        parcel.writeString(this.f4569j);
        parcel.writeString(this.f4570k);
        parcel.writeString(this.f4571l);
        parcel.writeString(this.f4572m);
        parcel.writeString(this.f4573n);
        parcel.writeString(this.f4574o);
        parcel.writeString(this.f4576q);
    }
}
