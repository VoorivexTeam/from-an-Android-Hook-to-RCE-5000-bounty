package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0782a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0786e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s;

/* renamed from: mm */
/* loaded from: classes.dex */
public abstract class AbstractC2948mm {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0800s m14170a(Context context, InterfaceC3132qm interfaceC3132qm, AbstractC0788g abstractC0788g, InterfaceC3404wn interfaceC3404wn) {
        return Build.VERSION.SDK_INT >= 21 ? new C0786e(context, interfaceC3132qm, abstractC0788g) : new C0782a(context, interfaceC3132qm, interfaceC3404wn, abstractC0788g);
    }
}
