package ir.tapsell.sdk.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.networkcacheutils.ImageLoadOptions;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;

/* renamed from: ir.tapsell.sdk.nativeads.b */
/* loaded from: classes.dex */
public class C2716b {
    /* renamed from: a */
    public static void m12997a(View view, float f) {
        if (view == null) {
            return;
        }
        if (view instanceof RatingBar) {
            RatingBar ratingBar = (RatingBar) view;
            ratingBar.setRating(f);
            ratingBar.setIsIndicator(true);
        } else if (view instanceof RateStarView) {
            ((RateStarView) view).setRate(f);
        }
    }

    /* renamed from: a */
    public static void m12998a(View view, String str) {
        if (view == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        ((TextView) view).setText(str);
    }

    /* renamed from: a */
    public static void m12999a(ImageLoader imageLoader, View view, String str) {
        ImageLoadOptions imageLoadOptions = new ImageLoadOptions();
        imageLoadOptions.setInitialReplacementType(ImageLoadOptions.EnumC2734g.HIDE_IMAGE_VIEW);
        m13000a(imageLoader, view, str, imageLoadOptions);
    }

    /* renamed from: a */
    private static void m13000a(ImageLoader imageLoader, View view, String str, ImageLoadOptions imageLoadOptions) {
        if (imageLoader == null || view == null || str == null || imageLoadOptions == null) {
            return;
        }
        imageLoader.DisplayImage(str, (ImageView) view, null, null, imageLoadOptions);
    }

    /* renamed from: b */
    public static void m13001b(ImageLoader imageLoader, View view, String str) {
        ImageLoadOptions imageLoadOptions = new ImageLoadOptions();
        imageLoadOptions.setBitmapDecodingMethod(ImageLoadOptions.EnumC2729b.HIGHEST_CONFIG_LOW_MEMORY);
        imageLoadOptions.setInitialReplacementType(ImageLoadOptions.EnumC2734g.HIDE_IMAGE_VIEW);
        m13000a(imageLoader, view, str, imageLoadOptions);
    }
}
