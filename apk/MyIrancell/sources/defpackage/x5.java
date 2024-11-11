package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class x5 {
    private final AssetManager d;
    private a e;
    private final h6<String> a = new h6<>();
    private final Map<h6<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String f = ".ttf";

    public x5(Drawable.Callback callback, a aVar) {
        AssetManager assets;
        this.e = aVar;
        if (callback instanceof View) {
            assets = ((View) callback).getContext().getAssets();
        } else {
            q9.b("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        }
        this.d = assets;
    }

    private Typeface a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    private Typeface a(String str) {
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(str);
            throw null;
        }
        if (aVar != null) {
            aVar.b(str);
            throw null;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.d, "fonts/" + str + this.f);
        this.c.put(str, createFromAsset);
        return createFromAsset;
    }

    public Typeface a(String str, String str2) {
        this.a.a(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = a(a(str), str2);
        this.b.put(this.a, a);
        return a;
    }

    public void a(a aVar) {
        this.e = aVar;
    }
}
