package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class z50 implements w50 {
    private String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    @Override // defpackage.w50
    public String a(String str) {
        String b = b(str);
        String d = w60.d(str);
        if (TextUtils.isEmpty(b)) {
            return d;
        }
        return d + "." + b;
    }
}
