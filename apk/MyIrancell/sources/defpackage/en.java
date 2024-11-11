package defpackage;

import android.database.Cursor;
import defpackage.nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class en implements nn.b {
    private static final en a = new en();

    private en() {
    }

    public static nn.b a() {
        return a;
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.c((Cursor) obj);
    }
}
