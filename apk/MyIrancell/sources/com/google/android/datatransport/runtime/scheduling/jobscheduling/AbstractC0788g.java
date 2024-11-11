package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0785d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.EnumC2556hk;
import p000.InterfaceC3404wn;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
/* loaded from: classes.dex */
public abstract class AbstractC0788g {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC3404wn f5414a;

        /* renamed from: b */
        private Map<EnumC2556hk, b> f5415b = new HashMap();

        /* renamed from: a */
        public a m6315a(EnumC2556hk enumC2556hk, b bVar) {
            this.f5415b.put(enumC2556hk, bVar);
            return this;
        }

        /* renamed from: a */
        public a m6316a(InterfaceC3404wn interfaceC3404wn) {
            this.f5414a = interfaceC3404wn;
            return this;
        }

        /* renamed from: a */
        public AbstractC0788g m6317a() {
            if (this.f5414a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f5415b.keySet().size() < EnumC2556hk.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC2556hk, b> map = this.f5415b;
            this.f5415b = new HashMap();
            return AbstractC0788g.m6309a(this.f5414a, map);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract a mo6301a(long j);

            /* renamed from: a */
            public abstract a mo6302a(Set<c> set);

            /* renamed from: a */
            public abstract b mo6303a();

            /* renamed from: b */
            public abstract a mo6304b(long j);
        }

        /* renamed from: d */
        public static a m6318d() {
            C0785d.b bVar = new C0785d.b();
            bVar.mo6302a(Collections.emptySet());
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract long mo6298a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Set<c> mo6299b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract long mo6300c();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public static AbstractC0788g m6308a(InterfaceC3404wn interfaceC3404wn) {
        a m6312c = m6312c();
        EnumC2556hk enumC2556hk = EnumC2556hk.DEFAULT;
        b.a m6318d = b.m6318d();
        m6318d.mo6301a(30000L);
        m6318d.mo6304b(86400000L);
        m6312c.m6315a(enumC2556hk, m6318d.mo6303a());
        EnumC2556hk enumC2556hk2 = EnumC2556hk.HIGHEST;
        b.a m6318d2 = b.m6318d();
        m6318d2.mo6301a(1000L);
        m6318d2.mo6304b(86400000L);
        m6312c.m6315a(enumC2556hk2, m6318d2.mo6303a());
        EnumC2556hk enumC2556hk3 = EnumC2556hk.VERY_LOW;
        b.a m6318d3 = b.m6318d();
        m6318d3.mo6301a(86400000L);
        m6318d3.mo6304b(86400000L);
        m6318d3.mo6302a(m6310a(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        m6312c.m6315a(enumC2556hk3, m6318d3.mo6303a());
        m6312c.m6316a(interfaceC3404wn);
        return m6312c.m6317a();
    }

    /* renamed from: a */
    static AbstractC0788g m6309a(InterfaceC3404wn interfaceC3404wn, Map<EnumC2556hk, b> map) {
        return new C0784c(interfaceC3404wn, map);
    }

    /* renamed from: a */
    private static <T> Set<T> m6310a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    private void m6311a(JobInfo.Builder builder, Set<c> set) {
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

    /* renamed from: c */
    public static a m6312c() {
        return new a();
    }

    /* renamed from: a */
    public long m6313a(EnumC2556hk enumC2556hk, long j, int i) {
        long mo3178a = j - mo6296a().mo3178a();
        b bVar = mo6297b().get(enumC2556hk);
        return Math.min(Math.max(((long) Math.pow(2.0d, i - 1)) * bVar.mo6298a(), mo3178a), bVar.mo6300c());
    }

    /* renamed from: a */
    public JobInfo.Builder m6314a(JobInfo.Builder builder, EnumC2556hk enumC2556hk, long j, int i) {
        builder.setMinimumLatency(m6313a(enumC2556hk, j, i));
        m6311a(builder, mo6297b().get(enumC2556hk).mo6299b());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract InterfaceC3404wn mo6296a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<EnumC2556hk, b> mo6297b();
}
