package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.api.C0859a;

/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes.dex */
public class C1036l {

    /* renamed from: a */
    private final SparseIntArray f6237a = new SparseIntArray();

    /* renamed from: b */
    private C0994d f6238b;

    public C1036l(C0994d c0994d) {
        C1057u.m7286a(c0994d);
        this.f6238b = c0994d;
    }

    /* renamed from: a */
    public int m7172a(Context context, C0859a.f fVar) {
        C1057u.m7286a(context);
        C1057u.m7286a(fVar);
        int i = 0;
        if (!fVar.m6517h()) {
            return 0;
        }
        int mo6465i = fVar.mo6465i();
        int i2 = this.f6237a.get(mo6465i, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f6237a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f6237a.keyAt(i3);
            if (keyAt > mo6465i && this.f6237a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f6238b.mo6953a(context, mo6465i);
        }
        this.f6237a.put(mo6465i, i);
        return i;
    }

    /* renamed from: a */
    public void m7173a() {
        this.f6237a.clear();
    }
}
