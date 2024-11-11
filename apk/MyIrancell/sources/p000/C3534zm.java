package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: zm */
/* loaded from: classes.dex */
final /* synthetic */ class C3534zm implements C2995nn.b {

    /* renamed from: a */
    private final long f14528a;

    private C3534zm(long j) {
        this.f14528a = j;
    }

    /* renamed from: a */
    public static C2995nn.b m16951a(long j) {
        return new C3534zm(j);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        Integer valueOf;
        valueOf = Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f14528a)}));
        return valueOf;
    }
}
