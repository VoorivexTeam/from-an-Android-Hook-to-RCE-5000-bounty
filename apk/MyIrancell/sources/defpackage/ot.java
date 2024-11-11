package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ot {
    private final i0<String, pt> a = new i0<>();

    public static ot a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a(arrayList);
        } catch (Exception unused) {
            String str = "Can't load animation resource ID #0x" + Integer.toHexString(i);
            return null;
        }
    }

    private static ot a(List<Animator> list) {
        ot otVar = new ot();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(otVar, list.get(i));
        }
        return otVar;
    }

    private static void a(ot otVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            otVar.a(objectAnimator.getPropertyName(), pt.a((ValueAnimator) objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            pt d = this.a.d(i);
            j = Math.max(j, d.a() + d.b());
        }
        return j;
    }

    public pt a(String str) {
        if (b(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public void a(String str, pt ptVar) {
        this.a.put(str, ptVar);
    }

    public boolean b(String str) {
        return this.a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ot.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ot) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + ot.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
