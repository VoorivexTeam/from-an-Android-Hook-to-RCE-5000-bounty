package com.comviva.webaxn.p002ui;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.triggertrap.seekarc.SeekArc;
import java.text.DecimalFormat;
import p000.C3489yj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.s */
/* loaded from: classes.dex */
public class C0662s {

    /* renamed from: a */
    private C3489yj f4309a;

    /* renamed from: b */
    private SeekArc f4310b;

    /* renamed from: d */
    private C3489yj f4312d;

    /* renamed from: e */
    private C3531zj f4313e;

    /* renamed from: h */
    private DecimalFormat f4316h;

    /* renamed from: c */
    private float f4311c = 0.0f;

    /* renamed from: f */
    private int f4314f = 0;

    /* renamed from: g */
    private boolean f4315g = false;

    /* renamed from: com.comviva.webaxn.ui.s$a */
    /* loaded from: classes.dex */
    class a implements SeekArc.InterfaceC2340a {

        /* renamed from: com.comviva.webaxn.ui.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3556a implements Runnable {
            RunnableC3556a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C0662s.this.f4312d == null || C0662s.this.f4312d.f14197a0 == null || !(C0662s.this.f4312d.f14197a0 instanceof C0670w)) {
                        return;
                    }
                    C0670w c0670w = (C0670w) C0662s.this.f4312d.f14197a0;
                    String m5097m = c0670w.m5097m();
                    if (TextUtils.isEmpty(m5097m)) {
                        C0662s.this.f4311c = 0.0f;
                    } else {
                        C0662s.this.f4311c = C0662s.this.m4931a(Float.parseFloat(m5097m) - C0662s.this.f4309a.f14171N0.m14620h(), false);
                        if (C0662s.this.f4309a.f14171N0.m14624l() && C0662s.this.f4309a.f14171N0.m14614e() == 0.0f) {
                            C0662s.this.f4311c = Math.round(C0662s.this.f4311c);
                        }
                    }
                    if (C0662s.this.f4314f != C0662s.this.f4311c || m5097m.length() == 0) {
                        C0662s.this.f4315g = true;
                        String m4945a = C0662s.this.m4945a();
                        c0670w.m5093h(m4945a);
                        c0670w.m5090g(m4945a.length());
                    }
                } catch (Exception unused) {
                }
            }
        }

        a() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC2340a
        /* renamed from: a */
        public void mo4949a(SeekArc seekArc) {
            if (C0662s.this.f4309a.f14197a0 == null || C0662s.this.f4309a.f14175P0 == null || C0662s.this.f4309a.f14175P0.get("onchange") == null || C0662s.this.f4313e.f14519r == null || C0662s.this.f4313e.f14519r.get("RELAYOUT_FLAG") == null || !C0662s.this.f4313e.f14519r.get("RELAYOUT_FLAG").equals("0")) {
                return;
            }
            C0662s.this.f4309a.f14197a0.f4049g.mo4849b(C0662s.this.f4309a.f14197a0);
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC2340a
        /* renamed from: a */
        public void mo4950a(SeekArc seekArc, int i, boolean z) {
            C0662s.this.f4314f = i;
            C0662s.this.f4310b.post(new RunnableC3556a());
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC2340a
        /* renamed from: b */
        public void mo4951b(SeekArc seekArc) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.s$b */
    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(C0662s c0662s) {
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
    public C0662s(android.content.Context r5, p000.C3489yj r6, com.comviva.webaxn.p002ui.C0669v0 r7, android.widget.AbsoluteLayout r8, com.comviva.webaxn.p002ui.C0657p0 r9, p000.C3531zj r10) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0662s.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0, android.widget.AbsoluteLayout, com.comviva.webaxn.ui.p0, zj):void");
    }

    /* renamed from: a */
    private float m4930a(float f) {
        if (this.f4316h == null) {
            this.f4316h = new DecimalFormat();
        }
        this.f4316h.setMaximumFractionDigits(this.f4309a.f14171N0.m14622j());
        try {
            return Float.parseFloat(this.f4316h.format(f));
        } catch (NumberFormatException unused) {
            return m4937b(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float m4931a(float f, boolean z) {
        if (this.f4309a.f14171N0.m14614e() != 0.0f) {
            f *= z ? this.f4309a.f14171N0.m14614e() : 1.0f / this.f4309a.f14171N0.m14614e();
        }
        return this.f4309a.f14171N0.m14622j() == 0 ? f : m4930a(f);
    }

    /* renamed from: b */
    private float m4937b(float f) {
        return ((float) Math.floor(f * m4941d())) / m4941d();
    }

    /* renamed from: c */
    private void m4940c(float f) {
        float m4931a = m4931a(f, false);
        float m4931a2 = m4931a(this.f4309a.f14171N0.m14620h(), false);
        float f2 = m4931a >= m4931a2 ? m4931a - m4931a2 : 0.0f;
        if (f2 > this.f4310b.getMax()) {
            f2 = this.f4310b.getMax();
        }
        this.f4310b.setProgress(Math.round(f2));
    }

    /* renamed from: d */
    private float m4941d() {
        return (float) Math.pow(10.0d, this.f4309a.f14171N0.m14622j());
    }

    /* renamed from: a */
    public String m4945a() {
        float m4931a = m4931a(this.f4314f, true) + this.f4309a.f14171N0.m14620h();
        if (this.f4309a.f14171N0.m14622j() != 0) {
            m4931a = m4930a(m4931a);
        } else if (!this.f4309a.f14171N0.m14624l()) {
            return String.valueOf((int) m4931a);
        }
        return String.valueOf(m4931a);
    }

    /* renamed from: a */
    public void m4946a(String str) {
        float parseFloat;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseFloat = Float.parseFloat(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m4940c(parseFloat);
        }
        parseFloat = 0.0f;
        m4940c(parseFloat);
    }

    /* renamed from: b */
    public boolean m4947b() {
        return this.f4315g;
    }

    /* renamed from: c */
    public void m4948c() {
        this.f4315g = false;
    }
}
