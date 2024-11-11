package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class CustomCap extends Cap {

    /* renamed from: e */
    public final C1635a f7246e;

    /* renamed from: f */
    public final float f7247f;

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        String valueOf = String.valueOf(this.f7246e);
        float f = this.f7247f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
