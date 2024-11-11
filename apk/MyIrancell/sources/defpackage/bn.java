package defpackage;

import android.database.Cursor;
import defpackage.nn;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements nn.b {
    private final Map a;

    private bn(Map map) {
        this.a = map;
    }

    public static nn.b a(Map map) {
        return new bn(map);
    }

    @Override // nn.b
    public Object a(Object obj) {
        return nn.a(this.a, (Cursor) obj);
    }
}
