package defpackage;

import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ed implements od<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements ka<ByteBuffer> {
        private final File b;

        a(File file) {
            this.b = file;
        }

        @Override // defpackage.ka
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super ByteBuffer> aVar) {
            try {
                aVar.a((ka.a<? super ByteBuffer>) ai.a(this.b));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.ka
        public void b() {
        }

        @Override // defpackage.ka
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.ka
        public void cancel() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements pd<File, ByteBuffer> {
        @Override // defpackage.pd
        public od<File, ByteBuffer> a(sd sdVar) {
            return new ed();
        }
    }

    @Override // defpackage.od
    public od.a<ByteBuffer> a(File file, int i, int i2, i iVar) {
        return new od.a<>(new zh(file), new a(file));
    }

    @Override // defpackage.od
    public boolean a(File file) {
        return true;
    }
}
