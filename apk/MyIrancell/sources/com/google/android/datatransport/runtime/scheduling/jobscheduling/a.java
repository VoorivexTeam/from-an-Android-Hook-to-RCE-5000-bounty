package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import defpackage.bm;
import defpackage.co;
import defpackage.qm;
import defpackage.tl;
import defpackage.wn;

/* loaded from: classes.dex */
public class a implements s {
    private final Context a;
    private final qm b;
    private AlarmManager c;
    private final g d;
    private final wn e;

    a(Context context, qm qmVar, AlarmManager alarmManager, wn wnVar, g gVar) {
        this.a = context;
        this.b = qmVar;
        this.c = alarmManager;
        this.e = wnVar;
        this.d = gVar;
    }

    public a(Context context, qm qmVar, wn wnVar, g gVar) {
        this(context, qmVar, (AlarmManager) context.getSystemService("alarm"), wnVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(tl tlVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", tlVar.a());
        builder.appendQueryParameter("priority", String.valueOf(co.a(tlVar.c())));
        if (tlVar.b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(tlVar.b(), 0));
        }
        Intent intent = new Intent(this.a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (a(intent)) {
            bm.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", tlVar);
            return;
        }
        long b = this.b.b(tlVar);
        long a = this.d.a(tlVar.c(), b, i);
        bm.a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", tlVar, Long.valueOf(a), Long.valueOf(b), Integer.valueOf(i));
        this.c.set(3, this.e.a() + a, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    boolean a(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }
}
