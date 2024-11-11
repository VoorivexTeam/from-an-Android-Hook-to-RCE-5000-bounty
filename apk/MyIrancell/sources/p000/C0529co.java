package p000;

import android.util.SparseArray;
import java.util.EnumMap;

/* renamed from: co */
/* loaded from: classes.dex */
public final class C0529co {

    /* renamed from: a */
    private static SparseArray<EnumC2556hk> f3029a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<EnumC2556hk, Integer> f3030b;

    static {
        EnumMap<EnumC2556hk, Integer> enumMap = new EnumMap<>((Class<EnumC2556hk>) EnumC2556hk.class);
        f3030b = enumMap;
        enumMap.put((EnumMap<EnumC2556hk, Integer>) EnumC2556hk.DEFAULT, (EnumC2556hk) 0);
        f3030b.put((EnumMap<EnumC2556hk, Integer>) EnumC2556hk.VERY_LOW, (EnumC2556hk) 1);
        f3030b.put((EnumMap<EnumC2556hk, Integer>) EnumC2556hk.HIGHEST, (EnumC2556hk) 2);
        for (EnumC2556hk enumC2556hk : f3030b.keySet()) {
            f3029a.append(f3030b.get(enumC2556hk).intValue(), enumC2556hk);
        }
    }

    /* renamed from: a */
    public static int m3699a(EnumC2556hk enumC2556hk) {
        Integer num = f3030b.get(enumC2556hk);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2556hk);
    }

    /* renamed from: a */
    public static EnumC2556hk m3700a(int i) {
        EnumC2556hk enumC2556hk = f3029a.get(i);
        if (enumC2556hk != null) {
            return enumC2556hk;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
