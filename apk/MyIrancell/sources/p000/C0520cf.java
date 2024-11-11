package p000;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0574h;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: cf */
/* loaded from: classes.dex */
public class C0520cf<T> implements InterfaceC0576j<T, Bitmap> {

    /* renamed from: d */
    public static final C0574h<Long> f3003d = C0574h.m3957a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final C0574h<Integer> f3004e = C0574h.m3957a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    private static final d f3005f = new d();

    /* renamed from: a */
    private final e<T> f3006a;

    /* renamed from: b */
    private final InterfaceC2427ec f3007b;

    /* renamed from: c */
    private final d f3008c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cf$a */
    /* loaded from: classes.dex */
    public class a implements C0574h.b<Long> {

        /* renamed from: a */
        private final ByteBuffer f3009a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.C0574h.b
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3673a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f3009a) {
                this.f3009a.position(0);
                messageDigest.update(this.f3009a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: cf$b */
    /* loaded from: classes.dex */
    class b implements C0574h.b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f3010a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.C0574h.b
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3673a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f3010a) {
                this.f3010a.position(0);
                messageDigest.update(this.f3010a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cf$c */
    /* loaded from: classes.dex */
    public static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // p000.C0520cf.e
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3674a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: cf$d */
    /* loaded from: classes.dex */
    static class d {
        d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m3675a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cf$e */
    /* loaded from: classes.dex */
    public interface e<T> {
        /* renamed from: a */
        void mo3674a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cf$f */
    /* loaded from: classes.dex */
    public static final class f implements e<ParcelFileDescriptor> {
        f() {
        }

        @Override // p000.C0520cf.e
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3674a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C0520cf(InterfaceC2427ec interfaceC2427ec, e<T> eVar) {
        this(interfaceC2427ec, eVar, f3005f);
    }

    C0520cf(InterfaceC2427ec interfaceC2427ec, e<T> eVar, d dVar) {
        this.f3007b = interfaceC2427ec;
        this.f3006a = eVar;
        this.f3008c = dVar;
    }

    /* renamed from: a */
    private static Bitmap m3668a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: a */
    private static Bitmap m3669a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC3082pe abstractC3082pe) {
        Bitmap m3671b = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || abstractC3082pe == AbstractC3082pe.f12598d) ? null : m3671b(mediaMetadataRetriever, j, i, i2, i3, abstractC3082pe);
        return m3671b == null ? m3668a(mediaMetadataRetriever, j, i) : m3671b;
    }

    /* renamed from: a */
    public static InterfaceC0576j<AssetFileDescriptor, Bitmap> m3670a(InterfaceC2427ec interfaceC2427ec) {
        return new C0520cf(interfaceC2427ec, new c(null));
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m3671b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC3082pe abstractC3082pe) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo14750b = abstractC3082pe.mo14750b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * mo14750b), Math.round(mo14750b * parseInt2));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: b */
    public static InterfaceC0576j<ParcelFileDescriptor, Bitmap> m3672b(InterfaceC2427ec interfaceC2427ec) {
        return new C0520cf(interfaceC2427ec, new f());
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a */
    public InterfaceC3353vb<Bitmap> mo3381a(T t, int i, int i2, C0575i c0575i) {
        long longValue = ((Long) c0575i.m3964a(f3003d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c0575i.m3964a(f3004e);
        if (num == null) {
            num = 2;
        }
        AbstractC3082pe abstractC3082pe = (AbstractC3082pe) c0575i.m3964a(AbstractC3082pe.f12600f);
        if (abstractC3082pe == null) {
            abstractC3082pe = AbstractC3082pe.f12599e;
        }
        AbstractC3082pe abstractC3082pe2 = abstractC3082pe;
        MediaMetadataRetriever m3675a = this.f3008c.m3675a();
        try {
            try {
                this.f3006a.mo3674a(m3675a, t);
                Bitmap m3669a = m3669a(m3675a, longValue, num.intValue(), i, i2, abstractC3082pe2);
                m3675a.release();
                return C2812je.m13456a(m3669a, this.f3007b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            m3675a.release();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a */
    public boolean mo3382a(T t, C0575i c0575i) {
        return true;
    }
}
