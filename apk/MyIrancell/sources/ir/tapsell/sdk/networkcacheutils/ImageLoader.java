package ir.tapsell.sdk.networkcacheutils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.networkcacheutils.C2751e;
import ir.tapsell.sdk.networkcacheutils.ImageLoadOptions;
import ir.tapsell.sdk.utils.C2764f;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.g50;

/* loaded from: classes.dex */
public class ImageLoader implements NoProguard {
    private ExecutorService cachedFilesService;
    private ExecutorService executorService;
    private Handler handler;
    private Map<ImageView, String> imageViews;
    private C2751e.a mCacheOptions;
    private Context mContext;
    private C2755i memoryCache;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$a */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2738a implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ ImageView f11192b;

        /* renamed from: c */
        final /* synthetic */ String f11193c;

        /* renamed from: d */
        final /* synthetic */ Bitmap f11194d;

        AnimationAnimationListenerC2738a(ImageView imageView, String str, Bitmap bitmap) {
            this.f11192b = imageView;
            this.f11193c = str;
            this.f11194d = bitmap;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (ImageLoader.this.imageViewReused(this.f11192b, this.f11193c)) {
                return;
            }
            this.f11192b.setImageBitmap(this.f11194d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$b */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2739b implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ ImageView f11196b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f11197c;

        /* renamed from: d */
        final /* synthetic */ ImageLoadOptions.InterfaceC2732e f11198d;

        /* renamed from: e */
        final /* synthetic */ Animation f11199e;

        AnimationAnimationListenerC2739b(ImageLoader imageLoader, ImageView imageView, Bitmap bitmap, ImageLoadOptions.InterfaceC2732e interfaceC2732e, Animation animation) {
            this.f11196b = imageView;
            this.f11197c = bitmap;
            this.f11198d = interfaceC2732e;
            this.f11199e = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                this.f11196b.setImageBitmap(this.f11197c);
                if (this.f11198d != null) {
                    this.f11198d.m13085a();
                }
                this.f11196b.startAnimation(this.f11199e);
            } catch (Throwable th) {
                g50.m11894a(AnimationAnimationListenerC2739b.class.getName(), th);
                this.f11196b.setImageBitmap(this.f11197c);
                ImageLoadOptions.InterfaceC2732e interfaceC2732e = this.f11198d;
                if (interfaceC2732e != null) {
                    interfaceC2732e.m13085a();
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$c */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2740c implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ ImageView f11200b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f11201c;

        /* renamed from: d */
        final /* synthetic */ ImageLoadOptions.InterfaceC2732e f11202d;

        AnimationAnimationListenerC2740c(ImageLoader imageLoader, ImageView imageView, Bitmap bitmap, ImageLoadOptions.InterfaceC2732e interfaceC2732e) {
            this.f11200b = imageView;
            this.f11201c = bitmap;
            this.f11202d = interfaceC2732e;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                if (this.f11202d != null) {
                    this.f11202d.m13085a();
                }
            } catch (Throwable th) {
                g50.m11894a(AnimationAnimationListenerC2740c.class.getName(), th);
                ImageLoadOptions.InterfaceC2732e interfaceC2732e = this.f11202d;
                if (interfaceC2732e != null) {
                    interfaceC2732e.m13085a();
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f11200b.setImageBitmap(this.f11201c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2741d {

        /* renamed from: a */
        static final /* synthetic */ int[] f11203a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11204b;

        /* renamed from: c */
        static final /* synthetic */ int[] f11205c;

        /* renamed from: d */
        static final /* synthetic */ int[] f11206d;

        /* renamed from: e */
        static final /* synthetic */ int[] f11207e;

        /* renamed from: f */
        static final /* synthetic */ int[] f11208f;

        /* renamed from: g */
        static final /* synthetic */ int[] f11209g;

        /* renamed from: h */
        static final /* synthetic */ int[] f11210h;

        /* renamed from: i */
        static final /* synthetic */ int[] f11211i;

        static {
            int[] iArr = new int[ImageLoadOptions.EnumC2735h.values().length];
            f11211i = iArr;
            try {
                iArr[ImageLoadOptions.EnumC2735h.REPLACE_WITH_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11211i[ImageLoadOptions.EnumC2735h.REPLACE_WITH_STUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11211i[ImageLoadOptions.EnumC2735h.DO_NOTHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ImageLoadOptions.EnumC2730c.values().length];
            f11210h = iArr2;
            try {
                iArr2[ImageLoadOptions.EnumC2730c.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11210h[ImageLoadOptions.EnumC2730c.NO_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[ImageLoadOptions.EnumC2728a.values().length];
            f11209g = iArr3;
            try {
                iArr3[ImageLoadOptions.EnumC2728a.GREYSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11209g[ImageLoadOptions.EnumC2728a.CUSTOM_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11209g[ImageLoadOptions.EnumC2728a.NO_MODIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[ImageLoadOptions.EnumC2731d.values().length];
            f11208f = iArr4;
            try {
                iArr4[ImageLoadOptions.EnumC2731d.REPLACE_WITH_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11208f[ImageLoadOptions.EnumC2731d.DO_NOTHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[ImageLoadOptions.EnumC2737j.values().length];
            f11207e = iArr5;
            try {
                iArr5[ImageLoadOptions.EnumC2737j.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11207e[ImageLoadOptions.EnumC2737j.CENTER_LARGE_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11207e[ImageLoadOptions.EnumC2737j.ROUND_CORNERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11207e[ImageLoadOptions.EnumC2737j.CIRCLE_CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11207e[ImageLoadOptions.EnumC2737j.SQUARE_CROP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11207e[ImageLoadOptions.EnumC2737j.DO_NOTHING.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr6 = new int[ImageLoadOptions.EnumC2736i.values().length];
            f11206d = iArr6;
            try {
                iArr6[ImageLoadOptions.EnumC2736i.NO_WATERMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr7 = new int[ImageLoadOptions.EnumC2733f.values().length];
            f11205c = iArr7;
            try {
                iArr7[ImageLoadOptions.EnumC2733f.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11205c[ImageLoadOptions.EnumC2733f.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11205c[ImageLoadOptions.EnumC2733f.FADE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11205c[ImageLoadOptions.EnumC2733f.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr8 = new int[ImageLoadOptions.EnumC2734g.values().length];
            f11204b = iArr8;
            try {
                iArr8[ImageLoadOptions.EnumC2734g.HIDE_IMAGE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11204b[ImageLoadOptions.EnumC2734g.REPLACE_INITIALLY_WITH_STUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11204b[ImageLoadOptions.EnumC2734g.DO_NOTHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr9 = new int[ImageLoadOptions.EnumC2729b.values().length];
            f11203a = iArr9;
            try {
                iArr9[ImageLoadOptions.EnumC2729b.HIGHEST_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11203a[ImageLoadOptions.EnumC2729b.HIGHEST_CONFIG_LOW_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11203a[ImageLoadOptions.EnumC2729b.USE_NEEDED_SIZE_UNLIMITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f11203a[ImageLoadOptions.EnumC2729b.USE_NEEDED_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f11203a[ImageLoadOptions.EnumC2729b.MINIMUM_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$e */
    /* loaded from: classes.dex */
    class RunnableC2742e implements Runnable {

        /* renamed from: b */
        Bitmap f11212b;

        /* renamed from: c */
        C2745h f11213c;

        /* renamed from: d */
        boolean f11214d;

        /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$e$a */
        /* loaded from: classes.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC2742e.this.f11213c.f11218b.f11250c.setShowAnimationStyle(ImageLoadOptions.EnumC2733f.NONE);
                RunnableC2742e runnableC2742e = RunnableC2742e.this;
                ImageLoader imageLoader = ImageLoader.this;
                C2745h c2745h = runnableC2742e.f11213c;
                String str = c2745h.f11217a;
                C2754h c2754h = c2745h.f11218b;
                imageLoader.DisplayImage(str, c2754h.f11248a, c2754h.f11249b, c2754h.f11251d, c2754h.f11250c);
            }
        }

        public RunnableC2742e(Bitmap bitmap, C2745h c2745h, boolean z) {
            this.f11214d = false;
            this.f11212b = bitmap;
            this.f11213c = c2745h;
            this.f11214d = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0131, code lost:
        
            if (r1 != null) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01a5, code lost:
        
            r0.f11248a.setClickable(false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x019e, code lost:
        
            r0 = r0.f11248a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x019c, code lost:
        
            if (r1 != null) goto L63;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 549
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.ImageLoader.RunnableC2742e.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$f */
    /* loaded from: classes.dex */
    public class C2743f extends RuntimeException {
        public C2743f(ImageLoader imageLoader) {
            super("ImageLoader Must Be Called With a Valid ImageView.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$g */
    /* loaded from: classes.dex */
    public class C2744g extends RuntimeException {
        public C2744g(ImageLoader imageLoader) {
            super("ImageLoader Must Be Called With a not-null Options item.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$h */
    /* loaded from: classes.dex */
    public class C2745h {

        /* renamed from: a */
        public String f11217a;

        /* renamed from: b */
        public C2754h f11218b;

        public C2745h(ImageLoader imageLoader, String str, C2754h c2754h) {
            this.f11217a = str;
            this.f11218b = c2754h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoader$i */
    /* loaded from: classes.dex */
    public class RunnableC2746i implements Runnable {

        /* renamed from: b */
        C2745h f11219b;

        /* renamed from: c */
        boolean f11220c;

        RunnableC2746i(C2745h c2745h, boolean z) {
            this.f11220c = false;
            this.f11219b = c2745h;
            this.f11220c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ImageLoader.this.imageViewReused(this.f11219b)) {
                    return;
                }
                Bitmap bitmap = ImageLoader.this.getBitmap(this.f11219b.f11217a, this.f11219b.f11218b.f11249b, this.f11219b.f11218b.f11250c);
                if (bitmap != null) {
                    ImageLoader.this.memoryCache.m13131a(this.f11219b.f11217a + this.f11219b.f11218b.f11250c.getModificationPostfix(), bitmap);
                }
                if (ImageLoader.this.imageViewReused(this.f11219b)) {
                    return;
                }
                ImageLoader.this.handler.post(new RunnableC2742e(bitmap, this.f11219b, this.f11220c));
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
    }

    public ImageLoader(Context context) {
        this(context, C2751e.a.m13103a(context));
    }

    public ImageLoader(Context context, C2751e.a aVar) {
        this.imageViews = Collections.synchronizedMap(new WeakHashMap());
        this.handler = new Handler(Looper.getMainLooper());
        this.mContext = context;
        this.mCacheOptions = aVar;
        this.executorService = Executors.newFixedThreadPool(6);
        this.cachedFilesService = Executors.newFixedThreadPool(3);
        this.memoryCache = new C2755i();
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(i3 / i2);
        int round2 = Math.round(i4 / i);
        return round < round2 ? round : round2;
    }

    private boolean fileForDownloadExists(String str, ImageLoadOptions imageLoadOptions) {
        return C2753g.m13121b(this.mContext, this.mCacheOptions, getFileNameForDownload(str, imageLoadOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if ((r5 instanceof java.lang.OutOfMemoryError) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap getBitmap(java.lang.String r5, android.view.View r6, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions r7) {
        /*
            r4 = this;
            long r0 = r7.getDelayMillisecondsBeforeDownload()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L16
            long r0 = r7.getDelayMillisecondsBeforeDownload()     // Catch: java.lang.Throwable -> L12
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r6 = move-exception
            p000.g50.m11895a(r6)
        L16:
            java.lang.String r6 = r4.getFileNameForDownload(r5, r7)
            r0 = 0
            ir.tapsell.sdk.networkcacheutils.g r1 = ir.tapsell.sdk.networkcacheutils.C2753g.m13118a()     // Catch: java.lang.Throwable -> L32
            android.content.Context r2 = r4.mContext     // Catch: java.lang.Throwable -> L32
            ir.tapsell.sdk.networkcacheutils.e$a r3 = r4.mCacheOptions     // Catch: java.lang.Throwable -> L32
            java.io.File r1 = r1.m13122a(r2, r5, r3, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L30
            android.graphics.Bitmap r5 = r4.getBitmapWithOptions(r2, r7)     // Catch: java.lang.Throwable -> L30
            return r5
        L30:
            r2 = move-exception
            goto L34
        L32:
            r2 = move-exception
            r1 = r0
        L34:
            p000.g50.m11895a(r2)
            boolean r2 = r2 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L41
        L3b:
            ir.tapsell.sdk.networkcacheutils.i r5 = r4.memoryCache
            r5.m13129a()
            goto L64
        L41:
            if (r1 == 0) goto L46
            r1.delete()     // Catch: java.lang.Throwable -> L5b
        L46:
            ir.tapsell.sdk.networkcacheutils.g r1 = ir.tapsell.sdk.networkcacheutils.C2753g.m13118a()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r2 = r4.mContext     // Catch: java.lang.Throwable -> L5b
            ir.tapsell.sdk.networkcacheutils.e$a r3 = r4.mCacheOptions     // Catch: java.lang.Throwable -> L5b
            java.io.File r5 = r1.m13124b(r2, r5, r3, r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L5b
            android.graphics.Bitmap r5 = r4.getBitmapWithOptions(r5, r7)     // Catch: java.lang.Throwable -> L5b
            return r5
        L5b:
            r5 = move-exception
            p000.g50.m11895a(r5)
            boolean r5 = r5 instanceof java.lang.OutOfMemoryError
            if (r5 == 0) goto L64
            goto L3b
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.ImageLoader.getBitmap(java.lang.String, android.view.View, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap getBitmapWithOptions(java.lang.String r12, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.ImageLoader.getBitmapWithOptions(java.lang.String, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions):android.graphics.Bitmap");
    }

    private String getFileNameForDownload(String str, ImageLoadOptions imageLoadOptions) {
        if (imageLoadOptions.getFileCacheSuffix() == null) {
            return String.valueOf(str.hashCode()) + "_" + C2764f.m13158c(str);
        }
        return String.valueOf(str.hashCode()) + "_" + C2764f.m13159d(str) + imageLoadOptions.getFileCacheSuffix() + C2764f.m13160e(str);
    }

    public static int getReloadBackgroundColor() {
        return Color.rgb(235, 235, 235);
    }

    private AnimationSet newFadeInScaleDownAnimation() {
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.08f, 1.0f, 1.08f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new LinearInterpolator());
        scaleAnimation.setDuration(450L);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private Animation newInFromLeftAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    private Animation newInFromRightAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    private Animation newOutToLeftAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    private Animation newOutToRightAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    private void queuePhoto(String str, C2754h c2754h) {
        ExecutorService executorService;
        RunnableC2746i runnableC2746i;
        C2745h c2745h = new C2745h(this, str, c2754h);
        if (fileForDownloadExists(str, c2754h.f11250c)) {
            executorService = this.cachedFilesService;
            runnableC2746i = new RunnableC2746i(c2745h, true);
        } else {
            executorService = this.executorService;
            runnableC2746i = new RunnableC2746i(c2745h, false);
        }
        executorService.submit(runnableC2746i);
    }

    private void replaceBitmapWithAnimation(ImageView imageView, Bitmap bitmap, ImageLoadOptions imageLoadOptions) {
        ImageLoadOptions.InterfaceC2732e imageLoadListener = imageLoadOptions.getImageLoadListener();
        int i = C2741d.f11205c[imageLoadOptions.getShowAnimationStyle().ordinal()];
        if (i == 1 || i == 2) {
            try {
                Animation newOutToRightAnimation = imageLoadOptions.getShowAnimationStyle() == ImageLoadOptions.EnumC2733f.RIGHT_TO_LEFT ? newOutToRightAnimation() : newOutToLeftAnimation();
                newOutToRightAnimation.setAnimationListener(new AnimationAnimationListenerC2739b(this, imageView, bitmap, imageLoadListener, imageLoadOptions.getShowAnimationStyle() == ImageLoadOptions.EnumC2733f.RIGHT_TO_LEFT ? newInFromLeftAnimation() : newInFromRightAnimation()));
                imageView.startAnimation(newOutToRightAnimation);
                return;
            } catch (Throwable th) {
                g50.m11894a(ImageLoader.class.getName(), th);
                imageView.setImageBitmap(bitmap);
                if (imageLoadListener == null) {
                    return;
                }
            }
        } else if (i == 3) {
            AnimationSet newFadeInScaleDownAnimation = newFadeInScaleDownAnimation();
            newFadeInScaleDownAnimation.setAnimationListener(new AnimationAnimationListenerC2740c(this, imageView, bitmap, imageLoadListener));
            imageView.startAnimation(newFadeInScaleDownAnimation);
            return;
        } else {
            if (i != 4) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (imageLoadListener == null) {
                return;
            }
        }
        imageLoadListener.m13085a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r1.m13085a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showDownlaodedBitmapWithInAnimation(android.widget.ImageView r6, java.lang.String r7, android.graphics.Bitmap r8, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions r9) {
        /*
            r5 = this;
            java.lang.Class<ir.tapsell.sdk.networkcacheutils.ImageLoader> r0 = ir.tapsell.sdk.networkcacheutils.ImageLoader.class
            boolean r1 = r5.imageViewReused(r6, r7)
            if (r1 == 0) goto L9
            return
        L9:
            ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$e r1 = r9.getImageLoadListener()
            int[] r2 = ir.tapsell.sdk.networkcacheutils.ImageLoader.C2741d.f11205c
            ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$f r3 = r9.getShowAnimationStyle()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L7f
            r3 = 2
            if (r2 == r3) goto L7f
            r9 = 3
            if (r2 == r9) goto L3b
            r7 = 4
            if (r2 == r7) goto L28
            goto Ld1
        L28:
            r6.clearAnimation()
            r6.setVisibility(r4)
            r6.setImageBitmap(r8)
            r6.setBackgroundColor(r4)
            if (r1 == 0) goto Ld1
            r1.m13085a()
            goto Ld1
        L3b:
            android.view.animation.AnimationSet r9 = r5.newFadeInScaleDownAnimation()     // Catch: java.lang.Throwable -> L65
            ir.tapsell.sdk.networkcacheutils.ImageLoader$a r2 = new ir.tapsell.sdk.networkcacheutils.ImageLoader$a     // Catch: java.lang.Throwable -> L50
            r2.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L50
            r9.setAnimationListener(r2)     // Catch: java.lang.Throwable -> L50
            r6.startAnimation(r9)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L7b
            r1.m13085a()     // Catch: java.lang.Throwable -> L50
            goto L7b
        L50:
            r9 = move-exception
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L65
            p000.g50.m11894a(r2, r9)     // Catch: java.lang.Throwable -> L65
            r6.setImageBitmap(r8)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L7b
            r1.m13085a()     // Catch: java.lang.Throwable -> L65
            goto L7b
        L65:
            r9 = move-exception
            java.lang.String r0 = r0.getName()
            p000.g50.m11894a(r0, r9)
            boolean r7 = r5.imageViewReused(r6, r7)
            if (r7 != 0) goto L7b
            r6.setImageBitmap(r8)
            if (r1 == 0) goto L7b
        L78:
            r1.m13085a()
        L7b:
            r6.setBackgroundColor(r4)
            goto Ld1
        L7f:
            r6.clearAnimation()     // Catch: java.lang.Throwable -> L83
            goto L8b
        L83:
            r2 = move-exception
            java.lang.String r3 = r0.getName()
            p000.g50.m11894a(r3, r2)
        L8b:
            ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$f r9 = r9.getShowAnimationStyle()     // Catch: java.lang.Throwable -> Lc3
            ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$f r2 = ir.tapsell.sdk.networkcacheutils.ImageLoadOptions.EnumC2733f.RIGHT_TO_LEFT     // Catch: java.lang.Throwable -> Lc3
            if (r9 != r2) goto L98
            android.view.animation.Animation r9 = r5.newInFromLeftAnimation()     // Catch: java.lang.Throwable -> Lc3
            goto L9c
        L98:
            android.view.animation.Animation r9 = r5.newInFromRightAnimation()     // Catch: java.lang.Throwable -> Lc3
        L9c:
            boolean r7 = r5.imageViewReused(r6, r7)     // Catch: java.lang.Throwable -> Lae
            if (r7 != 0) goto L7b
            r6.setImageBitmap(r8)     // Catch: java.lang.Throwable -> Lae
            r6.startAnimation(r9)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L7b
            r1.m13085a()     // Catch: java.lang.Throwable -> Lae
            goto L7b
        Lae:
            r7 = move-exception
            java.lang.Class r9 = r5.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc3
            p000.g50.m11894a(r9, r7)     // Catch: java.lang.Throwable -> Lc3
            r6.setImageBitmap(r8)     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L7b
            r1.m13085a()     // Catch: java.lang.Throwable -> Lc3
            goto L7b
        Lc3:
            r7 = move-exception
            java.lang.String r9 = r0.getName()
            p000.g50.m11894a(r9, r7)
            r6.setImageBitmap(r8)
            if (r1 == 0) goto L7b
            goto L78
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.ImageLoader.showDownlaodedBitmapWithInAnimation(android.widget.ImageView, java.lang.String, android.graphics.Bitmap, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:57|58|(1:(10:(1:62)|65|(1:(0))(1:81)|73|74|(1:76)|78|(1:70)|71|72)(1:82))(1:83)|63|65|(0)(0)|73|74|(0)|78|(0)|71|72) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r12 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015f, code lost:
    
        p000.g50.m11894a(ir.tapsell.sdk.networkcacheutils.ImageLoader.class.getName(), r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152 A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #1 {all -> 0x015e, blocks: (B:74:0x014c, B:76:0x0152), top: B:73:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DisplayImage(java.lang.String r9, android.widget.ImageView r10, android.view.View r11, android.view.View.OnClickListener r12, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.ImageLoader.DisplayImage(java.lang.String, android.widget.ImageView, android.view.View, android.view.View$OnClickListener, ir.tapsell.sdk.networkcacheutils.ImageLoadOptions):void");
    }

    public void IgnoreImageView(ImageView imageView) {
        this.imageViews.put(imageView, null);
    }

    public void clearCache() {
        C2755i c2755i = this.memoryCache;
        if (c2755i != null) {
            c2755i.m13129a();
        }
    }

    boolean imageViewReused(ImageView imageView, String str) {
        String str2 = this.imageViews.get(imageView);
        return str2 == null || !str2.equals(str);
    }

    boolean imageViewReused(C2745h c2745h) {
        String str = this.imageViews.get(c2745h.f11218b.f11248a);
        return str == null || !str.equals(c2745h.f11217a);
    }

    public Bitmap lessResolution(String str, BitmapFactory.Options options, int i, int i2, int i3) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        BitmapFactory.Options options2 = options;
        options2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options2);
        options2.inSampleSize = calculateInSampleSize(options2, i != 0 ? i : 800, i2 != 0 ? i2 : 800) * i3;
        options2.inScaled = false;
        options2.inJustDecodeBounds = false;
        try {
            return BitmapFactory.decodeFile(str, options2);
        } catch (Throwable th) {
            g50.m11894a(ImageLoader.class.getName(), th);
            if (!(th instanceof OutOfMemoryError)) {
                throw th;
            }
            this.memoryCache.m13129a();
            if (i3 <= 4) {
                return lessResolution(str, options2, i, i2, i3 * 2);
            }
            throw th;
        }
    }
}
