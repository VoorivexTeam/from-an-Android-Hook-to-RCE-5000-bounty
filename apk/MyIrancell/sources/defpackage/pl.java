package defpackage;

import defpackage.il;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class pl {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(Integer num);

        public abstract a a(String str);

        public final a a(String str, int i) {
            b().put(str, String.valueOf(i));
            return this;
        }

        public final a a(String str, long j) {
            b().put(str, String.valueOf(j));
            return this;
        }

        public final a a(String str, String str2) {
            b().put(str, str2);
            return this;
        }

        protected abstract a a(Map<String, String> map);

        public abstract a a(ol olVar);

        public abstract pl a();

        protected abstract Map<String, String> b();

        public abstract a b(long j);
    }

    public static a i() {
        il.b bVar = new il.b();
        bVar.a(new HashMap());
        return bVar;
    }

    public final String a(String str) {
        String str2 = a().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> a();

    public final int b(String str) {
        String str2 = a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer b();

    public final long c(String str) {
        String str2 = a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public abstract ol c();

    public abstract long d();

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(a());
    }

    public abstract String f();

    public abstract long g();

    public a h() {
        il.b bVar = new il.b();
        bVar.a(f());
        bVar.a(b());
        bVar.a(c());
        bVar.a(d());
        bVar.b(g());
        bVar.a(new HashMap(a()));
        return bVar;
    }
}
