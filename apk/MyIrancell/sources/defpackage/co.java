package defpackage;

import android.util.SparseArray;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class co {
    private static SparseArray<hk> a = new SparseArray<>();
    private static EnumMap<hk, Integer> b;

    static {
        EnumMap<hk, Integer> enumMap = new EnumMap<>((Class<hk>) hk.class);
        b = enumMap;
        enumMap.put((EnumMap<hk, Integer>) hk.DEFAULT, (hk) 0);
        b.put((EnumMap<hk, Integer>) hk.VERY_LOW, (hk) 1);
        b.put((EnumMap<hk, Integer>) hk.HIGHEST, (hk) 2);
        for (hk hkVar : b.keySet()) {
            a.append(b.get(hkVar).intValue(), hkVar);
        }
    }

    public static int a(hk hkVar) {
        Integer num = b.get(hkVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + hkVar);
    }

    public static hk a(int i) {
        hk hkVar = a.get(i);
        if (hkVar != null) {
            return hkVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
