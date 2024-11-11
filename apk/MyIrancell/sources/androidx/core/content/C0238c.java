package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0224b;

/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
public final class C0238c {
    /* renamed from: a */
    public static int m1469a(Context context, String str) {
        return m1470a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m1470a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m1368a = C0224b.m1368a(str);
        if (m1368a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0224b.m1367a(context, m1368a, str2) != 0 ? -2 : 0;
    }
}
