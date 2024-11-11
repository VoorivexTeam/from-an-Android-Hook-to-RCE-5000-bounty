package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes.dex */
final class j3 implements Comparator<h3> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(h3 h3Var, h3 h3Var2) {
        int b;
        int b2;
        h3 h3Var3 = h3Var;
        h3 h3Var4 = h3Var2;
        m3 m3Var = (m3) h3Var3.iterator();
        m3 m3Var2 = (m3) h3Var4.iterator();
        while (m3Var.hasNext() && m3Var2.hasNext()) {
            b = h3.b(m3Var.zza());
            b2 = h3.b(m3Var2.zza());
            int compare = Integer.compare(b, b2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(h3Var3.zza(), h3Var4.zza());
    }
}
