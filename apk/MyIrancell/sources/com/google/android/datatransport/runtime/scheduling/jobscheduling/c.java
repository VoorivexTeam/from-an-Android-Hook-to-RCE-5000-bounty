package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import defpackage.hk;
import defpackage.wn;
import java.util.Map;

/* loaded from: classes.dex */
final class c extends g {
    private final wn a;
    private final Map<hk, g.b> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(wn wnVar, Map<hk, g.b> map) {
        if (wnVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = wnVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    wn a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<hk, g.b> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a()) && this.b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
