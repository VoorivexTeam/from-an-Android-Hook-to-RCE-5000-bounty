package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class o1 {
    public static final n1 a;
    public static final n1 b;

    /* loaded from: classes.dex */
    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        static {
            new a(false);
        }

        private a(boolean z) {
            this.a = z;
        }

        @Override // o1.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = o1.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // o1.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = o1.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements n1 {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // defpackage.n1
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? a() : b(charSequence, i, i2);
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        private final boolean b;

        e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // o1.d
        protected boolean a() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        @Override // o1.d
        protected boolean a() {
            return p1.b(Locale.getDefault()) == 1;
        }
    }

    static {
        new e(null, false);
        new e(null, true);
        a = new e(b.a, false);
        b = new e(b.a, true);
        new e(a.b, false);
        f fVar = f.b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
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
