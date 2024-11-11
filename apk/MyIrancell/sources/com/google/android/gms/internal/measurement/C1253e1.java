package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes.dex */
public class C1253e1 {

    /* renamed from: f */
    private static HashMap<String, String> f6586f;

    /* renamed from: k */
    private static Object f6591k;

    /* renamed from: l */
    private static boolean f6592l;

    /* renamed from: a */
    public static final Uri f6581a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    private static final Uri f6582b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f6583c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f6584d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f6585e = new AtomicBoolean();

    /* renamed from: g */
    private static final HashMap<String, Boolean> f6587g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f6588h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f6589i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f6590j = new HashMap<>();

    /* renamed from: m */
    private static String[] f6593m = new String[0];

    /* renamed from: a */
    public static String m7785a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C1253e1.class) {
            if (f6586f == null) {
                f6585e.set(false);
                f6586f = new HashMap<>();
                f6591k = new Object();
                f6592l = false;
                contentResolver.registerContentObserver(f6581a, true, new C1283g1(null));
            } else if (f6585e.getAndSet(false)) {
                f6586f.clear();
                f6587g.clear();
                f6588h.clear();
                f6589i.clear();
                f6590j.clear();
                f6591k = new Object();
                f6592l = false;
            }
            Object obj = f6591k;
            if (f6586f.containsKey(str)) {
                String str3 = f6586f.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : f6593m) {
                if (str.startsWith(str4)) {
                    if (!f6592l || f6586f.isEmpty()) {
                        f6586f.putAll(m7786a(contentResolver, f6593m));
                        f6592l = true;
                        if (f6586f.containsKey(str)) {
                            String str5 = f6586f.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(f6581a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m7788a(obj, str, (String) null);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m7788a(obj, str, string);
                String str6 = string != null ? string : null;
                if (query != null) {
                    query.close();
                }
                return str6;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    /* renamed from: a */
    private static Map<String, String> m7786a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f6582b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    private static void m7788a(Object obj, String str, String str2) {
        synchronized (C1253e1.class) {
            if (obj == f6591k) {
                f6586f.put(str, str2);
            }
        }
    }
}
