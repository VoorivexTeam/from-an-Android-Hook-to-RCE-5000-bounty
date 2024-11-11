package com.google.android.gms.common.data;

import com.google.android.gms.common.api.InterfaceC0979j;
import java.io.Closeable;

/* renamed from: com.google.android.gms.common.data.b */
/* loaded from: classes.dex */
public interface InterfaceC0997b<T> extends InterfaceC0979j, Closeable, Iterable<T> {
    T get(int i);

    int getCount();
}
