package com.google.zxing.client.android;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {
    private static final Map<String, String> a;
    private static final Map<String, String> b;
    private static final Map<String, String> c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("AR", "com.ar");
        a.put("AU", "com.au");
        a.put("BR", "com.br");
        a.put("BG", "bg");
        a.put(Locale.CANADA.getCountry(), "ca");
        a.put(Locale.CHINA.getCountry(), "cn");
        a.put("CZ", "cz");
        a.put("DK", "dk");
        a.put("FI", "fi");
        a.put(Locale.FRANCE.getCountry(), "fr");
        a.put(Locale.GERMANY.getCountry(), "de");
        a.put("GR", "gr");
        a.put("HU", "hu");
        a.put("ID", "co.id");
        a.put("IL", "co.il");
        a.put(Locale.ITALY.getCountry(), "it");
        a.put(Locale.JAPAN.getCountry(), "co.jp");
        a.put(Locale.KOREA.getCountry(), "co.kr");
        a.put("NL", "nl");
        a.put("PL", "pl");
        a.put("PT", "pt");
        a.put("RO", "ro");
        a.put("RU", "ru");
        a.put("SK", "sk");
        a.put("SI", "si");
        a.put("ES", "es");
        a.put("SE", "se");
        a.put("CH", "ch");
        a.put(Locale.TAIWAN.getCountry(), "tw");
        a.put("TR", "com.tr");
        a.put("UA", "com.ua");
        a.put(Locale.UK.getCountry(), "co.uk");
        a.put(Locale.US.getCountry(), "com");
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put("AU", "com.au");
        b.put(Locale.FRANCE.getCountry(), "fr");
        b.put(Locale.GERMANY.getCountry(), "de");
        b.put(Locale.ITALY.getCountry(), "it");
        b.put(Locale.JAPAN.getCountry(), "co.jp");
        b.put("NL", "nl");
        b.put("ES", "es");
        b.put("CH", "ch");
        b.put(Locale.UK.getCountry(), "co.uk");
        b.put(Locale.US.getCountry(), "com");
        c = a;
        Arrays.asList("de", "en", "es", "fr", "it", "ja", "ko", "nl", "pt", "ru", "uk", "zh-rCN", "zh-rTW", "zh-rHK");
    }

    private static String a() {
        Locale locale = Locale.getDefault();
        return locale == null ? "US" : locale.getCountry();
    }

    public static String a(Context context) {
        return a(c, context);
    }

    private static String a(Map<String, String> map, Context context) {
        String str = map.get(b(context));
        return str == null ? "com" : str;
    }

    public static boolean a(String str) {
        return str.startsWith("http://google.com/books") || str.startsWith("http://books.google.");
    }

    public static String b(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences_search_country", "-");
        return (string == null || string.isEmpty() || "-".equals(string)) ? a() : string;
    }

    public static String c(Context context) {
        return a(a, context);
    }

    public static String d(Context context) {
        return a(b, context);
    }
}
