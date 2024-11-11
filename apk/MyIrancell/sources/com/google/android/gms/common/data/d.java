package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;

/* loaded from: classes.dex */
public class d {
    protected final DataHolder a;
    protected int b;
    private int c;

    public d(DataHolder dataHolder, int i) {
        u.a(dataHolder);
        this.a = dataHolder;
        a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str) {
        return this.a.a(str, this.b, this.c);
    }

    protected final void a(int i) {
        u.b(i >= 0 && i < this.a.getCount());
        this.b = i;
        this.c = this.a.d(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (s.a(Integer.valueOf(dVar.b), Integer.valueOf(this.b)) && s.a(Integer.valueOf(dVar.c), Integer.valueOf(this.c)) && dVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return s.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
