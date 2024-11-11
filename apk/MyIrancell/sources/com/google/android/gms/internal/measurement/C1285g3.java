package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* loaded from: classes.dex */
public final class C1285g3 extends AbstractC1315i3 {

    /* renamed from: b */
    private int f6621b = 0;

    /* renamed from: c */
    private final int f6622c;

    /* renamed from: d */
    private final /* synthetic */ AbstractC1300h3 f6623d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1285g3(AbstractC1300h3 abstractC1300h3) {
        this.f6623d = abstractC1300h3;
        this.f6622c = this.f6623d.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6621b < this.f6622c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1375m3
    public final byte zza() {
        int i = this.f6621b;
        if (i >= this.f6622c) {
            throw new NoSuchElementException();
        }
        this.f6621b = i + 1;
        return this.f6623d.mo7879b(i);
    }
}
