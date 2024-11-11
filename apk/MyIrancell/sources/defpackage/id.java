package defpackage;

import defpackage.kd;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface id {
    public static final id a;

    /* loaded from: classes.dex */
    class a implements id {
        a() {
        }

        @Override // defpackage.id
        public Map<String, String> a() {
            return Collections.emptyMap();
        }
    }

    static {
        new a();
        a = new kd.a().a();
    }

    Map<String, String> a();
}
