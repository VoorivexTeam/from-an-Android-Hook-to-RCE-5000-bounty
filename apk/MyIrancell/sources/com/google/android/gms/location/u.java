package com.google.android.gms.location;

import java.util.Comparator;

/* loaded from: classes.dex */
final class u implements Comparator<ActivityTransition> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int j = activityTransition3.j();
        int j2 = activityTransition4.j();
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        int k = activityTransition3.k();
        int k2 = activityTransition4.k();
        if (k == k2) {
            return 0;
        }
        return k < k2 ? -1 : 1;
    }
}
