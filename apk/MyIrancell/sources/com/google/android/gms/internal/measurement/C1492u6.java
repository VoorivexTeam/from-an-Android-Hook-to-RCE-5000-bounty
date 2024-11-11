package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* loaded from: classes.dex */
public final class C1492u6<FieldDescriptorType> extends C1450r6<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1492u6(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.C1450r6
    /* renamed from: a */
    public final void mo8315a() {
        if (!m8316b()) {
            for (int i = 0; i < m8317c(); i++) {
                Map.Entry<FieldDescriptorType, Object> m8314a = m8314a(i);
                if (((InterfaceC1271f4) m8314a.getKey()).mo7824a()) {
                    m8314a.setValue(Collections.unmodifiableList((List) m8314a.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m8318d()) {
                if (((InterfaceC1271f4) entry.getKey()).mo7824a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8315a();
    }
}
