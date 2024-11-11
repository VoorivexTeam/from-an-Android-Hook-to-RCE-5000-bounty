package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C0813a();

    /* renamed from: b */
    @Nonnull
    private final String f5534b;

    /* renamed from: c */
    private final String f5535c;

    /* renamed from: d */
    private final Uri f5536d;

    /* renamed from: e */
    @Nonnull
    private final List<IdToken> f5537e;

    /* renamed from: f */
    private final String f5538f;

    /* renamed from: g */
    private final String f5539g;

    /* renamed from: h */
    private final String f5540h;

    /* renamed from: i */
    private final String f5541i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        C1057u.m7287a(str, (Object) "credential identifier cannot be null");
        String trim = str.trim();
        C1057u.m7288a(trim, (Object) "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f5535c = str2;
        this.f5536d = uri;
        this.f5537e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f5534b = trim;
        this.f5538f = str3;
        this.f5539g = str4;
        this.f5540h = str5;
        this.f5541i = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f5534b, credential.f5534b) && TextUtils.equals(this.f5535c, credential.f5535c) && C1050s.m7205a(this.f5536d, credential.f5536d) && TextUtils.equals(this.f5538f, credential.f5538f) && TextUtils.equals(this.f5539g, credential.f5539g);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f5534b, this.f5535c, this.f5536d, this.f5538f, this.f5539g);
    }

    /* renamed from: j */
    public String m6356j() {
        return this.f5539g;
    }

    /* renamed from: k */
    public String m6357k() {
        return this.f5541i;
    }

    /* renamed from: l */
    public String m6358l() {
        return this.f5540h;
    }

    @Nonnull
    /* renamed from: m */
    public String m6359m() {
        return this.f5534b;
    }

    @Nonnull
    /* renamed from: n */
    public List<IdToken> m6360n() {
        return this.f5537e;
    }

    /* renamed from: o */
    public String m6361o() {
        return this.f5535c;
    }

    /* renamed from: p */
    public String m6362p() {
        return this.f5538f;
    }

    /* renamed from: q */
    public Uri m6363q() {
        return this.f5536d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m6359m(), false);
        C1053b.m7266a(parcel, 2, m6361o(), false);
        C1053b.m7260a(parcel, 3, (Parcelable) m6363q(), i, false);
        C1053b.m7279d(parcel, 4, m6360n(), false);
        C1053b.m7266a(parcel, 5, m6362p(), false);
        C1053b.m7266a(parcel, 6, m6356j(), false);
        C1053b.m7266a(parcel, 9, m6358l(), false);
        C1053b.m7266a(parcel, 10, m6357k(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
