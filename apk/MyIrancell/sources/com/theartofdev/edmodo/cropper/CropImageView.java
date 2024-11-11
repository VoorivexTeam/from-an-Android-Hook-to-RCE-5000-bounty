package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.AsyncTaskC2334a;
import com.theartofdev.edmodo.cropper.AsyncTaskC2335b;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: A */
    private InterfaceC2328i f9373A;

    /* renamed from: B */
    private InterfaceC2324e f9374B;

    /* renamed from: C */
    private Uri f9375C;

    /* renamed from: D */
    private int f9376D;

    /* renamed from: E */
    private float f9377E;

    /* renamed from: F */
    private float f9378F;

    /* renamed from: G */
    private float f9379G;

    /* renamed from: H */
    private RectF f9380H;

    /* renamed from: I */
    private int f9381I;

    /* renamed from: J */
    private boolean f9382J;

    /* renamed from: K */
    private Uri f9383K;

    /* renamed from: L */
    private WeakReference<AsyncTaskC2335b> f9384L;

    /* renamed from: M */
    private WeakReference<AsyncTaskC2334a> f9385M;

    /* renamed from: b */
    private final ImageView f9386b;

    /* renamed from: c */
    private final CropOverlayView f9387c;

    /* renamed from: d */
    private final Matrix f9388d;

    /* renamed from: e */
    private final Matrix f9389e;

    /* renamed from: f */
    private final ProgressBar f9390f;

    /* renamed from: g */
    private final float[] f9391g;

    /* renamed from: h */
    private final float[] f9392h;

    /* renamed from: i */
    private AnimationAnimationListenerC2337d f9393i;

    /* renamed from: j */
    private Bitmap f9394j;

    /* renamed from: k */
    private int f9395k;

    /* renamed from: l */
    private int f9396l;

    /* renamed from: m */
    private boolean f9397m;

    /* renamed from: n */
    private boolean f9398n;

    /* renamed from: o */
    private int f9399o;

    /* renamed from: p */
    private int f9400p;

    /* renamed from: q */
    private int f9401q;

    /* renamed from: r */
    private EnumC2330k f9402r;

    /* renamed from: s */
    private boolean f9403s;

    /* renamed from: t */
    private boolean f9404t;

    /* renamed from: u */
    private boolean f9405u;

    /* renamed from: v */
    private boolean f9406v;

    /* renamed from: w */
    private int f9407w;

    /* renamed from: x */
    private InterfaceC2326g f9408x;

    /* renamed from: y */
    private InterfaceC2325f f9409y;

    /* renamed from: z */
    private InterfaceC2327h f9410z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    /* loaded from: classes.dex */
    class C2320a implements CropOverlayView.InterfaceC2332b {
        C2320a() {
        }

        @Override // com.theartofdev.edmodo.cropper.CropOverlayView.InterfaceC2332b
        /* renamed from: a */
        public void mo11082a(boolean z) {
            CropImageView.this.m11067a(z, true);
            InterfaceC2326g interfaceC2326g = CropImageView.this.f9408x;
            if (interfaceC2326g != null && !z) {
                interfaceC2326g.m11092a(CropImageView.this.getCropRect());
            }
            InterfaceC2325f interfaceC2325f = CropImageView.this.f9409y;
            if (interfaceC2325f == null || !z) {
                return;
            }
            interfaceC2325f.m11091a(CropImageView.this.getCropRect());
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    /* loaded from: classes.dex */
    public static class C2321b {

        /* renamed from: b */
        private final Bitmap f9412b;

        /* renamed from: c */
        private final Uri f9413c;

        /* renamed from: d */
        private final Bitmap f9414d;

        /* renamed from: e */
        private final Uri f9415e;

        /* renamed from: f */
        private final Exception f9416f;

        /* renamed from: g */
        private final float[] f9417g;

        /* renamed from: h */
        private final Rect f9418h;

        /* renamed from: i */
        private final Rect f9419i;

        /* renamed from: j */
        private final int f9420j;

        /* renamed from: k */
        private final int f9421k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2321b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f9412b = bitmap;
            this.f9413c = uri;
            this.f9414d = bitmap2;
            this.f9415e = uri2;
            this.f9416f = exc;
            this.f9417g = fArr;
            this.f9418h = rect;
            this.f9419i = rect2;
            this.f9420j = i;
            this.f9421k = i2;
        }

        /* renamed from: a */
        public float[] m11083a() {
            return this.f9417g;
        }

        /* renamed from: b */
        public Rect m11084b() {
            return this.f9418h;
        }

        /* renamed from: c */
        public Exception m11085c() {
            return this.f9416f;
        }

        /* renamed from: d */
        public Uri m11086d() {
            return this.f9413c;
        }

        /* renamed from: e */
        public int m11087e() {
            return this.f9420j;
        }

        /* renamed from: f */
        public int m11088f() {
            return this.f9421k;
        }

        /* renamed from: g */
        public Uri m11089g() {
            return this.f9415e;
        }

        /* renamed from: h */
        public Rect m11090h() {
            return this.f9419i;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    /* loaded from: classes.dex */
    public enum EnumC2322c {
        RECTANGLE,
        OVAL
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    /* loaded from: classes.dex */
    public enum EnumC2323d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2324e {
        /* renamed from: a */
        void mo11054a(CropImageView cropImageView, C2321b c2321b);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2325f {
        /* renamed from: a */
        void m11091a(Rect rect);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2326g {
        /* renamed from: a */
        void m11092a(Rect rect);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$h */
    /* loaded from: classes.dex */
    public interface InterfaceC2327h {
        /* renamed from: a */
        void m11093a();
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$i */
    /* loaded from: classes.dex */
    public interface InterfaceC2328i {
        /* renamed from: a */
        void mo11053a(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$j */
    /* loaded from: classes.dex */
    public enum EnumC2329j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$k */
    /* loaded from: classes.dex */
    public enum EnumC2330k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bundle bundleExtra;
        this.f9388d = new Matrix();
        this.f9389e = new Matrix();
        this.f9391g = new float[8];
        this.f9392h = new float[8];
        this.f9403s = false;
        this.f9404t = true;
        this.f9405u = true;
        this.f9406v = true;
        this.f9376D = 1;
        this.f9377E = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            cropImageOptions = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropImageView, 0, 0);
                try {
                    cropImageOptions.f9359m = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropFixAspectRatio, cropImageOptions.f9359m);
                    cropImageOptions.f9360n = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropAspectRatioX, cropImageOptions.f9360n);
                    cropImageOptions.f9361o = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropAspectRatioY, cropImageOptions.f9361o);
                    cropImageOptions.f9352f = EnumC2330k.values()[obtainStyledAttributes.getInt(R$styleable.CropImageView_cropScaleType, cropImageOptions.f9352f.ordinal())];
                    cropImageOptions.f9355i = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropAutoZoomEnabled, cropImageOptions.f9355i);
                    cropImageOptions.f9356j = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropMultiTouchEnabled, cropImageOptions.f9356j);
                    cropImageOptions.f9357k = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropMaxZoom, cropImageOptions.f9357k);
                    cropImageOptions.f9344b = EnumC2322c.values()[obtainStyledAttributes.getInt(R$styleable.CropImageView_cropShape, cropImageOptions.f9344b.ordinal())];
                    cropImageOptions.f9350e = EnumC2323d.values()[obtainStyledAttributes.getInt(R$styleable.CropImageView_cropGuidelines, cropImageOptions.f9350e.ordinal())];
                    cropImageOptions.f9346c = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropSnapRadius, cropImageOptions.f9346c);
                    cropImageOptions.f9348d = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropTouchRadius, cropImageOptions.f9348d);
                    cropImageOptions.f9358l = obtainStyledAttributes.getFloat(R$styleable.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.f9358l);
                    cropImageOptions.f9362p = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropBorderLineThickness, cropImageOptions.f9362p);
                    cropImageOptions.f9363q = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropBorderLineColor, cropImageOptions.f9363q);
                    cropImageOptions.f9364r = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropBorderCornerThickness, cropImageOptions.f9364r);
                    cropImageOptions.f9365s = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropBorderCornerOffset, cropImageOptions.f9365s);
                    cropImageOptions.f9366t = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropBorderCornerLength, cropImageOptions.f9366t);
                    cropImageOptions.f9367u = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropBorderCornerColor, cropImageOptions.f9367u);
                    cropImageOptions.f9368v = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropGuidelinesThickness, cropImageOptions.f9368v);
                    cropImageOptions.f9369w = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropGuidelinesColor, cropImageOptions.f9369w);
                    cropImageOptions.f9370x = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropBackgroundColor, cropImageOptions.f9370x);
                    cropImageOptions.f9353g = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropShowCropOverlay, this.f9404t);
                    cropImageOptions.f9354h = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropShowProgressBar, this.f9405u);
                    cropImageOptions.f9364r = obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropBorderCornerThickness, cropImageOptions.f9364r);
                    cropImageOptions.f9371y = (int) obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropMinCropWindowWidth, cropImageOptions.f9371y);
                    cropImageOptions.f9372z = (int) obtainStyledAttributes.getDimension(R$styleable.CropImageView_cropMinCropWindowHeight, cropImageOptions.f9372z);
                    cropImageOptions.f9317A = (int) obtainStyledAttributes.getFloat(R$styleable.CropImageView_cropMinCropResultWidthPX, cropImageOptions.f9317A);
                    cropImageOptions.f9318B = (int) obtainStyledAttributes.getFloat(R$styleable.CropImageView_cropMinCropResultHeightPX, cropImageOptions.f9318B);
                    cropImageOptions.f9319C = (int) obtainStyledAttributes.getFloat(R$styleable.CropImageView_cropMaxCropResultWidthPX, cropImageOptions.f9319C);
                    cropImageOptions.f9320D = (int) obtainStyledAttributes.getFloat(R$styleable.CropImageView_cropMaxCropResultHeightPX, cropImageOptions.f9320D);
                    cropImageOptions.f9336T = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropFlipHorizontally, cropImageOptions.f9336T);
                    cropImageOptions.f9337U = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropFlipHorizontally, cropImageOptions.f9337U);
                    cropImageOptions.f9340X = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cropScreenStatusbarColor, cropImageOptions.f9340X);
                    cropImageOptions.f9341Y = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_customActionLayoutRequired, cropImageOptions.f9341Y);
                    cropImageOptions.f9342Z = obtainStyledAttributes.getInteger(R$styleable.CropImageView_customActionLayoutBGColor, cropImageOptions.f9342Z);
                    cropImageOptions.f9343a0 = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cancelTextFC, cropImageOptions.f9343a0);
                    cropImageOptions.f9347c0 = obtainStyledAttributes.getInteger(R$styleable.CropImageView_cancelTextFS, cropImageOptions.f9347c0);
                    cropImageOptions.f9345b0 = obtainStyledAttributes.getInteger(R$styleable.CropImageView_doneTextFC, cropImageOptions.f9345b0);
                    cropImageOptions.f9349d0 = obtainStyledAttributes.getInteger(R$styleable.CropImageView_doneTextFS, cropImageOptions.f9349d0);
                    this.f9403s = obtainStyledAttributes.getBoolean(R$styleable.CropImageView_cropSaveBitmapToInstanceState, this.f9403s);
                    if (obtainStyledAttributes.hasValue(R$styleable.CropImageView_cropAspectRatioX) && obtainStyledAttributes.hasValue(R$styleable.CropImageView_cropAspectRatioX) && !obtainStyledAttributes.hasValue(R$styleable.CropImageView_cropFixAspectRatio)) {
                        cropImageOptions.f9359m = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.m11060a();
        this.f9402r = cropImageOptions.f9352f;
        this.f9406v = cropImageOptions.f9355i;
        this.f9407w = cropImageOptions.f9357k;
        this.f9404t = cropImageOptions.f9353g;
        this.f9405u = cropImageOptions.f9354h;
        this.f9397m = cropImageOptions.f9336T;
        this.f9398n = cropImageOptions.f9337U;
        View inflate = LayoutInflater.from(context).inflate(R$layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R$id.ImageView_image);
        this.f9386b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(R$id.CropOverlayView);
        this.f9387c = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new C2320a());
        this.f9387c.setInitialAttributeValues(cropImageOptions);
        this.f9390f = (ProgressBar) inflate.findViewById(R$id.CropProgressBar);
        m11072f();
    }

    /* renamed from: a */
    private static int m11061a(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: a */
    private void m11063a(float f, float f2, boolean z, boolean z2) {
        if (this.f9394j != null) {
            if (f <= 0.0f || f2 <= 0.0f) {
                return;
            }
            this.f9388d.invert(this.f9389e);
            RectF cropWindowRect = this.f9387c.getCropWindowRect();
            this.f9389e.mapRect(cropWindowRect);
            this.f9388d.reset();
            this.f9388d.postTranslate((f - this.f9394j.getWidth()) / 2.0f, (f2 - this.f9394j.getHeight()) / 2.0f);
            m11070d();
            int i = this.f9396l;
            if (i > 0) {
                this.f9388d.postRotate(i, C2336c.m11143b(this.f9391g), C2336c.m11144c(this.f9391g));
                m11070d();
            }
            float min = Math.min(f / C2336c.m11149h(this.f9391g), f2 / C2336c.m11145d(this.f9391g));
            EnumC2330k enumC2330k = this.f9402r;
            if (enumC2330k == EnumC2330k.FIT_CENTER || ((enumC2330k == EnumC2330k.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f9406v))) {
                this.f9388d.postScale(min, min, C2336c.m11143b(this.f9391g), C2336c.m11144c(this.f9391g));
                m11070d();
            }
            float f3 = this.f9397m ? -this.f9377E : this.f9377E;
            float f4 = this.f9398n ? -this.f9377E : this.f9377E;
            this.f9388d.postScale(f3, f4, C2336c.m11143b(this.f9391g), C2336c.m11144c(this.f9391g));
            m11070d();
            this.f9388d.mapRect(cropWindowRect);
            if (z) {
                this.f9378F = f > C2336c.m11149h(this.f9391g) ? 0.0f : Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C2336c.m11146e(this.f9391g)), getWidth() - C2336c.m11147f(this.f9391g)) / f3;
                this.f9379G = f2 <= C2336c.m11145d(this.f9391g) ? Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C2336c.m11148g(this.f9391g)), getHeight() - C2336c.m11120a(this.f9391g)) / f4 : 0.0f;
            } else {
                this.f9378F = Math.min(Math.max(this.f9378F * f3, -cropWindowRect.left), (-cropWindowRect.right) + f) / f3;
                this.f9379G = Math.min(Math.max(this.f9379G * f4, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f4;
            }
            this.f9388d.postTranslate(this.f9378F * f3, this.f9379G * f4);
            cropWindowRect.offset(this.f9378F * f3, this.f9379G * f4);
            this.f9387c.setCropWindowRect(cropWindowRect);
            m11070d();
            this.f9387c.invalidate();
            if (z2) {
                this.f9393i.m11150a(this.f9391g, this.f9388d);
                this.f9386b.startAnimation(this.f9393i);
            } else {
                this.f9386b.setImageMatrix(this.f9388d);
            }
            m11066a(false);
        }
    }

    /* renamed from: a */
    private void m11064a(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f9394j;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f9386b.clearAnimation();
            m11069c();
            this.f9394j = bitmap;
            this.f9386b.setImageBitmap(bitmap);
            this.f9375C = uri;
            this.f9401q = i;
            this.f9376D = i2;
            this.f9396l = i3;
            m11063a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f9387c;
            if (cropOverlayView != null) {
                cropOverlayView.m11114c();
                m11071e();
            }
        }
    }

    /* renamed from: a */
    private void m11066a(boolean z) {
        if (this.f9394j != null && !z) {
            this.f9387c.m11110a(getWidth(), getHeight(), (this.f9376D * 100.0f) / C2336c.m11149h(this.f9392h), (this.f9376D * 100.0f) / C2336c.m11145d(this.f9392h));
        }
        this.f9387c.m11111a(z ? null : this.f9391g, getWidth(), getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11067a(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.m11067a(boolean, boolean):void");
    }

    /* renamed from: c */
    private void m11069c() {
        if (this.f9394j != null && (this.f9401q > 0 || this.f9375C != null)) {
            this.f9394j.recycle();
        }
        this.f9394j = null;
        this.f9401q = 0;
        this.f9375C = null;
        this.f9376D = 1;
        this.f9396l = 0;
        this.f9377E = 1.0f;
        this.f9378F = 0.0f;
        this.f9379G = 0.0f;
        this.f9388d.reset();
        this.f9383K = null;
        this.f9386b.setImageBitmap(null);
        m11071e();
    }

    /* renamed from: d */
    private void m11070d() {
        float[] fArr = this.f9391g;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f9394j.getWidth();
        float[] fArr2 = this.f9391g;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f9394j.getWidth();
        this.f9391g[5] = this.f9394j.getHeight();
        float[] fArr3 = this.f9391g;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f9394j.getHeight();
        this.f9388d.mapPoints(this.f9391g);
        float[] fArr4 = this.f9392h;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f9388d.mapPoints(fArr4);
    }

    /* renamed from: e */
    private void m11071e() {
        CropOverlayView cropOverlayView = this.f9387c;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f9404t || this.f9394j == null) ? 4 : 0);
        }
    }

    /* renamed from: f */
    private void m11072f() {
        this.f9390f.setVisibility(this.f9405u && ((this.f9394j == null && this.f9384L != null) || this.f9385M != null) ? 0 : 4);
    }

    /* renamed from: a */
    public Bitmap m11073a(int i, int i2, EnumC2329j enumC2329j) {
        if (this.f9394j == null) {
            return null;
        }
        this.f9386b.clearAnimation();
        int i3 = enumC2329j != EnumC2329j.NONE ? i : 0;
        int i4 = enumC2329j != EnumC2329j.NONE ? i2 : 0;
        return C2336c.m11125a(((this.f9375C == null || (this.f9376D <= 1 && enumC2329j != EnumC2329j.SAMPLING)) ? C2336c.m11137a(this.f9394j, getCropPoints(), this.f9396l, this.f9387c.m11113b(), this.f9387c.getAspectRatioX(), this.f9387c.getAspectRatioY(), this.f9397m, this.f9398n) : C2336c.m11134a(getContext(), this.f9375C, getCropPoints(), this.f9396l, this.f9394j.getWidth() * this.f9376D, this.f9394j.getHeight() * this.f9376D, this.f9387c.m11113b(), this.f9387c.getAspectRatioX(), this.f9387c.getAspectRatioY(), i3, i4, this.f9397m, this.f9398n)).f9495a, i3, i4, enumC2329j);
    }

    /* renamed from: a */
    public void m11074a() {
        this.f9397m = !this.f9397m;
        m11063a(getWidth(), getHeight(), true, false);
    }

    /* renamed from: a */
    public void m11075a(int i) {
        if (this.f9394j != null) {
            int i2 = i < 0 ? (i % 360) + 360 : i % 360;
            boolean z = !this.f9387c.m11113b() && ((i2 > 45 && i2 < 135) || (i2 > 215 && i2 < 305));
            C2336c.f9490c.set(this.f9387c.getCropWindowRect());
            RectF rectF = C2336c.f9490c;
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            RectF rectF2 = C2336c.f9490c;
            float width = (z ? rectF2.width() : rectF2.height()) / 2.0f;
            if (z) {
                boolean z2 = this.f9397m;
                this.f9397m = this.f9398n;
                this.f9398n = z2;
            }
            this.f9388d.invert(this.f9389e);
            C2336c.f9491d[0] = C2336c.f9490c.centerX();
            C2336c.f9491d[1] = C2336c.f9490c.centerY();
            float[] fArr = C2336c.f9491d;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f9389e.mapPoints(fArr);
            this.f9396l = (this.f9396l + i2) % 360;
            m11063a(getWidth(), getHeight(), true, false);
            this.f9388d.mapPoints(C2336c.f9492e, C2336c.f9491d);
            double d = this.f9377E;
            float[] fArr2 = C2336c.f9492e;
            double pow = Math.pow(fArr2[4] - fArr2[2], 2.0d);
            float[] fArr3 = C2336c.f9492e;
            double sqrt = Math.sqrt(pow + Math.pow(fArr3[5] - fArr3[3], 2.0d));
            Double.isNaN(d);
            float f = (float) (d / sqrt);
            this.f9377E = f;
            this.f9377E = Math.max(f, 1.0f);
            m11063a(getWidth(), getHeight(), true, false);
            this.f9388d.mapPoints(C2336c.f9492e, C2336c.f9491d);
            float[] fArr4 = C2336c.f9492e;
            double pow2 = Math.pow(fArr4[4] - fArr4[2], 2.0d);
            float[] fArr5 = C2336c.f9492e;
            double sqrt2 = Math.sqrt(pow2 + Math.pow(fArr5[5] - fArr5[3], 2.0d));
            double d2 = height;
            Double.isNaN(d2);
            float f2 = (float) (d2 * sqrt2);
            double d3 = width;
            Double.isNaN(d3);
            float f3 = (float) (d3 * sqrt2);
            RectF rectF3 = C2336c.f9490c;
            float[] fArr6 = C2336c.f9492e;
            rectF3.set(fArr6[0] - f2, fArr6[1] - f3, fArr6[0] + f2, fArr6[1] + f3);
            this.f9387c.m11114c();
            this.f9387c.setCropWindowRect(C2336c.f9490c);
            m11063a(getWidth(), getHeight(), true, false);
            m11067a(false, false);
            this.f9387c.m11109a();
        }
    }

    /* renamed from: a */
    public void m11076a(int i, int i2, EnumC2329j enumC2329j, Uri uri, Bitmap.CompressFormat compressFormat, int i3) {
        CropImageView cropImageView;
        Bitmap bitmap = this.f9394j;
        if (bitmap != null) {
            this.f9386b.clearAnimation();
            WeakReference<AsyncTaskC2334a> weakReference = this.f9385M;
            AsyncTaskC2334a asyncTaskC2334a = weakReference != null ? weakReference.get() : null;
            if (asyncTaskC2334a != null) {
                asyncTaskC2334a.cancel(true);
            }
            int i4 = enumC2329j != EnumC2329j.NONE ? i : 0;
            int i5 = enumC2329j != EnumC2329j.NONE ? i2 : 0;
            int width = bitmap.getWidth() * this.f9376D;
            int height = bitmap.getHeight();
            int i6 = this.f9376D;
            int i7 = height * i6;
            if (this.f9375C == null || (i6 <= 1 && enumC2329j != EnumC2329j.SAMPLING)) {
                cropImageView = this;
                cropImageView.f9385M = new WeakReference<>(new AsyncTaskC2334a(this, bitmap, getCropPoints(), this.f9396l, this.f9387c.m11113b(), this.f9387c.getAspectRatioX(), this.f9387c.getAspectRatioY(), i4, i5, this.f9397m, this.f9398n, enumC2329j, uri, compressFormat, i3));
            } else {
                this.f9385M = new WeakReference<>(new AsyncTaskC2334a(this, this.f9375C, getCropPoints(), this.f9396l, width, i7, this.f9387c.m11113b(), this.f9387c.getAspectRatioX(), this.f9387c.getAspectRatioY(), i4, i5, this.f9397m, this.f9398n, enumC2329j, uri, compressFormat, i3));
                cropImageView = this;
            }
            cropImageView.f9385M.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m11072f();
        }
    }

    /* renamed from: a */
    public void m11077a(Uri uri, Bitmap.CompressFormat compressFormat, int i, int i2, int i3, EnumC2329j enumC2329j) {
        if (this.f9374B == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m11076a(i2, i3, enumC2329j, uri, compressFormat, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11078a(AsyncTaskC2334a.a aVar) {
        this.f9385M = null;
        m11072f();
        InterfaceC2324e interfaceC2324e = this.f9374B;
        if (interfaceC2324e != null) {
            interfaceC2324e.mo11054a(this, new C2321b(this.f9394j, this.f9375C, aVar.f9474a, aVar.f9475b, aVar.f9476c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), aVar.f9477d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11079a(AsyncTaskC2335b.a aVar) {
        this.f9384L = null;
        m11072f();
        if (aVar.f9487e == null) {
            int i = aVar.f9486d;
            this.f9395k = i;
            m11064a(aVar.f9484b, 0, aVar.f9483a, aVar.f9485c, i);
        }
        InterfaceC2328i interfaceC2328i = this.f9373A;
        if (interfaceC2328i != null) {
            interfaceC2328i.mo11053a(this, aVar.f9483a, aVar.f9487e);
        }
    }

    /* renamed from: b */
    public void m11080b() {
        this.f9398n = !this.f9398n;
        m11063a(getWidth(), getHeight(), true, false);
    }

    /* renamed from: b */
    public void m11081b(int i, int i2, EnumC2329j enumC2329j) {
        if (this.f9374B == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m11076a(i, i2, enumC2329j, (Uri) null, (Bitmap.CompressFormat) null, 0);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f9387c.getAspectRatioX()), Integer.valueOf(this.f9387c.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f9387c.getCropWindowRect();
        float[] fArr = new float[8];
        float f = cropWindowRect.left;
        fArr[0] = f;
        float f2 = cropWindowRect.top;
        fArr[1] = f2;
        float f3 = cropWindowRect.right;
        fArr[2] = f3;
        fArr[3] = f2;
        fArr[4] = f3;
        float f4 = cropWindowRect.bottom;
        fArr[5] = f4;
        fArr[6] = f;
        fArr[7] = f4;
        this.f9388d.invert(this.f9389e);
        this.f9389e.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * this.f9376D;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f9376D;
        Bitmap bitmap = this.f9394j;
        if (bitmap == null) {
            return null;
        }
        return C2336c.m11130a(getCropPoints(), bitmap.getWidth() * i, i * bitmap.getHeight(), this.f9387c.m11113b(), this.f9387c.getAspectRatioX(), this.f9387c.getAspectRatioY());
    }

    public EnumC2322c getCropShape() {
        return this.f9387c.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f9387c;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return m11073a(0, 0, EnumC2329j.NONE);
    }

    public void getCroppedImageAsync() {
        m11081b(0, 0, EnumC2329j.NONE);
    }

    public EnumC2323d getGuidelines() {
        return this.f9387c.getGuidelines();
    }

    public int getImageResource() {
        return this.f9401q;
    }

    public Uri getImageUri() {
        return this.f9375C;
    }

    public int getMaxZoom() {
        return this.f9407w;
    }

    public int getRotatedDegrees() {
        return this.f9396l;
    }

    public EnumC2330k getScaleType() {
        return this.f9402r;
    }

    public Rect getWholeImageRect() {
        int i = this.f9376D;
        Bitmap bitmap = this.f9394j;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f9399o > 0 && this.f9400p > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.f9399o;
            layoutParams.height = this.f9400p;
            setLayoutParams(layoutParams);
            if (this.f9394j != null) {
                float f = i3 - i;
                float f2 = i4 - i2;
                m11063a(f, f2, true, false);
                if (this.f9380H == null) {
                    if (this.f9382J) {
                        this.f9382J = false;
                        m11067a(false, false);
                        return;
                    }
                    return;
                }
                int i5 = this.f9381I;
                if (i5 != this.f9395k) {
                    this.f9396l = i5;
                    m11063a(f, f2, true, false);
                }
                this.f9388d.mapRect(this.f9380H);
                this.f9387c.setCropWindowRect(this.f9380H);
                m11067a(false, false);
                this.f9387c.m11109a();
                this.f9380H = null;
                return;
            }
        }
        m11066a(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        double d;
        double d2;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f9394j;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f9394j.getWidth()) {
                double d3 = size;
                double width = this.f9394j.getWidth();
                Double.isNaN(d3);
                Double.isNaN(width);
                d = d3 / width;
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f9394j.getHeight()) {
                double d4 = size2;
                double height = this.f9394j.getHeight();
                Double.isNaN(d4);
                Double.isNaN(height);
                d2 = d4 / height;
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                i3 = this.f9394j.getWidth();
                i4 = this.f9394j.getHeight();
            } else if (d <= d2) {
                double height2 = this.f9394j.getHeight();
                Double.isNaN(height2);
                i4 = (int) (height2 * d);
                i3 = size;
            } else {
                double width2 = this.f9394j.getWidth();
                Double.isNaN(width2);
                i3 = (int) (width2 * d2);
                i4 = size2;
            }
            size = m11061a(mode, size, i3);
            size2 = m11061a(mode2, size2, i4);
            this.f9399o = size;
            this.f9400p = size2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r7.f9375C == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        setImageUriAsync(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0076, code lost:
    
        if (r0 != null) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRestoreInstanceState(android.os.Parcelable r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        AsyncTaskC2335b asyncTaskC2335b;
        if (this.f9375C == null && this.f9394j == null && this.f9401q < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f9375C;
        if (this.f9403s && uri == null && this.f9401q < 1) {
            uri = C2336c.m11131a(getContext(), this.f9394j, this.f9383K);
            this.f9383K = uri;
        }
        if (uri != null && this.f9394j != null) {
            String uuid = UUID.randomUUID().toString();
            C2336c.f9494g = new Pair<>(uuid, new WeakReference(this.f9394j));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<AsyncTaskC2335b> weakReference = this.f9384L;
        if (weakReference != null && (asyncTaskC2335b = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", asyncTaskC2335b.m11117a());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f9401q);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f9376D);
        bundle.putInt("DEGREES_ROTATED", this.f9396l);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f9387c.getInitialCropWindowRect());
        C2336c.f9490c.set(this.f9387c.getCropWindowRect());
        this.f9388d.invert(this.f9389e);
        this.f9389e.mapRect(C2336c.f9490c);
        bundle.putParcelable("CROP_WINDOW_RECT", C2336c.f9490c);
        bundle.putString("CROP_SHAPE", this.f9387c.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f9406v);
        bundle.putInt("CROP_MAX_ZOOM", this.f9407w);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f9397m);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f9398n);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9382J = i3 > 0 && i4 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f9406v != z) {
            this.f9406v = z;
            m11067a(false, false);
            this.f9387c.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f9387c.setInitialCropWindowRect(rect);
    }

    public void setCropShape(EnumC2322c enumC2322c) {
        this.f9387c.setCropShape(enumC2322c);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f9387c.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f9397m != z) {
            this.f9397m = z;
            m11063a(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f9398n != z) {
            this.f9398n = z;
            m11063a(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(EnumC2323d enumC2323d) {
        this.f9387c.setGuidelines(enumC2323d);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f9387c.setInitialCropWindowRect(null);
        m11064a(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f9387c.setInitialCropWindowRect(null);
            m11064a(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<AsyncTaskC2335b> weakReference = this.f9384L;
            AsyncTaskC2335b asyncTaskC2335b = weakReference != null ? weakReference.get() : null;
            if (asyncTaskC2335b != null) {
                asyncTaskC2335b.cancel(true);
            }
            m11069c();
            this.f9380H = null;
            this.f9381I = 0;
            this.f9387c.setInitialCropWindowRect(null);
            WeakReference<AsyncTaskC2335b> weakReference2 = new WeakReference<>(new AsyncTaskC2335b(this, uri));
            this.f9384L = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m11072f();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f9407w == i || i <= 0) {
            return;
        }
        this.f9407w = i;
        m11067a(false, false);
        this.f9387c.invalidate();
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f9387c.m11112a(z)) {
            m11067a(false, false);
            this.f9387c.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(InterfaceC2324e interfaceC2324e) {
        this.f9374B = interfaceC2324e;
    }

    public void setOnCropWindowChangedListener(InterfaceC2327h interfaceC2327h) {
        this.f9410z = interfaceC2327h;
    }

    public void setOnSetCropOverlayMovedListener(InterfaceC2325f interfaceC2325f) {
        this.f9409y = interfaceC2325f;
    }

    public void setOnSetCropOverlayReleasedListener(InterfaceC2326g interfaceC2326g) {
        this.f9408x = interfaceC2326g;
    }

    public void setOnSetImageUriCompleteListener(InterfaceC2328i interfaceC2328i) {
        this.f9373A = interfaceC2328i;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f9396l;
        if (i2 != i) {
            m11075a(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f9403s = z;
    }

    public void setScaleType(EnumC2330k enumC2330k) {
        if (enumC2330k != this.f9402r) {
            this.f9402r = enumC2330k;
            this.f9377E = 1.0f;
            this.f9379G = 0.0f;
            this.f9378F = 0.0f;
            this.f9387c.m11114c();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f9404t != z) {
            this.f9404t = z;
            m11071e();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f9405u != z) {
            this.f9405u = z;
            m11072f();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f9387c.setSnapRadius(f);
        }
    }
}
