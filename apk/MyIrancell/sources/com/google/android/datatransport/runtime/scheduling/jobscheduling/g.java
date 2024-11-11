package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import defpackage.hk;
import defpackage.wn;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static class a {
        private wn a;
        private Map<hk, b> b = new HashMap();

        public a a(hk hkVar, b bVar) {
            this.b.put(hkVar, bVar);
            return this;
        }

        public a a(wn wnVar) {
            this.a = wnVar;
            return this;
        }

        public g a() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < hk.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<hk, b> map = this.b;
            this.b = new HashMap();
            return g.a(this.a, map);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract a a(long j);

            public abstract a a(Set<c> set);

            public abstract b a();

            public abstract a b(long j);
        }

        public static a d() {
            d.b bVar = new d.b();
            bVar.a(Collections.emptySet());
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long c();
    }

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static g a(wn wnVar) {
        a c2 = c();
        hk hkVar = hk.DEFAULT;
        b.a d = b.d();
        d.a(30000L);
        d.b(86400000L);
        c2.a(hkVar, d.a());
        hk hkVar2 = hk.HIGHEST;
        b.a d2 = b.d();
        d2.a(1000L);
        d2.b(86400000L);
        c2.a(hkVar2, d2.a());
        hk hkVar3 = hk.VERY_LOW;
        b.a d3 = b.d();
        d3.a(86400000L);
        d3.b(86400000L);
        d3.a(a(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        c2.a(hkVar3, d3.a());
        c2.a(wnVar);
        return c2.a();
    }

    static g a(wn wnVar, Map<hk, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(wnVar, map);
    }

    private static <T> Set<T> a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void a(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static a c() {
        return new a();
    }

    public long a(hk hkVar, long j, int i) {
        long a2 = j - a().a();
        b bVar = b().get(hkVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, i - 1)) * bVar.a(), a2), bVar.c());
    }

    public JobInfo.Builder a(JobInfo.Builder builder, hk hkVar, long j, int i) {
        builder.setMinimumLatency(a(hkVar, j, i));
        a(builder, b().get(hkVar).b());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract wn a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<hk, b> b();
}
