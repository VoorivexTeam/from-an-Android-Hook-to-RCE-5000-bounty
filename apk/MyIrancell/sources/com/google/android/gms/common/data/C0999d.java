package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.data.d */
/* loaded from: classes.dex */
public class C0999d {

    /* renamed from: a */
    protected final DataHolder f6071a;

    /* renamed from: b */
    protected int f6072b;

    /* renamed from: c */
    private int f6073c;

    public C0999d(DataHolder dataHolder, int i) {
        C1057u.m7286a(dataHolder);
        this.f6071a = dataHolder;
        m6988a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m6987a(String str) {
        return this.f6071a.m6981a(str, this.f6072b, this.f6073c);
    }

    /* renamed from: a */
    protected final void m6988a(int i) {
        C1057u.m7297b(i >= 0 && i < this.f6071a.getCount());
        this.f6072b = i;
        this.f6073c = this.f6071a.m6982d(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0999d) {
            C0999d c0999d = (C0999d) obj;
            if (C1050s.m7205a(Integer.valueOf(c0999d.f6072b), Integer.valueOf(this.f6072b)) && C1050s.m7205a(Integer.valueOf(c0999d.f6073c), Integer.valueOf(this.f6073c)) && c0999d.f6071a == this.f6071a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f6072b), Integer.valueOf(this.f6073c), this.f6071a);
    }
}
