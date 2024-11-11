package com.comviva.webaxn.ui;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;
import defpackage.zj;

/* loaded from: classes.dex */
public class k1 {
    private x1.p h;
    private com.comviva.webaxn.utils.e i;
    public com.comviva.webaxn.utils.l1 j;
    public Context k;
    public zj l;
    public o1 m;
    public String q;
    public String r;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public long e = -1;
    public String f = null;
    Handler g = null;
    public boolean n = false;
    Runnable o = null;
    public int p = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.i = new com.comviva.webaxn.utils.e();
            k1 k1Var = k1.this;
            if (!k1Var.a) {
                k1Var.i.v = true;
            }
            k1.this.i.g = "ok";
            if (k1.this.f.startsWith("#")) {
                k1.this.i.h = "Menulist:";
                k1.this.i.i = k1.this.f.substring(1);
            } else {
                k1.this.i.h = k1.this.f;
            }
            x1.C = true;
            x1.p pVar = k1.this.h;
            com.comviva.webaxn.utils.e eVar = k1.this.i;
            k1 k1Var2 = k1.this;
            pVar.a(eVar, k1Var2.m.e, k1Var2.l, true);
            k1 k1Var3 = k1.this;
            k1Var3.p = 0;
            if (TextUtils.isEmpty(k1Var3.q)) {
                return;
            }
            k1 k1Var4 = k1.this;
            p1.a(k1Var4.k, k1Var4.q, k1Var4.m, (yj) null);
        }
    }

    public k1(Context context, zj zjVar) {
        this.k = context;
        this.l = zjVar;
    }

    public void a() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacks(this.o);
        }
        this.n = false;
        this.p = -1;
        this.g = null;
    }

    public void a(long j) {
        a aVar = new a();
        this.o = aVar;
        this.p = 1;
        this.g.postDelayed(aVar, j);
    }

    public void a(x1.p pVar) {
        this.h = pVar;
    }

    public void a(boolean z, boolean z2, o1 o1Var) {
        try {
            if (this.g == null) {
                this.g = new Handler();
            }
            this.m = o1Var;
            if (-1 < this.e) {
                if (this.b || this.c || this.d) {
                    if (!z2 || this.n) {
                        return;
                    }
                    if (this.d) {
                        this.n = true;
                    } else if (z) {
                        if (!this.b) {
                            return;
                        } else {
                            this.n = true;
                        }
                    } else if (!this.c) {
                        return;
                    } else {
                        this.n = true;
                    }
                }
                a(this.e);
            }
        } catch (Exception unused) {
        }
    }
}
