package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import androidx.core.R$id;

/* loaded from: classes.dex */
public final class s2 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R$id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && q2.p(viewGroup) == null) ? false : true;
    }
}
