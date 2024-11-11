package com.bumptech.glide;

import android.content.Context;
import defpackage.bc;
import defpackage.c0;
import defpackage.ec;
import defpackage.fc;
import defpackage.gg;
import defpackage.hh;
import defpackage.ig;
import defpackage.ih;
import defpackage.jc;
import defpackage.kb;
import defpackage.kc;
import defpackage.oc;
import defpackage.og;
import defpackage.tc;
import defpackage.uc;
import defpackage.vc;
import defpackage.wc;
import defpackage.yc;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    private kb b;
    private ec c;
    private bc d;
    private vc e;
    private yc f;
    private yc g;
    private oc.a h;
    private wc i;
    private gg j;
    private og.b m;
    private yc n;
    private boolean o;
    private List<hh<Object>> p;
    private boolean q;
    private final Map<Class<?>, k<?, ?>> a = new c0();
    private int k = 4;
    private ih l = new ih();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(Context context) {
        if (this.f == null) {
            this.f = yc.d();
        }
        if (this.g == null) {
            this.g = yc.c();
        }
        if (this.n == null) {
            this.n = yc.b();
        }
        if (this.i == null) {
            this.i = new wc.a(context).a();
        }
        if (this.j == null) {
            this.j = new ig();
        }
        if (this.c == null) {
            int b = this.i.b();
            if (b > 0) {
                this.c = new kc(b);
            } else {
                this.c = new fc();
            }
        }
        if (this.d == null) {
            this.d = new jc(this.i.a());
        }
        if (this.e == null) {
            this.e = new uc(this.i.c());
        }
        if (this.h == null) {
            this.h = new tc(context);
        }
        if (this.b == null) {
            this.b = new kb(this.e, this.h, this.g, this.f, yc.e(), yc.b(), this.o);
        }
        List<hh<Object>> list = this.p;
        this.p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        og ogVar = new og(this.m);
        kb kbVar = this.b;
        vc vcVar = this.e;
        ec ecVar = this.c;
        bc bcVar = this.d;
        gg ggVar = this.j;
        int i = this.k;
        ih ihVar = this.l;
        ihVar.G();
        return new c(context, kbVar, vcVar, ecVar, bcVar, ogVar, ggVar, i, ihVar, this.a, this.p, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(og.b bVar) {
        this.m = bVar;
    }
}
