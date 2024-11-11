package defpackage;

import android.database.Cursor;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class ln implements nn.b {
    private static final ln a = new ln();

    private ln() {
    }

    public static nn.b a() {
        return a;
    }

    @Override // nn.b
    public Object a(Object obj) {
        Long valueOf;
        valueOf = Long.valueOf(r2.moveToNext() ? ((Cursor) obj).getLong(0) : 0L);
        return valueOf;
    }
}
