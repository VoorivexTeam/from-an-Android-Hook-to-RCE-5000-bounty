package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.h */
/* loaded from: classes.dex */
class C0388h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f2437a;

    /* renamed from: b */
    private final PathMeasure f2438b;

    /* renamed from: c */
    private final float f2439c;

    /* renamed from: d */
    private final float[] f2440d;

    /* renamed from: e */
    private final PointF f2441e;

    /* renamed from: f */
    private float f2442f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0388h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2440d = new float[2];
        this.f2441e = new PointF();
        this.f2437a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2438b = pathMeasure;
        this.f2439c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f) {
        this.f2442f = f.floatValue();
        this.f2438b.getPosTan(this.f2439c * f.floatValue(), this.f2440d, null);
        PointF pointF = this.f2441e;
        float[] fArr = this.f2440d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2437a.set(t, pointF);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f2442f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(Object obj) {
        return get((C0388h<T>) obj);
    }
}
