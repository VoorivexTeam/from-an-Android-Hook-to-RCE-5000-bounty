package p000;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: lt */
/* loaded from: classes.dex */
public class C2909lt extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f11920b = new C2909lt();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f11921a;

    private C2909lt() {
        super(Integer.class, "drawableAlphaCompat");
        this.f11921a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f11921a.containsKey(drawable)) {
            return this.f11921a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f11921a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
