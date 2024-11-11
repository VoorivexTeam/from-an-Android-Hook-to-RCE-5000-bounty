package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes.dex */
public class C0907i {

    /* renamed from: a */
    private final Object f5860a;

    public C0907i(Activity activity) {
        C1057u.m7287a(activity, "Activity must not be null");
        this.f5860a = activity;
    }

    /* renamed from: a */
    public Activity m6776a() {
        return (Activity) this.f5860a;
    }

    /* renamed from: b */
    public FragmentActivity m6777b() {
        return (FragmentActivity) this.f5860a;
    }

    /* renamed from: c */
    public boolean m6778c() {
        return this.f5860a instanceof FragmentActivity;
    }

    /* renamed from: d */
    public final boolean m6779d() {
        return this.f5860a instanceof Activity;
    }
}
