package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: androidx.transition.w */
/* loaded from: classes.dex */
class C0407w {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0406v m3058a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C0405u(viewGroup) : C0404t.m3055a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3059a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0409y.m3063a(viewGroup, z);
        } else {
            C0408x.m3061a(viewGroup, z);
        }
    }
}
