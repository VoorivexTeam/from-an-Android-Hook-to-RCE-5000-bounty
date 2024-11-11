package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.InterfaceC1082a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C1081c();

    /* renamed from: b */
    private final int f6295b;

    /* renamed from: c */
    private final HashMap<String, Integer> f6296c;

    /* renamed from: d */
    private final SparseArray<String> f6297d;

    /* loaded from: classes.dex */
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new C1080b();

        /* renamed from: b */
        private final int f6298b;

        /* renamed from: c */
        final String f6299c;

        /* renamed from: d */
        final int f6300d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zaa(int i, String str, int i2) {
            this.f6298b = i;
            this.f6299c = str;
            this.f6300d = i2;
        }

        zaa(String str, int i) {
            this.f6298b = 1;
            this.f6299c = str;
            this.f6300d = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m7250a = C1053b.m7250a(parcel);
            C1053b.m7255a(parcel, 1, this.f6298b);
            C1053b.m7266a(parcel, 2, this.f6299c, false);
            C1053b.m7255a(parcel, 3, this.f6300d);
            C1053b.m7251a(parcel, m7250a);
        }
    }

    public StringToIntConverter() {
        this.f6295b = 1;
        this.f6296c = new HashMap<>();
        this.f6297d = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f6295b = i;
        this.f6296c = new HashMap<>();
        this.f6297d = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaaVar = arrayList.get(i2);
            i2++;
            zaa zaaVar2 = zaaVar;
            m7315a(zaaVar2.f6299c, zaaVar2.f6300d);
        }
    }

    /* renamed from: a */
    public final StringToIntConverter m7315a(String str, int i) {
        this.f6296c.put(str, Integer.valueOf(i));
        this.f6297d.put(i, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.InterfaceC1082a
    /* renamed from: a */
    public final /* synthetic */ String mo7316a(Integer num) {
        String str = this.f6297d.get(num.intValue());
        return (str == null && this.f6296c.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6295b);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f6296c.keySet()) {
            arrayList.add(new zaa(str, this.f6296c.get(str).intValue()));
        }
        C1053b.m7279d(parcel, 2, arrayList, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
