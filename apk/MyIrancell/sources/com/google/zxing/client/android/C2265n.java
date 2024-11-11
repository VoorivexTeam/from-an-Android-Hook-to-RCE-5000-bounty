package com.google.zxing.client.android;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p000.AbstractC2569hx;
import p000.C2488fw;

/* renamed from: com.google.zxing.client.android.n */
/* loaded from: classes.dex */
final class C2265n {

    /* renamed from: c */
    private static final CharSequence f9151c = "{CODE}";

    /* renamed from: d */
    private static final CharSequence f9152d = "{RAWCODE}";

    /* renamed from: e */
    private static final CharSequence f9153e = "{META}";

    /* renamed from: f */
    private static final CharSequence f9154f = "{FORMAT}";

    /* renamed from: g */
    private static final CharSequence f9155g = "{TYPE}";

    /* renamed from: a */
    private final String f9156a;

    /* renamed from: b */
    private final boolean f9157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2265n(Uri uri) {
        this.f9156a = uri.getQueryParameter("ret");
        this.f9157b = uri.getQueryParameter("raw") != null;
    }

    /* renamed from: a */
    private static String m10904a(CharSequence charSequence, CharSequence charSequence2, String str) {
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
    /* renamed from: a */
    public String m10905a(C2488fw c2488fw, AbstractC2569hx abstractC2569hx) {
        return m10904a(f9153e, String.valueOf(c2488fw.m11840c()), m10904a(f9155g, abstractC2569hx.m12278h().toString(), m10904a(f9154f, c2488fw.m11835a().toString(), m10904a(f9152d, c2488fw.m11842e(), m10904a(f9151c, this.f9157b ? c2488fw.m11842e() : abstractC2569hx.mo3200e(), this.f9156a)))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m10906a() {
        return this.f9156a != null;
    }
}
