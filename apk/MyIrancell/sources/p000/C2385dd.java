package p000;

import android.util.Log;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0570d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: dd */
/* loaded from: classes.dex */
public class C2385dd implements InterfaceC0570d<ByteBuffer> {
    @Override // com.bumptech.glide.load.InterfaceC0570d
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3950a(ByteBuffer byteBuffer, File file, C0575i c0575i) {
        try {
            C0022ai.m157a(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
