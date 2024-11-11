package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public class C0312r {

    /* renamed from: a */
    private final HashMap<String, AbstractC0310p> f1923a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0310p m2072a(String str) {
        return this.f1923a.get(str);
    }

    /* renamed from: a */
    public final void m2073a() {
        Iterator<AbstractC0310p> it = this.f1923a.values().iterator();
        while (it.hasNext()) {
            it.next().mo2068a();
        }
        this.f1923a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2074a(String str, AbstractC0310p abstractC0310p) {
        AbstractC0310p put = this.f1923a.put(str, abstractC0310p);
        if (put != null) {
            put.mo2068a();
        }
    }
}
