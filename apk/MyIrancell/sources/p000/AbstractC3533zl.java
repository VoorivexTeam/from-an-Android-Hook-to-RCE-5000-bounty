package p000;

import android.content.Context;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zl */
/* loaded from: classes.dex */
public abstract class AbstractC3533zl implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zl$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        a mo13917a(Context context);

        /* renamed from: a */
        AbstractC3533zl mo13918a();
    }

    /* renamed from: a */
    abstract InterfaceC3132qm mo13915a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C3491yl mo13916c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo13915a().close();
    }
}
