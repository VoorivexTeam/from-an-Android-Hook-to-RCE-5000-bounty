package defpackage;

import java.util.List;
import okio.BufferedSource;

/* loaded from: classes.dex */
public interface y90 {
    public static final y90 a = new a();

    /* loaded from: classes.dex */
    class a implements y90 {
        a() {
        }

        @Override // defpackage.y90
        public void a(int i, o90 o90Var) {
        }

        @Override // defpackage.y90
        public boolean a(int i, List<p90> list) {
            return true;
        }

        @Override // defpackage.y90
        public boolean a(int i, List<p90> list, boolean z) {
            return true;
        }

        @Override // defpackage.y90
        public boolean a(int i, BufferedSource bufferedSource, int i2, boolean z) {
            bufferedSource.skip(i2);
            return true;
        }
    }

    void a(int i, o90 o90Var);

    boolean a(int i, List<p90> list);

    boolean a(int i, List<p90> list, boolean z);

    boolean a(int i, BufferedSource bufferedSource, int i2, boolean z);
}
