package ir.metrix.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ir.metrix.sdk.network.AbstractC2632a;
import ir.metrix.sdk.network.C2636e;
import ir.metrix.sdk.network.InterfaceC2633b;
import ir.metrix.sdk.network.model.ErrorModel;
import p000.fb0;
import p000.pa0;

/* renamed from: ir.metrix.sdk.aa */
/* loaded from: classes.dex */
class C2609aa {

    /* renamed from: a */
    private final Context f10675a;

    /* renamed from: b */
    private final OnDeeplinkResponseListener f10676b;

    private C2609aa(Context context, OnDeeplinkResponseListener onDeeplinkResponseListener) {
        this.f10675a = context;
        this.f10676b = onDeeplinkResponseListener;
    }

    /* renamed from: a */
    private Intent m12505a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.f10675a.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2609aa m12506a(Context context, OnDeeplinkResponseListener onDeeplinkResponseListener) {
        return new C2609aa(context, onDeeplinkResponseListener);
    }

    /* renamed from: a */
    private void m12507a(Intent intent, Uri uri) {
        if (!(this.f10675a.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
            C2610ab.m12516a(String.format("Unable to open deferred deep link (%s)", uri));
        } else {
            C2610ab.m12523a(false, String.format("Open deferred deep link (%s)", uri));
            this.f10675a.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12508a(fb0<Void> fb0Var) {
        try {
            String m16593a = fb0Var.m11754d().m16593a("location");
            if (m16593a != null && !m16593a.isEmpty()) {
                String[] split = m16593a.split("#");
                if (split.length != 0 && split[0].startsWith("intent://")) {
                    String str = split[0].split("//")[1];
                    String str2 = "";
                    for (String str3 : split[1].split(";")) {
                        if (str3.startsWith("scheme")) {
                            str2 = str3.split("=")[1];
                        }
                    }
                    Uri parse = Uri.parse(str2 + "://" + str);
                    C2610ab.m12523a(false, String.format("Deferred deeplink received (%s)", parse));
                    boolean launchReceivedDeeplink = this.f10676b != null ? this.f10676b.launchReceivedDeeplink(parse) : true;
                    Intent m12505a = m12505a(parse);
                    if (launchReceivedDeeplink) {
                        m12507a(m12505a, parse);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12510a(String str, boolean z) {
        if (z) {
            try {
                String decode = Uri.decode(str);
                String[] split = decode.split("&");
                if (split.length >= 2 && decode.contains(C2624g.f10726b) && decode.contains(C2624g.f10727c)) {
                    String str2 = null;
                    boolean z2 = false;
                    for (String str3 : split) {
                        String[] split2 = str3.split("=");
                        if (split2[0].equals(C2624g.f10726b)) {
                            str2 = split2[1];
                        } else if (split2[0].equals(C2624g.f10727c)) {
                            z2 = Boolean.parseBoolean(split2[1]);
                        }
                    }
                    if (z2 && str2 != null) {
                        ((InterfaceC2633b) C2636e.m12672a(InterfaceC2633b.class)).m12656a(str2).mo14741a(new AbstractC2632a<Void, ErrorModel>() { // from class: ir.metrix.sdk.aa.1
                            @Override // ir.metrix.sdk.network.AbstractC2632a
                            /* renamed from: a */
                            public void mo12511a(pa0<Void> pa0Var, fb0<Void> fb0Var) {
                                C2609aa.this.m12508a(fb0Var);
                            }

                            @Override // ir.metrix.sdk.network.AbstractC2632a
                            /* renamed from: a */
                            public void mo12512a(pa0<Void> pa0Var, Throwable th) {
                            }

                            @Override // ir.metrix.sdk.network.AbstractC2632a
                            /* renamed from: b */
                            public void mo12513b(pa0<Void> pa0Var, fb0<ErrorModel> fb0Var) {
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
