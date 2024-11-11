package p000;

import java.util.List;

/* renamed from: bz */
/* loaded from: classes.dex */
public final class C0498bz extends AbstractC3102py {
    /* renamed from: a */
    private static String m3469a(CharSequence charSequence, String str, boolean z) {
        List<String> m3205a = C0441az.m3205a(charSequence, str, z, false);
        if (m3205a == null || m3205a.isEmpty()) {
            return null;
        }
        return m3205a.get(0);
    }

    /* renamed from: b */
    private static String[] m3470b(CharSequence charSequence, String str, boolean z) {
        List<List<String>> m3211b = C0441az.m3211b(charSequence, str, z, false);
        if (m3211b == null || m3211b.isEmpty()) {
            return null;
        }
        int size = m3211b.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = m3211b.get(i).get(0);
        }
        return strArr;
    }

    /* renamed from: e */
    private static String m3471e(String str) {
        return str != null ? (str.startsWith("mailto:") || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C0497by mo3202a(C2488fw c2488fw) {
        double parseDouble;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (m14848b.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String m3469a = m3469a((CharSequence) "SUMMARY", m14848b, true);
        String m3469a2 = m3469a((CharSequence) "DTSTART", m14848b, true);
        if (m3469a2 == null) {
            return null;
        }
        String m3469a3 = m3469a((CharSequence) "DTEND", m14848b, true);
        String m3469a4 = m3469a((CharSequence) "DURATION", m14848b, true);
        String m3469a5 = m3469a((CharSequence) "LOCATION", m14848b, true);
        String m3471e = m3471e(m3469a((CharSequence) "ORGANIZER", m14848b, true));
        String[] m3470b = m3470b("ATTENDEE", m14848b, true);
        if (m3470b != null) {
            for (int i = 0; i < m3470b.length; i++) {
                m3470b[i] = m3471e(m3470b[i]);
            }
        }
        String m3469a6 = m3469a((CharSequence) "DESCRIPTION", m14848b, true);
        String m3469a7 = m3469a((CharSequence) "GEO", m14848b, true);
        double d = Double.NaN;
        if (m3469a7 == null) {
            parseDouble = Double.NaN;
        } else {
            int indexOf = m3469a7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                d = Double.parseDouble(m3469a7.substring(0, indexOf));
                parseDouble = Double.parseDouble(m3469a7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new C0497by(m3469a, m3469a2, m3469a3, m3469a4, m3469a5, m3471e, m3470b, m3469a6, d, parseDouble);
    }
}
