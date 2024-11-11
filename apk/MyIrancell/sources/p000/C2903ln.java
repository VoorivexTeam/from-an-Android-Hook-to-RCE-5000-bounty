package p000;

import android.database.Cursor;
import p000.C2995nn;

/* renamed from: ln */
/* loaded from: classes.dex */
final /* synthetic */ class C2903ln implements C2995nn.b {

    /* renamed from: a */
    private static final C2903ln f11915a = new C2903ln();

    private C2903ln() {
    }

    /* renamed from: a */
    public static C2995nn.b m13921a() {
        return f11915a;
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        Long valueOf;
        valueOf = Long.valueOf(r2.moveToNext() ? ((Cursor) obj).getLong(0) : 0L);
        return valueOf;
    }
}
