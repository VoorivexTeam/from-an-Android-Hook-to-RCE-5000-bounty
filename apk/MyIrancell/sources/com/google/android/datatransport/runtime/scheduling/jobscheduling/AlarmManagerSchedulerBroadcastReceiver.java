package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p000.AbstractC3266tl;
import p000.C0529co;
import p000.C3491yl;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6291a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3491yl.m16649a(context);
        AbstractC3266tl.a m15657d = AbstractC3266tl.m15657d();
        m15657d.mo13739a(queryParameter);
        m15657d.mo13738a(C0529co.m3700a(intValue));
        if (queryParameter2 != null) {
            m15657d.mo13740a(Base64.decode(queryParameter2, 0));
        }
        C3491yl.m16651b().m16652a().m6330a(m15657d.mo13741a(), i, RunnableC0783b.m6295a());
    }
}
