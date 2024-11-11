package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.wv;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class g {
    private static final Pattern a = Pattern.compile(",");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<wv, Object> a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(wv.class);
        for (wv wvVar : wv.values()) {
            if (wvVar != wv.CHARACTER_SET && wvVar != wv.NEED_RESULT_POINT_CALLBACK && wvVar != wv.POSSIBLE_FORMATS) {
                String name = wvVar.name();
                if (extras.containsKey(name)) {
                    if (wvVar.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!wvVar.getValueType().isInstance(obj)) {
                            String str = "Ignoring hint " + wvVar + " because it is not assignable from " + obj;
                        }
                    }
                    enumMap.put((EnumMap) wvVar, (wv) obj);
                }
            }
        }
        String str2 = "Hints from the Intent: " + enumMap;
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Boolean] */
    public static Map<wv, ?> a(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> a2 = a(encodedQuery);
        EnumMap enumMap = new EnumMap(wv.class);
        for (wv wvVar : wv.values()) {
            if (wvVar != wv.CHARACTER_SET && wvVar != wv.NEED_RESULT_POINT_CALLBACK && wvVar != wv.POSSIBLE_FORMATS && (str = a2.get(wvVar.name())) != null) {
                String str2 = str;
                if (!wvVar.getValueType().equals(Object.class)) {
                    if (!wvVar.getValueType().equals(Void.class)) {
                        str2 = str;
                        if (!wvVar.getValueType().equals(String.class)) {
                            if (wvVar.getValueType().equals(Boolean.class)) {
                                if (!str.isEmpty() && ("0".equals(str) || "false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str))) {
                                    str2 = Boolean.FALSE;
                                }
                            } else if (wvVar.getValueType().equals(int[].class)) {
                                boolean isEmpty = str.isEmpty();
                                String str3 = str;
                                if (!isEmpty) {
                                    char charAt = str.charAt(str.length() - 1);
                                    str3 = str;
                                    if (charAt == ',') {
                                        str3 = str.substring(0, str.length() - 1);
                                    }
                                }
                                String[] split = a.split(str3);
                                int[] iArr = new int[split.length];
                                for (int i = 0; i < split.length; i++) {
                                    try {
                                        iArr[i] = Integer.parseInt(split[i]);
                                    } catch (NumberFormatException unused) {
                                        String str4 = "Skipping array of integers hint " + wvVar + " due to invalid numeric value: '" + split[i] + '\'';
                                        iArr = null;
                                    }
                                }
                                if (iArr != null) {
                                    enumMap.put((EnumMap) wvVar, (wv) iArr);
                                }
                            } else {
                                String str5 = "Unsupported hint type '" + wvVar + "' of type " + wvVar.getValueType();
                            }
                        }
                    }
                    str2 = Boolean.TRUE;
                }
                enumMap.put((EnumMap) wvVar, (wv) str2);
            }
        }
        String str6 = "Hints from the URI: " + enumMap;
        return enumMap;
    }

    private static Map<String, String> a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            if (str.charAt(i) == '&') {
                i++;
            } else {
                int indexOf = str.indexOf(38, i);
                int indexOf2 = str.indexOf(61, i);
                String str3 = "";
                if (indexOf < 0) {
                    if (indexOf2 < 0) {
                        str2 = Uri.decode(str.substring(i).replace('+', ' '));
                    } else {
                        String decode = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        str3 = Uri.decode(str.substring(indexOf2 + 1).replace('+', ' '));
                        str2 = decode;
                    }
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, str3);
                    }
                } else {
                    if (indexOf2 < 0 || indexOf2 > indexOf) {
                        String decode2 = Uri.decode(str.substring(i, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode2)) {
                            hashMap.put(decode2, "");
                        }
                    } else {
                        String decode3 = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        String decode4 = Uri.decode(str.substring(indexOf2 + 1, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode3)) {
                            hashMap.put(decode3, decode4);
                        }
                    }
                    i = indexOf + 1;
                }
            }
        }
        return hashMap;
    }
}
