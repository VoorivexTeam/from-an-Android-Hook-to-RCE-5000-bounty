package com.comviva.webaxn.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class RecorderData implements Parcelable {
    public static final Parcelable.Creator<RecorderData> CREATOR = new C0680a();

    /* renamed from: b */
    private int f4599b;

    /* renamed from: c */
    private String f4600c;

    /* renamed from: d */
    private String f4601d;

    /* renamed from: e */
    private String f4602e;

    /* renamed from: f */
    private String f4603f;

    /* renamed from: g */
    private String f4604g;

    /* renamed from: h */
    private String f4605h;

    /* renamed from: i */
    private String f4606i;

    /* renamed from: j */
    private String f4607j;

    /* renamed from: k */
    private String f4608k;

    /* renamed from: l */
    private String f4609l;

    /* renamed from: m */
    private String f4610m;

    /* renamed from: n */
    private String f4611n;

    /* renamed from: o */
    private String f4612o;

    /* renamed from: p */
    private String f4613p;

    /* renamed from: q */
    private String f4614q;

    /* renamed from: r */
    private String f4615r;

    /* renamed from: s */
    private String f4616s;

    /* renamed from: t */
    private String f4617t;

    /* renamed from: u */
    private String f4618u;

    /* renamed from: v */
    private String f4619v;

    /* renamed from: w */
    private String f4620w;

    /* renamed from: x */
    private String f4621x;

    /* renamed from: y */
    private String f4622y;

    /* renamed from: com.comviva.webaxn.utils.RecorderData$a */
    /* loaded from: classes.dex */
    static class C0680a implements Parcelable.Creator<RecorderData> {
        C0680a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecorderData createFromParcel(Parcel parcel) {
            return new RecorderData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecorderData[] newArray(int i) {
            return new RecorderData[i];
        }
    }

    public RecorderData() {
    }

    protected RecorderData(Parcel parcel) {
        this.f4599b = parcel.readInt();
        this.f4600c = parcel.readString();
        this.f4601d = parcel.readString();
        this.f4602e = parcel.readString();
        this.f4603f = parcel.readString();
        this.f4604g = parcel.readString();
        this.f4605h = parcel.readString();
        this.f4606i = parcel.readString();
        this.f4607j = parcel.readString();
        this.f4608k = parcel.readString();
        this.f4609l = parcel.readString();
        this.f4610m = parcel.readString();
        this.f4611n = parcel.readString();
        this.f4612o = parcel.readString();
        this.f4613p = parcel.readString();
        this.f4614q = parcel.readString();
        this.f4615r = parcel.readString();
        this.f4616s = parcel.readString();
        this.f4617t = parcel.readString();
        this.f4618u = parcel.readString();
        this.f4619v = parcel.readString();
        this.f4620w = parcel.readString();
        this.f4621x = parcel.readString();
        this.f4622y = parcel.readString();
    }

    /* renamed from: a */
    public String m5248a() {
        return this.f4600c;
    }

    /* renamed from: a */
    public void m5249a(int i) {
        this.f4599b = i;
    }

    /* renamed from: a */
    public void m5250a(String str) {
        this.f4600c = str;
    }

    /* renamed from: b */
    public String m5251b() {
        return this.f4605h;
    }

    /* renamed from: b */
    public void m5252b(String str) {
        this.f4605h = str;
    }

    /* renamed from: c */
    public String m5253c() {
        return this.f4609l;
    }

    /* renamed from: c */
    public void m5254c(String str) {
        this.f4609l = str;
    }

    /* renamed from: d */
    public String m5255d() {
        return this.f4607j;
    }

    /* renamed from: d */
    public void m5256d(String str) {
        this.f4607j = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m5257e() {
        return this.f4606i;
    }

    /* renamed from: e */
    public void m5258e(String str) {
        this.f4606i = str;
    }

    /* renamed from: f */
    public String m5259f() {
        return this.f4610m;
    }

    /* renamed from: f */
    public void m5260f(String str) {
        this.f4610m = str;
    }

    /* renamed from: g */
    public String m5261g() {
        return this.f4608k;
    }

    /* renamed from: g */
    public void m5262g(String str) {
        this.f4608k = str;
    }

    /* renamed from: h */
    public String m5263h() {
        return this.f4602e;
    }

    /* renamed from: h */
    public void m5264h(String str) {
        this.f4602e = str;
    }

    /* renamed from: i */
    public String m5265i() {
        return this.f4601d;
    }

    /* renamed from: i */
    public void m5266i(String str) {
        this.f4617t = str;
    }

    /* renamed from: j */
    public String m5267j() {
        return this.f4617t;
    }

    /* renamed from: j */
    public void m5268j(String str) {
        this.f4614q = str;
    }

    /* renamed from: k */
    public String m5269k() {
        return this.f4614q;
    }

    /* renamed from: k */
    public void m5270k(String str) {
        this.f4618u = str;
    }

    /* renamed from: l */
    public String m5271l() {
        return this.f4618u;
    }

    /* renamed from: l */
    public void m5272l(String str) {
        this.f4615r = str;
    }

    /* renamed from: m */
    public String m5273m() {
        return this.f4615r;
    }

    /* renamed from: m */
    public void m5274m(String str) {
        this.f4619v = str;
    }

    /* renamed from: n */
    public String m5275n() {
        return this.f4619v;
    }

    /* renamed from: n */
    public void m5276n(String str) {
        this.f4616s = str;
    }

    /* renamed from: o */
    public String m5277o() {
        return this.f4616s;
    }

    /* renamed from: o */
    public void m5278o(String str) {
        this.f4611n = str;
    }

    /* renamed from: p */
    public String m5279p() {
        return this.f4611n;
    }

    /* renamed from: p */
    public void m5280p(String str) {
        this.f4612o = str;
    }

    /* renamed from: q */
    public String m5281q() {
        return this.f4612o;
    }

    /* renamed from: q */
    public void m5282q(String str) {
        this.f4613p = str;
    }

    /* renamed from: r */
    public String m5283r() {
        return this.f4613p;
    }

    /* renamed from: r */
    public void m5284r(String str) {
        this.f4603f = str;
    }

    /* renamed from: s */
    public String m5285s() {
        return this.f4603f;
    }

    /* renamed from: s */
    public void m5286s(String str) {
        this.f4604g = str;
    }

    /* renamed from: t */
    public int m5287t() {
        return this.f4599b;
    }

    /* renamed from: t */
    public void m5288t(String str) {
        this.f4620w = str;
    }

    /* renamed from: u */
    public String m5289u() {
        return this.f4604g;
    }

    /* renamed from: u */
    public void m5290u(String str) {
        this.f4621x = str;
    }

    /* renamed from: v */
    public String m5291v() {
        return this.f4620w;
    }

    /* renamed from: v */
    public void m5292v(String str) {
        this.f4622y = str;
    }

    /* renamed from: w */
    public String m5293w() {
        return this.f4621x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4599b);
        parcel.writeString(this.f4600c);
        parcel.writeString(this.f4601d);
        parcel.writeString(this.f4602e);
        parcel.writeString(this.f4603f);
        parcel.writeString(this.f4604g);
        parcel.writeString(this.f4605h);
        parcel.writeString(this.f4606i);
        parcel.writeString(this.f4607j);
        parcel.writeString(this.f4608k);
        parcel.writeString(this.f4609l);
        parcel.writeString(this.f4610m);
        parcel.writeString(this.f4611n);
        parcel.writeString(this.f4612o);
        parcel.writeString(this.f4613p);
        parcel.writeString(this.f4614q);
        parcel.writeString(this.f4615r);
        parcel.writeString(this.f4616s);
        parcel.writeString(this.f4617t);
        parcel.writeString(this.f4618u);
        parcel.writeString(this.f4619v);
        parcel.writeString(this.f4620w);
        parcel.writeString(this.f4621x);
        parcel.writeString(this.f4622y);
    }

    /* renamed from: x */
    public String m5294x() {
        return this.f4622y;
    }
}
