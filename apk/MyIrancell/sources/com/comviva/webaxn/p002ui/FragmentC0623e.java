package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.CameraData;
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

/* renamed from: com.comviva.webaxn.ui.e */
/* loaded from: classes.dex */
public class FragmentC0623e extends Fragment implements View.OnClickListener {

    /* renamed from: I */
    private static final String f3554I = FragmentC0623e.class.getCanonicalName();

    /* renamed from: J */
    private static final SparseIntArray f3555J;

    /* renamed from: A */
    private CaptureRequest.Builder f3556A;

    /* renamed from: C */
    private long f3558C;

    /* renamed from: b */
    private OrientationEventListener f3564b;

    /* renamed from: d */
    private String f3566d;

    /* renamed from: f */
    private AutoFitTextureView f3568f;

    /* renamed from: g */
    private ImageButton f3569g;

    /* renamed from: h */
    private TextView f3570h;

    /* renamed from: i */
    private TextView f3571i;

    /* renamed from: j */
    private TextView f3572j;

    /* renamed from: k */
    private RelativeLayout f3573k;

    /* renamed from: l */
    private String f3574l;

    /* renamed from: m */
    private HandlerThread f3575m;

    /* renamed from: q */
    private String f3579q;

    /* renamed from: r */
    private CameraCaptureSession f3580r;

    /* renamed from: s */
    private CameraDevice f3581s;

    /* renamed from: t */
    private Size f3582t;

    /* renamed from: u */
    private CameraCharacteristics f3583u;

    /* renamed from: v */
    private Handler f3584v;

    /* renamed from: w */
    private l<ImageReader> f3585w;

    /* renamed from: c */
    private boolean f3565c = false;

    /* renamed from: e */
    private final TextureView.SurfaceTextureListener f3567e = new a();

    /* renamed from: n */
    private final AtomicInteger f3576n = new AtomicInteger();

    /* renamed from: o */
    private final Semaphore f3577o = new Semaphore(1);

    /* renamed from: p */
    private final Object f3578p = new Object();

    /* renamed from: x */
    private boolean f3586x = false;

    /* renamed from: y */
    private int f3587y = 0;

    /* renamed from: z */
    private final TreeMap<Integer, k.b> f3588z = new TreeMap<>();

    /* renamed from: B */
    private int f3557B = 0;

    /* renamed from: D */
    private final CameraDevice.StateCallback f3559D = new b();

    /* renamed from: E */
    private final ImageReader.OnImageAvailableListener f3560E = new c();

    /* renamed from: F */
    private CameraCaptureSession.CaptureCallback f3561F = new d();

    /* renamed from: G */
    private final CameraCaptureSession.CaptureCallback f3562G = new e();

