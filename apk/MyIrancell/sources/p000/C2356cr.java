package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: cr */
/* loaded from: classes.dex */
public final class C2356cr {

    /* renamed from: a */
    private static final Logger f9595a = Logger.getLogger(C2356cr.class.getName());

    private C2356cr() {
    }

    /* renamed from: a */
    public static void m11210a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f9595a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
