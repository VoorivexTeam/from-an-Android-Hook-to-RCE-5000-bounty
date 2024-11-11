package p000;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: xt */
/* loaded from: classes.dex */
public interface InterfaceC3450xt {

    /* renamed from: xt$b */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f14066b = new b();

        /* renamed from: a */
        private final e f14067a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f, e eVar, e eVar2) {
            this.f14067a.m16509a(C2359cu.m11211a(eVar.f14070a, eVar2.f14070a, f), C2359cu.m11211a(eVar.f14071b, eVar2.f14071b, f), C2359cu.m11211a(eVar.f14072c, eVar2.f14072c, f));
            return this.f14067a;
        }
    }

    /* renamed from: xt$c */
    /* loaded from: classes.dex */
    public static class c extends Property<InterfaceC3450xt, e> {

        /* renamed from: a */
        public static final Property<InterfaceC3450xt, e> f14068a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC3450xt interfaceC3450xt) {
            return interfaceC3450xt.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC3450xt interfaceC3450xt, e eVar) {
            interfaceC3450xt.setRevealInfo(eVar);
        }
    }

    /* renamed from: xt$d */
    /* loaded from: classes.dex */
    public static class d extends Property<InterfaceC3450xt, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC3450xt, Integer> f14069a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC3450xt interfaceC3450xt) {
            return Integer.valueOf(interfaceC3450xt.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC3450xt interfaceC3450xt, Integer num) {
            interfaceC3450xt.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: xt$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public float f14070a;

        /* renamed from: b */
        public float f14071b;

        /* renamed from: c */
        public float f14072c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.f14070a = f;
            this.f14071b = f2;
            this.f14072c = f3;
        }

        /* renamed from: a */
        public void m16509a(float f, float f2, float f3) {
            this.f14070a = f;
            this.f14071b = f2;
            this.f14072c = f3;
        }
    }

    /* renamed from: a */
    void mo16054a();

    /* renamed from: b */
    void mo16055b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
