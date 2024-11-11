package p000;

import android.os.Build;
import android.view.ViewGroup;
import androidx.core.R$id;

/* renamed from: s2 */
/* loaded from: classes.dex */
public final class C3188s2 {
    /* renamed from: a */
    public static boolean m15321a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R$id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C3107q2.m14924p(viewGroup) == null) ? false : true;
    }
}
