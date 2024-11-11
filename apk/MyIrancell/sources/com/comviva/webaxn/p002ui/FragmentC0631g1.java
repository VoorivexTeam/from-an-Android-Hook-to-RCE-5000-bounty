package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.CameraData;
import com.mtni.myirancell.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.comviva.webaxn.ui.g1 */
/* loaded from: classes.dex */
public class FragmentC0631g1 extends Fragment implements View.OnClickListener {

    /* renamed from: G */
    private static final SparseIntArray f3719G = new SparseIntArray();

    /* renamed from: H */
    private static final SparseIntArray f3720H = new SparseIntArray();

    /* renamed from: I */
    private static final String f3721I = FragmentC0631g1.class.getCanonicalName();

    /* renamed from: B */
    private Integer f3723B;

    /* renamed from: C */
    private String f3724C;

    /* renamed from: D */
    private CaptureRequest.Builder f3725D;

    /* renamed from: b */
    private AutoFitTextureView f3728b;

    /* renamed from: c */
    private ImageButton f3729c;

    /* renamed from: d */
    private String f3730d;

    /* renamed from: e */
    private TextView f3731e;

    /* renamed from: f */
    private TextView f3732f;

    /* renamed from: g */
    private TextView f3733g;

    /* renamed from: h */
    private RelativeLayout f3734h;

    /* renamed from: j */
    private String f3736j;

    /* renamed from: k */
    private Handler f3737k;

    /* renamed from: n */
    private LinearLayout f3740n;

    /* renamed from: o */
    private ImageView f3741o;

    /* renamed from: q */
    private CameraDevice f3743q;

    /* renamed from: r */
    private CameraCaptureSession f3744r;

    /* renamed from: t */
    private Size f3746t;

    /* renamed from: u */
    private Size f3747u;

    /* renamed from: v */
    private MediaRecorder f3748v;

    /* renamed from: w */
    private boolean f3749w;

    /* renamed from: x */
    private HandlerThread f3750x;

    /* renamed from: y */
    private Handler f3751y;

    /* renamed from: i */
    private boolean f3735i = false;

    /* renamed from: l */
    private boolean f3738l = false;

    /* renamed from: m */
    private long f3739m = 30000;

    /* renamed from: p */
    private boolean f3742p = true;

    /* renamed from: s */
    private TextureView.SurfaceTextureListener f3745s = new a();

    /* renamed from: z */
    private Semaphore f3752z = new Semaphore(1);

    /* renamed from: A */
    private CameraDevice.StateCallback f3722A = new b();

    /* renamed from: E */
    private Runnable f3726E = new e();

    /* renamed from: F */
    private Runnable f3727F = new f();

