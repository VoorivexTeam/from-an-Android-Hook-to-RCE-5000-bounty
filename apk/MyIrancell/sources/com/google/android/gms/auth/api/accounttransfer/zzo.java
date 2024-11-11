package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p000.C0500c0;

/* loaded from: classes.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new C0806b();

    /* renamed from: h */
    private static final C0500c0<String, FastJsonResponse.Field<?, ?>> f5508h;

    /* renamed from: b */
    private final int f5509b;

    /* renamed from: c */
    private List<String> f5510c;

    /* renamed from: d */
    private List<String> f5511d;

    /* renamed from: e */
    private List<String> f5512e;

    /* renamed from: f */
    private List<String> f5513f;

    /* renamed from: g */
    private List<String> f5514g;

    static {
        C0500c0<String, FastJsonResponse.Field<?, ?>> c0500c0 = new C0500c0<>();
        f5508h = c0500c0;
        c0500c0.put("registered", FastJsonResponse.Field.m7329d("registered", 2));
        f5508h.put("in_progress", FastJsonResponse.Field.m7329d("in_progress", 3));
        f5508h.put("success", FastJsonResponse.Field.m7329d("success", 4));
        f5508h.put("failed", FastJsonResponse.Field.m7329d("failed", 5));
        f5508h.put("escrowed", FastJsonResponse.Field.m7329d("escrowed", 6));
    }

    public zzo() {
        this.f5509b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f5509b = i;
        this.f5510c = list;
        this.f5511d = list2;
        this.f5512e = list3;
        this.f5513f = list4;
        this.f5514g = list5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo6353a(FastJsonResponse.Field field) {
        switch (field.m7334j()) {
            case 1:
                return Integer.valueOf(this.f5509b);
            case 2:
                return this.f5510c;
            case 3:
                return this.f5511d;
            case 4:
                return this.f5512e;
            case 5:
                return this.f5513f;
            case 6:
                return this.f5514g;
            default:
                int m7334j = field.m7334j();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(m7334j);
                throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo6354a() {
        return f5508h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo6355b(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5509b);
        C1053b.m7278c(parcel, 2, this.f5510c, false);
        C1053b.m7278c(parcel, 3, this.f5511d, false);
        C1053b.m7278c(parcel, 4, this.f5512e, false);
        C1053b.m7278c(parcel, 5, this.f5513f, false);
        C1053b.m7278c(parcel, 6, this.f5514g, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
