package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes.dex */
final class C1067z extends AbstractDialogInterfaceOnClickListenerC1026g {

    /* renamed from: b */
    private final /* synthetic */ Intent f6272b;

    /* renamed from: c */
    private final /* synthetic */ Activity f6273c;

    /* renamed from: d */
    private final /* synthetic */ int f6274d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1067z(Intent intent, Activity activity, int i) {
        this.f6272b = intent;
        this.f6273c = activity;
        this.f6274d = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1026g
    /* renamed from: a */
    public final void mo7042a() {
        Intent intent = this.f6272b;
        if (intent != null) {
            this.f6273c.startActivityForResult(intent, this.f6274d);
        }
    }
}
