package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new C0807c();

    /* renamed from: h */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f5515h;

    /* renamed from: b */
    private final Set<Integer> f5516b;

    /* renamed from: c */
    private final int f5517c;

    /* renamed from: d */
    private zzt f5518d;

    /* renamed from: e */
    private String f5519e;

    /* renamed from: f */
    private String f5520f;

    /* renamed from: g */
    private String f5521g;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f5515h = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m7324a("authenticatorInfo", 2, zzt.class));
        f5515h.put("signature", FastJsonResponse.Field.m7328c("signature", 3));
        f5515h.put("package", FastJsonResponse.Field.m7328c("package", 4));
    }

    public zzr() {
        this.f5516b = new HashSet(3);
        this.f5517c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(Set<Integer> set, int i, zzt zztVar, String str, String str2, String str3) {
        this.f5516b = set;
        this.f5517c = i;
        this.f5518d = zztVar;
        this.f5519e = str;
        this.f5520f = str2;
        this.f5521g = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo6353a(FastJsonResponse.Field field) {
        int m7334j = field.m7334j();
        if (m7334j == 1) {
            return Integer.valueOf(this.f5517c);
        }
        if (m7334j == 2) {
            return this.f5518d;
        }
        if (m7334j == 3) {
            return this.f5519e;
        }
        if (m7334j == 4) {
            return this.f5520f;
        }
        int m7334j2 = field.m7334j();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(m7334j2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo6354a() {
        return f5515h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo6355b(FastJsonResponse.Field field) {
        return this.f5516b.contains(Integer.valueOf(field.m7334j()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        Set<Integer> set = this.f5516b;
        if (set.contains(1)) {
            C1053b.m7255a(parcel, 1, this.f5517c);
        }
        if (set.contains(2)) {
            C1053b.m7260a(parcel, 2, (Parcelable) this.f5518d, i, true);
        }
        if (set.contains(3)) {
            C1053b.m7266a(parcel, 3, this.f5519e, true);
        }
        if (set.contains(4)) {
            C1053b.m7266a(parcel, 4, this.f5520f, true);
        }
        if (set.contains(5)) {
            C1053b.m7266a(parcel, 5, this.f5521g, true);
        }
        C1053b.m7251a(parcel, m7250a);
    }
}
