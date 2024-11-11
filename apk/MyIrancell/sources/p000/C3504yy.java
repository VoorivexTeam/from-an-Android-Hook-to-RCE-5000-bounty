package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: yy */
/* loaded from: classes.dex */
public final class C3504yy extends AbstractC3102py {

    /* renamed from: e */
    private static final Pattern f14306e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: f */
    private static final Pattern f14307f = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m16686e(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f14306e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f14307f.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3455xy mo3202a(C2488fw c2488fw) {
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (m14848b.startsWith("URL:") || m14848b.startsWith("URI:")) {
            return new C3455xy(m14848b.substring(4).trim(), null);
        }
        String trim = m14848b.trim();
        if (m16686e(trim)) {
            return new C3455xy(trim, null);
        }
        return null;
    }
}
