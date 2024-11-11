package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class yy extends py {
    private static final Pattern e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");
    private static final Pattern f = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // defpackage.py
    public xy a(fw fwVar) {
        String b = py.b(fwVar);
        if (b.startsWith("URL:") || b.startsWith("URI:")) {
            return new xy(b.substring(4).trim(), null);
        }
        String trim = b.trim();
        if (e(trim)) {
            return new xy(trim, null);
        }
        return null;
    }
}
