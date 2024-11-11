package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public class i {
    private final Object a;

    public i(Activity activity) {
        com.google.android.gms.common.internal.u.a(activity, "Activity must not be null");
        this.a = activity;
    }

    public Activity a() {
        return (Activity) this.a;
    }

    public FragmentActivity b() {
        return (FragmentActivity) this.a;
    }

    public boolean c() {
        return this.a instanceof FragmentActivity;
    }

    public final boolean d() {
        return this.a instanceof Activity;
    }
}
