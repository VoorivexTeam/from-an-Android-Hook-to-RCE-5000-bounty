package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new C1086d();

    /* renamed from: b */
    private final int f6321b;

    /* renamed from: c */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f6322c;

    /* renamed from: d */
    private final String f6323d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaj(int i, ArrayList<zam> arrayList, String str) {
        this.f6321b = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zam zamVar = arrayList.get(i2);
            String str2 = zamVar.f6328c;
            HashMap hashMap2 = new HashMap();
            int size2 = zamVar.f6329d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zal zalVar = zamVar.f6329d.get(i3);
                hashMap2.put(zalVar.f6325c, zalVar.f6326d);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f6322c = hashMap;
        C1057u.m7286a(str);
        this.f6323d = str;
        m7342j();
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> m7341a(String str) {
        return this.f6322c.get(str);
    }

    /* renamed from: j */
    public final void m7342j() {
        Iterator<String> it = this.f6322c.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f6322c.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).m7333a(this);
            }
        }
    }

    /* renamed from: k */
    public final String m7343k() {
        return this.f6323d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f6322c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f6322c.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6321b);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f6322c.keySet()) {
            arrayList.add(new zam(str, this.f6322c.get(str)));
        }
        C1053b.m7279d(parcel, 2, arrayList, false);
        C1053b.m7266a(parcel, 3, this.f6323d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
