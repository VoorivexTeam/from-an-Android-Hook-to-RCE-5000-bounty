package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

/* loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C0857d();

    /* renamed from: b */
    private final int f5483b;

    /* renamed from: c */
    private final String f5484c;

    /* renamed from: d */
    private final Long f5485d;

    /* renamed from: e */
    private final boolean f5486e;

    /* renamed from: f */
    private final boolean f5487f;

    /* renamed from: g */
    private final List<String> f5488g;

    /* renamed from: h */
    private final String f5489h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f5483b = i;
        C1057u.m7296b(str);
        this.f5484c = str;
        this.f5485d = l;
        this.f5486e = z;
        this.f5487f = z2;
        this.f5488g = list;
        this.f5489h = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f5484c, tokenData.f5484c) && C1050s.m7205a(this.f5485d, tokenData.f5485d) && this.f5486e == tokenData.f5486e && this.f5487f == tokenData.f5487f && C1050s.m7205a(this.f5488g, tokenData.f5488g) && C1050s.m7205a(this.f5489h, tokenData.f5489h);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f5484c, this.f5485d, Boolean.valueOf(this.f5486e), Boolean.valueOf(this.f5487f), this.f5488g, this.f5489h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5483b);
        C1053b.m7266a(parcel, 2, this.f5484c, false);
        C1053b.m7265a(parcel, 3, this.f5485d, false);
        C1053b.m7269a(parcel, 4, this.f5486e);
        C1053b.m7269a(parcel, 5, this.f5487f);
        C1053b.m7278c(parcel, 6, this.f5488g, false);
        C1053b.m7266a(parcel, 7, this.f5489h, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
