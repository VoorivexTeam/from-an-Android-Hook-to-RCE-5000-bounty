package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import defpackage.rj;
import defpackage.sj;
import defpackage.yj;

/* loaded from: classes.dex */
public class e1 extends n1 {
    private yj A;
    private Drawable B;
    private int C;
    private v0 D;
    private View.OnClickListener E;
    private TableLayout x;
    private TableRow y;
    private TextView z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        final /* synthetic */ sj b;

        a(sj sjVar) {
            this.b = sjVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i;
            int b;
            if (motionEvent.getAction() == 0) {
                b = com.comviva.webaxn.utils.j1.a(e1.this.c).f0();
            } else {
                if (!this.b.b.j()) {
                    i = -16777216;
                    view.setBackgroundColor(i);
                    return false;
                }
                b = this.b.b.b();
            }
            i = n1.d(b);
            view.setBackgroundColor(i);
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b(e1 e1Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public e1(Context context, v0 v0Var) {
        super(context);
        this.E = new b(this);
        this.D = v0Var;
        int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
        this.C = f0;
        this.C = f0 == -1 ? -16711936 : n1.d(f0);
    }

    private void a(TextView textView, String str) {
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

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
    }

    public void b(yj yjVar) {
        this.A = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.A;
    }

    public void m() {
        TextView textView;
        String str;
        TextView textView2;
        float m0;
        yj f = f();
        TableLayout tableLayout = new TableLayout(this.c);
        this.x = tableLayout;
        tableLayout.setStretchAllColumns(true);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, -2);
        if (f.A == null && f.B == null && f.C == null && f.D == null) {
            layoutParams.setMargins(2, 0, 2, 0);
        } else {
            layoutParams.setMargins(f.d(this.D.c.width()), f.i(this.D.c.width()), f.g(this.D.c.width()), f.a(this.D.c.width()));
        }
        this.x.setLayoutParams(layoutParams);
        TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
        if (f == null || f.h0 == null) {
            return;
        }
        int i = 0;
        while (i < f.h0.size()) {
            this.y = new TableRow(this.c);
            this.y.setPadding(0, 1, 1, i == f.h0.size() - 1 ? 1 : 0);
            this.y.setLayoutParams(layoutParams2);
            TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(-1, -2);
            if (f.A == null && f.B == null && f.C == null && f.D == null) {
                layoutParams3.setMargins(1, 0, 1, 0);
            } else {
                layoutParams3.setMargins(f.d(this.D.c.width()), f.i(this.D.c.width()), f.g(this.D.c.width()), f.a(this.D.c.width()));
            }
            sj elementAt = f.h0.elementAt(i);
            for (int i2 = 0; i2 < elementAt.c.size(); i2++) {
                rj elementAt2 = elementAt.c.elementAt(i2);
                TextView textView3 = new TextView(this.c);
                this.z = textView3;
                textView3.setText(elementAt2.n());
                this.z.setLayoutParams(layoutParams3);
                this.z.setPadding(1, 0, 0, 0);
                if (elementAt2.a() != null) {
                    textView = this.z;
                    str = elementAt2.a();
                } else {
                    textView = this.z;
                    str = "L";
                }
                a(textView, str);
                if (elementAt2.k()) {
                    this.z.setTextColor(n1.d(elementAt2.c()));
                }
                if (elementAt2.l()) {
                    textView2 = this.z;
                    m0 = elementAt2.f();
                } else {
                    textView2 = this.z;
                    m0 = com.comviva.webaxn.utils.j1.a(this.c).m0();
                }
                textView2.setTextSize(m0);
                if (elementAt2.j()) {
                    this.y.setBackgroundColor(n1.d(elementAt2.b()));
                } else if (elementAt.b.j()) {
                    this.y.setBackgroundColor(n1.d(elementAt.b.b()));
                } else if (this.B != null) {
                    this.y.setBackgroundColor(-16777216);
                    this.z.setBackgroundColor(-1);
                }
                this.y.addView(this.z);
            }
            this.y.setOnClickListener(this.E);
            this.y.setOnTouchListener(new a(elementAt));
            this.x.addView(this.y);
            i++;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.x);
        }
    }
}
