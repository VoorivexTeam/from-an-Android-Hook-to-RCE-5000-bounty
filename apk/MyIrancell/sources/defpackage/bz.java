package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bz extends py {
    private static String a(CharSequence charSequence, String str, boolean z) {
        List<String> a = az.a(charSequence, str, z, false);
        if (a == null || a.isEmpty()) {
            return null;
        }
        return a.get(0);
    }

    private static String[] b(CharSequence charSequence, String str, boolean z) {
        List<List<String>> b = az.b(charSequence, str, z, false);
        if (b == null || b.isEmpty()) {
            return null;
        }
        int size = b.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = b.get(i).get(0);
        }
        return strArr;
    }

    private static String e(String str) {
        return str != null ? (str.startsWith("mailto:") || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }

    @Override // defpackage.py
    public by a(fw fwVar) {
        double parseDouble;
        String b = py.b(fwVar);
        if (b.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String a = a((CharSequence) "SUMMARY", b, true);
        String a2 = a((CharSequence) "DTSTART", b, true);
        if (a2 == null) {
            return null;
        }
        String a3 = a((CharSequence) "DTEND", b, true);
        String a4 = a((CharSequence) "DURATION", b, true);
        String a5 = a((CharSequence) "LOCATION", b, true);
        String e = e(a((CharSequence) "ORGANIZER", b, true));
        String[] b2 = b("ATTENDEE", b, true);
        if (b2 != null) {
            for (int i = 0; i < b2.length; i++) {
                b2[i] = e(b2[i]);
            }
        }
        String a6 = a((CharSequence) "DESCRIPTION", b, true);
        String a7 = a((CharSequence) "GEO", b, true);
        double d = Double.NaN;
        if (a7 == null) {
            parseDouble = Double.NaN;
        } else {
            int indexOf = a7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                d = Double.parseDouble(a7.substring(0, indexOf));
                parseDouble = Double.parseDouble(a7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new by(a, a2, a3, a4, a5, e, b2, a6, d, parseDouble);
    }
}
