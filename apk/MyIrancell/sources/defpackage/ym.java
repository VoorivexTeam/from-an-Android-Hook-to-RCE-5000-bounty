package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class ym implements nn.b {
    private static final ym a = new ym();

    private ym() {
    }

    public static nn.b a() {
        return a;
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.c((SQLiteDatabase) obj);
    }
}
