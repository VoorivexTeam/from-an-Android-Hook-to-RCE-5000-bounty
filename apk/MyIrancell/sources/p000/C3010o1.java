package p000;

import java.util.Locale;

/* renamed from: o1 */
/* loaded from: classes.dex */
public final class C3010o1 {

    /* renamed from: a */
    public static final InterfaceC2964n1 f12376a;

    /* renamed from: b */
    public static final InterfaceC2964n1 f12377b;

    /* renamed from: o1$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f12378b = new a(true);

        /* renamed from: a */
        private final boolean f12379a;

        static {
            new a(false);
        }

        private a(boolean z) {
            this.f12379a = z;
        }

        @Override // p000.C3010o1.c
        /* renamed from: a */
        public int mo14409a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m14407a = C3010o1.m14407a(Character.getDirectionality(charSequence.charAt(i)));
                if (m14407a != 0) {
                    if (m14407a != 1) {
                        continue;
                        i++;
                    } else if (!this.f12379a) {
                        return 1;
                    }
                } else if (this.f12379a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f12379a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: o1$b */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f12380a = new b();

        private b() {
        }

        @Override // p000.C3010o1.c
        /* renamed from: a */
        public int mo14409a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C3010o1.m14408b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo14409a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: o1$d */
    /* loaded from: classes.dex */
    private static abstract class d implements InterfaceC2964n1 {

        /* renamed from: a */
        private final c f12381a;

        d(c cVar) {
            this.f12381a = cVar;
        }

        /* renamed from: b */
        private boolean m14410b(CharSequence charSequence, int i, int i2) {
            int mo14409a = this.f12381a.mo14409a(charSequence, i, i2);
            if (mo14409a == 0) {
                return true;
            }
            if (mo14409a != 1) {
                return mo14411a();
            }
            return false;
        }

        /* renamed from: a */
        protected abstract boolean mo14411a();

        @Override // p000.InterfaceC2964n1
        /* renamed from: a */
        public boolean mo14224a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f12381a == null ? mo14411a() : m14410b(charSequence, i, i2);
        }
    }

    /* renamed from: o1$e */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f12382b;

        e(c cVar, boolean z) {
            super(cVar);
            this.f12382b = z;
        }

        @Override // p000.C3010o1.d
        /* renamed from: a */
        protected boolean mo14411a() {
            return this.f12382b;
        }
    }

    /* renamed from: o1$f */
    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f12383b = new f();

        f() {
            super(null);
        }

        @Override // p000.C3010o1.d
        /* renamed from: a */
        protected boolean mo14411a() {
            return C3067p1.m14684b(Locale.getDefault()) == 1;
        }
    }

    static {
        new e(null, false);
        new e(null, true);
        f12376a = new e(b.f12380a, false);
        f12377b = new e(b.f12380a, true);
        new e(a.f12378b, false);
        f fVar = f.f12383b;
    }

    /* renamed from: a */
    static int m14407a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m14408b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
