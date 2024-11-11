package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ey extends vx {
    private static final Pattern e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        return str != null && e.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // defpackage.py
    public cy a(fw fwVar) {
        String[] a;
        String b = py.b(fwVar);
        if (!b.startsWith("MATMSG:") || (a = vx.a("TO:", b, true)) == null) {
            return null;
        }
        for (String str : a) {
            if (!e(str)) {
                return null;
            }
        }
        return new cy(a, null, null, vx.b("SUB:", b, false), vx.b("BODY:", b, false));
    }
}
