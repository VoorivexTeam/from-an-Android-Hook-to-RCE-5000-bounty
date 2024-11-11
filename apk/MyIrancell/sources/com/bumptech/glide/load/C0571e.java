package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
/* loaded from: classes.dex */
public final class C0571e extends IOException {
    public C0571e(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public C0571e(String str) {
        this(str, -1);
    }

    public C0571e(String str, int i) {
        this(str, i, null);
    }

    public C0571e(String str, int i, Throwable th) {
        super(str, th);
    }
}
