package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.rq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e3 extends Fragment implements j {
    private static WeakHashMap<FragmentActivity, WeakReference<e3>> c0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> Z = new defpackage.c0();
    private int a0 = 0;
    private Bundle b0;

    public static e3 a(FragmentActivity fragmentActivity) {
        e3 e3Var;
        WeakReference<e3> weakReference = c0.get(fragmentActivity);
        if (weakReference != null && (e3Var = weakReference.get()) != null) {
            return e3Var;
        }
        try {
            e3 e3Var2 = (e3) fragmentActivity.e().a("SupportLifecycleFragmentImpl");
            if (e3Var2 == null || e3Var2.J()) {
                e3Var2 = new e3();
                androidx.fragment.app.i a = fragmentActivity.e().a();
                a.a(e3Var2, "SupportLifecycleFragmentImpl");
                a.b();
            }
            c0.put(fragmentActivity, new WeakReference<>(e3Var2));
            return e3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M() {
        super.M();
        this.a0 = 5;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void R() {
        super.R();
        this.a0 = 3;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void S() {
        super.S();
        this.a0 = 2;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void T() {
        super.T();
        this.a0 = 4;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.Z.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().a(i, i2, intent);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.Z.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.Z.put(str, lifecycleCallback);
        if (this.a0 > 0) {
            new rq(Looper.getMainLooper()).post(new d3(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final /* synthetic */ Activity b() {
        return e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.a0 = 1;
        this.b0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }
}
