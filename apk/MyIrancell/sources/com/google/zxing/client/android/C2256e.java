package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p000.EnumC3224sv;

/* renamed from: com.google.zxing.client.android.e */
/* loaded from: classes.dex */
final class C2256e {

    /* renamed from: d */
    private static final Set<EnumC3224sv> f9123d;

    /* renamed from: i */
    private static final Map<String, Set<EnumC3224sv>> f9128i;

    /* renamed from: a */
    private static final Pattern f9120a = Pattern.compile(",");

    /* renamed from: e */
    static final Set<EnumC3224sv> f9124e = EnumSet.of(EnumC3224sv.QR_CODE);

    /* renamed from: f */
    static final Set<EnumC3224sv> f9125f = EnumSet.of(EnumC3224sv.DATA_MATRIX);

    /* renamed from: g */
    static final Set<EnumC3224sv> f9126g = EnumSet.of(EnumC3224sv.AZTEC);

    /* renamed from: h */
    static final Set<EnumC3224sv> f9127h = EnumSet.of(EnumC3224sv.PDF_417);

    /* renamed from: b */
    static final Set<EnumC3224sv> f9121b = EnumSet.of(EnumC3224sv.UPC_A, EnumC3224sv.UPC_E, EnumC3224sv.EAN_13, EnumC3224sv.EAN_8, EnumC3224sv.RSS_14, EnumC3224sv.RSS_EXPANDED);

    /* renamed from: c */
    static final Set<EnumC3224sv> f9122c = EnumSet.of(EnumC3224sv.CODE_39, EnumC3224sv.CODE_93, EnumC3224sv.CODE_128, EnumC3224sv.ITF, EnumC3224sv.CODABAR);

    static {
        EnumSet copyOf = EnumSet.copyOf((Collection) f9121b);
        f9123d = copyOf;
        copyOf.addAll(f9122c);
        HashMap hashMap = new HashMap();
        f9128i = hashMap;
        hashMap.put("ONE_D_MODE", f9123d);
        f9128i.put("PRODUCT_MODE", f9121b);
        f9128i.put("QR_CODE_MODE", f9124e);
        f9128i.put("DATA_MATRIX_MODE", f9125f);
        f9128i.put("AZTEC_MODE", f9126g);
        f9128i.put("PDF417_MODE", f9127h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Set<EnumC3224sv> m10871a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m10873a(stringExtra != null ? Arrays.asList(f9120a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Set<EnumC3224sv> m10872a(Uri uri) {
        List<String> queryParameters = uri.getQueryParameters("SCAN_FORMATS");
        if (queryParameters != null && queryParameters.size() == 1 && queryParameters.get(0) != null) {
            queryParameters = Arrays.asList(f9120a.split(queryParameters.get(0)));
        }
        return m10873a(queryParameters, uri.getQueryParameter("SCAN_MODE"));
    }

    /* renamed from: a */
    private static Set<EnumC3224sv> m10873a(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC3224sv.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(EnumC3224sv.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f9128i.get(str);
        }
        return null;
    }
}
