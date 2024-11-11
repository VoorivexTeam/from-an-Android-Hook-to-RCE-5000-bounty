package com.google.android.gms.common.data;

import com.google.android.gms.common.api.j;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b<T> extends j, Closeable, Iterable<T> {
    T get(int i);

    int getCount();
}
