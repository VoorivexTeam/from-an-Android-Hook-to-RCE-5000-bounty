package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class xm implements nn.b {
    private final nn a;
    private final tl b;

    private xm(nn nnVar, tl tlVar) {
        this.a = nnVar;
        this.b = tlVar;
    }

    public static nn.b a(nn nnVar, tl tlVar) {
        return new xm(nnVar, tlVar);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.b(this.a, this.b, (SQLiteDatabase) obj);
    }
}
