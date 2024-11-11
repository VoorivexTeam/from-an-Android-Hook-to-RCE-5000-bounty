package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.zzf;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractC2871ks;
import p000.C2573i0;
import p000.C2908ls;
import p000.C3000ns;

/* renamed from: com.google.firebase.iid.q */
/* loaded from: classes.dex */
final class C2115q {

    /* renamed from: g */
    private static int f8948g;

    /* renamed from: h */
    private static PendingIntent f8949h;

    /* renamed from: b */
    private final Context f8951b;

    /* renamed from: c */
    private final C2103k f8952c;

    /* renamed from: e */
    private Messenger f8954e;

    /* renamed from: f */
    private zzf f8955f;

    /* renamed from: a */
    @GuardedBy("responseCallbacks")
    private final C2573i0<String, C2908ls<Bundle>> f8950a = new C2573i0<>();

    /* renamed from: d */
    private Messenger f8953d = new Messenger(new HandlerC2121t(this, Looper.getMainLooper()));

    public C2115q(Context context, C2103k c2103k) {
        this.f8951b = context;
        this.f8952c = c2103k;
    }

    /* renamed from: a */
    private static synchronized String m10674a() {
        String num;
        synchronized (C2115q.class) {
            int i = f8948g;
            f8948g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    private static synchronized void m10675a(Context context, Intent intent) {
        synchronized (C2115q.class) {
            if (f8949h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f8949h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f8949h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m10676a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzf.C2135a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.f8955f = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f8954e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        } else {
                            new String("Unexpected response action: ");
                            return;
                        }
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        m10678a(group, extras);
                        return;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf2 = String.valueOf(stringExtra);
                        if (valueOf2.length() != 0) {
                            "Unexpected response string: ".concat(valueOf2);
                            return;
                        } else {
                            new String("Unexpected response string: ");
                            return;
                        }
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf3 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf3);
                    sb.toString();
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf4 = String.valueOf(stringExtra2);
                    if (valueOf4.length() != 0) {
                        "Received InstanceID error ".concat(valueOf4);
                    } else {
                        new String("Received InstanceID error ");
                    }
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f8950a) {
                        for (int i = 0; i < this.f8950a.size(); i++) {
                            m10678a(this.f8950a.m12310b(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    String valueOf5 = String.valueOf(stringExtra2);
                    if (valueOf5.length() != 0) {
                        "Unexpected structured response ".concat(valueOf5);
                        return;
                    } else {
                        new String("Unexpected structured response ");
                        return;
                    }
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                m10678a(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }

    /* renamed from: a */
    private final void m10678a(String str, Bundle bundle) {
        synchronized (this.f8950a) {
            C2908ls<Bundle> remove = this.f8950a.remove(str);
            if (remove != null) {
                remove.m13926a((C2908ls<Bundle>) bundle);
                return;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Missing callback for ".concat(valueOf);
            } else {
                new String("Missing callback for ");
            }
        }
    }

    /* renamed from: b */
    private final Bundle m10679b(Bundle bundle) {
        Bundle m10680c = m10680c(bundle);
        if (m10680c == null || !m10680c.containsKey("google.messenger")) {
            return m10680c;
        }
        Bundle m10680c2 = m10680c(bundle);
        if (m10680c2 == null || !m10680c2.containsKey("google.messenger")) {
            return m10680c2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle m10680c(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2115q.m10680c(android.os.Bundle):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m10681a(Bundle bundle) {
        if (this.f8952c.m10661d() < 12000000) {
            return m10679b(bundle);
        }
        try {
            return (Bundle) C3000ns.m14383a((AbstractC2871ks) C2134z0.m10733a(this.f8951b).m10737b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                sb.toString();
            }
            if ((e.getCause() instanceof C2099i) && ((C2099i) e.getCause()).m10651a() == 4) {
                return m10679b(bundle);
            }
            return null;
        }
    }
}
