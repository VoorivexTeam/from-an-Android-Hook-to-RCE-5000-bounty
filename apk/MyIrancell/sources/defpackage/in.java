package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class in implements nn.b {
    private final nn a;
    private final tl b;
    private final pl c;

    private in(nn nnVar, tl tlVar, pl plVar) {
        this.a = nnVar;
        this.b = tlVar;
        this.c = plVar;
    }

    public static nn.b a(nn nnVar, tl tlVar, pl plVar) {
        return new in(nnVar, tlVar, plVar);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.a(this.a, this.b, this.c, (SQLiteDatabase) obj);
    }
}
