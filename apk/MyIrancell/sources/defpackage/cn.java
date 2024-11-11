package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class cn implements nn.d {
    private final SQLiteDatabase a;

    private cn(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static nn.d a(SQLiteDatabase sQLiteDatabase) {
        return new cn(sQLiteDatabase);
    }

    @Override // nn.d
    public Object a() {
        return nn.b(this.a);
    }
}
