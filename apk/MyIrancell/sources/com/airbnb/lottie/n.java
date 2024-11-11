package com.airbnb.lottie;

import defpackage.d0;
import defpackage.s9;
import defpackage.t1;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class n {
    private boolean a = false;
    private final Set<b> b = new d0();
    private final Map<String, s9> c = new HashMap();

    /* loaded from: classes.dex */
    class a implements Comparator<t1<String, Float>> {
        a(n nVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(t1<String, Float> t1Var, t1<String, Float> t1Var2) {
            float floatValue = t1Var.b.floatValue();
            float floatValue2 = t1Var2.b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f);
    }

    public n() {
        new a(this);
    }

    public void a(String str, float f) {
        if (this.a) {
            s9 s9Var = this.c.get(str);
            if (s9Var == null) {
                s9Var = new s9();
                this.c.put(str, s9Var);
            }
            s9Var.a(f);
            if (str.equals("__container")) {
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.a = z;
    }
}
