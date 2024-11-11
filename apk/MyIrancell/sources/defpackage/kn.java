package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class kn implements nn.b {
    private final String a;

    private kn(String str) {
        this.a = str;
    }

    public static nn.b a(String str) {
        return new kn(str);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.a(this.a, (SQLiteDatabase) obj);
    }
}
