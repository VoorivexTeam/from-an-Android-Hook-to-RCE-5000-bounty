package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.comviva.webaxn.utils.C0713j1;
import p000.C3168rj;
import p000.C3212sj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.e1 */
/* loaded from: classes.dex */
public class C0625e1 extends AbstractC0652n1 {

    /* renamed from: A */
    private C3489yj f3631A;

    /* renamed from: B */
    private Drawable f3632B;

    /* renamed from: C */
    private int f3633C;

    /* renamed from: D */
    private C0669v0 f3634D;

    /* renamed from: E */
    private View.OnClickListener f3635E;

    /* renamed from: x */
    private TableLayout f3636x;

    /* renamed from: y */
    private TableRow f3637y;

    /* renamed from: z */
    private TextView f3638z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.e1$a */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ C3212sj f3639b;

        a(C3212sj c3212sj) {
            this.f3639b = c3212sj;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i;
            int m6057b;
            if (motionEvent.getAction() == 0) {
                m6057b = C0713j1.m5563a(C0625e1.this.f4045c).m5664f0();
            } else {
                if (!this.f3639b.f13118b.m6071j()) {
                    i = -16777216;
                    view.setBackgroundColor(i);
                    return false;
                }
                m6057b = this.f3639b.f13118b.m6057b();
            }
            i = AbstractC0652n1.m4701d(m6057b);
            view.setBackgroundColor(i);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e1$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b(C0625e1 c0625e1) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public C0625e1(Context context, C0669v0 c0669v0) {
        super(context);
        this.f3635E = new b(this);
        this.f3634D = c0669v0;
        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
        this.f3633C = m5664f0;
        this.f3633C = m5664f0 == -1 ? -16711936 : AbstractC0652n1.m4701d(m5664f0);
    }

    /* renamed from: a */
    private void m4296a(TextView textView, String str) {
        int i;
        if (str.equals("R")) {
            i = 5;
        } else if (str.equals("L")) {
            i = 3;
        } else if (!str.equals("C")) {
            return;
        } else {
            i = 17;
        }
        textView.setGravity(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
    }

    /* renamed from: b */
    public void m4297b(C3489yj c3489yj) {
        this.f3631A = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3631A;
    }

    /* renamed from: m */
    public void m4298m() {
        TextView textView;
        String str;
        TextView textView2;
        float m5700m0;
        C3489yj mo4148f = mo4148f();
        TableLayout tableLayout = new TableLayout(this.f4045c);
        this.f3636x = tableLayout;
        tableLayout.setStretchAllColumns(true);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, -2);
        if (mo4148f.f14144A == null && mo4148f.f14146B == null && mo4148f.f14148C == null && mo4148f.f14150D == null) {
            layoutParams.setMargins(2, 0, 2, 0);
        } else {
            layoutParams.setMargins(mo4148f.m16638d(this.f3634D.f4397c.width()), mo4148f.m16643i(this.f3634D.f4397c.width()), mo4148f.m16641g(this.f3634D.f4397c.width()), mo4148f.m16632a(this.f3634D.f4397c.width()));
        }
        this.f3636x.setLayoutParams(layoutParams);
        TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
        if (mo4148f == null || mo4148f.f14218h0 == null) {
            return;
        }
        int i = 0;
        while (i < mo4148f.f14218h0.size()) {
            this.f3637y = new TableRow(this.f4045c);
            this.f3637y.setPadding(0, 1, 1, i == mo4148f.f14218h0.size() - 1 ? 1 : 0);
            this.f3637y.setLayoutParams(layoutParams2);
            TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(-1, -2);
            if (mo4148f.f14144A == null && mo4148f.f14146B == null && mo4148f.f14148C == null && mo4148f.f14150D == null) {
                layoutParams3.setMargins(1, 0, 1, 0);
            } else {
                layoutParams3.setMargins(mo4148f.m16638d(this.f3634D.f4397c.width()), mo4148f.m16643i(this.f3634D.f4397c.width()), mo4148f.m16641g(this.f3634D.f4397c.width()), mo4148f.m16632a(this.f3634D.f4397c.width()));
            }
            C3212sj elementAt = mo4148f.f14218h0.elementAt(i);
            for (int i2 = 0; i2 < elementAt.f13119c.size(); i2++) {
                C3168rj elementAt2 = elementAt.f13119c.elementAt(i2);
                TextView textView3 = new TextView(this.f4045c);
                this.f3638z = textView3;
                textView3.setText(elementAt2.m15280n());
                this.f3638z.setLayoutParams(layoutParams3);
                this.f3638z.setPadding(1, 0, 0, 0);
                if (elementAt2.m6052a() != null) {
                    textView = this.f3638z;
                    str = elementAt2.m6052a();
                } else {
                    textView = this.f3638z;
                    str = "L";
                }
                m4296a(textView, str);
                if (elementAt2.m6072k()) {
                    this.f3638z.setTextColor(AbstractC0652n1.m4701d(elementAt2.m6062c()));
                }
                if (elementAt2.m6073l()) {
                    textView2 = this.f3638z;
                    m5700m0 = elementAt2.m6067f();
                } else {
                    textView2 = this.f3638z;
                    m5700m0 = C0713j1.m5563a(this.f4045c).m5700m0();
                }
                textView2.setTextSize(m5700m0);
                if (elementAt2.m6071j()) {
                    this.f3637y.setBackgroundColor(AbstractC0652n1.m4701d(elementAt2.m6057b()));
                } else if (elementAt.f13118b.m6071j()) {
                    this.f3637y.setBackgroundColor(AbstractC0652n1.m4701d(elementAt.f13118b.m6057b()));
                } else if (this.f3632B != null) {
                    this.f3637y.setBackgroundColor(-16777216);
                    this.f3638z.setBackgroundColor(-1);
                }
                this.f3637y.addView(this.f3638z);
            }
            this.f3637y.setOnClickListener(this.f3635E);
            this.f3637y.setOnTouchListener(new a(elementAt));
            this.f3636x.addView(this.f3637y);
            i++;
        }
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3636x);
        }
    }
}
