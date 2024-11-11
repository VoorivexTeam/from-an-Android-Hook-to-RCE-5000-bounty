package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000.C2366d0;

/* loaded from: classes.dex */
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new C0808d();

    /* renamed from: i */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f5522i;

    /* renamed from: b */
    private final Set<Integer> f5523b;

    /* renamed from: c */
    private final int f5524c;

    /* renamed from: d */
    private String f5525d;

    /* renamed from: e */
    private int f5526e;

    /* renamed from: f */
    private byte[] f5527f;

    /* renamed from: g */
    private PendingIntent f5528g;

    /* renamed from: h */
    private DeviceMetaData f5529h;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f5522i = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m7328c("accountType", 2));
        f5522i.put("status", FastJsonResponse.Field.m7326b("status", 3));
        f5522i.put("transferBytes", FastJsonResponse.Field.m7323a("transferBytes", 4));
    }

    public zzt() {
        this.f5523b = new C2366d0(3);
        this.f5524c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f5523b = set;
        this.f5524c = i;
        this.f5525d = str;
        this.f5526e = i2;
        this.f5527f = bArr;
        this.f5528g = pendingIntent;
        this.f5529h = deviceMetaData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo6353a(FastJsonResponse.Field field) {
        int i;
        int m7334j = field.m7334j();
        if (m7334j == 1) {
            i = this.f5524c;
        } else {
            if (m7334j == 2) {
                return this.f5525d;
            }
            if (m7334j != 3) {
                if (m7334j == 4) {
                    return this.f5527f;
                }
                int m7334j2 = field.m7334j();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(m7334j2);
                throw new IllegalStateException(sb.toString());
            }
            i = this.f5526e;
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo6354a() {
        return f5522i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo6355b(FastJsonResponse.Field field) {
        return this.f5523b.contains(Integer.valueOf(field.m7334j()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        Set<Integer> set = this.f5523b;
        if (set.contains(1)) {
            C1053b.m7255a(parcel, 1, this.f5524c);
        }
        if (set.contains(2)) {
            C1053b.m7266a(parcel, 2, this.f5525d, true);
        }
        if (set.contains(3)) {
            C1053b.m7255a(parcel, 3, this.f5526e);
        }
        if (set.contains(4)) {
            C1053b.m7270a(parcel, 4, this.f5527f, true);
        }
        if (set.contains(5)) {
            C1053b.m7260a(parcel, 5, (Parcelable) this.f5528g, i, true);
        }
        if (set.contains(6)) {
            C1053b.m7260a(parcel, 6, (Parcelable) this.f5529h, i, true);
        }
        C1053b.m7251a(parcel, m7250a);
    }
}
