package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.util.C1098d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
/* loaded from: classes.dex */
public class C1088a {

    /* renamed from: a */
    private static final Object f6346a = new Object();

    /* renamed from: b */
    private static volatile C1088a f6347b;

    private C1088a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public static C1088a m7348a() {
        if (f6347b == null) {
            synchronized (f6346a) {
                if (f6347b == null) {
                    f6347b = new C1088a();
                }
            }
        }
        return f6347b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void m7349a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public boolean m7350a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m7351a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean m7351a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : C1098d.m7374a(context, component.getPackageName())) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