    /* renamed from: H */
    private final Handler f3563H = new f(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.e$a */
    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            FragmentC0623e.this.m4217a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            synchronized (FragmentC0623e.this.f3578p) {
                FragmentC0623e.this.f3582t = null;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            FragmentC0623e.this.m4217a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$b */
    /* loaded from: classes.dex */
    class b extends CameraDevice.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            synchronized (FragmentC0623e.this.f3578p) {
                FragmentC0623e.this.f3557B = 0;
                FragmentC0623e.this.f3577o.release();
                cameraDevice.close();
                FragmentC0623e.this.f3581s = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            synchronized (FragmentC0623e.this.f3578p) {
                FragmentC0623e.this.f3557B = 0;
                FragmentC0623e.this.f3577o.release();
                cameraDevice.close();
                FragmentC0623e.this.f3581s = null;
            }
            Activity activity = FragmentC0623e.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            synchronized (FragmentC0623e.this.f3578p) {
                FragmentC0623e.this.f3557B = 1;
                FragmentC0623e.this.f3577o.release();
                FragmentC0623e.this.f3581s = cameraDevice;
                if (FragmentC0623e.this.f3582t != null && FragmentC0623e.this.f3568f.isAvailable()) {
                    FragmentC0623e.this.m4237d();
                }
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$c */
    /* loaded from: classes.dex */
    class c implements ImageReader.OnImageAvailableListener {
        c() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            FragmentC0623e fragmentC0623e = FragmentC0623e.this;
            fragmentC0623e.m4229a((TreeMap<Integer, k.b>) fragmentC0623e.f3588z, (l<ImageReader>) FragmentC0623e.this.f3585w);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$d */
    /* loaded from: classes.dex */
    class d extends CameraCaptureSession.CaptureCallback {
        d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[Catch: all -> 0x0098, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0096, B:11:0x0012, B:13:0x001c, B:16:0x0028, B:18:0x002f, B:22:0x003a, B:24:0x0043, B:29:0x005a, B:31:0x0060, B:36:0x006a, B:40:0x0076, B:42:0x007e, B:44:0x0086, B:46:0x0091), top: B:3:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0086 A[Catch: all -> 0x0098, LOOP:0: B:42:0x007e->B:44:0x0086, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0096, B:11:0x0012, B:13:0x001c, B:16:0x0028, B:18:0x002f, B:22:0x003a, B:24:0x0043, B:29:0x005a, B:31:0x0060, B:36:0x006a, B:40:0x0076, B:42:0x007e, B:44:0x0086, B:46:0x0091), top: B:3:0x0007 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m4265a(android.hardware.camera2.CaptureResult r8) {
            /*
                r7 = this;
                com.comviva.webaxn.ui.e r0 = com.comviva.webaxn.p002ui.FragmentC0623e.this
                java.lang.Object r0 = com.comviva.webaxn.p002ui.FragmentC0623e.m4215a(r0)
                monitor-enter(r0)
                com.comviva.webaxn.ui.e r1 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                int r1 = com.comviva.webaxn.p002ui.FragmentC0623e.m4257n(r1)     // Catch: java.lang.Throwable -> L98
                r2 = 3
                if (r1 == r2) goto L12
                goto L96
            L12:
                com.comviva.webaxn.ui.e r1 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                boolean r1 = com.comviva.webaxn.p002ui.FragmentC0623e.m4234b(r1)     // Catch: java.lang.Throwable -> L98
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
                com.comviva.webaxn.ui.e r4 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                boolean r4 = com.comviva.webaxn.p002ui.FragmentC0623e.m4236c(r4)     // Catch: java.lang.Throwable -> L98
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
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                boolean r8 = com.comviva.webaxn.p002ui.FragmentC0623e.m4238d(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 == 0) goto L73
                goto L74
            L73:
                r3 = r1
            L74:
                if (r3 == 0) goto L96
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                int r8 = com.comviva.webaxn.p002ui.FragmentC0623e.m4239e(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 <= 0) goto L96
            L7e:
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                int r8 = com.comviva.webaxn.p002ui.FragmentC0623e.m4239e(r8)     // Catch: java.lang.Throwable -> L98
                if (r8 <= 0) goto L91
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.p002ui.FragmentC0623e.m4243g(r8)     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.p002ui.FragmentC0623e.m4241f(r8)     // Catch: java.lang.Throwable -> L98
                goto L7e
            L91:
                com.comviva.webaxn.ui.e r8 = com.comviva.webaxn.p002ui.FragmentC0623e.this     // Catch: java.lang.Throwable -> L98
                com.comviva.webaxn.p002ui.FragmentC0623e.m4210a(r8, r5)     // Catch: java.lang.Throwable -> L98
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.FragmentC0623e.d.m4265a(android.hardware.camera2.CaptureResult):void");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m4265a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m4265a(captureResult);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$e */
    /* loaded from: classes.dex */
    class e extends CameraCaptureSession.CaptureCallback {

        /* renamed from: com.comviva.webaxn.ui.e$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ k.b f3594b;

            /* renamed from: c */
            final /* synthetic */ File f3595c;

            a(k.b bVar, StringBuilder sb, File file) {
                this.f3594b = bVar;
                this.f3595c = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f3594b.m4278d()) {
                    FragmentC0623e.this.m4226a(this.f3595c);
                }
            }
        }

        e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (FragmentC0623e.this.f3578p) {
                k.b bVar = (k.b) FragmentC0623e.this.f3588z.get(Integer.valueOf(intValue));
                if (bVar != null) {
                    bVar.m4270a(totalCaptureResult);
                    StringBuilder sb = new StringBuilder();
                    File m4277c = bVar.m4277c();
                    sb.append("Saving JPEG as: ");
                    sb.append(bVar.m4276b());
                    FragmentC0623e.this.m4218a(intValue, bVar, (TreeMap<Integer, k.b>) FragmentC0623e.this.f3588z);
                    FragmentC0623e.this.m4240e();
                    new Handler().postDelayed(new a(bVar, sb, m4277c), 750L);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (FragmentC0623e.this.f3578p) {
                FragmentC0623e.this.f3588z.remove(Integer.valueOf(intValue));
                FragmentC0623e.this.m4240e();
            }
            FragmentC0623e.this.m4228a("Capture failed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            k.b bVar;
            File file = new File(FragmentC0623e.this.f3566d);
            int intValue = ((Integer) captureRequest.getTag()).intValue();
            synchronized (FragmentC0623e.this.f3578p) {
                bVar = (k.b) FragmentC0623e.this.f3588z.get(Integer.valueOf(intValue));
            }
            if (bVar != null) {
                bVar.m4273a(file);
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$f */
    /* loaded from: classes.dex */
    class f extends Handler {
        f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            FragmentC0623e.this.getActivity();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$g */
    /* loaded from: classes.dex */
    class g extends OrientationEventListener {
        g(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (FragmentC0623e.this.f3568f == null || !FragmentC0623e.this.f3568f.isAvailable()) {
                return;
            }
            FragmentC0623e fragmentC0623e = FragmentC0623e.this;
            fragmentC0623e.m4217a(fragmentC0623e.f3568f.getWidth(), FragmentC0623e.this.f3568f.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.e$h */
    /* loaded from: classes.dex */
    public class h extends CameraCaptureSession.StateCallback {
        h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            FragmentC0623e.this.m4228a("Failed to configure camera.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            synchronized (FragmentC0623e.this.f3578p) {
                if (FragmentC0623e.this.f3581s == null) {
                    return;
                }
                try {
                    FragmentC0623e.this.m4219a(FragmentC0623e.this.f3556A);
                    cameraCaptureSession.setRepeatingRequest(FragmentC0623e.this.f3556A.build(), FragmentC0623e.this.f3561F, FragmentC0623e.this.f3584v);
                    FragmentC0623e.this.f3557B = 2;
                    FragmentC0623e.this.f3580r = cameraCaptureSession;
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
    /* renamed from: com.comviva.webaxn.ui.e$i */
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

    /* renamed from: com.comviva.webaxn.ui.e$j */
    /* loaded from: classes.dex */
    public static class j extends DialogFragment {

        /* renamed from: b */
        private String f3600b = "Unknown error occurred!";

        /* renamed from: com.comviva.webaxn.ui.e$j$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ Activity f3601b;

            a(j jVar, Activity activity) {
                this.f3601b = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f3601b.finish();
            }
        }

        /* renamed from: a */
        public static j m4267a(String str) {
            j jVar = new j();
            jVar.f3600b = str;
            return jVar;
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setMessage(this.f3600b).setPositiveButton(R.string.ok, new a(this, activity)).create();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.ui.e$k */
    /* loaded from: classes.dex */
    public static class k implements Runnable {

        /* renamed from: b */
        private final Image f3602b;

        /* renamed from: c */
        private final File f3603c;

        /* renamed from: d */
        private final Context f3604d;

        /* renamed from: e */
        private final l<ImageReader> f3605e;

        /* renamed from: f */
        private final b f3606f;

        /* renamed from: com.comviva.webaxn.ui.e$k$a */
        /* loaded from: classes.dex */
        class a implements MediaScannerConnection.MediaScannerConnectionClient {
            a(k kVar) {
            }

            @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
            public void onMediaScannerConnected() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                String unused = FragmentC0623e.f3554I;
                String str2 = "Scanned " + str + ":";
                String unused2 = FragmentC0623e.f3554I;
                String str3 = "-> uri=" + uri;
            }
        }

        /* renamed from: com.comviva.webaxn.ui.e$k$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            private Image f3607a;

            /* renamed from: b */
            private File f3608b;

            /* renamed from: c */
            private CaptureResult f3609c;

            /* renamed from: d */
            private CameraCharacteristics f3610d;

            /* renamed from: e */
            private Context f3611e;

            /* renamed from: f */
            private l<ImageReader> f3612f;

            /* renamed from: g */
            private boolean f3613g;

            public b(Context context) {
                this.f3611e = context;
            }

            /* renamed from: e */
            private boolean m4268e() {
                return (this.f3607a == null || this.f3608b == null || this.f3609c == null || this.f3610d == null) ? false : true;
            }

            /* renamed from: a */
            public synchronized b m4269a(CameraCharacteristics cameraCharacteristics) {
                if (cameraCharacteristics == null) {
                    throw new NullPointerException();
                }
                this.f3610d = cameraCharacteristics;
                return this;
            }

            /* renamed from: a */
            public synchronized b m4270a(CaptureResult captureResult) {
                if (captureResult == null) {
                    throw new NullPointerException();
                }
                this.f3609c = captureResult;
                return this;
            }

            /* renamed from: a */
            public synchronized b m4271a(Image image) {
                if (image == null) {
                    throw new NullPointerException();
                }
                this.f3607a = image;
                return this;
            }

            /* renamed from: a */
            public synchronized b m4272a(l<ImageReader> lVar) {
                if (lVar == null) {
                    throw new NullPointerException();
                }
                this.f3612f = lVar;
                return this;
            }

            /* renamed from: a */
            public synchronized b m4273a(File file) {
                if (file == null) {
                    throw new NullPointerException();
                }
                this.f3608b = file;
                return this;
            }

            /* renamed from: a */
            public synchronized k m4274a() {
                if (!m4268e()) {
                    return null;
                }
                return new k(this.f3607a, this.f3608b, this.f3609c, this.f3610d, this.f3611e, this.f3612f, this, null);
            }

            /* renamed from: a */
            public synchronized void m4275a(boolean z) {
                this.f3613g = z;
            }

            /* renamed from: b */
            public synchronized String m4276b() {
                return this.f3608b == null ? "Unknown" : this.f3608b.toString();
            }

            /* renamed from: c */
            public synchronized File m4277c() {
                return this.f3608b == null ? null : this.f3608b;
            }

            /* renamed from: d */
            public synchronized boolean m4278d() {
                return this.f3613g;
            }
        }

        private k(Image image, File file, CaptureResult captureResult, CameraCharacteristics cameraCharacteristics, Context context, l<ImageReader> lVar, b bVar) {
            this.f3602b = image;
            this.f3603c = file;
            this.f3604d = context;
            this.f3605e = lVar;
            this.f3606f = bVar;
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
                android.media.Image r0 = r6.f3602b
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
                android.media.Image r0 = r6.f3602b
                android.media.Image$Plane[] r0 = r0.getPlanes()
                r0 = r0[r3]
                java.nio.ByteBuffer r0 = r0.getBuffer()
                int r4 = r0.remaining()
                byte[] r4 = new byte[r4]
                r0.get(r4)
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                java.io.File r5 = r6.f3603c     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                r0.<init>(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
                r0.write(r4)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L6b
                android.media.Image r4 = r6.f3602b
                r4.close()
                com.comviva.webaxn.p002ui.FragmentC0623e.m4227a(r0)
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
                android.media.Image r4 = r6.f3602b
                r4.close()
                com.comviva.webaxn.p002ui.FragmentC0623e.m4227a(r0)
                goto Ld
            L4a:
                com.comviva.webaxn.ui.e$l<android.media.ImageReader> r4 = r6.f3605e
                r4.close()
                if (r0 == 0) goto L65
                android.content.Context r4 = r6.f3604d
                java.lang.String[] r1 = new java.lang.String[r1]
                java.io.File r5 = r6.f3603c
                java.lang.String r5 = r5.getPath()
                r1[r3] = r5
                com.comviva.webaxn.ui.e$k$a r3 = new com.comviva.webaxn.ui.e$k$a
                r3.<init>(r6)
                android.media.MediaScannerConnection.scanFile(r4, r1, r2, r3)
            L65:
                com.comviva.webaxn.ui.e$k$b r1 = r6.f3606f
                r1.m4275a(r0)
                return
            L6b:
                r1 = move-exception
                r2 = r0
            L6d:
                android.media.Image r0 = r6.f3602b
                r0.close()
                com.comviva.webaxn.p002ui.FragmentC0623e.m4227a(r2)
                goto L77
            L76:
                throw r1
            L77:
                goto L76
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.FragmentC0623e.k.run():void");
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e$l */
    /* loaded from: classes.dex */
    public static class l<T extends AutoCloseable> implements AutoCloseable {

        /* renamed from: b */
        private T f3614b;

        /* renamed from: c */
        private long f3615c = 0;

        public l(T t) {
            if (t == null) {
                throw null;
            }
            this.f3614b = t;
        }

        /* renamed from: a */
        public synchronized T m4279a() {
            return this.f3614b;
        }

        /* renamed from: c */
        public synchronized T m4280c() {
            if (this.f3615c < 0) {
                return null;
            }
            this.f3615c++;
            return this.f3614b;
        }

        @Override // java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f3615c >= 0) {
                long j = this.f3615c - 1;
                this.f3615c = j;
                if (j < 0) {
                    try {
                        try {
                            this.f3614b.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        this.f3614b = null;
                    }
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3555J = sparseIntArray;
        sparseIntArray.append(0, 0);
        f3555J.append(1, 90);
        f3555J.append(2, 180);
        f3555J.append(3, 270);
    }

    /* renamed from: a */
    private static int m4209a(CameraCharacteristics cameraCharacteristics, int i2) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        int i3 = f3555J.get(i2);
        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            i3 = -i3;
        }
        return ((intValue - i3) + 360) % 360;
    }

    /* renamed from: a */
    private static Size m4214a(Size[] sizeArr, int i2, int i3, int i4, int i5, Size size) {
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4217a(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.FragmentC0623e.m4217a(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4218a(int i2, k.b bVar, TreeMap<Integer, k.b> treeMap) {
        k m4274a;
        if (bVar == null || (m4274a = bVar.m4274a()) == null) {
            return;
        }
        treeMap.remove(Integer.valueOf(i2));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(m4274a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4219a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        Float f2 = (Float) this.f3583u.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        boolean z = f2 == null || f2.floatValue() == 0.0f;
        this.f3586x = z;
        if (!z) {
            if (m4231a((int[]) this.f3583u.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 4)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            } else {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
        if (m4231a((int[]) this.f3583u.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 2)) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        if (m4231a((int[]) this.f3583u.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES), 1)) {
            builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4226a(File file) {
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(file));
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4228a(String str) {
        Message obtain = Message.obtain();
        obtain.obj = str;
        this.f3563H.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4229a(TreeMap<Integer, k.b> treeMap, l<ImageReader> lVar) {
        synchronized (this.f3578p) {
            Map.Entry<Integer, k.b> firstEntry = treeMap.firstEntry();
            k.b value = firstEntry.getValue();
            if (lVar == null || lVar.m4280c() == null) {
                treeMap.remove(firstEntry.getKey());
                return;
            }
            try {
                Image acquireNextImage = lVar.m4279a().acquireNextImage();
                value.m4272a(lVar);
                value.m4271a(acquireNextImage);
                m4218a(firstEntry.getKey().intValue(), value, treeMap);
            } catch (IllegalStateException unused) {
                treeMap.remove(firstEntry.getKey());
            }
        }
    }

    /* renamed from: a */
    private static boolean m4230a(Size size, Size size2) {
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

    /* renamed from: a */
    private static boolean m4231a(int[] iArr, int i2) {
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
    /* renamed from: b */
    public void m4232b() {
        try {
            Activity activity = getActivity();
            if (activity != null && this.f3581s != null) {
                CaptureRequest.Builder createCaptureRequest = this.f3581s.createCaptureRequest(2);
                createCaptureRequest.addTarget(this.f3585w.m4279a().getSurface());
                m4219a(createCaptureRequest);
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(m4209a(this.f3583u, activity.getWindowManager().getDefaultDisplay().getRotation())));
                createCaptureRequest.setTag(Integer.valueOf(this.f3576n.getAndIncrement()));
                CaptureRequest build = createCaptureRequest.build();
                k.b bVar = new k.b(activity);
                bVar.m4269a(this.f3583u);
                new k.b(activity).m4269a(this.f3583u);
                this.f3588z.put(Integer.valueOf(((Integer) build.getTag()).intValue()), bVar);
                this.f3580r.capture(build, this.f3562G, this.f3584v);
            }
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m4233b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m4235c() {
        try {
            try {
                this.f3577o.acquire();
                synchronized (this.f3578p) {
                    this.f3587y = 0;
                    this.f3557B = 0;
                    if (this.f3580r != null) {
                        this.f3580r.close();
                        this.f3580r = null;
                    }
                    if (this.f3581s != null) {
                        this.f3581s.close();
                        this.f3581s = null;
                    }
                    if (this.f3585w != null) {
                        this.f3585w.close();
                        this.f3585w = null;
                    }
                }
            } catch (InterruptedException e2) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e2);
            }
        } finally {
            this.f3577o.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m4237d() {
        try {
            SurfaceTexture surfaceTexture = this.f3568f.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.f3582t.getWidth(), this.f3582t.getHeight());
            Surface surface = new Surface(surfaceTexture);
            CaptureRequest.Builder createCaptureRequest = this.f3581s.createCaptureRequest(1);
            this.f3556A = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            this.f3581s.createCaptureSession(Arrays.asList(surface, this.f3585w.m4279a().getSurface()), new h(), this.f3584v);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m4240e() {
        try {
            if (this.f3586x) {
                return;
            }
            this.f3556A.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.f3580r.capture(this.f3556A.build(), this.f3561F, this.f3584v);
            this.f3556A.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    static /* synthetic */ int m4241f(FragmentC0623e fragmentC0623e) {
        int i2 = fragmentC0623e.f3587y;
        fragmentC0623e.f3587y = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m4242f() {
        return SystemClock.elapsedRealtime() - this.f3558C > 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m4244g() {
        return ((Integer) this.f3583u.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
    }

    /* renamed from: h */
    public static FragmentC0623e m4245h() {
        return new FragmentC0623e();
    }

    /* renamed from: i */
    private void m4247i() {
        String str;
        Handler handler;
        if (m4250j()) {
            CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
            try {
                if (!this.f3577o.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                synchronized (this.f3578p) {
                    str = this.f3579q;
                    handler = this.f3584v;
                }
                cameraManager.openCamera(str, this.f3559D, handler);
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            } catch (InterruptedException e3) {
                throw new RuntimeException("Interrupted while trying to lock camera opening.", e3);
            }
        }
    }

    /* renamed from: j */
    private boolean m4250j() {
        String str;
        int i2;
        CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
        if (cameraManager == null) {
            str = "This device doesn't support Camera2 API.";
        } else {
            try {
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            }
            for (String str2 : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null) {
                    if (this.f3574l.equals("back")) {
                        if (num.intValue() == 0) {
                        }
                    } else if (num.intValue() == 1) {
                    }
                    e2.printStackTrace();
                    str = "This device doesn't support capturing photos";
                }
                Size size = (Size) Collections.max(Arrays.asList(((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256)), new i());
                synchronized (this.f3578p) {
                    if (this.f3585w == null || this.f3585w.m4280c() == null) {
                        this.f3585w = new l<>(ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 5));
                    }
                    this.f3585w.m4279a().setOnImageAvailableListener(this.f3560E, this.f3584v);
                    this.f3583u = cameraCharacteristics;
                    this.f3579q = str2;
                }
                return true;
            }
            str = "This device doesn't support capturing photos";
        }
        j.m4267a(str).show(getFragmentManager(), "dialog");
        return false;
    }

    /* renamed from: k */
    private void m4252k() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f3575m = handlerThread;
        handlerThread.start();
        synchronized (this.f3578p) {
            this.f3584v = new Handler(this.f3575m.getLooper());
        }
    }

    /* renamed from: l */
    private void m4254l() {
        this.f3558C = SystemClock.elapsedRealtime();
    }

    /* renamed from: m */
    private void m4256m() {
        this.f3575m.quitSafely();
        try {
            this.f3575m.join();
            this.f3575m = null;
            synchronized (this.f3578p) {
                this.f3584v = null;
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: n */
    private void m4258n() {
        synchronized (this.f3578p) {
            this.f3587y++;
            if (this.f3557B != 2) {
                return;
            }
            try {
                if (!this.f3586x) {
                    this.f3556A.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                if (!m4244g()) {
                    this.f3556A.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                }
                this.f3557B = 3;
                m4254l();
                this.f3580r.capture(this.f3556A.build(), this.f3561F, this.f3584v);
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != com.mtni.myirancell.R.id.capture) {
            return;
        }
        m4258n();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.mtni.myirancell.R.layout.fragment_camera, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        OrientationEventListener orientationEventListener = this.f3564b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        m4235c();
        m4256m();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m4252k();
        m4247i();
        if (this.f3568f.isAvailable()) {
            m4217a(this.f3568f.getWidth(), this.f3568f.getHeight());
        } else {
            this.f3568f.setSurfaceTextureListener(this.f3567e);
        }
        OrientationEventListener orientationEventListener = this.f3564b;
        if (orientationEventListener == null || !orientationEventListener.canDetectOrientation()) {
            return;
        }
        this.f3564b.enable();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        CameraData cameraData;
        ImageButton imageButton = (ImageButton) view.findViewById(com.mtni.myirancell.R.id.capture);
        this.f3569g = imageButton;
        imageButton.setOnClickListener(this);
        this.f3569g.setImageResource(com.mtni.myirancell.R.drawable.n_capture);
        this.f3568f = (AutoFitTextureView) view.findViewById(com.mtni.myirancell.R.id.texture);
        this.f3570h = (TextView) view.findViewById(com.mtni.myirancell.R.id.label1);
        this.f3571i = (TextView) view.findViewById(com.mtni.myirancell.R.id.label2);
        this.f3572j = (TextView) view.findViewById(com.mtni.myirancell.R.id.label3);
        this.f3573k = (RelativeLayout) view.findViewById(com.mtni.myirancell.R.id.cam_layout1);
        Intent intent = getActivity().getIntent();
        if (intent != null && (cameraData = (CameraData) intent.getParcelableExtra("camera_data")) != null) {
            if (!TextUtils.isEmpty(cameraData.m5188a())) {
                this.f3574l = cameraData.m5188a();
            }
            int m5552d = C0687b.m5342a(getActivity()).m5343a().m5552d();
            int m5547b = C0687b.m5342a(getActivity()).m5343a().m5547b();
            float m5544a = C0687b.m5342a(getActivity()).m5343a().m5544a();
            if (!TextUtils.isEmpty(cameraData.m5192c())) {
                this.f3570h.setText(cameraData.m5192c());
            }
            if (!TextUtils.isEmpty(cameraData.m5196e())) {
                try {
                    this.f3570h.setTextSize(Float.parseFloat(cameraData.m5196e()));
                } catch (NumberFormatException unused) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5194d())) {
                this.f3570h.setTypeface(C0747v.m6081a(cameraData.m5194d()));
            }
            if (!TextUtils.isEmpty(cameraData.m5198f())) {
                this.f3571i.setText(cameraData.m5198f());
                this.f3571i.setVisibility(0);
                if (!TextUtils.isEmpty(cameraData.m5202h())) {
                    try {
                        this.f3571i.setTextSize(Float.parseFloat(cameraData.m5202h()));
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (!TextUtils.isEmpty(cameraData.m5200g())) {
                    this.f3571i.setTypeface(C0747v.m6081a(cameraData.m5200g()));
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5204i())) {
                this.f3572j.setText(cameraData.m5204i());
                this.f3572j.setVisibility(0);
                if (!TextUtils.isEmpty(cameraData.m5208k())) {
                    try {
                        this.f3572j.setTextSize(Float.parseFloat(cameraData.m5208k()));
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (!TextUtils.isEmpty(cameraData.m5206j())) {
                    this.f3572j.setTypeface(C0747v.m6081a(cameraData.m5206j()));
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5214n())) {
                int m6115a = C0755x1.m6115a(cameraData.m5214n(), m5552d, m5544a);
                this.f3573k.setPadding(m6115a, m6115a, m6115a, m6115a);
            }
            if (!TextUtils.isEmpty(cameraData.m5212m())) {
                try {
                    this.f3573k.setBackgroundColor(Color.parseColor(cameraData.m5212m()));
                } catch (IllegalArgumentException unused4) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5218p()) && !TextUtils.isEmpty(cameraData.m5216o())) {
                int i2 = (int) (m5547b * 0.6f);
                int m6115a2 = C0755x1.m6115a(cameraData.m5218p(), m5552d, m5544a);
                int m6115a3 = C0755x1.m6115a(cameraData.m5216o(), m5547b, m5544a);
                if (m6115a3 == -3 && m6115a2 > 0) {
                    m6115a3 = m6115a2;
                }
                if (m6115a3 <= i2) {
                    i2 = m6115a3;
                }
                this.f3565c = true;
                this.f3568f.getLayoutParams().width = m6115a2;
                this.f3568f.getLayoutParams().height = i2;
            }
            if (!TextUtils.isEmpty(cameraData.m5190b())) {
                this.f3566d = cameraData.m5190b();
            }
        }
        this.f3564b = new g(getActivity(), 3);
    }
}
