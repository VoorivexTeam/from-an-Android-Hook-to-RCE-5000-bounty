package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C3216sn;

/* renamed from: rn */
/* loaded from: classes.dex */
final /* synthetic */ class C3172rn implements C3216sn.a {

    /* renamed from: a */
    private static final C3172rn f12979a = new C3172rn();

    private C3172rn() {
    }

    /* renamed from: a */
    public static C3216sn.a m15289a() {
        return f12979a;
    }

    @Override // p000.C3216sn.a
    /* renamed from: a */
    public void mo14814a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
