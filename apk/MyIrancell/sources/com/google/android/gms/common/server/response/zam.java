package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C1085c();

    /* renamed from: b */
    private final int f6327b;

    /* renamed from: c */
    final String f6328c;

    /* renamed from: d */
    final ArrayList<zal> f6329d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(int i, String str, ArrayList<zal> arrayList) {
        this.f6327b = i;
        this.f6328c = str;
        this.f6329d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zal> arrayList;
        this.f6327b = 1;
        this.f6328c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zal(str2, map.get(str2)));
            }
        }
        this.f6329d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6327b);
        C1053b.m7266a(parcel, 2, this.f6328c, false);
        C1053b.m7279d(parcel, 3, this.f6329d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
