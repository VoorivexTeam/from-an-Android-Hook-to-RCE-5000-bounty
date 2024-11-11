package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000.C0500c0;
import p000.HandlerC3175rq;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
/* loaded from: classes.dex */
public final class FragmentC0879b3 extends Fragment implements InterfaceC0911j {

    /* renamed from: e */
    private static WeakHashMap<Activity, WeakReference<FragmentC0879b3>> f5750e = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f5751b = new C0500c0();

    /* renamed from: c */
    private int f5752c = 0;

    /* renamed from: d */
    private Bundle f5753d;

    /* renamed from: a */
    public static FragmentC0879b3 m6623a(Activity activity) {
        FragmentC0879b3 fragmentC0879b3;
        WeakReference<FragmentC0879b3> weakReference = f5750e.get(activity);
        if (weakReference != null && (fragmentC0879b3 = weakReference.get()) != null) {
            return fragmentC0879b3;
        }
        try {
            FragmentC0879b3 fragmentC0879b32 = (FragmentC0879b3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC0879b32 == null || fragmentC0879b32.isRemoving()) {
                fragmentC0879b32 = new FragmentC0879b3();
                activity.getFragmentManager().beginTransaction().add(fragmentC0879b32, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f5750e.put(activity, new WeakReference<>(fragmentC0879b32));
            return fragmentC0879b32;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo6625a(String str, Class<T> cls) {
        return cls.cast(this.f5751b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: a */
    public final void mo6626a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5751b.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f5751b.put(str, lifecycleCallback);
        if (this.f5752c > 0) {
            new HandlerC3175rq(Looper.getMainLooper()).post(new RunnableC0884c3(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: b */
    public final Activity mo6627b() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6598a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6596a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5752c = 1;
        this.f5753d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f5751b.entrySet()) {
            entry.getValue().mo6597a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5752c = 5;
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().m6599b();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f5752c = 3;
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().m6601c();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f5751b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo6600b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5752c = 2;
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6602d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f5752c = 4;
        Iterator<LifecycleCallback> it = this.f5751b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6603e();
        }
    }
}
