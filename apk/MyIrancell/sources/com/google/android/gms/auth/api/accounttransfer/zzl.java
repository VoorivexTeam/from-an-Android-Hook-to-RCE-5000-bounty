package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new C0805a();

    /* renamed from: g */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f5502g;

    /* renamed from: b */
    private final Set<Integer> f5503b;

    /* renamed from: c */
    private final int f5504c;

    /* renamed from: d */
    private ArrayList<zzr> f5505d;

    /* renamed from: e */
    private int f5506e;

    /* renamed from: f */
    private zzo f5507f;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f5502g = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m7327b("authenticatorData", 2, zzr.class));
        f5502g.put("progress", FastJsonResponse.Field.m7324a("progress", 4, zzo.class));
    }

    public zzl() {
        this.f5503b = new HashSet(1);
        this.f5504c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzoVar) {
        this.f5503b = set;
        this.f5504c = i;
        this.f5505d = arrayList;
        this.f5506e = i2;
        this.f5507f = zzoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final Object mo6353a(FastJsonResponse.Field field) {
        int m7334j = field.m7334j();
        if (m7334j == 1) {
            return Integer.valueOf(this.f5504c);
        }
        if (m7334j == 2) {
            return this.f5505d;
        }
        if (m7334j == 4) {
            return this.f5507f;
        }
        int m7334j2 = field.m7334j();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(m7334j2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final /* synthetic */ Map mo6354a() {
        return f5502g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public final boolean mo6355b(FastJsonResponse.Field field) {
        return this.f5503b.contains(Integer.valueOf(field.m7334j()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        Set<Integer> set = this.f5503b;
        if (set.contains(1)) {
            C1053b.m7255a(parcel, 1, this.f5504c);
        }
        if (set.contains(2)) {
            C1053b.m7279d(parcel, 2, this.f5505d, true);
        }
        if (set.contains(3)) {
            C1053b.m7255a(parcel, 3, this.f5506e);
        }
        if (set.contains(4)) {
            C1053b.m7260a(parcel, 4, (Parcelable) this.f5507f, i, true);
        }
        C1053b.m7251a(parcel, m7250a);
    }
}
