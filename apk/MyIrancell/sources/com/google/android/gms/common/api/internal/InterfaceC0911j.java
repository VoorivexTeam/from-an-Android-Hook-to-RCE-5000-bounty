package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes.dex */
public interface InterfaceC0911j {
    /* renamed from: a */
    <T extends LifecycleCallback> T mo6625a(String str, Class<T> cls);

    /* renamed from: a */
    void mo6626a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    Activity mo6627b();

    void startActivityForResult(Intent intent, int i);
}
