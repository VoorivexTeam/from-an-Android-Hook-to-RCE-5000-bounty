package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import defpackage.sv;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class e {
    private static final Set<sv> d;
    private static final Map<String, Set<sv>> i;
    private static final Pattern a = Pattern.compile(",");
    static final Set<sv> e = EnumSet.of(sv.QR_CODE);
    static final Set<sv> f = EnumSet.of(sv.DATA_MATRIX);
    static final Set<sv> g = EnumSet.of(sv.AZTEC);
    static final Set<sv> h = EnumSet.of(sv.PDF_417);
    static final Set<sv> b = EnumSet.of(sv.UPC_A, sv.UPC_E, sv.EAN_13, sv.EAN_8, sv.RSS_14, sv.RSS_EXPANDED);
    static final Set<sv> c = EnumSet.of(sv.CODE_39, sv.CODE_93, sv.CODE_128, sv.ITF, sv.CODABAR);

    static {
        EnumSet copyOf = EnumSet.copyOf((Collection) b);
        d = copyOf;
        copyOf.addAll(c);
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("ONE_D_MODE", d);
        i.put("PRODUCT_MODE", b);
        i.put("QR_CODE_MODE", e);
        i.put("DATA_MATRIX_MODE", f);
        i.put("AZTEC_MODE", g);
        i.put("PDF417_MODE", h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<sv> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return a(stringExtra != null ? Arrays.asList(a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<sv> a(Uri uri) {
        List<String> queryParameters = uri.getQueryParameters("SCAN_FORMATS");
        if (queryParameters != null && queryParameters.size() == 1 && queryParameters.get(0) != null) {
            queryParameters = Arrays.asList(a.split(queryParameters.get(0)));
        }
        return a(queryParameters, uri.getQueryParameter("SCAN_MODE"));
    }

    private static Set<sv> a(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(sv.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(sv.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return i.get(str);
        }
        return null;
    }
}
