package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.r */
/* loaded from: classes.dex */
public final class C0987r extends UnsupportedOperationException {

    /* renamed from: b */
    private final Feature f6041b;

    public C0987r(Feature feature) {
        this.f6041b = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.f6041b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
