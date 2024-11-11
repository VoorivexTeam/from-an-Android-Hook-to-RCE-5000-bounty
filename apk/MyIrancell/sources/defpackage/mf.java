package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import defpackage.ca;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class mf implements j<ByteBuffer, of> {
    private static final a f = new a();
    private static final b g = new b();
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final nf e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        ca a(ca.a aVar, ea eaVar, ByteBuffer byteBuffer, int i) {
            return new ga(aVar, eaVar, byteBuffer, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        private final Queue<fa> a = ki.a(0);

        b() {
        }

        synchronized fa a(ByteBuffer byteBuffer) {
            fa poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new fa();
            }
            poll.a(byteBuffer);
            return poll;
        }

        synchronized void a(fa faVar) {
            faVar.a();
            this.a.offer(faVar);
        }
    }

    public mf(Context context, List<ImageHeaderParser> list, ec ecVar, bc bcVar) {
        this(context, list, ecVar, bcVar, g, f);
    }

    mf(Context context, List<ImageHeaderParser> list, ec ecVar, bc bcVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new nf(ecVar, bcVar);
        this.c = bVar;
    }

    private static int a(ea eaVar, int i, int i2) {
        int min = Math.min(eaVar.a() / i2, eaVar.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            String str = "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + eaVar.d() + "x" + eaVar.a() + "]";
        }
        return max;
    }

    private qf a(ByteBuffer byteBuffer, int i, int i2, fa faVar, i iVar) {
        long a2 = fi.a();
        try {
            ea b2 = faVar.b();
            if (b2.b() > 0 && b2.c() == 0) {
                Bitmap.Config config = iVar.a(uf.a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                ca a3 = this.d.a(this.e, b2, byteBuffer, a(b2, i, i2));
                a3.a(config);
                a3.c();
                Bitmap b3 = a3.b();
                if (b3 == null) {
                    return null;
                }
                qf qfVar = new qf(new of(this.a, a3, fe.a(), i, i2, b3));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    String str = "Decoded GIF from stream in " + fi.a(a2);
                }
                return qfVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str2 = "Decoded GIF from stream in " + fi.a(a2);
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str3 = "Decoded GIF from stream in " + fi.a(a2);
            }
        }
    }

    @Override // com.bumptech.glide.load.j
    public qf a(ByteBuffer byteBuffer, int i, int i2, i iVar) {
        fa a2 = this.c.a(byteBuffer);
        try {
            return a(byteBuffer, i, i2, a2, iVar);
        } finally {
            this.c.a(a2);
        }
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return !((Boolean) iVar.a(uf.b)).booleanValue() && f.a(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
