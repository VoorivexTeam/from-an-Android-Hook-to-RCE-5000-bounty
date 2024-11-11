package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* loaded from: classes.dex */
public abstract class mm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(Context context, qm qmVar, g gVar, wn wnVar) {
        return Build.VERSION.SDK_INT >= 21 ? new e(context, qmVar, gVar) : new a(context, qmVar, wnVar, gVar);
    }
}
