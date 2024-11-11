package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e00 {
    private final hz a;
    private final tz b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private final hw a;
        private final hw b;
        private final int c;

        private b(hw hwVar, hw hwVar2, int i) {
            this.a = hwVar;
            this.b = hwVar2;
            this.c = i;
        }

        hw a() {
            return this.a;
        }

        hw b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public String toString() {
            return this.a + "/" + this.b + '/' + this.c;
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Comparator<b>, Serializable {
        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public e00(hz hzVar) {
        this.a = hzVar;
        this.b = new tz(hzVar);
    }

    private static int a(hw hwVar, hw hwVar2) {
        return sz.a(hw.a(hwVar, hwVar2));
    }

    private hw a(hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4, int i) {
        float f = i;
        float a2 = a(hwVar, hwVar2) / f;
        float a3 = a(hwVar3, hwVar4);
        hw hwVar5 = new hw(hwVar4.a() + (((hwVar4.a() - hwVar3.a()) / a3) * a2), hwVar4.b() + (a2 * ((hwVar4.b() - hwVar3.b()) / a3)));
        float a4 = a(hwVar, hwVar3) / f;
        float a5 = a(hwVar2, hwVar4);
        hw hwVar6 = new hw(hwVar4.a() + (((hwVar4.a() - hwVar2.a()) / a5) * a4), hwVar4.b() + (a4 * ((hwVar4.b() - hwVar2.b()) / a5)));
        if (a(hwVar5)) {
            return (a(hwVar6) && Math.abs(b(hwVar3, hwVar5).c() - b(hwVar2, hwVar5).c()) > Math.abs(b(hwVar3, hwVar6).c() - b(hwVar2, hwVar6).c())) ? hwVar6 : hwVar5;
        }
        if (a(hwVar6)) {
            return hwVar6;
        }
        return null;
    }

    private hw a(hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4, int i, int i2) {
        float a2 = a(hwVar, hwVar2) / i;
        float a3 = a(hwVar3, hwVar4);
        hw hwVar5 = new hw(hwVar4.a() + (((hwVar4.a() - hwVar3.a()) / a3) * a2), hwVar4.b() + (a2 * ((hwVar4.b() - hwVar3.b()) / a3)));
        float a4 = a(hwVar, hwVar3) / i2;
        float a5 = a(hwVar2, hwVar4);
        hw hwVar6 = new hw(hwVar4.a() + (((hwVar4.a() - hwVar2.a()) / a5) * a4), hwVar4.b() + (a4 * ((hwVar4.b() - hwVar2.b()) / a5)));
        if (a(hwVar5)) {
            return (a(hwVar6) && Math.abs(i - b(hwVar3, hwVar5).c()) + Math.abs(i2 - b(hwVar2, hwVar5).c()) > Math.abs(i - b(hwVar3, hwVar6).c()) + Math.abs(i2 - b(hwVar2, hwVar6).c())) ? hwVar6 : hwVar5;
        }
        if (a(hwVar6)) {
            return hwVar6;
        }
        return null;
    }

    private static hz a(hz hzVar, hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return oz.a().a(hzVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, hwVar.a(), hwVar.b(), hwVar4.a(), hwVar4.b(), hwVar3.a(), hwVar3.b(), hwVar2.a(), hwVar2.b());
    }

    private static void a(Map<hw, Integer> map, hw hwVar) {
        Integer num = map.get(hwVar);
        map.put(hwVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private boolean a(hw hwVar) {
        return hwVar.a() >= 0.0f && hwVar.a() < ((float) this.a.h()) && hwVar.b() > 0.0f && hwVar.b() < ((float) this.a.c());
    }

    private b b(hw hwVar, hw hwVar2) {
        int a2 = (int) hwVar.a();
        int b2 = (int) hwVar.b();
        int a3 = (int) hwVar2.a();
        int b3 = (int) hwVar2.b();
        int i = 0;
        boolean z = Math.abs(b3 - b2) > Math.abs(a3 - a2);
        if (z) {
            b2 = a2;
            a2 = b2;
            b3 = a3;
            a3 = b3;
        }
        int abs = Math.abs(a3 - a2);
        int abs2 = Math.abs(b3 - b2);
        int i2 = (-abs) / 2;
        int i3 = b2 < b3 ? 1 : -1;
        int i4 = a2 >= a3 ? -1 : 1;
        boolean b4 = this.a.b(z ? b2 : a2, z ? a2 : b2);
        while (a2 != a3) {
            boolean b5 = this.a.b(z ? b2 : a2, z ? a2 : b2);
            if (b5 != b4) {
                i++;
                b4 = b5;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (b2 == b3) {
                    break;
                }
                b2 += i3;
                i2 -= abs;
            }
            a2 += i4;
        }
        return new b(hwVar, hwVar2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [hw] */
    /* JADX WARN: Type inference failed for: r16v3, types: [hw] */
    /* JADX WARN: Type inference failed for: r22v0, types: [hw] */
    /* JADX WARN: Type inference failed for: r23v0, types: [e00] */
    /* JADX WARN: Type inference failed for: r2v4, types: [hw[]] */
    /* JADX WARN: Type inference failed for: r4v6, types: [hw[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hw] */
    public mz a() {
        hw hwVar;
        hz a2;
        hw[] a3 = this.b.a();
        hw hwVar2 = a3[0];
        hw hwVar3 = a3[1];
        hw hwVar4 = a3[2];
        hw hwVar5 = a3[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(b(hwVar2, hwVar3));
        arrayList.add(b(hwVar2, hwVar4));
        arrayList.add(b(hwVar3, hwVar5));
        arrayList.add(b(hwVar4, hwVar5));
        a aVar = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        a(hashMap, bVar.a());
        a(hashMap, bVar.b());
        a(hashMap, bVar2.a());
        a(hashMap, bVar2.b());
        Object obj = null;
        Object obj2 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ?? r16 = (hw) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                obj = r16;
            } else if (aVar == null) {
                aVar = r16;
            } else {
                obj2 = r16;
            }
        }
        if (aVar == null || obj == null || obj2 == null) {
            throw aw.a();
        }
        ?? r4 = {aVar, obj, obj2};
        hw.a(r4);
        ?? r14 = r4[0];
        ?? r22 = r4[1];
        ?? r6 = r4[2];
        hw hwVar6 = !hashMap.containsKey(hwVar2) ? hwVar2 : !hashMap.containsKey(hwVar3) ? hwVar3 : !hashMap.containsKey(hwVar4) ? hwVar4 : hwVar5;
        int c2 = b(r6, hwVar6).c();
        int c3 = b(r14, hwVar6).c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            hwVar = r6;
            hw a4 = a(r22, r14, r6, hwVar6, i, i2);
            if (a4 != null) {
                hwVar6 = a4;
            }
            int c4 = b(hwVar, hwVar6).c();
            int c5 = b(r14, hwVar6).c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            a2 = a(this.a, hwVar, r22, r14, hwVar6, i3, c5);
        } else {
            hw a5 = a(r22, r14, r6, hwVar6, Math.min(i2, i));
            if (a5 != null) {
                hwVar6 = a5;
            }
            int max = Math.max(b(r6, hwVar6).c(), b(r14, hwVar6).c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            a2 = a(this.a, r6, r22, r14, hwVar6, i4, i4);
            hwVar = r6;
        }
        return new mz(a2, new hw[]{hwVar, r22, r14, hwVar6});
    }
}
