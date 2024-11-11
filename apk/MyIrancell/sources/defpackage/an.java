package defpackage;

import android.database.Cursor;
import defpackage.nn;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements nn.b {
    private final List a;
    private final tl b;

    private an(List list, tl tlVar) {
        this.a = list;
        this.b = tlVar;
    }

    public static nn.b a(List list, tl tlVar) {
        return new an(list, tlVar);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.a(this.a, this.b, (Cursor) obj);
    }
}
