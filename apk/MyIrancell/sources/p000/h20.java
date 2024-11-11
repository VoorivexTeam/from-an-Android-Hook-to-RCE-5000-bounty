package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class h20 {

    /* renamed from: a */
    private final Map<Integer, Integer> f10370a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12085a(int i) {
        Integer num = this.f10370a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f10370a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m12086a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f10370a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i) {
            }
            arrayList.add(entry.getKey());
        }
        return d20.m11252a(arrayList);
    }
}
