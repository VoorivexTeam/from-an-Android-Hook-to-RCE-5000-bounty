package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ca {

    /* loaded from: classes.dex */
    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void a(Bitmap bitmap);

        void a(byte[] bArr);

        void a(int[] iArr);

        byte[] a(int i);

        int[] b(int i);
    }

    int a();

    void a(Bitmap.Config config);

    Bitmap b();

    void c();

    void clear();

    int d();

    int e();

    int f();

    ByteBuffer g();

    void h();
}
