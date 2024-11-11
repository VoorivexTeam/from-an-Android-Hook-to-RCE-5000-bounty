package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C0541g;
import com.airbnb.lottie.InterfaceC0536b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y5 */
/* loaded from: classes.dex */
public class C3472y5 {

    /* renamed from: e */
    private static final Object f14098e = new Object();

    /* renamed from: a */
    private final Context f14099a;

    /* renamed from: b */
    private String f14100b;

    /* renamed from: c */
    private InterfaceC0536b f14101c;

    /* renamed from: d */
    private final Map<String, C0541g> f14102d;

    public C3472y5(Drawable.Callback callback, String str, InterfaceC0536b interfaceC0536b, Map<String, C0541g> map) {
        this.f14100b = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.f14100b.charAt(r4.length() - 1) != '/') {
                this.f14100b += '/';
            }
        }
        if (callback instanceof View) {
            this.f14099a = ((View) callback).getContext();
            this.f14102d = map;
            m16575a(interfaceC0536b);
        } else {
            C3116q9.m15002b("LottieDrawable must be inside of a view for images to work.");
            this.f14102d = new HashMap();
            this.f14099a = null;
        }
    }

    /* renamed from: a */
    private Bitmap m16573a(String str, Bitmap bitmap) {
        synchronized (f14098e) {
            this.f14102d.get(str).m3829a(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m16574a(String str) {
        String str2;
        Bitmap m15757a;
        C0541g c0541g = this.f14102d.get(str);
        if (c0541g == null) {
            return null;
        }
        Bitmap m3828a = c0541g.m3828a();
        if (m3828a != null) {
            return m3828a;
        }
        InterfaceC0536b interfaceC0536b = this.f14101c;
        if (interfaceC0536b != null) {
            Bitmap m3720a = interfaceC0536b.m3720a(c0541g);
            if (m3720a != null) {
                m16573a(str, m3720a);
            }
            return m3720a;
        }
        String m3830b = c0541g.m3830b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!m3830b.startsWith("data:") || m3830b.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f14100b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                m15757a = C3295u9.m15757a(BitmapFactory.decodeStream(this.f14099a.getAssets().open(this.f14100b + m3830b), null, options), c0541g.m3833e(), c0541g.m3831c());
            } catch (IOException e) {
                e = e;
                str2 = "Unable to open asset.";
                C3116q9.m15003b(str2, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(m3830b.substring(m3830b.indexOf(44) + 1), 0);
                m15757a = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e2) {
                e = e2;
                str2 = "data URL did not have correct base64 format.";
                C3116q9.m15003b(str2, e);
                return null;
            }
        }
        m16573a(str, m15757a);
        return m15757a;
    }

    /* renamed from: a */
    public void m16575a(InterfaceC0536b interfaceC0536b) {
        this.f14101c = interfaceC0536b;
    }

    /* renamed from: a */
    public boolean m16576a(Context context) {
        return (context == null && this.f14099a == null) || this.f14099a.equals(context);
    }
}
