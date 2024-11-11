package com.google.zxing.client.android;

import android.net.Uri;
import defpackage.fw;
import defpackage.hx;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes.dex */
final class n {
    private static final CharSequence c = "{CODE}";
    private static final CharSequence d = "{RAWCODE}";
    private static final CharSequence e = "{META}";
    private static final CharSequence f = "{FORMAT}";
    private static final CharSequence g = "{TYPE}";
    private final String a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Uri uri) {
        this.a = uri.getQueryParameter("ret");
        this.b = uri.getQueryParameter("raw") != null;
    }

    private static String a(CharSequence charSequence, CharSequence charSequence2, String str) {
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        try {
            charSequence2 = URLEncoder.encode(charSequence2.toString(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return str.replace(charSequence, charSequence2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(fw fwVar, hx hxVar) {
        return a(e, String.valueOf(fwVar.c()), a(g, hxVar.h().toString(), a(f, fwVar.a().toString(), a(d, fwVar.e(), a(c, this.b ? fwVar.e() : hxVar.e(), this.a)))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.a != null;
    }
}
