package defpackage;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class r3 {

    /* loaded from: classes.dex */
    public interface a<D> {
        v3<D> a(int i, Bundle bundle);

        void a(v3<D> v3Var);

        void a(v3<D> v3Var, D d);
    }

    public static <T extends g & s> r3 a(T t) {
        return new s3(t, t.d());
    }

    public abstract <D> v3<D> a(int i, Bundle bundle, a<D> aVar);

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> v3<D> b(int i, Bundle bundle, a<D> aVar);
}
