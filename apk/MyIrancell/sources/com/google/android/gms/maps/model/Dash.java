package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class Dash extends PatternItem {

    /* renamed from: d */
    public final float f7248d;

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        float f = this.f7248d;
        StringBuilder sb = new StringBuilder(30);
        sb.append("[Dash: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
