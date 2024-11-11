package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC0911j;

/* renamed from: com.google.android.gms.common.internal.a0 */
/* loaded from: classes.dex */
final class C1015a0 extends AbstractDialogInterfaceOnClickListenerC1026g {

    /* renamed from: b */
    private final /* synthetic */ Intent f6143b;

    /* renamed from: c */
    private final /* synthetic */ InterfaceC0911j f6144c;

    /* renamed from: d */
    private final /* synthetic */ int f6145d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1015a0(Intent intent, InterfaceC0911j interfaceC0911j, int i) {
        this.f6143b = intent;
        this.f6144c = interfaceC0911j;
        this.f6145d = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1026g
    /* renamed from: a */
    public final void mo7042a() {
        Intent intent = this.f6143b;
        if (intent != null) {
            this.f6144c.startActivityForResult(intent, this.f6145d);
        }
    }
}
