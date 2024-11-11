package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
/* loaded from: classes.dex */
public final class C1105k {
    /* renamed from: a */
    public static void m7392a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
