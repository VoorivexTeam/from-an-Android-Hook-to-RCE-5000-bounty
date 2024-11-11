package p000;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C0535a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x5 */
/* loaded from: classes.dex */
public class C3423x5 {

    /* renamed from: d */
    private final AssetManager f13992d;

    /* renamed from: e */
    private C0535a f13993e;

    /* renamed from: a */
    private final C2539h6<String> f13989a = new C2539h6<>();

    /* renamed from: b */
    private final Map<C2539h6<String>, Typeface> f13990b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f13991c = new HashMap();

    /* renamed from: f */
    private String f13994f = ".ttf";

    public C3423x5(Drawable.Callback callback, C0535a c0535a) {
        AssetManager assets;
        this.f13993e = c0535a;
        if (callback instanceof View) {
            assets = ((View) callback).getContext().getAssets();
        } else {
            C3116q9.m15002b("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        }
        this.f13992d = assets;
    }

    /* renamed from: a */
    private Typeface m16441a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    /* renamed from: a */
    private Typeface m16442a(String str) {
        Typeface typeface = this.f13991c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C0535a c0535a = this.f13993e;
        if (c0535a != null) {
            c0535a.m3718a(str);
            throw null;
        }
        if (c0535a != null) {
            c0535a.m3719b(str);
            throw null;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f13992d, "fonts/" + str + this.f13994f);
        this.f13991c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: a */
    public Typeface m16443a(String str, String str2) {
        this.f13989a.m12137a(str, str2);
        Typeface typeface = this.f13990b.get(this.f13989a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m16441a = m16441a(m16442a(str), str2);
        this.f13990b.put(this.f13989a, m16441a);
        return m16441a;
    }

    /* renamed from: a */
    public void m16444a(C0535a c0535a) {
        this.f13993e = c0535a;
    }
}
