package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: pt */
/* loaded from: classes.dex */
public class C3097pt {

    /* renamed from: a */
    private long f12635a;

    /* renamed from: b */
    private long f12636b;

    /* renamed from: c */
    private TimeInterpolator f12637c;

    /* renamed from: d */
    private int f12638d;

    /* renamed from: e */
    private int f12639e;

    public C3097pt(long j, long j2) {
        this.f12635a = 0L;
        this.f12636b = 300L;
        this.f12637c = null;
        this.f12638d = 0;
        this.f12639e = 1;
        this.f12635a = j;
        this.f12636b = j2;
    }

    public C3097pt(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f12635a = 0L;
        this.f12636b = 300L;
        this.f12637c = null;
        this.f12638d = 0;
        this.f12639e = 1;
        this.f12635a = j;
        this.f12636b = j2;
        this.f12637c = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3097pt m14817a(ValueAnimator valueAnimator) {
        C3097pt c3097pt = new C3097pt(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m14818b(valueAnimator));
        c3097pt.f12638d = valueAnimator.getRepeatCount();
        c3097pt.f12639e = valueAnimator.getRepeatMode();
        return c3097pt;
    }

    /* renamed from: b */
    private static TimeInterpolator m14818b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C2565ht.f10510b : interpolator instanceof AccelerateInterpolator ? C2565ht.f10511c : interpolator instanceof DecelerateInterpolator ? C2565ht.f10512d : interpolator;
    }

    /* renamed from: a */
    public long m14819a() {
        return this.f12635a;
    }

    /* renamed from: a */
    public void m14820a(Animator animator) {
        animator.setStartDelay(m14819a());
        animator.setDuration(m14821b());
        animator.setInterpolator(m14822c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m14823d());
            valueAnimator.setRepeatMode(m14824e());
        }
    }

    /* renamed from: b */
    public long m14821b() {
        return this.f12636b;
    }

    /* renamed from: c */
    public TimeInterpolator m14822c() {
        TimeInterpolator timeInterpolator = this.f12637c;
        return timeInterpolator != null ? timeInterpolator : C2565ht.f10510b;
    }

    /* renamed from: d */
    public int m14823d() {
        return this.f12638d;
    }

    /* renamed from: e */
    public int m14824e() {
        return this.f12639e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3097pt.class != obj.getClass()) {
            return false;
        }
        C3097pt c3097pt = (C3097pt) obj;
        if (m14819a() == c3097pt.m14819a() && m14821b() == c3097pt.m14821b() && m14823d() == c3097pt.m14823d() && m14824e() == c3097pt.m14824e()) {
            return m14822c().getClass().equals(c3097pt.m14822c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (m14819a() ^ (m14819a() >>> 32))) * 31) + ((int) (m14821b() ^ (m14821b() >>> 32)))) * 31) + m14822c().getClass().hashCode()) * 31) + m14823d()) * 31) + m14824e();
    }

    public String toString() {
        return '\n' + C3097pt.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m14819a() + " duration: " + m14821b() + " interpolator: " + m14822c().getClass() + " repeatCount: " + m14823d() + " repeatMode: " + m14824e() + "}\n";
    }
}
