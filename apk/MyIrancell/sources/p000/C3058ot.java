package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ot */
/* loaded from: classes.dex */
public class C3058ot {

    /* renamed from: a */
    private final C2573i0<String, C3097pt> f12528a = new C2573i0<>();

    /* renamed from: a */
    public static C3058ot m14651a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m14652a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m14652a(arrayList);
        } catch (Exception unused) {
            String str = "Can't load animation resource ID #0x" + Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: a */
    private static C3058ot m14652a(List<Animator> list) {
        C3058ot c3058ot = new C3058ot();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m14653a(c3058ot, list.get(i));
        }
        return c3058ot;
    }

    /* renamed from: a */
    private static void m14653a(C3058ot c3058ot, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c3058ot.m14656a(objectAnimator.getPropertyName(), C3097pt.m14817a((ValueAnimator) objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: a */
    public long m14654a() {
        int size = this.f12528a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C3097pt m12311d = this.f12528a.m12311d(i);
            j = Math.max(j, m12311d.m14819a() + m12311d.m14821b());
        }
        return j;
    }

    /* renamed from: a */
    public C3097pt m14655a(String str) {
        if (m14657b(str)) {
            return this.f12528a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void m14656a(String str, C3097pt c3097pt) {
        this.f12528a.put(str, c3097pt);
    }

    /* renamed from: b */
    public boolean m14657b(String str) {
        return this.f12528a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3058ot.class != obj.getClass()) {
            return false;
        }
        return this.f12528a.equals(((C3058ot) obj).f12528a);
    }

    public int hashCode() {
        return this.f12528a.hashCode();
    }

    public String toString() {
        return '\n' + C3058ot.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f12528a + "}\n";
    }
}
