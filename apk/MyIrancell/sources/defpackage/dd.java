package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class dd implements d<ByteBuffer> {
    @Override // com.bumptech.glide.load.d
    public boolean a(ByteBuffer byteBuffer, File file, i iVar) {
        try {
            ai.a(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
