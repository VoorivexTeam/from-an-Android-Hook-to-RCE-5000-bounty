package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class r extends UnsupportedOperationException {
    private final Feature b;

    public r(Feature feature) {
        this.b = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
