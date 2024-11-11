package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.sn;

/* loaded from: classes.dex */
final /* synthetic */ class rn implements sn.a {
    private static final rn a = new rn();

    private rn() {
    }

    public static sn.a a() {
        return a;
    }

    @Override // sn.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
