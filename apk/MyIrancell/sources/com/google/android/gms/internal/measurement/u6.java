package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
public final class u6<FieldDescriptorType> extends r6<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u6(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.r6
    public final void a() {
        if (!b()) {
            for (int i = 0; i < c(); i++) {
                Map.Entry<FieldDescriptorType, Object> a = a(i);
                if (((f4) a.getKey()).a()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : d()) {
                if (((f4) entry.getKey()).a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
