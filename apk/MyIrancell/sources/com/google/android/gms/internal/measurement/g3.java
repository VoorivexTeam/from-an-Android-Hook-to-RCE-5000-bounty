package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g3 extends i3 {
    private int b = 0;
    private final int c;
    private final /* synthetic */ h3 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g3(h3 h3Var) {
        this.d = h3Var;
        this.c = this.d.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }

    @Override // com.google.android.gms.internal.measurement.m3
    public final byte zza() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.d.b(i);
    }
}
