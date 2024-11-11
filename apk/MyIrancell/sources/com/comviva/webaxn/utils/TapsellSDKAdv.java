package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import com.comviva.webaxn.p002ui.ExitActivity;
import com.mtni.myirancell.R;
import ir.tapsell.sdk.AdRequestCallback;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdShowListener;
import ir.tapsell.sdk.TapsellShowOptions;
import ir.tapsell.sdk.bannerads.TapsellBannerType;
import ir.tapsell.sdk.bannerads.TapsellBannerView;
import ir.tapsell.sdk.nativeads.C2715a;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerManager;
import p000.C0482bj;

/* loaded from: classes.dex */
public class TapsellSDKAdv {

    /* renamed from: e */
    private static final String f4623e = "com.comviva.webaxn.utils.TapsellSDKAdv";

    /* renamed from: a */
    private TapsellBannerView f4624a;

    /* renamed from: b */
    private C2715a f4625b;

    /* renamed from: c */
    private String[] f4626c = null;

    /* renamed from: d */
    private TapsellAd f4627d = null;

    /* renamed from: com.comviva.webaxn.utils.TapsellSDKAdv$2 */
    /* loaded from: classes.dex */
    class C06822 implements TapsellAdRequestListener {
        final /* synthetic */ Activity val$activity;

        C06822(Activity activity) {
            this.val$activity = activity;
        }

        @Override // ir.tapsell.sdk.TapsellAdRequestListener
        public void onAdAvailable(TapsellAd tapsellAd) {
            String unused = TapsellSDKAdv.f4623e;
            if (Build.VERSION.SDK_INT >= 17 ? this.val$activity.isDestroyed() : this.val$activity.isFinishing()) {
                return;
            }
            TapsellSDKAdv.this.f4627d = tapsellAd;
            TapsellSDKAdv.this.m5302b(this.val$activity);
        }

        @Override // ir.tapsell.sdk.TapsellAdRequestListener
        public void onError(String str) {
            if (Build.VERSION.SDK_INT >= 17 ? this.val$activity.isDestroyed() : this.val$activity.isFinishing()) {
                return;
            }
            String unused = TapsellSDKAdv.f4623e;
            String str2 = "on ad Error" + str;
            TapsellSDKAdv.this.m5296a(this.val$activity);
        }

        @Override // ir.tapsell.sdk.TapsellAdRequestListener
        public void onExpiring(TapsellAd tapsellAd) {
            if (Build.VERSION.SDK_INT >= 17 ? this.val$activity.isDestroyed() : this.val$activity.isFinishing()) {
                return;
            }
            String unused = TapsellSDKAdv.f4623e;
            TapsellSDKAdv.this.m5296a(this.val$activity);
        }

        @Override // ir.tapsell.sdk.TapsellAdRequestListener
        public void onNoAdAvailable() {
            if (Build.VERSION.SDK_INT >= 17 ? this.val$activity.isDestroyed() : this.val$activity.isFinishing()) {
                return;
            }
            String unused = TapsellSDKAdv.f4623e;
            TapsellSDKAdv.this.m5296a(this.val$activity);
        }

        @Override // ir.tapsell.sdk.TapsellAdRequestListener
        public void onNoNetwork() {
            if (Build.VERSION.SDK_INT >= 17 ? this.val$activity.isDestroyed() : this.val$activity.isFinishing()) {
                return;
            }
            String unused = TapsellSDKAdv.f4623e;
            TapsellSDKAdv.this.m5296a(this.val$activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5296a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ExitActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: a */
    private void m5297a(final Context context, final String str) {
        TapsellNativeBannerManager.getAd(context, str, new AdRequestCallback() { // from class: com.comviva.webaxn.utils.TapsellSDKAdv.1
            @Override // ir.tapsell.sdk.AdRequestCallback
            public void onFailed(String str2) {
                if (Build.VERSION.SDK_INT >= 17 ? ((Activity) context).isDestroyed() : ((Activity) context).isFinishing()) {
                    return;
                }
                String unused = TapsellSDKAdv.f4623e;
                String str3 = "onFailed" + str2;
            }

            @Override // ir.tapsell.sdk.AdRequestCallback
            public void onResponse(String[] strArr) {
                String unused = TapsellSDKAdv.f4623e;
                if (Build.VERSION.SDK_INT >= 17 ? ((Activity) context).isDestroyed() : ((Activity) context).isFinishing()) {
                    return;
                }
                TapsellSDKAdv.this.f4626c = strArr;
                TapsellSDKAdv.this.m5303b(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5302b(final Activity activity) {
        TapsellAd tapsellAd = this.f4627d;
        if (tapsellAd == null) {
            return;
        }
        tapsellAd.show(activity, new TapsellShowOptions(), new TapsellAdShowListener() { // from class: com.comviva.webaxn.utils.TapsellSDKAdv.3
            @Override // ir.tapsell.sdk.TapsellAdShowListener
            public void onClosed(TapsellAd tapsellAd2) {
                String unused = TapsellSDKAdv.f4623e;
                TapsellSDKAdv.this.m5296a(activity);
            }

            @Override // ir.tapsell.sdk.TapsellAdShowListener
            public void onOpened(TapsellAd tapsellAd2) {
                String unused = TapsellSDKAdv.f4623e;
            }
        });
        this.f4627d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5303b(Context context, String str) {
        String[] strArr = this.f4626c;
        if (strArr == null) {
            return;
        }
        TapsellNativeBannerManager.bindAd(context, this.f4625b, str, strArr[0]);
    }

    /* renamed from: a */
    public TapsellBannerView m5305a() {
        return this.f4624a;
    }

    /* renamed from: a */
    public void m5306a(Context context, int i, String str) {
        TapsellBannerView tapsellBannerView;
        if (i == 1) {
            tapsellBannerView = new TapsellBannerView(context, TapsellBannerType.BANNER_320x50, str);
        } else if (i == 2) {
            tapsellBannerView = new TapsellBannerView(context, TapsellBannerType.BANNER_320x100, str);
        } else if (i == 3) {
            tapsellBannerView = new TapsellBannerView(context, TapsellBannerType.BANNER_250x250, str);
        } else if (i != 4) {
            return;
        } else {
            tapsellBannerView = new TapsellBannerView(context, TapsellBannerType.BANNER_300x250, str);
        }
        this.f4624a = tapsellBannerView;
    }

    /* renamed from: a */
    public void m5307a(Context context, ViewGroup viewGroup, C0482bj c0482bj) {
        int m3399a = c0482bj.m3399a();
        int i = R.layout.tapsell_native_home_ad_layout;
        int i2 = m3399a == 1 ? R.layout.tapsell_content_banner_ad_template : c0482bj.m3399a() == 2 ? R.layout.tapsell_small_content_banner_ad_template : c0482bj.m3399a() == 3 ? R.layout.tapsell_native_home_ad_layout : c0482bj.m3399a() == 4 ? R.layout.tapsell_native_bottom_ad_layout : 0;
        if (i2 != 0) {
            i = i2;
        }
        this.f4625b = new TapsellNativeBannerManager.Builder().setParentView(viewGroup).setContentViewTemplate(i).setClickableViewId(R.id.clickableView).inflateTemplate(context);
        m5297a(context, c0482bj.m3402b());
    }
}
