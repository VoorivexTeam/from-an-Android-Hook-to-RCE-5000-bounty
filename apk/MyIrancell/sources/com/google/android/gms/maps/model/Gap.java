package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class Gap extends PatternItem {

    /* renamed from: d */
    public final float f7249d;

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        float f = this.f7249d;
        StringBuilder sb = new StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
