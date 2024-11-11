package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C2366d0;
import p000.C3199s9;
import p000.C3231t1;

/* renamed from: com.airbnb.lottie.n */
/* loaded from: classes.dex */
public class C0548n {

    /* renamed from: a */
    private boolean f3190a = false;

    /* renamed from: b */
    private final Set<b> f3191b = new C2366d0();

    /* renamed from: c */
    private final Map<String, C3199s9> f3192c = new HashMap();

    /* renamed from: com.airbnb.lottie.n$a */
    /* loaded from: classes.dex */
    class a implements Comparator<C3231t1<String, Float>> {
        a(C0548n c0548n) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C3231t1<String, Float> c3231t1, C3231t1<String, Float> c3231t12) {
            float floatValue = c3231t1.f13168b.floatValue();
            float floatValue2 = c3231t12.f13168b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: com.airbnb.lottie.n$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m3856a(float f);
    }

    public C0548n() {
        new a(this);
    }

    /* renamed from: a */
    public void m3853a(String str, float f) {
        if (this.f3190a) {
            C3199s9 c3199s9 = this.f3192c.get(str);
            if (c3199s9 == null) {
                c3199s9 = new C3199s9();
                this.f3192c.put(str, c3199s9);
            }
            c3199s9.m15386a(f);
            if (str.equals("__container")) {
                Iterator<b> it = this.f3191b.iterator();
                while (it.hasNext()) {
                    it.next().m3856a(f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3854a(boolean z) {
        this.f3190a = z;
    }
}
