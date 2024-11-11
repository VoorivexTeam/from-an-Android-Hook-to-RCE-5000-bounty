package defpackage;

import defpackage.tk;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dl {

    /* loaded from: classes.dex */
    public static abstract class a {
        abstract a a(int i);

        public abstract a a(long j);

        abstract a a(String str);

        public abstract a a(List<bl> list);

        public abstract a a(nk nkVar);

        public abstract a a(yk ykVar);

        public abstract dl a();

        public a b(int i) {
            a(i);
            return this;
        }

        public abstract a b(long j);

        public a b(String str) {
            a(str);
            return this;
        }
    }

    public static a a() {
        tk.b bVar = new tk.b();
        bVar.a(Integer.MIN_VALUE);
        return bVar;
    }
}
