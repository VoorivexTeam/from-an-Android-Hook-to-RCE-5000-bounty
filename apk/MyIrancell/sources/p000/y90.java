package p000;

import java.util.List;
import okio.BufferedSource;

/* loaded from: classes.dex */
public interface y90 {

    /* renamed from: a */
    public static final y90 f14119a = new C3479a();

    /* renamed from: y90$a */
    /* loaded from: classes.dex */
    class C3479a implements y90 {
        C3479a() {
        }

        @Override // p000.y90
        /* renamed from: a */
        public void mo16612a(int i, o90 o90Var) {
        }

        @Override // p000.y90
        /* renamed from: a */
        public boolean mo16613a(int i, List<p90> list) {
            return true;
        }

        @Override // p000.y90
        /* renamed from: a */
        public boolean mo16614a(int i, List<p90> list, boolean z) {
            return true;
        }

        @Override // p000.y90
        /* renamed from: a */
        public boolean mo16615a(int i, BufferedSource bufferedSource, int i2, boolean z) {
            bufferedSource.skip(i2);
            return true;
        }
    }

    /* renamed from: a */
    void mo16612a(int i, o90 o90Var);

    /* renamed from: a */
    boolean mo16613a(int i, List<p90> list);

    /* renamed from: a */
    boolean mo16614a(int i, List<p90> list, boolean z);

    /* renamed from: a */
    boolean mo16615a(int i, BufferedSource bufferedSource, int i2, boolean z);
}
