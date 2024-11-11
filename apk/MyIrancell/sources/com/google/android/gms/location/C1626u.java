package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.u */
/* loaded from: classes.dex */
final class C1626u implements Comparator<ActivityTransition> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int m8936j = activityTransition3.m8936j();
        int m8936j2 = activityTransition4.m8936j();
        if (m8936j != m8936j2) {
            return m8936j < m8936j2 ? -1 : 1;
        }
        int m8937k = activityTransition3.m8937k();
        int m8937k2 = activityTransition4.m8937k();
        if (m8937k == m8937k2) {
            return 0;
        }
        return m8937k < m8937k2 ? -1 : 1;
    }
}
