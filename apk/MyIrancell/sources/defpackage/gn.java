package defpackage;

import android.database.Cursor;
import defpackage.nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class gn implements nn.b {
    private static final gn a = new gn();

    private gn() {
    }

    public static nn.b a() {
        return a;
    }

    @Override // nn.b
    public Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
