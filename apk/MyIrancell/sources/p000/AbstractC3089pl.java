package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.C2599il;

/* renamed from: pl */
/* loaded from: classes.dex */
public abstract class AbstractC3089pl {

    /* renamed from: pl$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract a mo12484a(long j);

        /* renamed from: a */
        public abstract a mo12485a(Integer num);

        /* renamed from: a */
        public abstract a mo12486a(String str);

        /* renamed from: a */
        public final a m14807a(String str, int i) {
            mo12490b().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final a m14808a(String str, long j) {
            mo12490b().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final a m14809a(String str, String str2) {
            mo12490b().put(str, str2);
            return this;
        }

        /* renamed from: a */
        protected abstract a mo12487a(Map<String, String> map);

        /* renamed from: a */
        public abstract a mo12488a(C3050ol c3050ol);

        /* renamed from: a */
        public abstract AbstractC3089pl mo12489a();

        /* renamed from: b */
        protected abstract Map<String, String> mo12490b();

        /* renamed from: b */
        public abstract a mo12491b(long j);
    }

    /* renamed from: i */
    public static a m14801i() {
        C2599il.b bVar = new C2599il.b();
        bVar.mo12487a(new HashMap());
        return bVar;
    }

    /* renamed from: a */
    public final String m14802a(String str) {
        String str2 = mo12478a().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo12478a();

    /* renamed from: b */
    public final int m14803b(String str) {
        String str2 = mo12478a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: b */
    public abstract Integer mo12479b();

    /* renamed from: c */
    public final long m14804c(String str) {
        String str2 = mo12478a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: c */
    public abstract C3050ol mo12480c();

    /* renamed from: d */
    public abstract long mo12481d();

    /* renamed from: e */
    public final Map<String, String> m14805e() {
        return Collections.unmodifiableMap(mo12478a());
    }

    /* renamed from: f */
    public abstract String mo12482f();

    /* renamed from: g */
    public abstract long mo12483g();

    /* renamed from: h */
    public a m14806h() {
        C2599il.b bVar = new C2599il.b();
        bVar.mo12486a(mo12482f());
        bVar.mo12485a(mo12479b());
        bVar.mo12488a(mo12480c());
        bVar.mo12484a(mo12481d());
        bVar.mo12491b(mo12483g());
        bVar.mo12487a(new HashMap(mo12478a()));
        return bVar;
    }
}
