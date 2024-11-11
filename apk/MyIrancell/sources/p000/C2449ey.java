package p000;

import java.util.regex.Pattern;

/* renamed from: ey */
/* loaded from: classes.dex */
public final class C2449ey extends AbstractC3375vx {

    /* renamed from: e */
    private static final Pattern f10045e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m11640e(String str) {
        return str != null && f10045e.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2363cy mo3202a(C2488fw c2488fw) {
        String[] m16059a;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("MATMSG:") || (m16059a = AbstractC3375vx.m16059a("TO:", m14848b, true)) == null) {
            return null;
        }
        for (String str : m16059a) {
            if (!m11640e(str)) {
                return null;
            }
        }
        return new C2363cy(m16059a, null, null, AbstractC3375vx.m16060b("SUB:", m14848b, false), AbstractC3375vx.m16060b("BODY:", m14848b, false));
    }
}
