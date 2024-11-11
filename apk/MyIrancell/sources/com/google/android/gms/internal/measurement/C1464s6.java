package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s6 */
/* loaded from: classes.dex */
public final class C1464s6 {

    /* renamed from: a */
    private static final Class<?> f6890a = m8402d();

    /* renamed from: b */
    private static final AbstractC1319i7<?, ?> f6891b = m8377a(false);

    /* renamed from: c */
    private static final AbstractC1319i7<?, ?> f6892c = m8377a(true);

    /* renamed from: d */
    private static final AbstractC1319i7<?, ?> f6893d = new C1349k7();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8371a(int i, Object obj, InterfaceC1436q6 interfaceC1436q6) {
        return obj instanceof C1272f5 ? AbstractC1503v3.m8530a(i, (C1272f5) obj) : AbstractC1503v3.m8540b(i, (InterfaceC1533x5) obj, interfaceC1436q6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8372a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m8555e = AbstractC1503v3.m8555e(i) * size;
        if (list instanceof InterfaceC1302h5) {
            InterfaceC1302h5 interfaceC1302h5 = (InterfaceC1302h5) list;
            while (i2 < size) {
                Object mo7799b = interfaceC1302h5.mo7799b(i2);
                m8555e += mo7799b instanceof AbstractC1300h3 ? AbstractC1503v3.m8543b((AbstractC1300h3) mo7799b) : AbstractC1503v3.m8545b((String) mo7799b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                m8555e += obj instanceof AbstractC1300h3 ? AbstractC1503v3.m8543b((AbstractC1300h3) obj) : AbstractC1503v3.m8545b((String) obj);
                i2++;
            }
        }
        return m8555e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8373a(int i, List<?> list, InterfaceC1436q6 interfaceC1436q6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8555e = AbstractC1503v3.m8555e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            m8555e += obj instanceof C1272f5 ? AbstractC1503v3.m8531a((C1272f5) obj) : AbstractC1503v3.m8532a((InterfaceC1533x5) obj, interfaceC1436q6);
        }
        return m8555e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8374a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m8375a(list) + (list.size() * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8375a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1362l5) {
            C1362l5 c1362l5 = (C1362l5) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8554d(c1362l5.mo7965b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8554d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static AbstractC1319i7<?, ?> m8376a() {
        return f6891b;
    }

    /* renamed from: a */
    private static AbstractC1319i7<?, ?> m8377a(boolean z) {
        try {
            Class<?> m8406e = m8406e();
            if (m8406e == null) {
                return null;
            }
            return (AbstractC1319i7) m8406e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m8378a(int i, int i2, UB ub, AbstractC1319i7<UT, UB> abstractC1319i7) {
        if (ub == null) {
            ub = abstractC1319i7.mo7919a();
        }
        abstractC1319i7.mo7921a((AbstractC1319i7<UT, UB>) ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <UT, UB> UB m8379a(int i, List<Integer> list, InterfaceC1462s4 interfaceC1462s4, UB ub, AbstractC1319i7<UT, UB> abstractC1319i7) {
        if (interfaceC1462s4 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC1462s4.mo7725a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m8378a(i, intValue, ub, abstractC1319i7);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC1462s4.mo7725a(intValue2)) {
                    ub = (UB) m8378a(i, intValue2, ub, abstractC1319i7);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static void m8380a(int i, List<String> list, InterfaceC1215b8 interfaceC1215b8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7649b(i, list);
    }

    /* renamed from: a */
    public static void m8381a(int i, List<?> list, InterfaceC1215b8 interfaceC1215b8, InterfaceC1436q6 interfaceC1436q6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7650b(i, list, interfaceC1436q6);
    }

    /* renamed from: a */
    public static void m8382a(int i, List<Double> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7665i(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T, FT extends InterfaceC1271f4<FT>> void m8383a(AbstractC1226c4<FT> abstractC1226c4, T t, T t2) {
        C1241d4<FT> mo7577a = abstractC1226c4.mo7577a(t2);
        if (mo7577a.f6562a.isEmpty()) {
            return;
        }
        abstractC1226c4.mo7581b(t).m7760a(mo7577a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T, UT, UB> void m8384a(AbstractC1319i7<UT, UB> abstractC1319i7, T t, T t2) {
        abstractC1319i7.mo7924a(t, abstractC1319i7.mo7929c(abstractC1319i7.mo7920a(t), abstractC1319i7.mo7920a(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> void m8385a(InterfaceC1491u5 interfaceC1491u5, T t, T t2, long j) {
        C1409o7.m8124a(t, j, interfaceC1491u5.mo8480a(C1409o7.m8146f(t, j), C1409o7.m8146f(t2, j)));
    }

    /* renamed from: a */
    public static void m8386a(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC1406o4.class.isAssignableFrom(cls) && (cls2 = f6890a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m8387a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8388b(int i, List<AbstractC1300h3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8555e = size * AbstractC1503v3.m8555e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m8555e += AbstractC1503v3.m8543b(list.get(i2));
        }
        return m8555e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8389b(int i, List<InterfaceC1533x5> list, InterfaceC1436q6 interfaceC1436q6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC1503v3.m8549c(i, list.get(i3), interfaceC1436q6);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8390b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8391b(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8391b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1362l5) {
            C1362l5 c1362l5 = (C1362l5) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8557e(c1362l5.mo7965b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8557e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC1319i7<?, ?> m8392b() {
        return f6892c;
    }

    /* renamed from: b */
    public static void m8393b(int i, List<AbstractC1300h3> list, InterfaceC1215b8 interfaceC1215b8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7641a(i, list);
    }

    /* renamed from: b */
    public static void m8394b(int i, List<?> list, InterfaceC1215b8 interfaceC1215b8, InterfaceC1436q6 interfaceC1436q6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7642a(i, list, interfaceC1436q6);
    }

    /* renamed from: b */
    public static void m8395b(int i, List<Float> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7668l(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8396c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8397c(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8397c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1362l5) {
            C1362l5 c1362l5 = (C1362l5) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8561f(c1362l5.mo7965b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8561f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static AbstractC1319i7<?, ?> m8398c() {
        return f6893d;
    }

    /* renamed from: c */
    public static void m8399c(int i, List<Long> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7664h(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m8400d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8401d(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m8401d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1420p4) {
            C1420p4 c1420p4 = (C1420p4) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8575k(c1420p4.m8179c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8575k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m8402d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m8403d(int i, List<Long> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7660e(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m8404e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8405e(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m8405e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1420p4) {
            C1420p4 c1420p4 = (C1420p4) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8558f(c1420p4.m8179c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8558f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m8406e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m8407e(int i, List<Long> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7654c(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m8408f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8409f(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m8409f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1420p4) {
            C1420p4 c1420p4 = (C1420p4) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8562g(c1420p4.m8179c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8562g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m8410f(int i, List<Long> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7643a(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m8411g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8412g(list) + (size * AbstractC1503v3.m8555e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m8412g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1420p4) {
            C1420p4 c1420p4 = (C1420p4) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8566h(c1420p4.m8179c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1503v3.m8566h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m8413g(int i, List<Long> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7666j(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8414h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1503v3.m8571i(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8415h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m8416h(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7657d(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m8417i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1503v3.m8564g(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m8418i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m8419i(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7669m(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m8420j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC1503v3.m8542b(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m8421j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m8422j(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7663g(i, list, z);
    }

    /* renamed from: k */
    public static void m8423k(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7667k(i, list, z);
    }

    /* renamed from: l */
    public static void m8424l(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7670n(i, list, z);
    }

    /* renamed from: m */
    public static void m8425m(int i, List<Integer> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7662f(i, list, z);
    }

    /* renamed from: n */
    public static void m8426n(int i, List<Boolean> list, InterfaceC1215b8 interfaceC1215b8, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1215b8.mo7651b(i, list, z);
    }
}
