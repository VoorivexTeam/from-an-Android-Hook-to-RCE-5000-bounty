package defpackage;

/* loaded from: classes.dex */
public final class gy extends py {
    private static String a(int i, String str) {
        char charAt;
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length() && (charAt = substring.charAt(i2)) != ')'; i2++) {
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt != '(') {
                sb.append(charAt);
            } else {
                if (a(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01fb, code lost:
    
        if (r1.equals("10") != false) goto L136;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0216. Please report as an issue. */
    @Override // defpackage.py
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.fy a(defpackage.fw r25) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.a(fw):fy");
    }
}
