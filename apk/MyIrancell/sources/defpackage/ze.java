package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import defpackage.qe;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ze implements j<InputStream, Bitmap> {
    private final qe a;
    private final bc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements qe.b {
        private final xe a;
        private final di b;

        a(xe xeVar, di diVar) {
            this.a = xeVar;
            this.b = diVar;
        }

        @Override // qe.b
        public void a() {
            this.a.a();
        }

        @Override // qe.b
        public void a(ec ecVar, Bitmap bitmap) {
            IOException a = this.b.a();
            if (a != null) {
                if (bitmap == null) {
                    throw a;
                }
                ecVar.a(bitmap);
                throw a;
            }
        }
    }

    public ze(qe qeVar, bc bcVar) {
        this.a = qeVar;
        this.b = bcVar;
    }

    @Override // com.bumptech.glide.load.j
    public vb<Bitmap> a(InputStream inputStream, int i, int i2, i iVar) {
        xe xeVar;
        boolean z;
        if (inputStream instanceof xe) {
            xeVar = (xe) inputStream;
            z = false;
        } else {
            xeVar = new xe(inputStream, this.b);
            z = true;
        }
        di b = di.b(xeVar);
        try {
            return this.a.a(new hi(b), i, i2, iVar, new a(xeVar, b));
        } finally {
            b.c();
            if (z) {
                xeVar.c();
            }
        }
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(InputStream inputStream, i iVar) {
        return this.a.a(inputStream);
    }
}
