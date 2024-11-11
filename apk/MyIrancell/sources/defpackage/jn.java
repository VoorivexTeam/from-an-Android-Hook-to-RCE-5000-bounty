package defpackage;

import android.database.Cursor;
import defpackage.nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class jn implements nn.b {
    private static final jn a = new jn();

    private jn() {
    }

    public static nn.b a() {
        return a;
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.b((Cursor) obj);
    }
}
