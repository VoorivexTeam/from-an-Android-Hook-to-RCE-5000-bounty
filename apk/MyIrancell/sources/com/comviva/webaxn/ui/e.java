package com.comviva.webaxn.ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.CameraData;
import com.comviva.webaxn.utils.x1;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e extends Fragment implements View.OnClickListener {
    private static final String I = e.class.getCanonicalName();
    private static final SparseIntArray J;
    private CaptureRequest.Builder A;
    private long C;
    private OrientationEventListener b;
    private String d;
    private AutoFitTextureView f;
    private ImageButton g;
    private TextView h;
    private TextView i;
    private TextView j;
    private RelativeLayout k;
    private String l;
    private HandlerThread m;
    private String q;
    private CameraCaptureSession r;
    private CameraDevice s;
    private Size t;
    private CameraCharacteristics u;
    private Handler v;
    private l<ImageReader> w;
    private boolean c = false;
    private final TextureView.SurfaceTextureListener e = new a();
    private final AtomicInteger n = new AtomicInteger();
    private final Semaphore o = new Semaphore(1);
    private final Object p = new Object();
    private boolean x = false;
    private int y = 0;
    private final TreeMap<Integer, k.b> z = new TreeMap<>();
    private int B = 0;
    private final CameraDevice.StateCallback D = new b();
    private final ImageReader.OnImageAvailableListener E = new c();
    private CameraCaptureSession.CaptureCallback F = new d();
    private final CameraCaptureSession.CaptureCallback G = new C0030e();
    private final Handler H = new f(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            e.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            synchronized (e.this.p) {
                e.this.t = null;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            e.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* loaded from: classes.dex */
    class b extends CameraDevice.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            synchronized (e.this.p) {
                e.this.B = 0;
                e.this.o.release();
                cameraDevice.close();
                e.this.s = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            synchronized (e.this.p) {
                e.this.B = 0;
                e.this.o.release();
                cameraDevice.close();
                e.this.s = null;
            }
            Activity activity = e.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            synchronized (e.this.p) {
                e.this.B = 1;
                e.this.o.release();
                e.this.s = cameraDevice;
                if (e.this.t != null && e.this.f.isAvailable()) {
                    e.this.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements ImageReader.OnImageAvailableListener {
        c() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            e eVar = e.this;
            eVar.a((TreeMap<Integer, k.b>) eVar.z, (l<ImageReader>) e.this.w);
        }
    }

    /* loaded from: classes.dex */
    class d extends CameraCaptureSession.CaptureCallback {
        d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[Catch: all -> 0x0098, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0096, B:11:0x0012, B:13:0x001c, B:16:0x0028, B:18:0x002f, B:22:0x003a, B:24:0x0043, B:29:0x005a, B:31:0x0060, B:36:0x006a, B:40:0x0076, B:42:0x007e, B:44:0x0086, B:46:0x0091), top: B:3:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0086 A[Catch: all -> 0x0098, LOOP:0: B:42:0x007e->B:44:0x0086, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0096, B:11:0x0012, B:13:0x001c, B:16:0x0028, B:18:0x002f, B:22:0x003a, B:24:0x0043, B:29:0x005a, B:31:0x0060, B:36:0x006a, B:40:0x0076, B:42:0x007e, B:44:0x0086, B:46:0x0091), top: B:3:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(android.hardware.camera2.CaptureResult r8) {
            /*
                r7 = this;
                com.comviva.webaxn.ui.e r0 = com.comviva.webaxn.ui.e.this
                java.lang.Object r0 = com.comviva.webaxn.ui.e.a(r0)
                monitor-enter(r0)
                com.comviva.webaxn.ui.e r1 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                int r1 = com.comviva.webaxn.ui.e.n(r1)     // Catch: java.lang.Throwable -> L98
                r2 = 3
                if (r1 == r2) goto L12
                goto L96
            L12:
                com.comviva.webaxn.ui.e r1 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                boolean r1 = com.comviva.webaxn.ui.e.b(r1)     // Catch: java.lang.Throwable -> L98
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L39
                android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE     // Catch: java.lang.Throwable -> L98
                java.lang.Object r1 = r8.get(r1)     // Catch: java.lang.Throwable -> L98
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L98
                if (r1 != 0) goto L28
                goto L96
            L28:
                int r4 = r1.intValue()     // Catch: java.lang.Throwable -> L98
                r5 = 4
                if (r4 == r5) goto L39
                int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L98
                r4 = 5
                if (r1 != r4) goto L37
                goto L39
            L37:
                r1 = 0
                goto L3a
            L39:
                r1 = 1
            L3a:
                com.comviva.webaxn.ui.e r4 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                boolean r4 = com.comviva.webaxn.ui.e.c(r4)     // Catch: java.lang.Throwable -> L98
                r5 = 2
                if (r4 != 0) goto L68
                android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE     // Catch: java.lang.Throwable -> L98
                java.lang.Object r4 = r8.get(r4)     // Catch: java.lang.Throwable -> L98
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L98
                android.hardware.camera2.CaptureResult$Key r6 = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE     // Catch: java.lang.Throwable -> L98
                java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L98
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L98
                if (r4 == 0) goto L96
                if (r8 != 0) goto L58
                goto L96
            L58:
                if (r1 == 0) goto L67
                int r1 = r4.intValue()     // Catch: java.lang.Throwable -> L98
                if (r1 != r5) goto L67
                int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L98
                if (r8 != r5) goto L67
                r2 = 1
            L67:
                r1 = r2
            L68:
                if (r1 != 0) goto L73
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                boolean r8 = com.comviva.webaxn.ui.e.d(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 == 0) goto L73
                goto L74
            L73:
                r3 = r1
            L74:
                if (r3 == 0) goto L96
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                int r8 = com.comviva.webaxn.ui.e.e(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 <= 0) goto L96
            L7e:
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                int r8 = com.comviva.webaxn.ui.e.e(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 <= 0) goto L91
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.ui.e.g(r8)     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.ui.e.f(r8)     // Catch: java.lang.Throwable -> L98
                goto L7e
            L91:
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.ui.e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.ui.e.a(r8, r5)     // Catch: java.lang.Throwable -> L98
            L96:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                return
            L98:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                goto L9c
            L9b:
                throw r8
            L9c:
                goto L9b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.e.d.a(android.hardware.camera2.CaptureResult):void");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            a(captureResult);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0030e extends CameraCaptureSession.CaptureCallback {

        /* renamed from: com.comviva.webaxn.ui.e$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ k.b b;
            final /* synthetic */ File c;

            a(k.b bVar, StringBuilder sb, File file) {
                this.b = bVar;
                this.c = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.b.d()) {
                    e.this.a(this.c);
                }
            }
        }

        C0030e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (e.this.p) {
                k.b bVar = (k.b) e.this.z.get(Integer.valueOf(intValue));
                if (bVar != null) {
                    bVar.a(totalCaptureResult);
                    StringBuilder sb = new StringBuilder();
                    File c = bVar.c();
                    sb.append("Saving JPEG as: ");
                    sb.append(bVar.b());
                    e.this.a(intValue, bVar, (TreeMap<Integer, k.b>) e.this.z);
                    e.this.e();
                    new Handler().postDelayed(new a(bVar, sb, c), 750L);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (e.this.p) {
                e.this.z.remove(Integer.valueOf(intValue));
                e.this.e();
            }
            e.this.a("Capture failed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            k.b bVar;
            File file = new File(e.this.d);
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (e.this.p) {
                bVar = (k.b) e.this.z.get(Integer.valueOf(intValue));
            }
            if (bVar != null) {
                bVar.a(file);
            }
        }
    }

    /* loaded from: classes.dex */
    class f extends Handler {
        f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.getActivity();
        }
    }

    /* loaded from: classes.dex */
    class g extends OrientationEventListener {
        g(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (e.this.f == null || !e.this.f.isAvailable()) {
                return;
            }
            e eVar = e.this;
            eVar.a(eVar.f.getWidth(), e.this.f.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends CameraCaptureSession.StateCallback {
        h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            e.this.a("Failed to configure camera.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            synchronized (e.this.p) {
                if (e.this.s == null) {
                    return;
                }
                try {
                    e.this.a(e.this.A);
                    cameraCaptureSession.setRepeatingRequest(e.this.A.build(), e.this.F, e.this.v);
                    e.this.B = 2;
                    e.this.r = cameraCaptureSession;
                } catch (CameraAccessException e) {
                    e = e;
                    e.printStackTrace();
                } catch (IllegalStateException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i implements Comparator<Size> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends DialogFragment {
        private String b = "Unknown error occurred!";

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            final /* synthetic */ Activity b;

            a(j jVar, Activity activity) {
                this.b = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.finish();
            }
        }

        public static j a(String str) {
            j jVar = new j();
            jVar.b = str;
            return jVar;
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setMessage(this.b).setPositiveButton(R.string.ok, new a(this, activity)).create();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k implements Runnable {
        private final Image b;
        private final File c;
        private final Context d;
        private final l<ImageReader> e;
        private final b f;

        /* loaded from: classes.dex */
        class a implements MediaScannerConnection.MediaScannerConnectionClient {
            a(k kVar) {
            }

            @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
            public void onMediaScannerConnected() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                String unused = e.I;
                String str2 = "Scanned " + str + ":";
                String unused2 = e.I;
                String str3 = "-> uri=" + uri;
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            private Image a;
            private File b;
            private CaptureResult c;
            private CameraCharacteristics d;
            private Context e;
            private l<ImageReader> f;
            private boolean g;

            public b(Context context) {
                this.e = context;
            }

            private boolean e() {
                return (this.a == null || this.b == null || this.c == null || this.d == null) ? false : true;
            }

            public synchronized b a(CameraCharacteristics cameraCharacteristics) {
                if (cameraCharacteristics == null) {
                    throw new NullPointerException();
                }
                this.d = cameraCharacteristics;
                return this;
            }

            public synchronized b a(CaptureResult captureResult) {
                if (captureResult == null) {
                    throw new NullPointerException();
                }
                this.c = captureResult;
                return this;
            }

            public synchronized b a(Image image) {
                if (image == null) {
                    throw new NullPointerException();
                }
                this.a = image;
                return this;
            }

            public synchronized b a(l<ImageReader> lVar) {
                if (lVar == null) {
                    throw new NullPointerException();
                }
                this.f = lVar;
                return this;
            }

            public synchronized b a(File file) {
                if (file == null) {
                    throw new NullPointerException();
                }
                this.b = file;
                return this;
            }

            public synchronized k a() {
                if (!e()) {
                    return null;
                }
                return new k(this.a, this.b, this.c, this.d, this.e, this.f, this, null);
            }

            public synchronized void a(boolean z) {
                this.g = z;
            }

            public synchronized String b() {
                return this.b == null ? "Unknown" : this.b.toString();
            }

            public synchronized File c() {
                return this.b == null ? null : this.b;
            }

            public synchronized boolean d() {
                return this.g;
            }
        }

        private k(Image image, File file, CaptureResult captureResult, CameraCharacteristics cameraCharacteristics, Context context, l<ImageReader> lVar, b bVar) {
            this.b = image;
            this.c = file;
            this.d = context;
            this.e = lVar;
            this.f = bVar;
        }

        /* synthetic */ k(Image image, File file, CaptureResult captureResult, CameraCharacteristics cameraCharacteristics, Context context, l lVar, b bVar, a aVar) {
            this(image, file, captureResult, cameraCharacteristics, context, lVar, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0051  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r6 = this;
                android.media.Image r0 = r6.b
                int r0 = r0.getFormat()
                r1 = 1
                r2 = 0
                r3 = 0
                r4 = 256(0x100, float:3.59E-43)
                if (r0 == r4) goto Lf
            Ld:
                r0 = 0
                goto L4a
            Lf:
                android.media.Image r0 = r6.b
                android.media.Image$Plane[] r0 = r0.getPlanes()
                r0 = r0[r3]
                java.nio.ByteBuffer r0 = r0.getBuffer()
                int r4 = r0.remaining()
                byte[] r4 = new byte[r4]
                r0.get(r4)
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                java.io.File r5 = r6.c     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                r0.<init>(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                r0.write(r4)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L6b
                android.media.Image r4 = r6.b
                r4.close()
                com.comviva.webaxn.ui.e.a(r0)
                r0 = 1
                goto L4a
            L38:
                r4 = move-exception
                goto L3e
            L3a:
                r1 = move-exception
                goto L6d
            L3c:
                r4 = move-exception
                r0 = r2
            L3e:
                r4.printStackTrace()     // Catch: java.lang.Throwable -> L6b
                android.media.Image r4 = r6.b
                r4.close()
                com.comviva.webaxn.ui.e.a(r0)
                goto Ld
            L4a:
                com.comviva.webaxn.ui.e$l<android.media.ImageReader> r4 = r6.e
                r4.close()
                if (r0 == 0) goto L65
                android.content.Context r4 = r6.d
                java.lang.String[] r1 = new java.lang.String[r1]
                java.io.File r5 = r6.c
                java.lang.String r5 = r5.getPath()
                r1[r3] = r5
                com.comviva.webaxn.ui.e$k$a r3 = new com.comviva.webaxn.ui.e$k$a
                r3.<init>(r6)
                android.media.MediaScannerConnection.scanFile(r4, r1, r2, r3)
            L65:
                com.comviva.webaxn.ui.e$k$b r1 = r6.f
                r1.a(r0)
                return
            L6b:
                r1 = move-exception
                r2 = r0
            L6d:
                android.media.Image r0 = r6.b
                r0.close()
                com.comviva.webaxn.ui.e.a(r2)
                goto L77
            L76:
                throw r1
            L77:
                goto L76
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.e.k.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class l<T extends AutoCloseable> implements AutoCloseable {
        private T b;
        private long c = 0;

        public l(T t) {
            if (t == null) {
                throw null;
            }
            this.b = t;
        }

        public synchronized T a() {
            return this.b;
        }

        public synchronized T c() {
            if (this.c < 0) {
                return null;
            }
            this.c++;
            return this.b;
        }

        @Override // java.lang.AutoCloseable
        public synchronized void close() {
            if (this.c >= 0) {
                long j = this.c - 1;
                this.c = j;
                if (j < 0) {
                    try {
                        try {
                            this.b.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.append(0, 0);
        J.append(1, 90);
        J.append(2, 180);
        J.append(3, 270);
    }

    private static int a(CameraCharacteristics cameraCharacteristics, int i2) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        int i3 = J.get(i2);
        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            i3 = -i3;
        }
        return ((intValue - i3) + 360) % 360;
    }

    private static Size a(Size[] sizeArr, int i2, int i3, int i4, int i5, Size size) {
        Object max;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getWidth() <= i4 && size2.getHeight() <= i5 && size2.getHeight() == (size2.getWidth() * height) / width) {
                if (size2.getWidth() < i2 || size2.getHeight() < i3) {
                    arrayList2.add(size2);
                } else {
                    arrayList.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            max = Collections.min(arrayList, new i());
        } else {
            if (arrayList2.size() <= 0) {
                return sizeArr[0];
            }
            max = Collections.max(arrayList2, new i());
        }
        return (Size) max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x000f, B:14:0x005e, B:16:0x0064, B:23:0x007d, B:26:0x0091, B:27:0x009b, B:28:0x00af, B:30:0x00bf, B:31:0x00d4, B:35:0x0124, B:37:0x0131, B:39:0x0142, B:42:0x0139, B:44:0x013f, B:45:0x00fd, B:46:0x00ca, B:47:0x009f, B:48:0x00aa, B:53:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x000f, B:14:0x005e, B:16:0x0064, B:23:0x007d, B:26:0x0091, B:27:0x009b, B:28:0x00af, B:30:0x00bf, B:31:0x00d4, B:35:0x0124, B:37:0x0131, B:39:0x0142, B:42:0x0139, B:44:0x013f, B:45:0x00fd, B:46:0x00ca, B:47:0x009f, B:48:0x00aa, B:53:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x000f, B:14:0x005e, B:16:0x0064, B:23:0x007d, B:26:0x0091, B:27:0x009b, B:28:0x00af, B:30:0x00bf, B:31:0x00d4, B:35:0x0124, B:37:0x0131, B:39:0x0142, B:42:0x0139, B:44:0x013f, B:45:0x00fd, B:46:0x00ca, B:47:0x009f, B:48:0x00aa, B:53:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x000f, B:14:0x005e, B:16:0x0064, B:23:0x007d, B:26:0x0091, B:27:0x009b, B:28:0x00af, B:30:0x00bf, B:31:0x00d4, B:35:0x0124, B:37:0x0131, B:39:0x0142, B:42:0x0139, B:44:0x013f, B:45:0x00fd, B:46:0x00ca, B:47:0x009f, B:48:0x00aa, B:53:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x000f, B:14:0x005e, B:16:0x0064, B:23:0x007d, B:26:0x0091, B:27:0x009b, B:28:0x00af, B:30:0x00bf, B:31:0x00d4, B:35:0x0124, B:37:0x0131, B:39:0x0142, B:42:0x0139, B:44:0x013f, B:45:0x00fd, B:46:0x00ca, B:47:0x009f, B:48:0x00aa, B:53:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.e.a(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, k.b bVar, TreeMap<Integer, k.b> treeMap) {
        k a2;
        if (bVar == null || (a2 = bVar.a()) == null) {
            return;
        }
        treeMap.remove(Integer.valueOf(i2));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        Float f2 = (Float) this.u.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        boolean z = f2 == null || f2.floatValue() == 0.0f;
        this.x = z;
        if (!z) {
            if (a((int[]) this.u.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 4)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            } else {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
        if (a((int[]) this.u.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 2)) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        if (a((int[]) this.u.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES), 1)) {
            builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(file));
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Message obtain = Message.obtain();
        obtain.obj = str;
        this.H.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TreeMap<Integer, k.b> treeMap, l<ImageReader> lVar) {
        synchronized (this.p) {
            Map.Entry<Integer, k.b> firstEntry = treeMap.firstEntry();
            k.b value = firstEntry.getValue();
            if (lVar == null || lVar.c() == null) {
                treeMap.remove(firstEntry.getKey());
                return;
            }
            try {
                Image acquireNextImage = lVar.a().acquireNextImage();
                value.a(lVar);
                value.a(acquireNextImage);
                a(firstEntry.getKey().intValue(), value, treeMap);
            } catch (IllegalStateException unused) {
                treeMap.remove(firstEntry.getKey());
            }
        }
    }

    private static boolean a(Size size, Size size2) {
        double width = size.getWidth();
        double height = size.getHeight();
        Double.isNaN(width);
        Double.isNaN(height);
        double d2 = width / height;
        double width2 = size2.getWidth();
        double height2 = size2.getHeight();
        Double.isNaN(width2);
        Double.isNaN(height2);
        return Math.abs(d2 - (width2 / height2)) <= 0.005d;
    }

    private static boolean a(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Activity activity = getActivity();
            if (activity != null && this.s != null) {
                CaptureRequest.Builder createCaptureRequest = this.s.createCaptureRequest(2);
                createCaptureRequest.addTarget(this.w.a().getSurface());
                a(createCaptureRequest);
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(a(this.u, activity.getWindowManager().getDefaultDisplay().getRotation())));
                createCaptureRequest.setTag(Integer.valueOf(this.n.getAndIncrement()));
                CaptureRequest build = createCaptureRequest.build();
                k.b bVar = new k.b(activity);
                bVar.a(this.u);
                new k.b(activity).a(this.u);
                this.z.put(Integer.valueOf(((Integer) build.getTag()).intValue()), bVar);
                this.r.capture(build, this.G, this.v);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void c() {
        try {
            try {
                this.o.acquire();
                synchronized (this.p) {
                    this.y = 0;
                    this.B = 0;
                    if (this.r != null) {
                        this.r.close();
                        this.r = null;
                    }
                    if (this.s != null) {
                        this.s.close();
                        this.s = null;
                    }
                    if (this.w != null) {
                        this.w.close();
                        this.w = null;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } finally {
            this.o.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            SurfaceTexture surfaceTexture = this.f.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.t.getWidth(), this.t.getHeight());
            Surface surface = new Surface(surfaceTexture);
            CaptureRequest.Builder createCaptureRequest = this.s.createCaptureRequest(1);
            this.A = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            this.s.createCaptureSession(Arrays.asList(surface, this.w.a().getSurface()), new h(), this.v);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.x) {
                return;
            }
            this.A.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.r.capture(this.A.build(), this.F, this.v);
            this.A.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ int f(e eVar) {
        int i2 = eVar.y;
        eVar.y = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return SystemClock.elapsedRealtime() - this.C > 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return ((Integer) this.u.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
    }

    public static e h() {
        return new e();
    }

    private void i() {
        String str;
        Handler handler;
        if (j()) {
            CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
            try {
                if (!this.o.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                synchronized (this.p) {
                    str = this.q;
                    handler = this.v;
                }
                cameraManager.openCamera(str, this.D, handler);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Interrupted while trying to lock camera opening.", e2);
            }
        }
    }

    private boolean j() {
        String str;
        int i2;
        CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
        if (cameraManager == null) {
            str = "This device doesn't support Camera2 API.";
        } else {
            try {
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            for (String str2 : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null) {
                    if (this.l.equals("back")) {
                        if (num.intValue() == 0) {
                        }
                    } else if (num.intValue() == 1) {
                    }
                    e.printStackTrace();
                    str = "This device doesn't support capturing photos";
                }
                Size size = (Size) Collections.max(Arrays.asList(((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256)), new i());
                synchronized (this.p) {
                    if (this.w == null || this.w.c() == null) {
                        this.w = new l<>(ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 5));
                    }
                    this.w.a().setOnImageAvailableListener(this.E, this.v);
                    this.u = cameraCharacteristics;
                    this.q = str2;
                }
                return true;
            }
            str = "This device doesn't support capturing photos";
        }
        j.a(str).show(getFragmentManager(), "dialog");
        return false;
    }

    private void k() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.m = handlerThread;
        handlerThread.start();
        synchronized (this.p) {
            this.v = new Handler(this.m.getLooper());
        }
    }

    private void l() {
        this.C = SystemClock.elapsedRealtime();
    }

    private void m() {
        this.m.quitSafely();
        try {
            this.m.join();
            this.m = null;
            synchronized (this.p) {
                this.v = null;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void n() {
        synchronized (this.p) {
            this.y++;
            if (this.B != 2) {
                return;
            }
            try {
                if (!this.x) {
                    this.A.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                if (!g()) {
                    this.A.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                }
                this.B = 3;
                l();
                this.r.capture(this.A.build(), this.F, this.v);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != com.mtni.myirancell.R.id.capture) {
            return;
        }
        n();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.mtni.myirancell.R.layout.fragment_camera, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        c();
        m();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        k();
        i();
        if (this.f.isAvailable()) {
            a(this.f.getWidth(), this.f.getHeight());
        } else {
            this.f.setSurfaceTextureListener(this.e);
        }
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener == null || !orientationEventListener.canDetectOrientation()) {
            return;
        }
        this.b.enable();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        CameraData cameraData;
        ImageButton imageButton = (ImageButton) view.findViewById(com.mtni.myirancell.R.id.capture);
        this.g = imageButton;
        imageButton.setOnClickListener(this);
        this.g.setImageResource(com.mtni.myirancell.R.drawable.n_capture);
        this.f = (AutoFitTextureView) view.findViewById(com.mtni.myirancell.R.id.texture);
        this.h = (TextView) view.findViewById(com.mtni.myirancell.R.id.label1);
        this.i = (TextView) view.findViewById(com.mtni.myirancell.R.id.label2);
        this.j = (TextView) view.findViewById(com.mtni.myirancell.R.id.label3);
        this.k = (RelativeLayout) view.findViewById(com.mtni.myirancell.R.id.cam_layout1);
        Intent intent = getActivity().getIntent();
        if (intent != null && (cameraData = (CameraData) intent.getParcelableExtra("camera_data")) != null) {
            if (!TextUtils.isEmpty(cameraData.a())) {
                this.l = cameraData.a();
            }
            int d2 = com.comviva.webaxn.utils.b.a(getActivity()).a().d();
            int b2 = com.comviva.webaxn.utils.b.a(getActivity()).a().b();
            float a2 = com.comviva.webaxn.utils.b.a(getActivity()).a().a();
            if (!TextUtils.isEmpty(cameraData.c())) {
                this.h.setText(cameraData.c());
            }
            if (!TextUtils.isEmpty(cameraData.e())) {
                try {
                    this.h.setTextSize(Float.parseFloat(cameraData.e()));
                } catch (NumberFormatException unused) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.d())) {
                this.h.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.d()));
            }
            if (!TextUtils.isEmpty(cameraData.f())) {
                this.i.setText(cameraData.f());
                this.i.setVisibility(0);
                if (!TextUtils.isEmpty(cameraData.h())) {
                    try {
                        this.i.setTextSize(Float.parseFloat(cameraData.h()));
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (!TextUtils.isEmpty(cameraData.g())) {
                    this.i.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.g()));
                }
            }
            if (!TextUtils.isEmpty(cameraData.i())) {
                this.j.setText(cameraData.i());
                this.j.setVisibility(0);
                if (!TextUtils.isEmpty(cameraData.k())) {
                    try {
                        this.j.setTextSize(Float.parseFloat(cameraData.k()));
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (!TextUtils.isEmpty(cameraData.j())) {
                    this.j.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.j()));
                }
            }
            if (!TextUtils.isEmpty(cameraData.n())) {
                int a3 = x1.a(cameraData.n(), d2, a2);
                this.k.setPadding(a3, a3, a3, a3);
            }
            if (!TextUtils.isEmpty(cameraData.m())) {
                try {
                    this.k.setBackgroundColor(Color.parseColor(cameraData.m()));
                } catch (IllegalArgumentException unused4) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.p()) && !TextUtils.isEmpty(cameraData.o())) {
                int i2 = (int) (b2 * 0.6f);
                int a4 = x1.a(cameraData.p(), d2, a2);
                int a5 = x1.a(cameraData.o(), b2, a2);
                if (a5 == -3 && a4 > 0) {
                    a5 = a4;
                }
                if (a5 <= i2) {
                    i2 = a5;
                }
                this.c = true;
                this.f.getLayoutParams().width = a4;
                this.f.getLayoutParams().height = i2;
            }
            if (!TextUtils.isEmpty(cameraData.b())) {
                this.d = cameraData.b();
            }
        }
        this.b = new g(getActivity(), 3);
    }
}
