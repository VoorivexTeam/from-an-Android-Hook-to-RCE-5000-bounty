package ir.tapsell.sdk.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.networkcacheutils.ImageLoadOptions;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;

/* loaded from: classes.dex */
public class b {
    public static void a(View view, float f) {
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

    public static void a(View view, String str) {
        if (view == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        ((TextView) view).setText(str);
    }

    public static void a(ImageLoader imageLoader, View view, String str) {
        ImageLoadOptions imageLoadOptions = new ImageLoadOptions();
        imageLoadOptions.setInitialReplacementType(ImageLoadOptions.g.HIDE_IMAGE_VIEW);
        a(imageLoader, view, str, imageLoadOptions);
    }

    private static void a(ImageLoader imageLoader, View view, String str, ImageLoadOptions imageLoadOptions) {
        if (imageLoader == null || view == null || str == null || imageLoadOptions == null) {
            return;
        }
        imageLoader.DisplayImage(str, (ImageView) view, null, null, imageLoadOptions);
    }

    public static void b(ImageLoader imageLoader, View view, String str) {
        ImageLoadOptions imageLoadOptions = new ImageLoadOptions();
        imageLoadOptions.setBitmapDecodingMethod(ImageLoadOptions.b.HIGHEST_CONFIG_LOW_MEMORY);
        imageLoadOptions.setInitialReplacementType(ImageLoadOptions.g.HIDE_IMAGE_VIEW);
        a(imageLoader, view, str, imageLoadOptions);
    }
}
