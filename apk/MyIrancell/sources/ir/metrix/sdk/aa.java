package ir.metrix.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.fb0;
import defpackage.pa0;
import ir.metrix.sdk.network.model.ErrorModel;

/* loaded from: classes.dex */
class aa {
    private final Context a;
    private final OnDeeplinkResponseListener b;

    private aa(Context context, OnDeeplinkResponseListener onDeeplinkResponseListener) {
        this.a = context;
        this.b = onDeeplinkResponseListener;
    }

    private Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.a.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aa a(Context context, OnDeeplinkResponseListener onDeeplinkResponseListener) {
        return new aa(context, onDeeplinkResponseListener);
    }

    private void a(Intent intent, Uri uri) {
        if (!(this.a.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
            ab.a(String.format("Unable to open deferred deep link (%s)", uri));
        } else {
            ab.a(false, String.format("Open deferred deep link (%s)", uri));
            this.a.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(fb0<Void> fb0Var) {
        try {
            String a = fb0Var.d().a("location");
            if (a != null && !a.isEmpty()) {
                String[] split = a.split("#");
                if (split.length != 0 && split[0].startsWith("intent://")) {
                    String str = split[0].split("//")[1];
                    String str2 = "";
                    for (String str3 : split[1].split(";")) {
                        if (str3.startsWith("scheme")) {
                            str2 = str3.split("=")[1];
                        }
                    }
                    Uri parse = Uri.parse(str2 + "://" + str);
                    ab.a(false, String.format("Deferred deeplink received (%s)", parse));
                    boolean launchReceivedDeeplink = this.b != null ? this.b.launchReceivedDeeplink(parse) : true;
                    Intent a2 = a(parse);
                    if (launchReceivedDeeplink) {
                        a(a2, parse);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, boolean z) {
        if (z) {
            try {
                String decode = Uri.decode(str);
                String[] split = decode.split("&");
                if (split.length >= 2 && decode.contains(g.b) && decode.contains(g.c)) {
                    String str2 = null;
                    boolean z2 = false;
                    for (String str3 : split) {
                        String[] split2 = str3.split("=");
                        if (split2[0].equals(g.b)) {
                            str2 = split2[1];
                        } else if (split2[0].equals(g.c)) {
                            z2 = Boolean.parseBoolean(split2[1]);
                        }
                    }
                    if (z2 && str2 != null) {
                        ((ir.metrix.sdk.network.b) ir.metrix.sdk.network.e.a(ir.metrix.sdk.network.b.class)).a(str2).a(new ir.metrix.sdk.network.a<Void, ErrorModel>() { // from class: ir.metrix.sdk.aa.1
                            @Override // ir.metrix.sdk.network.a
                            public void a(pa0<Void> pa0Var, fb0<Void> fb0Var) {
                                aa.this.a(fb0Var);
                            }

                            @Override // ir.metrix.sdk.network.a
                            public void a(pa0<Void> pa0Var, Throwable th) {
                            }

                            @Override // ir.metrix.sdk.network.a
                            public void b(pa0<Void> pa0Var, fb0<ErrorModel> fb0Var) {
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
