package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import p000.AbstractC3266tl;
import p000.C0485bm;
import p000.C0529co;
import p000.InterfaceC3132qm;
import p000.InterfaceC3404wn;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes.dex */
public class C0782a implements InterfaceC0800s {

    /* renamed from: a */
    private final Context f5395a;

    /* renamed from: b */
    private final InterfaceC3132qm f5396b;

    /* renamed from: c */
    private AlarmManager f5397c;

    /* renamed from: d */
    private final AbstractC0788g f5398d;

    /* renamed from: e */
    private final InterfaceC3404wn f5399e;

    C0782a(Context context, InterfaceC3132qm interfaceC3132qm, AlarmManager alarmManager, InterfaceC3404wn interfaceC3404wn, AbstractC0788g abstractC0788g) {
        this.f5395a = context;
        this.f5396b = interfaceC3132qm;
        this.f5397c = alarmManager;
        this.f5399e = interfaceC3404wn;
        this.f5398d = abstractC0788g;
    }

    public C0782a(Context context, InterfaceC3132qm interfaceC3132qm, InterfaceC3404wn interfaceC3404wn, AbstractC0788g abstractC0788g) {
        this(context, interfaceC3132qm, (AlarmManager) context.getSystemService("alarm"), interfaceC3404wn, abstractC0788g);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s
    /* renamed from: a */
    public void mo6293a(AbstractC3266tl abstractC3266tl, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC3266tl.mo13735a());
        builder.appendQueryParameter("priority", String.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c())));
        if (abstractC3266tl.mo13736b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC3266tl.mo13736b(), 0));
        }
        Intent intent = new Intent(this.f5395a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (m6294a(intent)) {
            C0485bm.m3430a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC3266tl);
            return;
        }
        long mo14376b = this.f5396b.mo14376b(abstractC3266tl);
        long m6313a = this.f5398d.m6313a(abstractC3266tl.mo13737c(), mo14376b, i);
        C0485bm.m3432a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC3266tl, Long.valueOf(m6313a), Long.valueOf(mo14376b), Integer.valueOf(i));
        this.f5397c.set(3, this.f5399e.mo3178a() + m6313a, PendingIntent.getBroadcast(this.f5395a, 0, intent, 0));
    }

    /* renamed from: a */
    boolean m6294a(Intent intent) {
        return PendingIntent.getBroadcast(this.f5395a, 0, intent, 536870912) != null;
    }
}
