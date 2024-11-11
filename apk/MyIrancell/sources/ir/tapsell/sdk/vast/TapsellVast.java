package ir.tapsell.sdk.vast;

import android.content.Context;
import android.view.ViewGroup;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import ir.tapsell.sdk.vast.VideoAdPlayer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.h50;
import p000.i50;
import p000.k50;

/* loaded from: classes.dex */
public class TapsellVast implements NoProguard {
    public static final int PREROLL_TYPE_BOTH = -1;
    public static final int PREROLL_TYPE_LONG = 2;
    public static final int PREROLL_TYPE_SHORT = 1;
    public static final int VAST_VERSION_2 = 2;
    public static final int VAST_VERSION_3 = 3;
    private String TAG = "TapsellVast";
    private Object contentProgressProvider;
    private Object mAdDisplayContainer;
    private Object mAdsLoader;
    private Object mAdsManager;
    private Object mSdkFactory;
    private TapsellVastAdsListener tapsellVastAdsListener;
    private Object videoAdPlayer;

    /* renamed from: ir.tapsell.sdk.vast.TapsellVast$a */
    /* loaded from: classes.dex */
    class C2773a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Context f11284a;

        C2773a(Context context) {
            this.f11284a = context;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onAdError")) {
                try {
                    k50.m13611a(this.f11284a, C2776a.m13207g(objArr[0]), SdkErrorTypeEnum.TAPSELL_VAST);
                } catch (Exception e) {
                    h50.m12123a(TapsellVast.this.TAG, e);
                }
                if (TapsellVast.this.tapsellVastAdsListener != null) {
                    TapsellVast.this.tapsellVastAdsListener.onAdError(C2776a.m13207g(objArr[0]));
                }
            }
            return null;
        }
    }

    /* renamed from: ir.tapsell.sdk.vast.TapsellVast$b */
    /* loaded from: classes.dex */
    class C2774b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Context f11286a;

        /* renamed from: ir.tapsell.sdk.vast.TapsellVast$b$a */
        /* loaded from: classes.dex */
        class a implements InvocationHandler {
            a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getName().equals("onAdError")) {
                    try {
                        k50.m13611a(C2774b.this.f11286a, C2776a.m13207g(objArr[0]), SdkErrorTypeEnum.TAPSELL_VAST);
                    } catch (Exception e) {
                        h50.m12123a(TapsellVast.this.TAG, e);
                    }
                    if (TapsellVast.this.tapsellVastAdsListener != null) {
                        TapsellVast.this.tapsellVastAdsListener.onAdError(C2776a.m13207g(objArr[0]));
                    }
                }
                return null;
            }
        }

        /* renamed from: ir.tapsell.sdk.vast.TapsellVast$b$b */
        /* loaded from: classes.dex */
        class b implements InvocationHandler {
            b() {
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x005e, code lost:
            
                if (r10.equals("LOADED") != false) goto L26;
             */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.vast.TapsellVast.C2774b.b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        }

        C2774b(Context context) {
            this.f11286a = context;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onAdsManagerLoaded")) {
                TapsellVast.this.mAdsManager = C2776a.m13209h(objArr[0]);
                C2776a.m13198c(TapsellVast.this.mAdsManager, new a());
                C2776a.m13201d(TapsellVast.this.mAdsManager, new b());
                C2776a.m13203e(TapsellVast.this.mAdsManager);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.vast.TapsellVast$c */
    /* loaded from: classes.dex */
    public class C2775c implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ ContentProgressProvider f11290a;

        C2775c(TapsellVast tapsellVast, ContentProgressProvider contentProgressProvider) {
            this.f11290a = contentProgressProvider;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("getContentProgress")) {
                return C2776a.m13180a(new VideoProgressUpdate(this.f11290a.getContentProgress().getCurrentTime(), this.f11290a.getContentProgress().getDuration()));
            }
            return null;
        }
    }

    public TapsellVast(Context context, String str) {
        String message;
        if (!C2776a.m13191a()) {
            throw new RuntimeException("Google ima dependency required for TapsellVAST. Visit HERE for more info");
        }
        if (!C2776a.m13195b()) {
            throw new RuntimeException("Google gms dependency required for TapsellVAST. Visit HERE for more info");
        }
        try {
            Object m13183a = C2776a.m13183a(str);
            Object m13196c = C2776a.m13196c();
            this.mSdkFactory = m13196c;
            Object m13181a = C2776a.m13181a(m13196c, context, m13183a);
            this.mAdsLoader = m13181a;
            C2776a.m13190a(m13181a, new C2773a(context));
            C2776a.m13194b(this.mAdsLoader, new C2774b(context));
        } catch (ClassNotFoundException e) {
            message = e.getMessage();
            i50.m12369a("Tapsell", message);
        } catch (IllegalAccessException e2) {
            message = e2.getMessage();
            i50.m12369a("Tapsell", message);
        } catch (NoSuchMethodException e3) {
            message = e3.getMessage();
            i50.m12369a("Tapsell", message);
        } catch (InvocationTargetException e4) {
            message = e4.getMessage();
            i50.m12369a("Tapsell", message);
        }
    }

    @Deprecated
    public static String getAdTag(Context context, String str, int i, int i2) {
        return getAdTag(str, i, i2);
    }

    public static String getAdTag(String str, int i, int i2) {
        return C2776a.m13185a(str, i, i2);
    }

    public void contentComplete() {
        Object obj = this.mAdsLoader;
        if (obj != null) {
            try {
                C2776a.m13186a(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void pause() {
        Object obj = this.mAdsManager;
        if (obj != null) {
            try {
                C2776a.m13193b(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void requestAds(VideoAdPlayer videoAdPlayer, ViewGroup viewGroup, String str, ContentProgressProvider contentProgressProvider) {
        try {
            if (this.mAdsManager != null) {
                C2776a.m13200d(this.mAdsManager);
            }
            C2776a.m13186a(this.mAdsLoader);
            setVideoAdPlayer(videoAdPlayer);
            setContentProgressProvider(contentProgressProvider);
            Object m13182a = C2776a.m13182a(this.mSdkFactory, this.videoAdPlayer, viewGroup);
            this.mAdDisplayContainer = m13182a;
            C2776a.m13187a(this.mSdkFactory, this.mAdsLoader, str, m13182a, this.contentProgressProvider);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                k50.m13611a((Context) null, "requestAds error", SdkErrorTypeEnum.TAPSELL_VAST);
            } catch (Exception e2) {
                h50.m12123a(this.TAG, e2);
            }
            TapsellVastAdsListener tapsellVastAdsListener = this.tapsellVastAdsListener;
            if (tapsellVastAdsListener != null) {
                tapsellVastAdsListener.onAdError("requestAds error");
            }
        }
    }

    public void resume() {
        Object obj = this.mAdsManager;
        if (obj != null) {
            try {
                C2776a.m13197c(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        if (contentProgressProvider == null) {
            return;
        }
        try {
            this.contentProgressProvider = C2776a.m13192b((InvocationHandler) new C2775c(this, contentProgressProvider));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setTapsellVastAdsListener(TapsellVastAdsListener tapsellVastAdsListener) {
        this.tapsellVastAdsListener = tapsellVastAdsListener;
    }

    public void setVideoAdPlayer(final VideoAdPlayer videoAdPlayer) {
        if (videoAdPlayer == null) {
            return;
        }
        try {
            this.videoAdPlayer = C2776a.m13184a(new InvocationHandler(this) { // from class: ir.tapsell.sdk.vast.TapsellVast.3
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, final Object[] objArr) {
                    char c;
                    String name = method.getName();
                    switch (name.hashCode()) {
                        case -1766672151:
                            if (name.equals("removeCallback")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1146500090:
                            if (name.equals("addCallback")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1097520215:
                            if (name.equals("loadAd")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -985753993:
                            if (name.equals("playAd")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -892069947:
                            if (name.equals("stopAd")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -790198087:
                            if (name.equals("pauseAd")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -335775440:
                            if (name.equals("resumeAd")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 822024038:
                            if (name.equals("getAdProgress")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        videoAdPlayer.playAd();
                        return null;
                    }
                    if (c == 1) {
                        videoAdPlayer.loadAd((String) objArr[0]);
                        return null;
                    }
                    if (c == 2) {
                        videoAdPlayer.stopAd();
                        return null;
                    }
                    if (c == 3) {
                        videoAdPlayer.pauseAd();
                        return null;
                    }
                    if (c == 4) {
                        videoAdPlayer.resumeAd();
                        return null;
                    }
                    if (c == 5) {
                        videoAdPlayer.addCallback(new VideoAdPlayer.VideoAdPlayerCallback() { // from class: ir.tapsell.sdk.vast.TapsellVast.3.1
                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onEnded() {
                                try {
                                    C2776a.m13188a(objArr[0], "onEnded");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onError() {
                                try {
                                    k50.m13611a((Context) null, C2776a.m13207g(objArr[0]), SdkErrorTypeEnum.TAPSELL_VAST);
                                    C2776a.m13188a(objArr[0], "onError");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onLoaded() {
                                try {
                                    C2776a.m13188a(objArr[0], "onLoaded");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onPause() {
                                try {
                                    C2776a.m13188a(objArr[0], "onPause");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onPlay() {
                                try {
                                    C2776a.m13188a(objArr[0], "onPlay");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onResume() {
                                try {
                                    C2776a.m13188a(objArr[0], "onResume");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }

                            @Override // ir.tapsell.sdk.vast.VideoAdPlayer.VideoAdPlayerCallback
                            public void onVolumeChanged(int i) {
                                try {
                                    C2776a.m13189a(objArr[0], "onVolumeChanged", i);
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e2.printStackTrace();
                                } catch (NoSuchMethodException e3) {
                                    e3.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e4.printStackTrace();
                                }
                            }
                        });
                        return null;
                    }
                    if (c != 7) {
                        return null;
                    }
                    return C2776a.m13180a(videoAdPlayer.getAdProgress());
                }
            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
