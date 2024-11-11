package com.google.android.gms.common;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0228f;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC0917k1;
import com.google.android.gms.common.api.internal.C0921l1;
import com.google.android.gms.common.api.internal.InterfaceC0911j;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1026g;
import com.google.android.gms.common.internal.C1024f;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1103i;
import com.google.android.gms.common.util.C1108n;
import p000.HandlerC2824jq;

/* renamed from: com.google.android.gms.common.c */
/* loaded from: classes.dex */
public class C0993c extends C0994d {

    /* renamed from: d */
    private static final Object f6044d = new Object();

    /* renamed from: e */
    private static final C0993c f6045e = new C0993c();

    /* renamed from: f */
    public static final int f6046f = C0994d.f6050a;

    /* renamed from: c */
    private String f6047c;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.c$a */
    /* loaded from: classes.dex */
    public class a extends HandlerC2824jq {

        /* renamed from: a */
        private final Context f6048a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f6048a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                sb.toString();
                return;
            }
            int mo6964c = C0993c.this.mo6964c(this.f6048a);
            if (C0993c.this.mo6965c(mo6964c)) {
                C0993c.this.m6967d(this.f6048a, mo6964c);
            }
        }
    }

    /* renamed from: a */
    public static Dialog m6947a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C1024f.m7139b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m6950a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    static Dialog m6948a(Context context, int i, AbstractDialogInterfaceOnClickListenerC1026g abstractDialogInterfaceOnClickListenerC1026g, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1024f.m7139b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m7135a = C1024f.m7135a(context, i);
        if (m7135a != null) {
            builder.setPositiveButton(m7135a, abstractDialogInterfaceOnClickListenerC1026g);
        }
        String m7142e = C1024f.m7142e(context, i);
        if (m7142e != null) {
            builder.setTitle(m7142e);
        }
        return builder.create();
    }

    /* renamed from: a */
    public static C0993c m6949a() {
        return f6045e;
    }

    /* renamed from: a */
    static void m6950a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C1068j.m7307a(dialog, onCancelListener).mo1774a(((FragmentActivity) activity).m1738e(), str);
        } else {
            DialogFragmentC0992b.m6946a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m6951a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            m6966d(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String m7141d = C1024f.m7141d(context, i);
        String m7140c = C1024f.m7140c(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        C0228f.d dVar = new C0228f.d(context);
        dVar.m1413b(true);
        dVar.m1407a(true);
        dVar.m1412b(m7141d);
        C0228f.c cVar = new C0228f.c();
        cVar.m1391a(m7140c);
        dVar.m1404a(cVar);
        if (C1103i.m7387a(context)) {
            C1057u.m7297b(C1108n.m7401g());
            dVar.m1418e(context.getApplicationInfo().icon);
            dVar.m1417d(2);
            if (C1103i.m7388b(context)) {
                dVar.m1399a(R$drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R$string.common_open_on_phone), pendingIntent);
            } else {
                dVar.m1401a(pendingIntent);
            }
        } else {
            dVar.m1418e(R.drawable.stat_sys_warning);
            dVar.m1415c(resources.getString(com.google.android.gms.base.R$string.common_google_play_services_notification_ticker));
            dVar.m1400a(System.currentTimeMillis());
            dVar.m1401a(pendingIntent);
            dVar.m1405a((CharSequence) m7140c);
        }
        if (C1108n.m7404j()) {
            C1057u.m7297b(C1108n.m7404j());
            String m6952b = m6952b();
            if (m6952b == null) {
                m6952b = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m7138b = C1024f.m7138b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", m7138b, 4);
                } else if (!m7138b.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(m7138b);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            dVar.m1406a(m6952b);
        }
        Notification m1395a = dVar.m1395a();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            C1006h.f6078d.set(false);
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, m1395a);
    }

    /* renamed from: b */
    private final String m6952b() {
        String str;
        synchronized (f6044d) {
            str = this.f6047c;
        }
        return str;
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: a */
    public int mo6953a(Context context, int i) {
        return super.mo6953a(context, i);
    }

    /* renamed from: a */
    public Dialog m6954a(Activity activity, int i, int i2) {
        return m6955a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: a */
    public Dialog m6955a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m6948a(activity, i, AbstractDialogInterfaceOnClickListenerC1026g.m7143a(activity, mo6958a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: a */
    public PendingIntent mo6956a(Context context, int i, int i2) {
        return super.mo6956a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent m6957a(Context context, ConnectionResult connectionResult) {
        return connectionResult.m6487m() ? connectionResult.m6486l() : mo6956a(context, connectionResult.m6484j(), 0);
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: a */
    public Intent mo6958a(Context context, int i, String str) {
        return super.mo6958a(context, i, str);
    }

    /* renamed from: a */
    public final C0921l1 m6959a(Context context, AbstractC0917k1 abstractC0917k1) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C0921l1 c0921l1 = new C0921l1(abstractC0917k1);
        context.registerReceiver(c0921l1, intentFilter);
        c0921l1.m6801a(context);
        if (m6973a(context, "com.google.android.gms")) {
            return c0921l1;
        }
        abstractC0917k1.mo6793a();
        c0921l1.m6800a();
        return null;
    }

    /* renamed from: a */
    public final boolean m6960a(Activity activity, InterfaceC0911j interfaceC0911j, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6948a = m6948a(activity, i, AbstractDialogInterfaceOnClickListenerC1026g.m7144a(interfaceC0911j, mo6958a(activity, i, "d"), 2), onCancelListener);
        if (m6948a == null) {
            return false;
        }
        m6950a(activity, m6948a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: a */
    public final boolean m6961a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent m6957a = m6957a(context, connectionResult);
        if (m6957a == null) {
            return false;
        }
        m6951a(context, connectionResult.m6484j(), (String) null, GoogleApiActivity.m6492a(context, m6957a, i));
        return true;
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: b */
    public final String mo6962b(int i) {
        return super.mo6962b(i);
    }

    /* renamed from: b */
    public boolean m6963b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6955a = m6955a(activity, i, i2, onCancelListener);
        if (m6955a == null) {
            return false;
        }
        m6950a(activity, m6955a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: c */
    public int mo6964c(Context context) {
        return super.mo6964c(context);
    }

    @Override // com.google.android.gms.common.C0994d
    /* renamed from: c */
    public final boolean mo6965c(int i) {
        return super.mo6965c(i);
    }

    /* renamed from: d */
    final void m6966d(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: d */
    public void m6967d(Context context, int i) {
        m6951a(context, i, (String) null, m6970a(context, i, 0, "n"));
    }
}
