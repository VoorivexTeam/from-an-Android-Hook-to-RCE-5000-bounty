package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C1013c();

    /* renamed from: b */
    private final int f6103b;

    /* renamed from: c */
    private final Uri f6104c;

    /* renamed from: d */
    private final int f6105d;

    /* renamed from: e */
    private final int f6106e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f6103b = i;
        this.f6104c = uri;
        this.f6105d = i2;
        this.f6106e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C1050s.m7205a(this.f6104c, webImage.f6104c) && this.f6105d == webImage.f6105d && this.f6106e == webImage.f6106e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f6104c, Integer.valueOf(this.f6105d), Integer.valueOf(this.f6106e));
    }

    /* renamed from: j */
    public final int m7025j() {
        return this.f6106e;
    }

    /* renamed from: k */
    public final Uri m7026k() {
        return this.f6104c;
    }

    /* renamed from: l */
    public final int m7027l() {
        return this.f6105d;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f6105d), Integer.valueOf(this.f6106e), this.f6104c.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6103b);
        C1053b.m7260a(parcel, 2, (Parcelable) m7026k(), i, false);
        C1053b.m7255a(parcel, 3, m7027l());
        C1053b.m7255a(parcel, 4, m7025j());
        C1053b.m7251a(parcel, m7250a);
    }
}
