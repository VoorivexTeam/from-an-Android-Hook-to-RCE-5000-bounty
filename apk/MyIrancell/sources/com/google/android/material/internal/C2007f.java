package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public final class C2007f {

    /* renamed from: a */
    private final ArrayList<b> f8547a = new ArrayList<>();

    /* renamed from: b */
    private b f8548b = null;

    /* renamed from: c */
    ValueAnimator f8549c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f8550d = new a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2007f c2007f = C2007f.this;
            if (c2007f.f8549c == animator) {
                c2007f.f8549c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int[] f8552a;

        /* renamed from: b */
        final ValueAnimator f8553b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f8552a = iArr;
            this.f8553b = valueAnimator;
        }
    }

    /* renamed from: a */
    private void m10261a(b bVar) {
        ValueAnimator valueAnimator = bVar.f8553b;
        this.f8549c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: b */
    private void m10262b() {
        ValueAnimator valueAnimator = this.f8549c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8549c = null;
        }
    }

    /* renamed from: a */
    public void m10263a() {
        ValueAnimator valueAnimator = this.f8549c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f8549c = null;
        }
    }

    /* renamed from: a */
    public void m10264a(int[] iArr) {
        b bVar;
        int size = this.f8547a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f8547a.get(i);
            if (StateSet.stateSetMatches(bVar.f8552a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        b bVar2 = this.f8548b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            m10262b();
        }
        this.f8548b = bVar;
        if (bVar != null) {
            m10261a(bVar);
        }
    }

    /* renamed from: a */
    public void m10265a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f8550d);
        this.f8547a.add(bVar);
    }
}
