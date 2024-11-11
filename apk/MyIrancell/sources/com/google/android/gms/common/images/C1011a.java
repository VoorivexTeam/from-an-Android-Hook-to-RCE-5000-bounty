package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C1050s;

/* renamed from: com.google.android.gms.common.images.a */
/* loaded from: classes.dex */
final class C1011a {

    /* renamed from: a */
    public final Uri f6107a;

    public C1011a(Uri uri) {
        this.f6107a = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1011a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C1050s.m7205a(((C1011a) obj).f6107a, this.f6107a);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f6107a);
    }
}
