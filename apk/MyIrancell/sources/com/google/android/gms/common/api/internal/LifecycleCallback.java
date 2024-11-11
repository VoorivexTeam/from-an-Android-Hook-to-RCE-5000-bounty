package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: b */
    protected final InterfaceC0911j f5733b;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC0911j interfaceC0911j) {
        this.f5733b = interfaceC0911j;
    }

    /* renamed from: a */
    public static InterfaceC0911j m6593a(Activity activity) {
        return m6594a(new C0907i(activity));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static InterfaceC0911j m6594a(C0907i c0907i) {
        if (c0907i.m6778c()) {
            return C0894e3.m6686a(c0907i.m6777b());
        }
        if (c0907i.m6779d()) {
            return FragmentC0879b3.m6623a(c0907i.m6776a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC0911j getChimeraLifecycleFragmentImpl(C0907i c0907i) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public Activity m6595a() {
        return this.f5733b.mo6627b();
    }

    /* renamed from: a */
    public void mo6596a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo6597a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6598a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void m6599b() {
    }

    /* renamed from: b */
    public void mo6600b(Bundle bundle) {
    }

    /* renamed from: c */
    public void m6601c() {
    }

    /* renamed from: d */
    public void mo6602d() {
    }

    /* renamed from: e */
    public void mo6603e() {
    }
}
