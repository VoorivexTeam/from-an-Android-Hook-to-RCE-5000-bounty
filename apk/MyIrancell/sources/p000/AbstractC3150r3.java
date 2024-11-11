package p000;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0301g;
import androidx.lifecycle.InterfaceC0313s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: r3 */
/* loaded from: classes.dex */
public abstract class AbstractC3150r3 {

    /* renamed from: r3$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        C3329v3<D> mo4096a(int i, Bundle bundle);

        /* renamed from: a */
        void mo4097a(C3329v3<D> c3329v3);

        /* renamed from: a */
        void mo4098a(C3329v3<D> c3329v3, D d);
    }

    /* renamed from: a */
    public static <T extends InterfaceC0301g & InterfaceC0313s> AbstractC3150r3 m15184a(T t) {
        return new C3189s3(t, t.mo1685d());
    }

    /* renamed from: a */
    public abstract <D> C3329v3<D> mo15185a(int i, Bundle bundle, a<D> aVar);

    /* renamed from: a */
    public abstract void mo15186a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo15187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract <D> C3329v3<D> mo15188b(int i, Bundle bundle, a<D> aVar);
}
