package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;
import java.util.Map;
import p000.EnumC2556hk;
import p000.InterfaceC3404wn;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
/* loaded from: classes.dex */
final class C0784c extends AbstractC0788g {

    /* renamed from: a */
    private final InterfaceC3404wn f5401a;

    /* renamed from: b */
    private final Map<EnumC2556hk, AbstractC0788g.b> f5402b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0784c(InterfaceC3404wn interfaceC3404wn, Map<EnumC2556hk, AbstractC0788g.b> map) {
        if (interfaceC3404wn == null) {
            throw new NullPointerException("Null clock");
        }
        this.f5401a = interfaceC3404wn;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f5402b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g
    /* renamed from: a */
    InterfaceC3404wn mo6296a() {
        return this.f5401a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g
    /* renamed from: b */
    Map<EnumC2556hk, AbstractC0788g.b> mo6297b() {
        return this.f5402b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0788g)) {
            return false;
        }
        AbstractC0788g abstractC0788g = (AbstractC0788g) obj;
        return this.f5401a.equals(abstractC0788g.mo6296a()) && this.f5402b.equals(abstractC0788g.mo6297b());
    }

    public int hashCode() {
        return ((this.f5401a.hashCode() ^ 1000003) * 1000003) ^ this.f5402b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f5401a + ", values=" + this.f5402b + "}";
    }
}
