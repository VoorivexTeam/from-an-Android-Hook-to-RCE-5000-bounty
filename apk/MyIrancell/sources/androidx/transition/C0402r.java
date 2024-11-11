package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.r */
/* loaded from: classes.dex */
public class C0402r {

    /* renamed from: b */
    public View f2525b;

    /* renamed from: a */
    public final Map<String, Object> f2524a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC0396l> f2526c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C0402r)) {
            return false;
        }
        C0402r c0402r = (C0402r) obj;
        return this.f2525b == c0402r.f2525b && this.f2524a.equals(c0402r.f2524a);
    }

    public int hashCode() {
        return (this.f2525b.hashCode() * 31) + this.f2524a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2525b + "\n") + "    values:";
        for (String str2 : this.f2524a.keySet()) {
            str = str + "    " + str2 + ": " + this.f2524a.get(str2) + "\n";
        }
        return str;
    }
}