    /* renamed from: com.comviva.webaxn.ui.g1$a */
    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            FragmentC0631g1.this.m4393b(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            FragmentC0631g1.this.m4388a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.g1$b */
    /* loaded from: classes.dex */
    class b extends CameraDevice.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            FragmentC0631g1.this.f3752z.release();
            cameraDevice.close();
            FragmentC0631g1.this.f3743q = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            FragmentC0631g1.this.f3752z.release();
            cameraDevice.close();
            FragmentC0631g1.this.f3743q = null;
            Activity activity = FragmentC0631g1.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            FragmentC0631g1.this.f3743q = cameraDevice;
            FragmentC0631g1.this.m4409i();
            FragmentC0631g1.this.f3752z.release();
            if (FragmentC0631g1.this.f3728b != null) {
                FragmentC0631g1 fragmentC0631g1 = FragmentC0631g1.this;
                fragmentC0631g1.m4388a(fragmentC0631g1.f3728b.getWidth(), FragmentC0631g1.this.f3728b.getHeight());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.g1$c */
    /* loaded from: classes.dex */
    public class c extends CameraCaptureSession.StateCallback {
        c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            FragmentC0631g1.this.getActivity();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            FragmentC0631g1.this.f3744r = cameraCaptureSession;
            FragmentC0631g1.this.m4416p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.g1$d */
    /* loaded from: classes.dex */
    public class d extends CameraCaptureSession.StateCallback {

        /* renamed from: com.comviva.webaxn.ui.g1$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageButton imageButton;
                int i;
                if (FragmentC0631g1.this.f3738l) {
                    imageButton = FragmentC0631g1.this.f3729c;
                    i = R.drawable.n_recording_on;
                } else {
                    imageButton = FragmentC0631g1.this.f3729c;
                    i = R.drawable.n_recording_stop;
                }
                imageButton.setImageResource(i);
                FragmentC0631g1.this.f3749w = true;
                FragmentC0631g1.this.f3748v.start();
            }
        }

        d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            FragmentC0631g1.this.getActivity();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            FragmentC0631g1.this.f3744r = cameraCaptureSession;
            FragmentC0631g1.this.m4416p();
            FragmentC0631g1.this.getActivity().runOnUiThread(new a());
        }
    }

    /* renamed from: com.comviva.webaxn.ui.g1$e */
    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentC0631g1.this.m4415o();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.g1$f */
    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentC0631g1.this.m4392b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.g1$g */
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

    /* renamed from: com.comviva.webaxn.ui.g1$h */
    /* loaded from: classes.dex */
    public static class h extends DialogFragment {

        /* renamed from: com.comviva.webaxn.ui.g1$h$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ Activity f3760b;

            a(h hVar, Activity activity) {
                this.f3760b = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f3760b.finish();
            }
        }

        /* renamed from: a */
        public static h m4418a(String str) {
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
        f3719G.append(0, 90);
        f3719G.append(1, 0);
        f3719G.append(2, 270);
        f3719G.append(3, 180);
        f3720H.append(0, 270);
        f3720H.append(1, 180);
        f3720H.append(2, 90);
        f3720H.append(3, 0);
    }

    /* renamed from: a */
    private static Size m4385a(Size[] sizeArr) {
        for (Size size : sizeArr) {
            if (size.getWidth() == (size.getHeight() * 4) / 3 && size.getWidth() <= 1080) {
                return size;
            }
        }
        return sizeArr[sizeArr.length - 1];
    }

    /* renamed from: a */
    private static Size m4386a(Size[] sizeArr, int i, int i2, Size size) {
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

    /* renamed from: a */
    private void m4387a() {
        Handler handler = this.f3737k;
        if (handler != null) {
            handler.removeCallbacks(this.f3726E);
            this.f3737k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4388a(int i, int i2) {
        Activity activity = getActivity();
        if (this.f3728b == null || this.f3746t == null || activity == null) {
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f3746t.getHeight(), this.f3746t.getWidth());
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float max = Math.max(f3 / this.f3746t.getHeight(), f2 / this.f3746t.getWidth());
            matrix.postScale(max, max, centerX, centerY);
            matrix.postRotate((rotation - 2) * 90, centerX, centerY);
        }
        this.f3728b.setTransform(matrix);
    }

    /* renamed from: a */
    private void m4389a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4392b() {
        boolean z;
        if (this.f3742p) {
            this.f3741o.setAlpha(0.0f);
            z = false;
        } else {
            this.f3741o.setAlpha(1.0f);
            z = true;
        }
        this.f3742p = z;
        m4410j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4393b(int i, int i2) {
        AutoFitTextureView autoFitTextureView;
        int height;
        int width;
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        try {
            if (!this.f3752z.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            String str = cameraManager.getCameraIdList()[0];
            if (!TextUtils.isEmpty(this.f3730d) && this.f3730d.equals("front")) {
                str = cameraManager.getCameraIdList()[1];
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            this.f3723B = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (streamConfigurationMap == null) {
                throw new RuntimeException("Cannot get available preview/video sizes");
            }
            this.f3747u = m4385a(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
            this.f3746t = m4386a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2, this.f3747u);
            int i3 = getResources().getConfiguration().orientation;
            if (this.f3735i) {
                this.f3728b.m4003a(i, i2);
            } else {
                if (i3 == 2) {
                    autoFitTextureView = this.f3728b;
                    height = this.f3746t.getWidth();
                    width = this.f3746t.getHeight();
                } else {
                    autoFitTextureView = this.f3728b;
                    height = this.f3746t.getHeight();
                    width = this.f3746t.getWidth();
                }
                autoFitTextureView.m4003a(height, width);
            }
            m4388a(i, i2);
            this.f3748v = new MediaRecorder();
            cameraManager.openCamera(str, this.f3722A, (Handler) null);
        } catch (CameraAccessException unused) {
            activity.finish();
        } catch (InterruptedException unused2) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.");
        } catch (NullPointerException unused3) {
            h.m4418a(getString(R.string.camera_error)).show(getChildFragmentManager(), "dialog");
        }
    }

    /* renamed from: c */
    private void m4396c() {
        try {
            try {
                this.f3752z.acquire();
                m4398d();
                if (this.f3743q != null) {
                    this.f3743q.close();
                    this.f3743q = null;
                }
                if (this.f3748v != null) {
                    this.f3748v.release();
                    this.f3748v = null;
                }
            } catch (InterruptedException unused) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.");
            }
        } finally {
            this.f3752z.release();
        }
    }

    /* renamed from: d */
    private void m4398d() {
        CameraCaptureSession cameraCaptureSession = this.f3744r;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f3744r = null;
        }
    }

    /* renamed from: e */
    private String m4400e() {
        return new File(this.f3736j).getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4";
    }

    /* renamed from: f */
    public static FragmentC0631g1 m4403f() {
        return new FragmentC0631g1();
    }

    /* renamed from: g */
    private void m4404g() {
        MediaRecorder mediaRecorder;
        SparseIntArray sparseIntArray;
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.f3748v.setAudioSource(1);
        this.f3748v.setVideoSource(2);
        this.f3748v.setOutputFormat(2);
        String str = this.f3724C;
        if (str == null || str.isEmpty()) {
            this.f3724C = m4400e();
        }
        this.f3748v.setOutputFile(this.f3724C);
        this.f3748v.setVideoEncodingBitRate(1000000);
        this.f3748v.setVideoFrameRate(20);
        this.f3748v.setVideoSize(this.f3747u.getWidth(), this.f3747u.getHeight());
        this.f3748v.setVideoEncoder(2);
        this.f3748v.setAudioEncoder(3);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int intValue = this.f3723B.intValue();
        if (intValue != 90) {
            if (intValue == 270) {
                mediaRecorder = this.f3748v;
                sparseIntArray = f3720H;
            }
            this.f3748v.prepare();
        }
        mediaRecorder = this.f3748v;
        sparseIntArray = f3719G;
        mediaRecorder.setOrientationHint(sparseIntArray.get(rotation));
        this.f3748v.prepare();
    }

    /* renamed from: h */
    private void m4406h() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f3750x = handlerThread;
        handlerThread.start();
        this.f3751y = new Handler(this.f3750x.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m4409i() {
        if (this.f3743q == null || !this.f3728b.isAvailable() || this.f3746t == null) {
            return;
        }
        try {
            m4398d();
            SurfaceTexture surfaceTexture = this.f3728b.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.f3746t.getWidth(), this.f3746t.getHeight());
            this.f3725D = this.f3743q.createCaptureRequest(1);
            Surface surface = new Surface(surfaceTexture);
            this.f3725D.addTarget(surface);
            this.f3743q.createCaptureSession(Collections.singletonList(surface), new c(), this.f3751y);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m4410j() {
        LinearLayout linearLayout = this.f3740n;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 8) {
                this.f3740n.setVisibility(0);
            }
            this.f3740n.postDelayed(this.f3727F, 250L);
        }
    }

    /* renamed from: k */
    private void m4411k() {
        if (this.f3743q == null || !this.f3728b.isAvailable() || this.f3746t == null) {
            return;
        }
        try {
            m4398d();
            m4404g();
            SurfaceTexture surfaceTexture = this.f3728b.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.f3746t.getWidth(), this.f3746t.getHeight());
            this.f3725D = this.f3743q.createCaptureRequest(3);
            ArrayList arrayList = new ArrayList();
            Surface surface = new Surface(surfaceTexture);
            arrayList.add(surface);
            this.f3725D.addTarget(surface);
            Surface surface2 = this.f3748v.getSurface();
            arrayList.add(surface2);
            this.f3725D.addTarget(surface2);
            this.f3743q.createCaptureSession(arrayList, new d(), this.f3751y);
        } catch (CameraAccessException | IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: l */
    private void m4412l() {
        Handler handler = new Handler();
        this.f3737k = handler;
        handler.postDelayed(this.f3726E, this.f3739m);
    }

    /* renamed from: m */
    private void m4413m() {
        this.f3750x.quitSafely();
        try {
            this.f3750x.join();
            this.f3750x = null;
            this.f3751y = null;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: n */
    private void m4414n() {
        this.f3740n.setVisibility(8);
        this.f3740n.removeCallbacks(this.f3727F);
        this.f3749w = false;
        this.f3729c.setImageResource(R.drawable.n_recording_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m4415o() {
        MediaRecorder mediaRecorder = this.f3748v;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.f3748v.reset();
        }
        m4414n();
        if (!this.f3738l) {
            this.f3724C = null;
            m4409i();
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(new File(this.f3724C)));
        getActivity().setResult(-1, intent);
        getActivity().finish();
        this.f3724C = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m4416p() {
        if (this.f3743q == null) {
            return;
        }
        try {
            m4389a(this.f3725D);
            new HandlerThread("CameraPreview").start();
            this.f3744r.setRepeatingRequest(this.f3725D.build(), null, this.f3751y);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.capture) {
            return;
        }
        if (this.f3749w) {
            m4415o();
            return;
        }
        m4411k();
        m4410j();
        if (this.f3738l) {
            this.f3729c.setOnClickListener(null);
            m4412l();
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        m4396c();
        m4413m();
        m4414n();
        if (this.f3738l) {
            m4387a();
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m4406h();
        if (this.f3728b.isAvailable()) {
            m4393b(this.f3728b.getWidth(), this.f3728b.getHeight());
        } else {
            this.f3728b.setSurfaceTextureListener(this.f3745s);
        }
        this.f3729c.setOnClickListener(this);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        CameraData cameraData;
        this.f3728b = (AutoFitTextureView) view.findViewById(R.id.texture);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.capture);
        this.f3729c = imageButton;
        imageButton.setImageResource(R.drawable.n_recording_start);
        this.f3731e = (TextView) view.findViewById(R.id.label1);
        this.f3732f = (TextView) view.findViewById(R.id.label2);
        this.f3733g = (TextView) view.findViewById(R.id.label3);
        this.f3734h = (RelativeLayout) view.findViewById(R.id.cam_layout1);
        this.f3740n = (LinearLayout) view.findViewById(R.id.recording_status);
        this.f3741o = (ImageView) view.findViewById(R.id.recording_status_img);
        Intent intent = getActivity().getIntent();
        if (intent == null || (cameraData = (CameraData) intent.getParcelableExtra("camera_data")) == null) {
            return;
        }
        if (!TextUtils.isEmpty(cameraData.m5188a())) {
            this.f3730d = cameraData.m5188a();
        }
        int m5552d = C0687b.m5342a(getActivity()).m5343a().m5552d();
        int m5547b = C0687b.m5342a(getActivity()).m5343a().m5547b();
        float m5544a = C0687b.m5342a(getActivity()).m5343a().m5544a();
        if (!TextUtils.isEmpty(cameraData.m5192c())) {
            this.f3731e.setText(cameraData.m5192c());
        }
        if (!TextUtils.isEmpty(cameraData.m5196e())) {
            try {
                this.f3731e.setTextSize(Float.parseFloat(cameraData.m5196e()));
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(cameraData.m5194d())) {
            this.f3731e.setTypeface(C0747v.m6081a(cameraData.m5194d()));
        }
        if (!TextUtils.isEmpty(cameraData.m5198f())) {
            this.f3732f.setText(cameraData.m5198f());
            this.f3732f.setVisibility(0);
            if (!TextUtils.isEmpty(cameraData.m5202h())) {
                try {
                    this.f3732f.setTextSize(Float.parseFloat(cameraData.m5202h()));
                } catch (NumberFormatException unused2) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5200g())) {
                this.f3732f.setTypeface(C0747v.m6081a(cameraData.m5200g()));
            }
        }
        if (!TextUtils.isEmpty(cameraData.m5204i())) {
            this.f3733g.setText(cameraData.m5204i());
            this.f3733g.setVisibility(0);
            if (!TextUtils.isEmpty(cameraData.m5208k())) {
                try {
                    this.f3733g.setTextSize(Float.parseFloat(cameraData.m5208k()));
                } catch (NumberFormatException unused3) {
                }
            }
            if (!TextUtils.isEmpty(cameraData.m5206j())) {
                this.f3733g.setTypeface(C0747v.m6081a(cameraData.m5206j()));
            }
        }
        if (!TextUtils.isEmpty(cameraData.m5214n())) {
            int m6115a = C0755x1.m6115a(cameraData.m5214n(), m5552d, m5544a);
            this.f3734h.setPadding(m6115a, m6115a, m6115a, m6115a);
        }
        if (!TextUtils.isEmpty(cameraData.m5212m())) {
            try {
                this.f3734h.setBackgroundColor(Color.parseColor(cameraData.m5212m()));
            } catch (IllegalArgumentException unused4) {
            }
        }
        if (!TextUtils.isEmpty(cameraData.m5218p()) && !TextUtils.isEmpty(cameraData.m5216o())) {
            int i = (int) (m5547b * 0.6f);
            int m6115a2 = C0755x1.m6115a(cameraData.m5218p(), m5552d, m5544a);
            int m6115a3 = C0755x1.m6115a(cameraData.m5216o(), m5547b, m5544a);
            if (m6115a3 == -3 && m6115a2 > 0) {
                m6115a3 = m6115a2;
            }
            if (m6115a3 <= i) {
                i = m6115a3;
            }
            this.f3735i = true;
            this.f3728b.getLayoutParams().width = m6115a2;
            this.f3728b.getLayoutParams().height = i;
        }
        if (!TextUtils.isEmpty(cameraData.m5190b())) {
            this.f3736j = cameraData.m5190b();
        }
        if (TextUtils.isEmpty(cameraData.m5210l())) {
            return;
        }
        try {
            this.f3739m = Long.parseLong(cameraData.m5210l());
            this.f3738l = true;
        } catch (NumberFormatException unused5) {
        }
    }
}
