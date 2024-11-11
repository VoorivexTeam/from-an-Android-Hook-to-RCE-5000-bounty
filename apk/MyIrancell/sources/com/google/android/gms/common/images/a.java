package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
final class a {
    public final Uri a;

    public a(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return s.a(((a) obj).a, this.a);
    }

    public final int hashCode() {
        return s.a(this.a);
    }
}
