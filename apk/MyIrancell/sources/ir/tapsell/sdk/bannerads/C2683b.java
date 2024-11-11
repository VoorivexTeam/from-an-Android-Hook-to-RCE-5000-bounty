package ir.tapsell.sdk.bannerads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ir.tapsell.sdk.R$styleable;

/* renamed from: ir.tapsell.sdk.bannerads.b */
/* loaded from: classes.dex */
class C2683b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12873a(TapsellBannerView tapsellBannerView, TapsellBannerWebView tapsellBannerWebView, Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TapsellBannerView, 0, 0);
            try {
                int i2 = obtainStyledAttributes.getInt(R$styleable.TapsellBannerView_tapsell_banner_type, -1);
                tapsellBannerView.mBannerType = TapsellBannerType.fromValue(i2);
                tapsellBannerWebView.mBannerType = TapsellBannerType.fromValue(i2);
                tapsellBannerWebView.mZoneId = obtainStyledAttributes.getString(R$styleable.TapsellBannerView_tapsell_zone_id);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        tapsellBannerWebView.initialize(context);
    }
}
