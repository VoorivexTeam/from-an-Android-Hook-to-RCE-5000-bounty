package com.google.zxing.client.android;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.zxing.client.android.m */
/* loaded from: classes.dex */
public final class C2264m {

    /* renamed from: a */
    private static final Map<String, String> f9148a;

    /* renamed from: b */
    private static final Map<String, String> f9149b;

    /* renamed from: c */
    private static final Map<String, String> f9150c;

    static {
        HashMap hashMap = new HashMap();
        f9148a = hashMap;
        hashMap.put("AR", "com.ar");
        f9148a.put("AU", "com.au");
        f9148a.put("BR", "com.br");
        f9148a.put("BG", "bg");
        f9148a.put(Locale.CANADA.getCountry(), "ca");
        f9148a.put(Locale.CHINA.getCountry(), "cn");
        f9148a.put("CZ", "cz");
        f9148a.put("DK", "dk");
        f9148a.put("FI", "fi");
        f9148a.put(Locale.FRANCE.getCountry(), "fr");
        f9148a.put(Locale.GERMANY.getCountry(), "de");
        f9148a.put("GR", "gr");
        f9148a.put("HU", "hu");
        f9148a.put("ID", "co.id");
        f9148a.put("IL", "co.il");
        f9148a.put(Locale.ITALY.getCountry(), "it");
        f9148a.put(Locale.JAPAN.getCountry(), "co.jp");
        f9148a.put(Locale.KOREA.getCountry(), "co.kr");
        f9148a.put("NL", "nl");
        f9148a.put("PL", "pl");
        f9148a.put("PT", "pt");
        f9148a.put("RO", "ro");
        f9148a.put("RU", "ru");
        f9148a.put("SK", "sk");
        f9148a.put("SI", "si");
        f9148a.put("ES", "es");
        f9148a.put("SE", "se");
        f9148a.put("CH", "ch");
        f9148a.put(Locale.TAIWAN.getCountry(), "tw");
        f9148a.put("TR", "com.tr");
        f9148a.put("UA", "com.ua");
        f9148a.put(Locale.UK.getCountry(), "co.uk");
        f9148a.put(Locale.US.getCountry(), "com");
        HashMap hashMap2 = new HashMap();
        f9149b = hashMap2;
        hashMap2.put("AU", "com.au");
        f9149b.put(Locale.FRANCE.getCountry(), "fr");
        f9149b.put(Locale.GERMANY.getCountry(), "de");
        f9149b.put(Locale.ITALY.getCountry(), "it");
        f9149b.put(Locale.JAPAN.getCountry(), "co.jp");
        f9149b.put("NL", "nl");
        f9149b.put("ES", "es");
        f9149b.put("CH", "ch");
        f9149b.put(Locale.UK.getCountry(), "co.uk");
        f9149b.put(Locale.US.getCountry(), "com");
        f9150c = f9148a;
        Arrays.asList("de", "en", "es", "fr", "it", "ja", "ko", "nl", "pt", "ru", "uk", "zh-rCN", "zh-rTW", "zh-rHK");
    }

    /* renamed from: a */
    private static String m10897a() {
        Locale locale = Locale.getDefault();
        return locale == null ? "US" : locale.getCountry();
    }

    /* renamed from: a */
    public static String m10898a(Context context) {
        return m10899a(f9150c, context);
    }

    /* renamed from: a */
    private static String m10899a(Map<String, String> map, Context context) {
        String str = map.get(m10901b(context));
        return str == null ? "com" : str;
    }

    /* renamed from: a */
    public static boolean m10900a(String str) {
        return str.startsWith("http://google.com/books") || str.startsWith("http://books.google.");
    }

    /* renamed from: b */
    public static String m10901b(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences_search_country", "-");
        return (string == null || string.isEmpty() || "-".equals(string)) ? m10897a() : string;
    }

    /* renamed from: c */
    public static String m10902c(Context context) {
        return m10899a(f9148a, context);
    }

    /* renamed from: d */
    public static String m10903d(Context context) {
        return m10899a(f9149b, context);
    }
}
