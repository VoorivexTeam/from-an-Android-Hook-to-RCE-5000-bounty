package com.comviva.webaxn.utils;

import android.content.Context;

/* renamed from: com.comviva.webaxn.utils.b */
/* loaded from: classes.dex */
public class C0687b {

    /* renamed from: b */
    private static C0687b f4646b;

    /* renamed from: a */
    private C0711j f4647a;

    private C0687b(Context context) {
        C0711j c0711j = this.f4647a;
        if (c0711j == null) {
            this.f4647a = new C0711j(context);
        } else {
            c0711j.m5558j();
        }
    }

    /* renamed from: a */
    public static C0687b m5342a(Context context) {
        if (f4646b == null) {
            f4646b = new C0687b(context);
        }
        return f4646b;
    }

    /* renamed from: a */
    public C0711j m5343a() {
        return this.f4647a;
    }

    /* renamed from: b */
    public void m5344b() {
        f4646b.m5343a().m5558j();
    }
}
