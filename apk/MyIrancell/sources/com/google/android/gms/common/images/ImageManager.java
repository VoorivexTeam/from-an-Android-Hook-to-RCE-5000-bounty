package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1018c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p000.C2398dq;
import p000.C2493g0;

/* loaded from: classes.dex */
public final class ImageManager {

    /* renamed from: i */
    private static final Object f6082i = new Object();

    /* renamed from: j */
    private static HashSet<Uri> f6083j = new HashSet<>();

    /* renamed from: a */
    private final Context f6084a;

    /* renamed from: b */
    private final Handler f6085b;

    /* renamed from: c */
    private final ExecutorService f6086c;

    /* renamed from: d */
    private final C1008a f6087d;

    /* renamed from: e */
    private final C2398dq f6088e;

    /* renamed from: f */
    private final Map<AbstractC1012b, ImageReceiver> f6089f;

    /* renamed from: g */
    private final Map<Uri, ImageReceiver> f6090g;

    /* renamed from: h */
    private final Map<Uri, Long> f6091h;

    @KeepName
    /* loaded from: classes.dex */
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: b */
        private final Uri f6092b;

        /* renamed from: c */
        private final ArrayList<AbstractC1012b> f6093c;

        /* renamed from: d */
        private final /* synthetic */ ImageManager f6094d;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            this.f6094d.f6086c.execute(new RunnableC1009b(this.f6092b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    /* loaded from: classes.dex */
    private static final class C1008a extends C2493g0<C1011a, Bitmap> {
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    /* loaded from: classes.dex */
    private final class RunnableC1009b implements Runnable {

        /* renamed from: b */
        private final Uri f6095b;

        /* renamed from: c */
        private final ParcelFileDescriptor f6096c;

        public RunnableC1009b(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f6095b = uri;
            this.f6096c = parcelFileDescriptor;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Bitmap bitmap;
            C1018c.m7048b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.f6096c;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    String valueOf = String.valueOf(this.f6095b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    sb.toString();
                    z2 = true;
                }
                try {
                    this.f6096c.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.f6085b.post(new RunnableC1010c(this.f6095b, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
                String valueOf2 = String.valueOf(this.f6095b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                sb2.toString();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    /* loaded from: classes.dex */
    private final class RunnableC1010c implements Runnable {

        /* renamed from: b */
        private final Uri f6098b;

        /* renamed from: c */
        private final Bitmap f6099c;

        /* renamed from: d */
        private final CountDownLatch f6100d;

        /* renamed from: e */
        private boolean f6101e;

        public RunnableC1010c(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f6098b = uri;
            this.f6099c = bitmap;
            this.f6101e = z;
            this.f6100d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1018c.m7047a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f6099c != null;
            if (ImageManager.this.f6087d != null) {
                if (this.f6101e) {
                    ImageManager.this.f6087d.m11859a();
                    System.gc();
                    this.f6101e = false;
                    ImageManager.this.f6085b.post(this);
                    return;
                }
                if (z) {
                    ImageManager.this.f6087d.m11858a(new C1011a(this.f6098b), this.f6099c);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f6090g.remove(this.f6098b);
            if (imageReceiver != null) {
                ArrayList arrayList = imageReceiver.f6093c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC1012b abstractC1012b = (AbstractC1012b) arrayList.get(i);
                    ImageManager imageManager = ImageManager.this;
                    if (z) {
                        abstractC1012b.m7028a(imageManager.f6084a, this.f6099c, false);
                    } else {
                        imageManager.f6091h.put(this.f6098b, Long.valueOf(SystemClock.elapsedRealtime()));
                        abstractC1012b.m7029a(ImageManager.this.f6084a, ImageManager.this.f6088e, false);
                    }
                    ImageManager.this.f6089f.remove(abstractC1012b);
                }
            }
            this.f6100d.countDown();
            synchronized (ImageManager.f6082i) {
                ImageManager.f6083j.remove(this.f6098b);
            }
        }
    }
}
