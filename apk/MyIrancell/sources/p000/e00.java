package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e00 {

    /* renamed from: a */
    private final C2571hz f9892a;

    /* renamed from: b */
    private final C3280tz f9893b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e00$b */
    /* loaded from: classes.dex */
    public static final class C2411b {

        /* renamed from: a */
        private final C2568hw f9894a;

        /* renamed from: b */
        private final C2568hw f9895b;

        /* renamed from: c */
        private final int f9896c;

        private C2411b(C2568hw c2568hw, C2568hw c2568hw2, int i) {
            this.f9894a = c2568hw;
            this.f9895b = c2568hw2;
            this.f9896c = i;
        }

        /* renamed from: a */
        C2568hw m11513a() {
            return this.f9894a;
        }

        /* renamed from: b */
        C2568hw m11514b() {
            return this.f9895b;
        }

        /* renamed from: c */
        public int m11515c() {
            return this.f9896c;
        }

        public String toString() {
            return this.f9894a + "/" + this.f9895b + '/' + this.f9896c;
        }
    }

    /* renamed from: e00$c */
    /* loaded from: classes.dex */
    private static final class C2412c implements Comparator<C2411b>, Serializable {
        private C2412c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2411b c2411b, C2411b c2411b2) {
            return c2411b.m11515c() - c2411b2.m11515c();
        }
    }

    public e00(C2571hz c2571hz) {
        this.f9892a = c2571hz;
        this.f9893b = new C3280tz(c2571hz);
    }

    /* renamed from: a */
    private static int m11505a(C2568hw c2568hw, C2568hw c2568hw2) {
        return C3228sz.m15461a(C2568hw.m12245a(c2568hw, c2568hw2));
    }

    /* renamed from: a */
    private C2568hw m11506a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4, int i) {
        float f = i;
        float m11505a = m11505a(c2568hw, c2568hw2) / f;
        float m11505a2 = m11505a(c2568hw3, c2568hw4);
        C2568hw c2568hw5 = new C2568hw(c2568hw4.m12248a() + (((c2568hw4.m12248a() - c2568hw3.m12248a()) / m11505a2) * m11505a), c2568hw4.m12249b() + (m11505a * ((c2568hw4.m12249b() - c2568hw3.m12249b()) / m11505a2)));
        float m11505a3 = m11505a(c2568hw, c2568hw3) / f;
        float m11505a4 = m11505a(c2568hw2, c2568hw4);
        C2568hw c2568hw6 = new C2568hw(c2568hw4.m12248a() + (((c2568hw4.m12248a() - c2568hw2.m12248a()) / m11505a4) * m11505a3), c2568hw4.m12249b() + (m11505a3 * ((c2568hw4.m12249b() - c2568hw2.m12249b()) / m11505a4)));
        if (m11510a(c2568hw5)) {
            return (m11510a(c2568hw6) && Math.abs(m11511b(c2568hw3, c2568hw5).m11515c() - m11511b(c2568hw2, c2568hw5).m11515c()) > Math.abs(m11511b(c2568hw3, c2568hw6).m11515c() - m11511b(c2568hw2, c2568hw6).m11515c())) ? c2568hw6 : c2568hw5;
        }
        if (m11510a(c2568hw6)) {
            return c2568hw6;
        }
        return null;
    }

    /* renamed from: a */
    private C2568hw m11507a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4, int i, int i2) {
        float m11505a = m11505a(c2568hw, c2568hw2) / i;
        float m11505a2 = m11505a(c2568hw3, c2568hw4);
        C2568hw c2568hw5 = new C2568hw(c2568hw4.m12248a() + (((c2568hw4.m12248a() - c2568hw3.m12248a()) / m11505a2) * m11505a), c2568hw4.m12249b() + (m11505a * ((c2568hw4.m12249b() - c2568hw3.m12249b()) / m11505a2)));
        float m11505a3 = m11505a(c2568hw, c2568hw3) / i2;
        float m11505a4 = m11505a(c2568hw2, c2568hw4);
        C2568hw c2568hw6 = new C2568hw(c2568hw4.m12248a() + (((c2568hw4.m12248a() - c2568hw2.m12248a()) / m11505a4) * m11505a3), c2568hw4.m12249b() + (m11505a3 * ((c2568hw4.m12249b() - c2568hw2.m12249b()) / m11505a4)));
        if (m11510a(c2568hw5)) {
            return (m11510a(c2568hw6) && Math.abs(i - m11511b(c2568hw3, c2568hw5).m11515c()) + Math.abs(i2 - m11511b(c2568hw2, c2568hw5).m11515c()) > Math.abs(i - m11511b(c2568hw3, c2568hw6).m11515c()) + Math.abs(i2 - m11511b(c2568hw2, c2568hw6).m11515c())) ? c2568hw6 : c2568hw5;
        }
        if (m11510a(c2568hw6)) {
            return c2568hw6;
        }
        return null;
    }

    /* renamed from: a */
    private static C2571hz m11508a(C2571hz c2571hz, C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC3064oz.m14668a().mo13945a(c2571hz, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, c2568hw.m12248a(), c2568hw.m12249b(), c2568hw4.m12248a(), c2568hw4.m12249b(), c2568hw3.m12248a(), c2568hw3.m12249b(), c2568hw2.m12248a(), c2568hw2.m12249b());
    }

    /* renamed from: a */
    private static void m11509a(Map<C2568hw, Integer> map, C2568hw c2568hw) {
        Integer num = map.get(c2568hw);
        map.put(c2568hw, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* renamed from: a */
    private boolean m11510a(C2568hw c2568hw) {
        return c2568hw.m12248a() >= 0.0f && c2568hw.m12248a() < ((float) this.f9892a.m12300h()) && c2568hw.m12249b() > 0.0f && c2568hw.m12249b() < ((float) this.f9892a.m12297c());
    }

    /* renamed from: b */
    private C2411b m11511b(C2568hw c2568hw, C2568hw c2568hw2) {
        int m12248a = (int) c2568hw.m12248a();
        int m12249b = (int) c2568hw.m12249b();
        int m12248a2 = (int) c2568hw2.m12248a();
        int m12249b2 = (int) c2568hw2.m12249b();
        int i = 0;
        boolean z = Math.abs(m12249b2 - m12249b) > Math.abs(m12248a2 - m12248a);
        if (z) {
            m12249b = m12248a;
            m12248a = m12249b;
            m12249b2 = m12248a2;
            m12248a2 = m12249b2;
        }
        int abs = Math.abs(m12248a2 - m12248a);
        int abs2 = Math.abs(m12249b2 - m12249b);
        int i2 = (-abs) / 2;
        int i3 = m12249b < m12249b2 ? 1 : -1;
        int i4 = m12248a >= m12248a2 ? -1 : 1;
        boolean m12295b = this.f9892a.m12295b(z ? m12249b : m12248a, z ? m12248a : m12249b);
        while (m12248a != m12248a2) {
            boolean m12295b2 = this.f9892a.m12295b(z ? m12249b : m12248a, z ? m12248a : m12249b);
            if (m12295b2 != m12295b) {
                i++;
                m12295b = m12295b2;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (m12249b == m12249b2) {
                    break;
                }
                m12249b += i3;
                i2 -= abs;
            }
            m12248a += i4;
        }
        return new C2411b(c2568hw, c2568hw2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [hw] */
    /* JADX WARN: Type inference failed for: r16v3, types: [hw] */
    /* JADX WARN: Type inference failed for: r22v0, types: [hw] */
    /* JADX WARN: Type inference failed for: r23v0, types: [e00] */
    /* JADX WARN: Type inference failed for: r2v4, types: [hw[]] */
    /* JADX WARN: Type inference failed for: r4v6, types: [hw[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hw] */
    /* renamed from: a */
    public C2961mz m11512a() {
        C2568hw c2568hw;
        C2571hz m11508a;
        C2568hw[] m15698a = this.f9893b.m15698a();
        C2568hw c2568hw2 = m15698a[0];
        C2568hw c2568hw3 = m15698a[1];
        C2568hw c2568hw4 = m15698a[2];
        C2568hw c2568hw5 = m15698a[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m11511b(c2568hw2, c2568hw3));
        arrayList.add(m11511b(c2568hw2, c2568hw4));
        arrayList.add(m11511b(c2568hw3, c2568hw5));
        arrayList.add(m11511b(c2568hw4, c2568hw5));
        C2410a c2410a = null;
        Collections.sort(arrayList, new C2412c());
        C2411b c2411b = (C2411b) arrayList.get(0);
        C2411b c2411b2 = (C2411b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m11509a(hashMap, c2411b.m11513a());
        m11509a(hashMap, c2411b.m11514b());
        m11509a(hashMap, c2411b2.m11513a());
        m11509a(hashMap, c2411b2.m11514b());
        Object obj = null;
        Object obj2 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ?? r16 = (C2568hw) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                obj = r16;
            } else if (c2410a == null) {
                c2410a = r16;
            } else {
                obj2 = r16;
            }
        }
        if (c2410a == null || obj == null || obj2 == null) {
            throw C0438aw.m3194a();
        }
        ?? r4 = {c2410a, obj, obj2};
        C2568hw.m12247a(r4);
        ?? r14 = r4[0];
        ?? r22 = r4[1];
        ?? r6 = r4[2];
        C2568hw c2568hw6 = !hashMap.containsKey(c2568hw2) ? c2568hw2 : !hashMap.containsKey(c2568hw3) ? c2568hw3 : !hashMap.containsKey(c2568hw4) ? c2568hw4 : c2568hw5;
        int m11515c = m11511b(r6, c2568hw6).m11515c();
        int m11515c2 = m11511b(r14, c2568hw6).m11515c();
        if ((m11515c & 1) == 1) {
            m11515c++;
        }
        int i = m11515c + 2;
        if ((m11515c2 & 1) == 1) {
            m11515c2++;
        }
        int i2 = m11515c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            c2568hw = r6;
            C2568hw m11507a = m11507a(r22, r14, r6, c2568hw6, i, i2);
            if (m11507a != null) {
                c2568hw6 = m11507a;
            }
            int m11515c3 = m11511b(c2568hw, c2568hw6).m11515c();
            int m11515c4 = m11511b(r14, c2568hw6).m11515c();
            if ((m11515c3 & 1) == 1) {
                m11515c3++;
            }
            int i3 = m11515c3;
            if ((m11515c4 & 1) == 1) {
                m11515c4++;
            }
            m11508a = m11508a(this.f9892a, c2568hw, r22, r14, c2568hw6, i3, m11515c4);
        } else {
            C2568hw m11506a = m11506a(r22, r14, r6, c2568hw6, Math.min(i2, i));
            if (m11506a != null) {
                c2568hw6 = m11506a;
            }
            int max = Math.max(m11511b(r6, c2568hw6).m11515c(), m11511b(r14, c2568hw6).m11515c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            m11508a = m11508a(this.f9892a, r6, r22, r14, c2568hw6, i4, i4);
            c2568hw = r6;
        }
        return new C2961mz(m11508a, new C2568hw[]{c2568hw, r22, r14, c2568hw6});
    }
}
