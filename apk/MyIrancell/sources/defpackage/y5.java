package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.b;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y5 {
    private static final Object e = new Object();
    private final Context a;
    private String b;
    private b c;
    private final Map<String, g> d;

    public y5(Drawable.Callback callback, String str, b bVar, Map<String, g> map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.b.charAt(r4.length() - 1) != '/') {
                this.b += '/';
            }
        }
        if (callback instanceof View) {
            this.a = ((View) callback).getContext();
            this.d = map;
            a(bVar);
        } else {
            q9.b("LottieDrawable must be inside of a view for images to work.");
            this.d = new HashMap();
            this.a = null;
        }
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).a(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        String str2;
        Bitmap a;
        g gVar = this.d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a2 = gVar.a();
        if (a2 != null) {
            return a2;
        }
        b bVar = this.c;
        if (bVar != null) {
            Bitmap a3 = bVar.a(gVar);
            if (a3 != null) {
                a(str, a3);
            }
            return a3;
        }
        String b = gVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                a = u9.a(BitmapFactory.decodeStream(this.a.getAssets().open(this.b + b), null, options), gVar.e(), gVar.c());
            } catch (IOException e2) {
                e = e2;
                str2 = "Unable to open asset.";
                q9.b(str2, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                a = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e3) {
                e = e3;
                str2 = "data URL did not have correct base64 format.";
                q9.b(str2, e);
                return null;
            }
        }
        a(str, a);
        return a;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public boolean a(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }
}
