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
import defpackage.ks;
import defpackage.ls;
import defpackage.ns;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class q {
    private static int g;
    private static PendingIntent h;
    private final Context b;
    private final k c;
    private Messenger e;
    private zzf f;

    @GuardedBy("responseCallbacks")
    private final defpackage.i0<String, ls<Bundle>> a = new defpackage.i0<>();
    private Messenger d = new Messenger(new t(this, Looper.getMainLooper()));

    public q(Context context, k kVar) {
        this.b = context;
        this.c = kVar;
    }

    private static synchronized String a() {
        String num;
        synchronized (q.class) {
            int i = g;
            g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (q.class) {
            if (h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzf.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.f = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.e = (Messenger) parcelableExtra;
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
                        a(group, extras);
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
                    synchronized (this.a) {
                        for (int i = 0; i < this.a.size(); i++) {
                            a(this.a.b(i), intent2.getExtras());
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
                a(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.a) {
            ls<Bundle> remove = this.a.remove(str);
            if (remove != null) {
                remove.a((ls<Bundle>) bundle);
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

    private final Bundle b(Bundle bundle) {
        Bundle c = c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle c(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.q.c(android.os.Bundle):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        if (this.c.d() < 12000000) {
            return b(bundle);
        }
        try {
            return (Bundle) ns.a((ks) z0.a(this.b).b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                sb.toString();
            }
            if ((e.getCause() instanceof i) && ((i) e.getCause()).a() == 4) {
                return b(bundle);
            }
            return null;
        }
    }
}
