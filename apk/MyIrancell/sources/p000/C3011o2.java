package p000;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: o2 */
/* loaded from: classes.dex */
public final class C3011o2 {

    /* renamed from: a */
    private Object f12386a;

    private C3011o2(Object obj) {
        this.f12386a = obj;
    }

    /* renamed from: a */
    public static C3011o2 m14413a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new C3011o2(PointerIcon.getSystemIcon(context, i)) : new C3011o2(null);
    }

    /* renamed from: a */
    public Object m14414a() {
        return this.f12386a;
    }
}
