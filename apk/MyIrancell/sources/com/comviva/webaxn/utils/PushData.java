package com.comviva.webaxn.utils;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class PushData implements Parcelable {
    public static final Parcelable.Creator<PushData> CREATOR = new C0679a();

    /* renamed from: b */
    private String f4586b;

    /* renamed from: c */
    private int f4587c;

    /* renamed from: d */
    private String f4588d;

    /* renamed from: e */
    private String f4589e;

    /* renamed from: f */
    private String f4590f;

    /* renamed from: g */
    private String f4591g;

    /* renamed from: h */
    private String f4592h;

    /* renamed from: i */
    private String f4593i;

    /* renamed from: j */
    private String f4594j;

    /* renamed from: k */
    private String f4595k;

    /* renamed from: l */
    private String f4596l;

    /* renamed from: m */
    private String f4597m;

    /* renamed from: n */
    private Bitmap f4598n;

    /* renamed from: com.comviva.webaxn.utils.PushData$a */
    /* loaded from: classes.dex */
    static class C0679a implements Parcelable.Creator<PushData> {
        C0679a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushData createFromParcel(Parcel parcel) {
            return new PushData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushData[] newArray(int i) {
            return new PushData[i];
        }
    }

    public PushData() {
    }

    protected PushData(Parcel parcel) {
        this.f4586b = parcel.readString();
        this.f4587c = parcel.readInt();
        this.f4588d = parcel.readString();
        this.f4589e = parcel.readString();
        this.f4590f = parcel.readString();
        this.f4591g = parcel.readString();
        this.f4592h = parcel.readString();
        this.f4593i = parcel.readString();
        this.f4594j = parcel.readString();
        this.f4595k = parcel.readString();
        this.f4596l = parcel.readString();
        this.f4597m = parcel.readString();
    }

    /* renamed from: a */
    public String m5222a() {
        return this.f4595k;
    }

    /* renamed from: a */
    public void m5223a(int i) {
        this.f4587c = i;
    }

    /* renamed from: a */
    public void m5224a(Bitmap bitmap) {
        this.f4598n = bitmap;
    }

    /* renamed from: a */
    public void m5225a(String str) {
        this.f4595k = str;
    }

    /* renamed from: b */
    public String m5226b() {
        return this.f4596l;
    }

    /* renamed from: b */
    public void m5227b(String str) {
        this.f4596l = str;
    }

    /* renamed from: c */
    public String m5228c() {
        return this.f4590f;
    }

    /* renamed from: c */
    public void m5229c(String str) {
        this.f4590f = str;
    }

    /* renamed from: d */
    public Bitmap m5230d() {
        return this.f4598n;
    }

    /* renamed from: d */
    public void m5231d(String str) {
        this.f4597m = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m5232e() {
        return this.f4597m;
    }

    /* renamed from: e */
    public void m5233e(String str) {
        this.f4591g = str;
    }

    /* renamed from: f */
    public String m5234f() {
        return this.f4591g;
    }

    /* renamed from: f */
    public void m5235f(String str) {
        this.f4593i = str;
    }

    /* renamed from: g */
    public String m5236g() {
        return this.f4593i;
    }

    /* renamed from: g */
    public void m5237g(String str) {
        this.f4586b = str;
    }

    /* renamed from: h */
    public int m5238h() {
        return this.f4587c;
    }

    /* renamed from: h */
    public void m5239h(String str) {
        this.f4592h = str;
    }

    /* renamed from: i */
    public String m5240i() {
        return this.f4586b;
    }

    /* renamed from: i */
    public void m5241i(String str) {
        this.f4594j = str;
    }

    /* renamed from: j */
    public String m5242j() {
        return this.f4592h;
    }

    /* renamed from: j */
    public void m5243j(String str) {
        this.f4589e = str;
    }

    /* renamed from: k */
    public String m5244k() {
        return this.f4594j;
    }

    /* renamed from: k */
    public void m5245k(String str) {
        this.f4588d = str;
    }

    /* renamed from: l */
    public String m5246l() {
        return this.f4589e;
    }

    /* renamed from: m */
    public String m5247m() {
        return this.f4588d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4586b);
        parcel.writeInt(this.f4587c);
        parcel.writeString(this.f4588d);
        parcel.writeString(this.f4589e);
        parcel.writeString(this.f4590f);
        parcel.writeString(this.f4591g);
        parcel.writeString(this.f4592h);
        parcel.writeString(this.f4593i);
        parcel.writeString(this.f4594j);
        parcel.writeString(this.f4595k);
        parcel.writeString(this.f4596l);
        parcel.writeString(this.f4597m);
    }
}
