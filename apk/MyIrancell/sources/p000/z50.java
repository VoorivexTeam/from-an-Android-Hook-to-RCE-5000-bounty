package p000;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class z50 implements w50 {
    /* renamed from: b */
    private String m16776b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    @Override // p000.w50
    /* renamed from: a */
    public String mo16135a(String str) {
        String m16776b = m16776b(str);
        String m16147d = w60.m16147d(str);
        if (TextUtils.isEmpty(m16776b)) {
            return m16147d;
        }
        return m16147d + "." + m16776b;
    }
}
