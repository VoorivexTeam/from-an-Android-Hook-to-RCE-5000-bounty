package com.comviva.webaxn.ui;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.triggertrap.seekarc.SeekArc;
import defpackage.yj;
import defpackage.zj;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class s {
    private yj a;
    private SeekArc b;
    private yj d;
    private zj e;
    private DecimalFormat h;
    private float c = 0.0f;
    private int f = 0;
    private boolean g = false;

    /* loaded from: classes.dex */
    class a implements SeekArc.a {

        /* renamed from: com.comviva.webaxn.ui.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0033a implements Runnable {
            RunnableC0033a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (s.this.d == null || s.this.d.a0 == null || !(s.this.d.a0 instanceof w)) {
                        return;
                    }
                    w wVar = (w) s.this.d.a0;
                    String m = wVar.m();
                    if (TextUtils.isEmpty(m)) {
                        s.this.c = 0.0f;
                    } else {
                        s.this.c = s.this.a(Float.parseFloat(m) - s.this.a.N0.h(), false);
                        if (s.this.a.N0.l() && s.this.a.N0.e() == 0.0f) {
                            s.this.c = Math.round(s.this.c);
                        }
                    }
                    if (s.this.f != s.this.c || m.length() == 0) {
                        s.this.g = true;
                        String a = s.this.a();
                        wVar.h(a);
                        wVar.g(a.length());
                    }
                } catch (Exception unused) {
                }
            }
        }

        a() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc) {
            if (s.this.a.a0 == null || s.this.a.P0 == null || s.this.a.P0.get("onchange") == null || s.this.e.r == null || s.this.e.r.get("RELAYOUT_FLAG") == null || !s.this.e.r.get("RELAYOUT_FLAG").equals("0")) {
                return;
            }
            s.this.a.a0.g.b(s.this.a.a0);
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc, int i, boolean z) {
            s.this.f = i;
            s.this.b.post(new RunnableC0033a());
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void b(SeekArc seekArc) {
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(s sVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r10 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(android.content.Context r5, defpackage.yj r6, com.comviva.webaxn.ui.v0 r7, android.widget.AbsoluteLayout r8, com.comviva.webaxn.ui.p0 r9, defpackage.zj r10) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.s.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0, android.widget.AbsoluteLayout, com.comviva.webaxn.ui.p0, zj):void");
    }

    private float a(float f) {
        if (this.h == null) {
            this.h = new DecimalFormat();
        }
        this.h.setMaximumFractionDigits(this.a.N0.j());
        try {
            return Float.parseFloat(this.h.format(f));
        } catch (NumberFormatException unused) {
            return b(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f, boolean z) {
        if (this.a.N0.e() != 0.0f) {
            f *= z ? this.a.N0.e() : 1.0f / this.a.N0.e();
        }
        return this.a.N0.j() == 0 ? f : a(f);
    }

    private float b(float f) {
        return ((float) Math.floor(f * d())) / d();
    }

    private void c(float f) {
        float a2 = a(f, false);
        float a3 = a(this.a.N0.h(), false);
        float f2 = a2 >= a3 ? a2 - a3 : 0.0f;
        if (f2 > this.b.getMax()) {
            f2 = this.b.getMax();
        }
        this.b.setProgress(Math.round(f2));
    }

    private float d() {
        return (float) Math.pow(10.0d, this.a.N0.j());
    }

    public String a() {
        float a2 = a(this.f, true) + this.a.N0.h();
        if (this.a.N0.j() != 0) {
            a2 = a(a2);
        } else if (!this.a.N0.l()) {
            return String.valueOf((int) a2);
        }
        return String.valueOf(a2);
    }

    public void a(String str) {
        float parseFloat;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseFloat = Float.parseFloat(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            c(parseFloat);
        }
        parseFloat = 0.0f;
        c(parseFloat);
    }

    public boolean b() {
        return this.g;
    }

    public void c() {
        this.g = false;
    }
}
