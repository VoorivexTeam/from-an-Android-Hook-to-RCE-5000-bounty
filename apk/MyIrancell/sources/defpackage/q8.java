package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.d;
import defpackage.k9;
import defpackage.q7;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class q8 {
    private static final k9.a a = k9.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    private static final k9.a b = k9.a.a("d", "a");
    private static final k9.a c = k9.a.a("nm");

    public static q7 a(d dVar) {
        Rect a2 = dVar.a();
        return new q7(Collections.emptyList(), dVar, "__container", -1L, q7.a.PRE_COMP, -1L, null, Collections.emptyList(), new t6(), 0, 0, 0, 0.0f, 0.0f, a2.width(), a2.height(), null, null, Collections.emptyList(), q7.b.NONE, null, false);
    }

    public static q7 a(k9 k9Var, d dVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        q7.b bVar = q7.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        k9Var.c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        q7.b bVar2 = bVar;
        q7.a aVar = null;
        String str = null;
        t6 t6Var = null;
        r6 r6Var = null;
        s6 s6Var = null;
        j6 j6Var = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (k9Var.h()) {
            switch (k9Var.a(a)) {
                case 0:
                    str3 = k9Var.m();
                    continue;
                case 1:
                    j2 = k9Var.k();
                    continue;
                case 2:
                    str = k9Var.m();
                    continue;
                case 3:
                    int k = k9Var.k();
                    if (k < q7.a.UNKNOWN.ordinal()) {
                        aVar = q7.a.values()[k];
                        break;
                    } else {
                        aVar = q7.a.UNKNOWN;
                        continue;
                    }
                case 4:
                    j = k9Var.k();
                    continue;
                case 5:
                    i = (int) (k9Var.k() * u9.a());
                    continue;
                case 6:
                    i2 = (int) (k9Var.k() * u9.a());
                    continue;
                case 7:
                    i3 = Color.parseColor(k9Var.m());
                    continue;
                case 8:
                    t6Var = a8.a(k9Var, dVar);
                    continue;
                case 9:
                    bVar2 = q7.b.values()[k9Var.k()];
                    dVar.a(1);
                    continue;
                case 10:
                    k9Var.a();
                    while (k9Var.h()) {
                        arrayList3.add(s8.a(k9Var, dVar));
                    }
                    dVar.a(arrayList3.size());
                    break;
                case 11:
                    k9Var.a();
                    while (k9Var.h()) {
                        x6 a2 = e8.a(k9Var, dVar);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    break;
                case 12:
                    k9Var.c();
                    while (k9Var.h()) {
                        int a3 = k9Var.a(b);
                        if (a3 == 0) {
                            r6Var = b8.b(k9Var, dVar);
                        } else if (a3 != 1) {
                            k9Var.n();
                            k9Var.o();
                        } else {
                            k9Var.a();
                            if (k9Var.h()) {
                                s6Var = z7.a(k9Var, dVar);
                            }
                            while (k9Var.h()) {
                                k9Var.o();
                            }
                            k9Var.d();
                        }
                    }
                    k9Var.e();
                    continue;
                case 13:
                    k9Var.a();
                    ArrayList arrayList5 = new ArrayList();
                    while (k9Var.h()) {
                        k9Var.c();
                        while (k9Var.h()) {
                            if (k9Var.a(c) != 0) {
                                k9Var.n();
                                k9Var.o();
                            } else {
                                arrayList5.add(k9Var.m());
                            }
                        }
                        k9Var.e();
                    }
                    k9Var.d();
                    dVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    continue;
                case 14:
                    f3 = (float) k9Var.j();
                    continue;
                case 15:
                    f4 = (float) k9Var.j();
                    continue;
                case 16:
                    i4 = (int) (k9Var.k() * u9.a());
                    continue;
                case 17:
                    i5 = (int) (k9Var.k() * u9.a());
                    continue;
                case 18:
                    f = (float) k9Var.j();
                    continue;
                case 19:
                    f2 = (float) k9Var.j();
                    continue;
                case 20:
                    j6Var = b8.a(k9Var, dVar, false);
                    continue;
                case 21:
                    str2 = k9Var.m();
                    continue;
                case 22:
                    z = k9Var.i();
                    continue;
                default:
                    k9Var.n();
                    k9Var.o();
                    continue;
            }
            k9Var.d();
        }
        k9Var.e();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new v9(dVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= 0.0f) {
            f6 = dVar.e();
        }
        arrayList2.add(new v9(dVar, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList2.add(new v9(dVar, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            dVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new q7(arrayList4, dVar, str3, j2, aVar, j, str, arrayList, t6Var, i, i2, i3, f3, f4, i4, i5, r6Var, s6Var, arrayList2, bVar2, j6Var, z);
    }
}
