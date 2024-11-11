package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: j */
    public abstract int mo7344j();

    /* renamed from: k */
    public abstract long mo7345k();

    /* renamed from: l */
    public abstract long mo7346l();

    /* renamed from: m */
    public abstract String mo7347m();

    public String toString() {
        long mo7345k = mo7345k();
        int mo7344j = mo7344j();
        long mo7346l = mo7346l();
        String mo7347m = mo7347m();
        StringBuilder sb = new StringBuilder(String.valueOf(mo7347m).length() + 53);
        sb.append(mo7345k);
        sb.append("\t");
        sb.append(mo7344j);
        sb.append("\t");
        sb.append(mo7346l);
        sb.append(mo7347m);
        return sb.toString();
    }
}
