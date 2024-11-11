package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C0572f;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0568b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC0576j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p000.InterfaceC0513ca;

/* renamed from: mf */
/* loaded from: classes.dex */
public class C2941mf implements InterfaceC0576j<ByteBuffer, C3033of> {

    /* renamed from: f */
    private static final a f12139f = new a();

    /* renamed from: g */
    private static final b f12140g = new b();

    /* renamed from: a */
    private final Context f12141a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f12142b;

    /* renamed from: c */
    private final b f12143c;

    /* renamed from: d */
    private final a f12144d;

    /* renamed from: e */
    private final C2987nf f12145e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mf$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        /* renamed from: a */
        InterfaceC0513ca m14101a(InterfaceC0513ca.a aVar, C2423ea c2423ea, ByteBuffer byteBuffer, int i) {
            return new C2504ga(aVar, c2423ea, byteBuffer, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mf$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Queue<C2466fa> f12146a = C2861ki.m13727a(0);

        b() {
        }

        /* renamed from: a */
        synchronized C2466fa m14102a(ByteBuffer byteBuffer) {
            C2466fa poll;
            poll = this.f12146a.poll();
            if (poll == null) {
                poll = new C2466fa();
            }
            poll.m11736a(byteBuffer);
            return poll;
        }

        /* renamed from: a */
        synchronized void m14103a(C2466fa c2466fa) {
            c2466fa.m11737a();
            this.f12146a.offer(c2466fa);
        }
    }

    public C2941mf(Context context, List<ImageHeaderParser> list, InterfaceC2427ec interfaceC2427ec, InterfaceC0475bc interfaceC0475bc) {
        this(context, list, interfaceC2427ec, interfaceC0475bc, f12140g, f12139f);
    }

    C2941mf(Context context, List<ImageHeaderParser> list, InterfaceC2427ec interfaceC2427ec, InterfaceC0475bc interfaceC0475bc, b bVar, a aVar) {
        this.f12141a = context.getApplicationContext();
        this.f12142b = list;
        this.f12144d = aVar;
        this.f12145e = new C2987nf(interfaceC2427ec, interfaceC0475bc);
        this.f12143c = bVar;
    }

    /* renamed from: a */
    private static int m14099a(C2423ea c2423ea, int i, int i2) {
        int min = Math.min(c2423ea.m11569a() / i2, c2423ea.m11572d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            String str = "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c2423ea.m11572d() + "x" + c2423ea.m11569a() + "]";
        }
        return max;
    }

    /* renamed from: a */
    private C3125qf m14100a(ByteBuffer byteBuffer, int i, int i2, C2466fa c2466fa, C0575i c0575i) {
        long m11768a = C2474fi.m11768a();
        try {
            C2423ea m11738b = c2466fa.m11738b();
            if (m11738b.m11570b() > 0 && m11738b.m11571c() == 0) {
                Bitmap.Config config = c0575i.m3964a(C3304uf.f13466a) == EnumC0568b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC0513ca m14101a = this.f12144d.m14101a(this.f12145e, m11738b, byteBuffer, m14099a(m11738b, i, i2));
                m14101a.mo3620a(config);
                m14101a.mo3622c();
                Bitmap mo3621b = m14101a.mo3621b();
                if (mo3621b == null) {
                    return null;
                }
                C3125qf c3125qf = new C3125qf(new C3033of(this.f12141a, m14101a, C2470fe.m11761a(), i, i2, mo3621b));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    String str = "Decoded GIF from stream in " + C2474fi.m11767a(m11768a);
                }
                return c3125qf;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str2 = "Decoded GIF from stream in " + C2474fi.m11767a(m11768a);
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str3 = "Decoded GIF from stream in " + C2474fi.m11767a(m11768a);
            }
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3125qf mo3381a(ByteBuffer byteBuffer, int i, int i2, C0575i c0575i) {
        C2466fa m14102a = this.f12143c.m14102a(byteBuffer);
        try {
            return m14100a(byteBuffer, i, i2, m14102a, c0575i);
        } finally {
            this.f12143c.m14103a(m14102a);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(ByteBuffer byteBuffer, C0575i c0575i) {
        return !((Boolean) c0575i.m3964a(C3304uf.f13467b)).booleanValue() && C0572f.m3952a(this.f12142b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
