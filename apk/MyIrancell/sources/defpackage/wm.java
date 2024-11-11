package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class wm implements nn.b {
    private final long a;
    private final tl b;

    private wm(long j, tl tlVar) {
        this.a = j;
        this.b = tlVar;
    }

    public static nn.b a(long j, tl tlVar) {
        return new wm(j, tlVar);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.a(this.a, this.b, (SQLiteDatabase) obj);
    }
}
