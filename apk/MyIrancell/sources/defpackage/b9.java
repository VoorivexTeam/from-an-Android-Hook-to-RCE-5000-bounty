package defpackage;

import android.graphics.PointF;
import defpackage.k9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b9 implements h9<h7> {
    public static final b9 a = new b9();
    private static final k9.a b = k9.a.a("c", "v", "i", "o");

    private b9() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h9
    public h7 a(k9 k9Var, float f) {
        if (k9Var.peek() == k9.b.BEGIN_ARRAY) {
            k9Var.a();
        }
        k9Var.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(b);
            if (a2 == 0) {
                z = k9Var.i();
            } else if (a2 == 1) {
                list = n8.e(k9Var, f);
            } else if (a2 == 2) {
                list2 = n8.e(k9Var, f);
            } else if (a2 != 3) {
                k9Var.n();
                k9Var.o();
            } else {
                list3 = n8.e(k9Var, f);
            }
        }
        k9Var.e();
        if (k9Var.peek() == k9.b.END_ARRAY) {
            k9Var.d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new h7(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new z5(t9.a(list.get(i2), list3.get(i2)), t9.a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new z5(t9.a(list.get(i3), list3.get(i3)), t9.a(pointF3, list2.get(0)), pointF3));
        }
        return new h7(pointF, z, arrayList);
    }
}
