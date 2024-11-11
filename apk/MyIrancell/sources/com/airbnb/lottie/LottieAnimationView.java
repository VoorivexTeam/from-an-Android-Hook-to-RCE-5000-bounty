package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.C0185n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C2375d6;
import p000.C3107q2;
import p000.C3116q9;
import p000.C3295u9;
import p000.C3429x9;

/* loaded from: classes.dex */
public class LottieAnimationView extends C0185n {

    /* renamed from: u */
    private static final String f3031u = LottieAnimationView.class.getSimpleName();

    /* renamed from: v */
    private static final InterfaceC0542h<Throwable> f3032v = new C0531a();

    /* renamed from: d */
    private final InterfaceC0542h<C0538d> f3033d;

    /* renamed from: e */
    private final InterfaceC0542h<Throwable> f3034e;

    /* renamed from: f */
    private InterfaceC0542h<Throwable> f3035f;

    /* renamed from: g */
    private int f3036g;

    /* renamed from: h */
    private final C0540f f3037h;

    /* renamed from: i */
    private boolean f3038i;

    /* renamed from: j */
    private String f3039j;

    /* renamed from: k */
    private int f3040k;

    /* renamed from: l */
    private boolean f3041l;

    /* renamed from: m */
    private boolean f3042m;

    /* renamed from: n */
    private boolean f3043n;

    /* renamed from: o */
    private boolean f3044o;

    /* renamed from: p */
    private EnumC0549o f3045p;

    /* renamed from: q */
    private Set<InterfaceC0544j> f3046q;

    /* renamed from: r */
    private int f3047r;

    /* renamed from: s */
    private C0547m<C0538d> f3048s;

    /* renamed from: t */
    private C0538d f3049t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0530a();

        /* renamed from: b */
        String f3050b;

        /* renamed from: c */
        int f3051c;

        /* renamed from: d */
        float f3052d;

        /* renamed from: e */
        boolean f3053e;

        /* renamed from: f */
        String f3054f;

        /* renamed from: g */
        int f3055g;

