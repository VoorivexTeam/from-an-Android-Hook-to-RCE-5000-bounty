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
import androidx.core.app.f;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.k1;
import com.google.android.gms.common.api.internal.l1;
import defpackage.jq;

/* loaded from: classes.dex */
public class c extends d {
    private static final Object d = new Object();
    private static final c e = new c();
    public static final int f = d.a;
    private String c;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class a extends jq {
        private final Context a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
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
            int c = c.this.c(this.a);
            if (c.this.c(c)) {
                c.this.d(this.a, c);
            }
        }
    }

    public static Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.f.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    static Dialog a(Context context, int i, com.google.android.gms.common.internal.g gVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.f.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = com.google.android.gms.common.internal.f.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, gVar);
        }
        String e2 = com.google.android.gms.common.internal.f.e(context, i);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static c a() {
        return e;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            j.a(dialog, onCancelListener).a(((FragmentActivity) activity).e(), str);
        } else {
            b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    private final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            d(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String d2 = com.google.android.gms.common.internal.f.d(context, i);
        String c = com.google.android.gms.common.internal.f.c(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        f.d dVar = new f.d(context);
        dVar.b(true);
        dVar.a(true);
        dVar.b(d2);
        f.c cVar = new f.c();
        cVar.a(c);
        dVar.a(cVar);
        if (com.google.android.gms.common.util.i.a(context)) {
            com.google.android.gms.common.internal.u.b(com.google.android.gms.common.util.n.g());
            dVar.e(context.getApplicationInfo().icon);
            dVar.d(2);
            if (com.google.android.gms.common.util.i.b(context)) {
                dVar.a(R$drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R$string.common_open_on_phone), pendingIntent);
            } else {
                dVar.a(pendingIntent);
            }
        } else {
            dVar.e(R.drawable.stat_sys_warning);
            dVar.c(resources.getString(com.google.android.gms.base.R$string.common_google_play_services_notification_ticker));
            dVar.a(System.currentTimeMillis());
            dVar.a(pendingIntent);
            dVar.a((CharSequence) c);
        }
        if (com.google.android.gms.common.util.n.j()) {
            com.google.android.gms.common.internal.u.b(com.google.android.gms.common.util.n.j());
            String b = b();
            if (b == null) {
                b = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b2 = com.google.android.gms.common.internal.f.b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", b2, 4);
                } else if (!b2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b2);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            dVar.a(b);
        }
        Notification a2 = dVar.a();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            h.d.set(false);
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a2);
    }

    private final String b() {
        String str;
        synchronized (d) {
            str = this.c;
        }
        return str;
    }

    @Override // com.google.android.gms.common.d
    public int a(Context context, int i) {
        return super.a(context, i);
    }

    public Dialog a(Activity activity, int i, int i2) {
        return a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, com.google.android.gms.common.internal.g.a(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // com.google.android.gms.common.d
    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, ConnectionResult connectionResult) {
        return connectionResult.m() ? connectionResult.l() : a(context, connectionResult.j(), 0);
    }

    @Override // com.google.android.gms.common.d
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final l1 a(Context context, k1 k1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        l1 l1Var = new l1(k1Var);
        context.registerReceiver(l1Var, intentFilter);
        l1Var.a(context);
        if (a(context, "com.google.android.gms")) {
            return l1Var;
        }
        k1Var.a();
        l1Var.a();
        return null;
    }

    public final boolean a(Activity activity, com.google.android.gms.common.api.internal.j jVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, com.google.android.gms.common.internal.g.a(jVar, a(activity, i, "d"), 2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a2 = a(context, connectionResult);
        if (a2 == null) {
            return false;
        }
        a(context, connectionResult.j(), (String) null, GoogleApiActivity.a(context, a2, i));
        return true;
    }

    @Override // com.google.android.gms.common.d
    public final String b(int i) {
        return super.b(i);
    }

    public boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // com.google.android.gms.common.d
    public int c(Context context) {
        return super.c(context);
    }

    @Override // com.google.android.gms.common.d
    public final boolean c(int i) {
        return super.c(i);
    }

    final void d(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    public void d(Context context, int i) {
        a(context, i, (String) null, a(context, i, 0, "n"));
    }
}
