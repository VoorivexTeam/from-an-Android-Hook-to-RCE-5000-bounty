package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractC0285i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000.C0500c0;
import p000.HandlerC3175rq;

/* renamed from: com.google.android.gms.common.api.internal.e3 */
/* loaded from: classes.dex */
public final class C0894e3 extends Fragment implements InterfaceC0911j {

    /* renamed from: c0 */
    private static WeakHashMap<FragmentActivity, WeakReference<C0894e3>> f5798c0 = new WeakHashMap<>();

    /* renamed from: Z */
    private Map<String, LifecycleCallback> f5799Z = new C0500c0();

    /* renamed from: a0 */
    private int f5800a0 = 0;

    /* renamed from: b0 */
    private Bundle f5801b0;

    /* renamed from: a */
    public static C0894e3 m6686a(FragmentActivity fragmentActivity) {
        C0894e3 c0894e3;
        WeakReference<C0894e3> weakReference = f5798c0.get(fragmentActivity);
        if (weakReference != null && (c0894e3 = weakReference.get()) != null) {
            return c0894e3;
        }
        try {
            C0894e3 c0894e32 = (C0894e3) fragmentActivity.m1738e().mo1809a("SupportLifecycleFragmentImpl");
            if (c0894e32 == null || c0894e32.m1626J()) {
                c0894e32 = new C0894e3();
                AbstractC0285i mo1810a = fragmentActivity.m1738e().mo1810a();
                mo1810a.mo1757a(c0894e32, "SupportLifecycleFragmentImpl");
                mo1810a.mo1765b();
            }
            f5798c0.put(fragmentActivity, new WeakReference<>(c0894e32));
            return c0894e32;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M */
    public final void mo1629M() {
        super.mo1629M();
        this.f5800a0 = 5;
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().m6599b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: R */
    public final void mo1634R() {
        super.mo1634R();
        this.f5800a0 = 3;
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().m6601c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S */
    public final void mo1635S() {
        super.mo1635S();
        this.f5800a0 = 2;
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().mo6602d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T */
    public final void mo1636T() {
        super.mo1636T();
        this.f5800a0 = 4;
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().mo6603e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo6625a(String str, Class<T> cls) {
        return cls.cast(this.f5799Z.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo1649a(int i, int i2, Intent intent) {
        super.mo1649a(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().mo6596a(i, i2, intent);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: a */
    public final void mo6626a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5799Z.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f5799Z.put(str, lifecycleCallback);
        if (this.f5800a0 > 0) {
            new HandlerC3175rq(Looper.getMainLooper()).post(new RunnableC0889d3(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo1665a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1665a(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f5799Z.values().iterator();
        while (it.hasNext()) {
            it.next().mo6598a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0911j
    /* renamed from: b */
    public final /* synthetic */ Activity mo6627b() {
        return m1690e();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c */
    public final void mo1679c(Bundle bundle) {
        super.mo1679c(bundle);
        this.f5800a0 = 1;
        this.f5801b0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f5799Z.entrySet()) {
            entry.getValue().mo6597a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public final void mo1691e(Bundle bundle) {
        super.mo1691e(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f5799Z.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo6600b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }
}