        /* renamed from: h */
        int f3056h;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        /* loaded from: classes.dex */
        class C0530a implements Parcelable.Creator<SavedState> {
            C0530a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f3050b = parcel.readString();
            this.f3052d = parcel.readFloat();
            this.f3053e = parcel.readInt() == 1;
            this.f3054f = parcel.readString();
            this.f3055g = parcel.readInt();
            this.f3056h = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C0531a c0531a) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3050b);
            parcel.writeFloat(this.f3052d);
            parcel.writeInt(this.f3053e ? 1 : 0);
            parcel.writeString(this.f3054f);
            parcel.writeInt(this.f3055g);
            parcel.writeInt(this.f3056h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    /* loaded from: classes.dex */
    public class C0531a implements InterfaceC0542h<Throwable> {
        C0531a() {
        }

        @Override // com.airbnb.lottie.InterfaceC0542h
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3717a(Throwable th) {
            if (!C3295u9.m15765a(th)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            C3116q9.m15003b("Unable to load composition.", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    /* loaded from: classes.dex */
    class C0532b implements InterfaceC0542h<C0538d> {
        C0532b() {
        }

        @Override // com.airbnb.lottie.InterfaceC0542h
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3717a(C0538d c0538d) {
            LottieAnimationView.this.setComposition(c0538d);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    /* loaded from: classes.dex */
    class C0533c implements InterfaceC0542h<Throwable> {
        C0533c() {
        }

        @Override // com.airbnb.lottie.InterfaceC0542h
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3717a(Throwable th) {
            if (LottieAnimationView.this.f3036g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f3036g);
            }
            (LottieAnimationView.this.f3035f == null ? LottieAnimationView.f3032v : LottieAnimationView.this.f3035f).mo3717a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0534d {

        /* renamed from: a */
        static final /* synthetic */ int[] f3059a;

        static {
            int[] iArr = new int[EnumC0549o.values().length];
            f3059a = iArr;
            try {
                iArr[EnumC0549o.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3059a[EnumC0549o.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3059a[EnumC0549o.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f3033d = new C0532b();
        this.f3034e = new C0533c();
        this.f3036g = 0;
        this.f3037h = new C0540f();
        this.f3041l = false;
        this.f3042m = false;
        this.f3043n = false;
        this.f3044o = true;
        this.f3045p = EnumC0549o.AUTOMATIC;
        this.f3046q = new HashSet();
        this.f3047r = 0;
        m3702a((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3033d = new C0532b();
        this.f3034e = new C0533c();
        this.f3036g = 0;
        this.f3037h = new C0540f();
        this.f3041l = false;
        this.f3042m = false;
        this.f3043n = false;
        this.f3044o = true;
        this.f3045p = EnumC0549o.AUTOMATIC;
        this.f3046q = new HashSet();
        this.f3047r = 0;
        m3702a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3033d = new C0532b();
        this.f3034e = new C0533c();
        this.f3036g = 0;
        this.f3037h = new C0540f();
        this.f3041l = false;
        this.f3042m = false;
        this.f3043n = false;
        this.f3044o = true;
        this.f3045p = EnumC0549o.AUTOMATIC;
        this.f3046q = new HashSet();
        this.f3047r = 0;
        m3702a(attributeSet);
    }

    /* renamed from: a */
    private void m3702a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView);
        if (!isInEditMode()) {
            this.f3044o = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
            boolean hasValue = obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_url);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_fileName);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_url)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f3042m = true;
            this.f3043n = true;
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            this.f3037h.m3803d(-1);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
        m3711a(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_colorFilter)) {
            m3708a(new C2375d6("**"), InterfaceC0545k.f3153C, new C3429x9(new C0550p(obtainStyledAttributes.getColor(R$styleable.LottieAnimationView_lottie_colorFilter, 0))));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_scale)) {
            this.f3037h.m3802d(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_renderMode)) {
            int i = obtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_renderMode, EnumC0549o.AUTOMATIC.ordinal());
            if (i >= EnumC0549o.values().length) {
                i = EnumC0549o.AUTOMATIC.ordinal();
            }
            setRenderMode(EnumC0549o.values()[i]);
        }
        if (getScaleType() != null) {
            this.f3037h.m3783a(getScaleType());
        }
        obtainStyledAttributes.recycle();
        this.f3037h.m3788a(Boolean.valueOf(C3295u9.m15754a(getContext()) != 0.0f));
        m3707k();
        this.f3038i = true;
    }

    /* renamed from: i */
    private void m3705i() {
        C0547m<C0538d> c0547m = this.f3048s;
        if (c0547m != null) {
            c0547m.m3852d(this.f3033d);
            this.f3048s.m3851c(this.f3034e);
        }
    }

    /* renamed from: j */
    private void m3706j() {
        this.f3049t = null;
        this.f3037h.m3791b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r3 != false) goto L25;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3707k() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C0534d.f3059a
            com.airbnb.lottie.o r1 = r5.f3045p
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L3d
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = 1
            goto L3d
        L15:
            com.airbnb.lottie.d r0 = r5.f3049t
            r3 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.m3743m()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L27
            goto L3b
        L27:
            com.airbnb.lottie.d r0 = r5.f3049t
            if (r0 == 0) goto L33
            int r0 = r0.m3740j()
            r4 = 4
            if (r0 <= r4) goto L33
            goto L3b
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L3a
            goto L3b
        L3a:
            r3 = 1
        L3b:
            if (r3 == 0) goto L13
        L3d:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L47
            r0 = 0
            r5.setLayerType(r1, r0)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m3707k():void");
    }

    private void setCompositionTask(C0547m<C0538d> c0547m) {
        m3706j();
        m3705i();
        c0547m.m3850b(this.f3033d);
        c0547m.m3849a(this.f3034e);
        this.f3048s = c0547m;
    }

    /* renamed from: a */
    public <T> void m3708a(C2375d6 c2375d6, T t, C3429x9<T> c3429x9) {
        this.f3037h.m3787a(c2375d6, t, c3429x9);
    }

    /* renamed from: a */
    public void m3709a(InputStream inputStream, String str) {
        setCompositionTask(C0539e.m3753a(inputStream, str));
    }

    /* renamed from: a */
    public void m3710a(String str, String str2) {
        m3709a(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* renamed from: a */
    public void m3711a(boolean z) {
        this.f3037h.m3789a(z);
    }

    /* renamed from: b */
    public void m3712b() {
        this.f3041l = false;
        this.f3037h.m3779a();
        m3707k();
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        C0537c.m3721a("buildDrawingCache");
        this.f3047r++;
        super.buildDrawingCache(z);
        if (this.f3047r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(EnumC0549o.HARDWARE);
        }
        this.f3047r--;
        C0537c.m3722b("buildDrawingCache");
    }

    /* renamed from: d */
    public boolean m3713d() {
        return this.f3037h.m3821q();
    }

    /* renamed from: e */
    public void m3714e() {
        this.f3043n = false;
        this.f3042m = false;
        this.f3041l = false;
        this.f3037h.m3823s();
        m3707k();
    }

    /* renamed from: f */
    public void m3715f() {
        if (!isShown()) {
            this.f3041l = true;
        } else {
            this.f3037h.m3824t();
            m3707k();
        }
    }

    /* renamed from: g */
    public void m3716g() {
        if (!isShown()) {
            this.f3041l = true;
        } else {
            this.f3037h.m3825u();
            m3707k();
        }
    }

    public C0538d getComposition() {
        return this.f3049t;
    }

    public long getDuration() {
        if (this.f3049t != null) {
            return r0.m3732c();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f3037h.m3810f();
    }

    public String getImageAssetsFolder() {
        return this.f3037h.m3811g();
    }

    public float getMaxFrame() {
        return this.f3037h.m3812h();
    }

    public float getMinFrame() {
        return this.f3037h.m3813i();
    }

    public C0548n getPerformanceTracker() {
        return this.f3037h.m3814j();
    }

    public float getProgress() {
        return this.f3037h.m3815k();
    }

    public int getRepeatCount() {
        return this.f3037h.m3816l();
    }

    public int getRepeatMode() {
        return this.f3037h.m3817m();
    }

    public float getScale() {
        return this.f3037h.m3818n();
    }

    public float getSpeed() {
        return this.f3037h.m3819o();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C0540f c0540f = this.f3037h;
        if (drawable2 == c0540f) {
            super.invalidateDrawable(c0540f);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3043n || this.f3042m) {
            m3715f();
            this.f3043n = false;
            this.f3042m = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (m3713d()) {
            m3712b();
            this.f3042m = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f3050b;
        this.f3039j = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f3039j);
        }
        int i = savedState.f3051c;
        this.f3040k = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f3052d);
        if (savedState.f3053e) {
            m3715f();
        }
        this.f3037h.m3794b(savedState.f3054f);
        setRepeatMode(savedState.f3055g);
        setRepeatCount(savedState.f3056h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3050b = this.f3039j;
        savedState.f3051c = this.f3040k;
        savedState.f3052d = this.f3037h.m3815k();
        savedState.f3053e = this.f3037h.m3821q() || (!C3107q2.m14931w(this) && this.f3042m);
        savedState.f3054f = this.f3037h.m3811g();
        savedState.f3055g = this.f3037h.m3817m();
        savedState.f3056h = this.f3037h.m3816l();
        return savedState;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        if (this.f3038i) {
            if (isShown()) {
                if (!this.f3041l) {
                    return;
                }
                m3716g();
                z = false;
            } else {
                if (!m3713d()) {
                    return;
                }
                m3714e();
                z = true;
            }
            this.f3041l = z;
        }
    }

    public void setAnimation(int i) {
        this.f3040k = i;
        this.f3039j = null;
        setCompositionTask(this.f3044o ? C0539e.m3749a(getContext(), i) : C0539e.m3750a(getContext(), i, (String) null));
    }

    public void setAnimation(String str) {
        this.f3039j = str;
        this.f3040k = 0;
        setCompositionTask(this.f3044o ? C0539e.m3751a(getContext(), str) : C0539e.m3752a(getContext(), str, (String) null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m3710a(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f3044o ? C0539e.m3762b(getContext(), str) : C0539e.m3763c(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f3037h.m3795b(z);
    }

    public void setCacheComposition(boolean z) {
        this.f3044o = z;
    }

    public void setComposition(C0538d c0538d) {
        if (C0537c.f3061a) {
            String str = "Set Composition \n" + c0538d;
        }
        this.f3037h.setCallback(this);
        this.f3049t = c0538d;
        boolean m3790a = this.f3037h.m3790a(c0538d);
        m3707k();
        if (getDrawable() != this.f3037h || m3790a) {
            setImageDrawable(null);
            setImageDrawable(this.f3037h);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<InterfaceC0544j> it = this.f3046q.iterator();
            while (it.hasNext()) {
                it.next().m3838a(c0538d);
            }
        }
    }

    public void setFailureListener(InterfaceC0542h<Throwable> interfaceC0542h) {
        this.f3035f = interfaceC0542h;
    }

    public void setFallbackResource(int i) {
        this.f3036g = i;
    }

    public void setFontAssetDelegate(C0535a c0535a) {
        this.f3037h.m3784a(c0535a);
    }

    public void setFrame(int i) {
        this.f3037h.m3781a(i);
    }

    public void setImageAssetDelegate(InterfaceC0536b interfaceC0536b) {
        this.f3037h.m3785a(interfaceC0536b);
    }

    public void setImageAssetsFolder(String str) {
        this.f3037h.m3794b(str);
    }

    @Override // androidx.appcompat.widget.C0185n, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m3705i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.C0185n, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m3705i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0185n, android.widget.ImageView
    public void setImageResource(int i) {
        m3705i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f3037h.m3793b(i);
    }

    public void setMaxFrame(String str) {
        this.f3037h.m3798c(str);
    }

    public void setMaxProgress(float f) {
        this.f3037h.m3780a(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f3037h.m3804d(str);
    }

    public void setMinFrame(int i) {
        this.f3037h.m3797c(i);
    }

    public void setMinFrame(String str) {
        this.f3037h.m3809e(str);
    }

    public void setMinProgress(float f) {
        this.f3037h.m3792b(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f3037h.m3799c(z);
    }

    public void setProgress(float f) {
        this.f3037h.m3796c(f);
    }

    public void setRenderMode(EnumC0549o enumC0549o) {
        this.f3045p = enumC0549o;
        m3707k();
    }

    public void setRepeatCount(int i) {
        this.f3037h.m3803d(i);
    }

    public void setRepeatMode(int i) {
        this.f3037h.m3808e(i);
    }

    public void setSafeMode(boolean z) {
        this.f3037h.m3805d(z);
    }

    public void setScale(float f) {
        this.f3037h.m3802d(f);
        if (getDrawable() == this.f3037h) {
            setImageDrawable(null);
            setImageDrawable(this.f3037h);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        C0540f c0540f = this.f3037h;
        if (c0540f != null) {
            c0540f.m3783a(scaleType);
        }
    }

    public void setSpeed(float f) {
        this.f3037h.m3807e(f);
    }

    public void setTextDelegate(C0551q c0551q) {
        this.f3037h.m3786a(c0551q);
    }
}
