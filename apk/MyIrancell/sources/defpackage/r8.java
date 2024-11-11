package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.d;
import com.airbnb.lottie.g;
import defpackage.k9;
import defpackage.q7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r8 {
    private static final k9.a a = k9.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static k9.a b = k9.a.a("id", "layers", "w", "h", "p", "u");
    private static final k9.a c = k9.a.a("list");
    private static final k9.a d = k9.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0043. Please report as an issue. */
    public static d a(k9 k9Var) {
        HashMap hashMap;
        ArrayList arrayList;
        k9 k9Var2 = k9Var;
        float a2 = u9.a();
        f0<q7> f0Var = new f0<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        j0<c6> j0Var = new j0<>();
        d dVar = new d();
        k9Var.c();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (k9Var.h()) {
            switch (k9Var2.a(a)) {
                case 0:
                    i = k9Var.k();
                    break;
                case 1:
                    i2 = k9Var.k();
                    break;
                case 2:
                    f = (float) k9Var.j();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) k9Var.j()) - 0.01f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) k9Var.j();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] split = k9Var.m().split("\\.");
                    if (!u9.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    a(k9Var2, dVar, arrayList2, f0Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    a(k9Var2, dVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    a(k9Var2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    a(k9Var2, dVar, j0Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    a(k9Var2, dVar, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    k9Var.n();
                    k9Var.o();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
            }
            k9Var2 = k9Var;
        }
        dVar.a(new Rect(0, 0, (int) (i * a2), (int) (i2 * a2)), f, f2, f3, arrayList2, f0Var, hashMap2, hashMap3, j0Var, hashMap4, arrayList3);
        return dVar;
    }

    private static void a(k9 k9Var, d dVar, j0<c6> j0Var) {
        k9Var.a();
        while (k9Var.h()) {
            c6 a2 = h8.a(k9Var, dVar);
            j0Var.c(a2.hashCode(), a2);
        }
        k9Var.d();
    }

    private static void a(k9 k9Var, d dVar, List<g6> list) {
        k9Var.a();
        while (k9Var.h()) {
            String str = null;
            k9Var.c();
            float f = 0.0f;
            float f2 = 0.0f;
            while (k9Var.h()) {
                int a2 = k9Var.a(d);
                if (a2 == 0) {
                    str = k9Var.m();
                } else if (a2 == 1) {
                    f = (float) k9Var.j();
                } else if (a2 != 2) {
                    k9Var.n();
                    k9Var.o();
                } else {
                    f2 = (float) k9Var.j();
                }
            }
            k9Var.e();
            list.add(new g6(str, f, f2));
        }
        k9Var.d();
    }

    private static void a(k9 k9Var, d dVar, List<q7> list, f0<q7> f0Var) {
        k9Var.a();
        int i = 0;
        while (k9Var.h()) {
            q7 a2 = q8.a(k9Var, dVar);
            if (a2.d() == q7.a.IMAGE) {
                i++;
            }
            list.add(a2);
            f0Var.c(a2.b(), a2);
            if (i > 4) {
                q9.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        k9Var.d();
    }

    private static void a(k9 k9Var, d dVar, Map<String, List<q7>> map, Map<String, g> map2) {
        k9Var.a();
        while (k9Var.h()) {
            ArrayList arrayList = new ArrayList();
            f0 f0Var = new f0();
            k9Var.c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (k9Var.h()) {
                int a2 = k9Var.a(b);
                if (a2 == 0) {
                    str = k9Var.m();
                } else if (a2 == 1) {
                    k9Var.a();
                    while (k9Var.h()) {
                        q7 a3 = q8.a(k9Var, dVar);
                        f0Var.c(a3.b(), a3);
                        arrayList.add(a3);
                    }
                    k9Var.d();
                } else if (a2 == 2) {
                    i = k9Var.k();
                } else if (a2 == 3) {
                    i2 = k9Var.k();
                } else if (a2 == 4) {
                    str2 = k9Var.m();
                } else if (a2 != 5) {
                    k9Var.n();
                    k9Var.o();
                } else {
                    str3 = k9Var.m();
                }
            }
            k9Var.e();
            if (str2 != null) {
                g gVar = new g(i, i2, str, str2, str3);
                map2.put(gVar.d(), gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        k9Var.d();
    }

    private static void a(k9 k9Var, Map<String, b6> map) {
        k9Var.c();
        while (k9Var.h()) {
            if (k9Var.a(c) != 0) {
                k9Var.n();
                k9Var.o();
            } else {
                k9Var.a();
                while (k9Var.h()) {
                    b6 a2 = i8.a(k9Var);
                    map.put(a2.b(), a2);
                }
                k9Var.d();
            }
        }
        k9Var.e();
    }
}
