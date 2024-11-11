package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class l {
    private final SparseIntArray a = new SparseIntArray();
    private com.google.android.gms.common.d b;

    public l(com.google.android.gms.common.d dVar) {
        u.a(dVar);
        this.b = dVar;
    }

    public int a(Context context, a.f fVar) {
        u.a(context);
        u.a(fVar);
        int i = 0;
        if (!fVar.h()) {
            return 0;
        }
        int i2 = fVar.i();
        int i3 = this.a.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.a.size()) {
                i = i3;
                break;
            }
            int keyAt = this.a.keyAt(i4);
            if (keyAt > i2 && this.a.get(keyAt) == 0) {
                break;
            }
            i4++;
        }
        if (i == -1) {
            i = this.b.a(context, i2);
        }
        this.a.put(i2, i);
        return i;
    }

    public void a() {
        this.a.clear();
    }
}
