package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class zm implements nn.b {
    private final long a;

    private zm(long j) {
        this.a = j;
    }

    public static nn.b a(long j) {
        return new zm(j);
    }

    @Override // nn.b
    public Object a(Object obj) {
        Integer valueOf;
        valueOf = Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.a)}));
        return valueOf;
    }
}
