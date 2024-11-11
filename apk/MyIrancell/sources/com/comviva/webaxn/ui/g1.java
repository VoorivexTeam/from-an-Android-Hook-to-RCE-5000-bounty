package com.comviva.webaxn.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.CameraData;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g1 extends Fragment implements View.OnClickListener {
    private static final SparseIntArray G = new SparseIntArray();
    private static final SparseIntArray H = new SparseIntArray();
    private static final String I = g1.class.getCanonicalName();
    private Integer B;
    private String C;
    private CaptureRequest.Builder D;
    private AutoFitTextureView b;
    private ImageButton c;
    private String d;
    private TextView e;
    private TextView f;
    private TextView g;
    private RelativeLayout h;
    private String j;
    private Handler k;
    private LinearLayout n;
    private ImageView o;
    private CameraDevice q;
    private CameraCaptureSession r;
    private Size t;
    private Size u;
    private MediaRecorder v;
    private boolean w;
    private HandlerThread x;
    private Handler y;
    private boolean i = false;
    private boolean l = false;
    private long m = 30000;
    private boolean p = true;
    private TextureView.SurfaceTextureListener s = new a();
    private Semaphore z = new Semaphore(1);
    private CameraDevice.StateCallback A = new b();
    private Runnable E = new e();
    private Runnable F = new f();

    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            g1.this.b(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            g1.this.a(i, i2);
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
            g1.this.z.release();
            cameraDevice.close();
            g1.this.q = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            g1.this.z.release();
            cameraDevice.close();
            g1.this.q = null;
            Activity activity = g1.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            g1.this.q = cameraDevice;
            g1.this.i();
            g1.this.z.release();
            if (g1.this.b != null) {
                g1 g1Var = g1.this;
                g1Var.a(g1Var.b.getWidth(), g1.this.b.getHeight());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends CameraCaptureSession.StateCallback {
        c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            g1.this.getActivity();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            g1.this.r = cameraCaptureSession;
            g1.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends CameraCaptureSession.StateCallback {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageButton imageButton;
                int i;
                if (g1.this.l) {
                    imageButton = g1.this.c;
                    i = R.drawable.n_recording_on;
                } else {
                    imageButton = g1.this.c;
                    i = R.drawable.n_recording_stop;
                }
                imageButton.setImageResource(i);
                g1.this.w = true;
                g1.this.v.start();
            }
        }

        d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            g1.this.getActivity();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            g1.this.r = cameraCaptureSession;
            g1.this.p();
            g1.this.getActivity().runOnUiThread(new a());
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.o();
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements Comparator<Size> {
        g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    /* loaded from: classes.dex */
    public static class h extends DialogFragment {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            final /* synthetic */ Activity b;

            a(h hVar, Activity activity) {
                this.b = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.finish();
            }
        }

        public static h a(String str) {
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            hVar.setArguments(bundle);
            return hVar;
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setMessage(getArguments().getString("message")).setPositiveButton(android.R.string.ok, new a(this, activity)).create();
        }
    }

    static {
        G.append(0, 90);
        G.append(1, 0);
        G.append(2, 270);
        G.append(3, 180);
        H.append(0, 270);
        H.append(1, 180);
        H.append(2, 90);
        H.append(3, 0);
    }

    private static Size a(Size[] sizeArr) {
        for (Size size : sizeArr) {
            if (size.getWidth() == (size.getHeight() * 4) / 3 && size.getWidth() <= 1080) {
                return size;
            }
        }
        return sizeArr[sizeArr.length - 1];
    }

    private static Size a(Size[] sizeArr, int i, int i2, Size size) {
        ArrayList arrayList = new ArrayList();
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i && size2.getHeight() >= i2) {
                arrayList.add(size2);
            }
        }
        return arrayList.size() > 0 ? (Size) Collections.min(arrayList, new g()) : sizeArr[0];
    }

    private void a() {
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.E);
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Activity activity = getActivity();
        if (this.b == null || this.t == null || activity == null) {
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.t.getHeight(), this.t.getWidth());
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float max = Math.max(f3 / this.t.getHeight(), f2 / this.t.getWidth());
            matrix.postScale(max, max, centerX, centerY);
            matrix.postRotate((rotation - 2) * 90, centerX, centerY);
        }
        this.b.setTransform(matrix);
    }

    private void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean z;
        if (this.p) {
            this.o.setAlpha(0.0f);
            z = false;
        } else {
            this.o.setAlpha(1.0f);
            z = true;
        }
        this.p = z;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        AutoFitTextureView autoFitTextureView;
        int height;
        int width;
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        try {
            if (!this.z.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            String str = cameraManager.getCameraIdList()[0];
            if (!TextUtils.isEmpty(this.d) && this.d.equals("front")) {
                str = cameraManager.getCameraIdList()[1];
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            this.B = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (streamConfigurationMap == null) {
                throw new RuntimeException("Cannot get available preview/video sizes");
            }
            this.u = a(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
            this.t = a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2, this.u);
            int i3 = getResources().getConfiguration().orientation;
            if (this.i) {
                this.b.a(i, i2);
            } else {
                if (i3 == 2) {
                    autoFitTextureView = this.b;
                    height = this.t.getWidth();
                    width = this.t.getHeight();
                } else {
                    autoFitTextureView = this.b;
                    height = this.t.getHeight();
                    width = this.t.getWidth();
                }
                autoFitTextureView.a(height, width);
            }
            a(i, i2);
            this.v = new MediaRecorder();
            cameraManager.openCamera(str, this.A, (Handler) null);
        } catch (CameraAccessException unused) {
            activity.finish();
        } catch (InterruptedException unused2) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.");
        } catch (NullPointerException unused3) {
            h.a(getString(R.string.camera_error)).show(getChildFragmentManager(), "dialog");
        }
    }

    private void c() {
        try {
            try {
                this.z.acquire();
                d();
                if (this.q != null) {
                    this.q.close();
                    this.q = null;
                }
                if (this.v != null) {
                    this.v.release();
                    this.v = null;
                }
            } catch (InterruptedException unused) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.");
            }
        } finally {
            this.z.release();
        }
    }

    private void d() {
        CameraCaptureSession cameraCaptureSession = this.r;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.r = null;
        }
    }

    private String e() {
        return new File(this.j).getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4";
    }

    public static g1 f() {
        return new g1();
    }

    private void g() {
        MediaRecorder mediaRecorder;
        SparseIntArray sparseIntArray;
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.v.setAudioSource(1);
        this.v.setVideoSource(2);
        this.v.setOutputFormat(2);
        String str = this.C;
        if (str == null || str.isEmpty()) {
            this.C = e();
        }
        this.v.setOutputFile(this.C);
        this.v.setVideoEncodingBitRate(1000000);
        this.v.setVideoFrameRate(20);
        this.v.setVideoSize(this.u.getWidth(), this.u.getHeight());
        this.v.setVideoEncoder(2);
        this.v.setAudioEncoder(3);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int intValue = this.B.intValue();
        if (intValue != 90) {
            if (intValue == 270) {
                mediaRecorder = this.v;
                sparseIntArray = H;
            }
            this.v.prepare();
        }
        mediaRecorder = this.v;
        sparseIntArray = G;
        mediaRecorder.setOrientationHint(sparseIntArray.get(rotation));
        this.v.prepare();
    }

    private void h() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.x = handlerThread;
        handlerThread.start();
        this.y = new Handler(this.x.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.q == null || !this.b.isAvailable() || this.t == null) {
            return;
        }
        try {
            d();
            SurfaceTexture surfaceTexture = this.b.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.t.getWidth(), this.t.getHeight());
            this.D = this.q.createCaptureRequest(1);
            Surface surface = new Surface(surfaceTexture);
            this.D.addTarget(surface);
            this.q.createCaptureSession(Collections.singletonList(surface), new c(), this.y);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void j() {
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 8) {
                this.n.setVisibility(0);
            }
            this.n.postDelayed(this.F, 250L);
        }
    }

    private void k() {
        if (this.q == null || !this.b.isAvailable() || this.t == null) {
            return;
        }
        try {
            d();
            g();
            SurfaceTexture surfaceTexture = this.b.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.t.getWidth(), this.t.getHeight());
            this.D = this.q.createCaptureRequest(3);
            ArrayList arrayList = new ArrayList();
            Surface surface = new Surface(surfaceTexture);
            arrayList.add(surface);
            this.D.addTarget(surface);
            Surface surface2 = this.v.getSurface();
            arrayList.add(surface2);
            this.D.addTarget(surface2);
            this.q.createCaptureSession(arrayList, new d(), this.y);
        } catch (CameraAccessException | IOException e2) {
            e2.printStackTrace();
        }
    }

    private void l() {
        Handler handler = new Handler();
        this.k = handler;
        handler.postDelayed(this.E, this.m);
    }

    private void m() {
        this.x.quitSafely();
        try {
            this.x.join();
            this.x = null;
            this.y = null;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    private void n() {
        this.n.setVisibility(8);
        this.n.removeCallbacks(this.F);
        this.w = false;
        this.c.setImageResource(R.drawable.n_recording_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        MediaRecorder mediaRecorder = this.v;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.v.reset();
        }
        n();
        if (!this.l) {
            this.C = null;
            i();
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(new File(this.C)));
        getActivity().setResult(-1, intent);
        getActivity().finish();
        this.C = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.q == null) {
            return;
        }
        try {
            a(this.D);
            new HandlerThread("CameraPreview").start();
            this.r.setRepeatingRequest(this.D.build(), null, this.y);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.capture) {
            return;
        }
        if (this.w) {
            o();
            return;
        }
        k();
        j();
        if (this.l) {
            this.c.setOnClickListener(null);
            l();
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        c();
        m();
        n();
        if (this.l) {
            a();
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        h();
        if (this.b.isAvailable()) {
            b(this.b.getWidth(), this.b.getHeight());
        } else {
            this.b.setSurfaceTextureListener(this.s);
        }
        this.c.setOnClickListener(this);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        CameraData cameraData;
        this.b = (AutoFitTextureView) view.findViewById(R.id.texture);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.capture);
        this.c = imageButton;
        imageButton.setImageResource(R.drawable.n_recording_start);
        this.e = (TextView) view.findViewById(R.id.label1);
        this.f = (TextView) view.findViewById(R.id.label2);
        this.g = (TextView) view.findViewById(R.id.label3);
        this.h = (RelativeLayout) view.findViewById(R.id.cam_layout1);
        this.n = (LinearLayout) view.findViewById(R.id.recording_status);
        this.o = (ImageView) view.findViewById(R.id.recording_status_img);
        Intent intent = getActivity().getIntent();
        if (intent == null || (cameraData = (CameraData) intent.getParcelableExtra("camera_data")) == null) {
            return;
        }
        if (!TextUtils.isEmpty(cameraData.a())) {
            this.d = cameraData.a();
        }
        int d2 = com.comviva.webaxn.utils.b.a(getActivity()).a().d();
        int b2 = com.comviva.webaxn.utils.b.a(getActivity()).a().b();
        float a2 = com.comviva.webaxn.utils.b.a(getActivity()).a().a();
        if (!TextUtils.isEmpty(cameraData.c())) {
            this.e.setText(cameraData.c());
        }
        if (!TextUtils.isEmpty(cameraData.e())) {
            try {
                this.e.setTextSize(Float.parseFloat(cameraData.e()));
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(cameraData.d())) {
            this.e.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.d()));
        }
        if (!TextUtils.isEmpty(cameraData.f())) {
            this.f.setText(cameraData.f());
            this.f.setVisibility(0);
            if (!TextUtils.isEmpty(cameraData.h())) {
                try {
                    this.f.setTextSize(Float.parseFloat(cameraData.h()));
                } catch (NumberFormatException unused2) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.g())) {
                this.f.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.g()));
            }
        }
        if (!TextUtils.isEmpty(cameraData.i())) {
            this.g.setText(cameraData.i());
            this.g.setVisibility(0);
            if (!TextUtils.isEmpty(cameraData.k())) {
                try {
                    this.g.setTextSize(Float.parseFloat(cameraData.k()));
                } catch (NumberFormatException unused3) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.j())) {
                this.g.setTypeface(com.comviva.webaxn.utils.v.a(cameraData.j()));
            }
        }
        if (!TextUtils.isEmpty(cameraData.n())) {
            int a3 = x1.a(cameraData.n(), d2, a2);
            this.h.setPadding(a3, a3, a3, a3);
        }
        if (!TextUtils.isEmpty(cameraData.m())) {
            try {
                this.h.setBackgroundColor(Color.parseColor(cameraData.m()));
            } catch (IllegalArgumentException unused4) {
            }
        }
        if (!TextUtils.isEmpty(cameraData.p()) && !TextUtils.isEmpty(cameraData.o())) {
            int i = (int) (b2 * 0.6f);
            int a4 = x1.a(cameraData.p(), d2, a2);
            int a5 = x1.a(cameraData.o(), b2, a2);
            if (a5 == -3 && a4 > 0) {
                a5 = a4;
            }
            if (a5 <= i) {
                i = a5;
            }
            this.i = true;
            this.b.getLayoutParams().width = a4;
            this.b.getLayoutParams().height = i;
        }
        if (!TextUtils.isEmpty(cameraData.b())) {
            this.j = cameraData.b();
        }
        if (TextUtils.isEmpty(cameraData.l())) {
            return;
        }
        try {
            this.m = Long.parseLong(cameraData.l());
            this.l = true;
        } catch (NumberFormatException unused5) {
        }
    }
}
