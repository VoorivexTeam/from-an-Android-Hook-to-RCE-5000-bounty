package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR;

    /* renamed from: b */
    private final String f7166b;

    /* renamed from: c */
    private final String f7167c;

    /* renamed from: d */
    private final String f7168d;

    /* renamed from: e */
    private final String f7169e;

    /* renamed from: f */
    private final int f7170f;

    /* renamed from: g */
    private final int f7171g;

    static {
        new zzau("com.google.android.gms", Locale.getDefault(), null);
        CREATOR = new C1615f();
    }

    public zzau(String str, String str2, String str3, String str4, int i, int i2) {
        this.f7166b = str;
        this.f7167c = str2;
        this.f7168d = str3;
        this.f7169e = str4;
        this.f7170f = i;
        this.f7171g = i2;
    }

    private zzau(String str, Locale locale, String str2) {
        this(str, m8992a(locale), null, null, C0993c.f6046f, 0);
    }

    /* renamed from: a */
    private static String m8992a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        String language = locale.getLanguage();
        String str = "";
        if (language == null) {
            language = "";
        }
        String country = locale.getCountry();
        if (country == null) {
            country = "";
        }
        String valueOf = String.valueOf(language);
        if (country.length() > 0) {
            String valueOf2 = String.valueOf(country);
            str = valueOf2.length() != 0 ? "-".concat(valueOf2) : new String("-");
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzau)) {
            zzau zzauVar = (zzau) obj;
            if (this.f7170f == zzauVar.f7170f && this.f7171g == zzauVar.f7171g && this.f7167c.equals(zzauVar.f7167c) && this.f7166b.equals(zzauVar.f7166b) && C1050s.m7205a(this.f7168d, zzauVar.f7168d) && C1050s.m7205a(this.f7169e, zzauVar.f7169e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7166b, this.f7167c, this.f7168d, this.f7169e, Integer.valueOf(this.f7170f), Integer.valueOf(this.f7171g));
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("clientPackageName", this.f7166b);
        m7204a.m7206a("locale", this.f7167c);
        m7204a.m7206a("accountName", this.f7168d);
        m7204a.m7206a("gCoreClientName", this.f7169e);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7166b, false);
        C1053b.m7266a(parcel, 2, this.f7167c, false);
        C1053b.m7266a(parcel, 3, this.f7168d, false);
        C1053b.m7266a(parcel, 4, this.f7169e, false);
        C1053b.m7255a(parcel, 6, this.f7170f);
        C1053b.m7255a(parcel, 7, this.f7171g);
        C1053b.m7251a(parcel, m7250a);
    }
}
