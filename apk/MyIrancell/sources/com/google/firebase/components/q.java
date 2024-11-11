package com.google.firebase.components;

import defpackage.av;
import defpackage.zu;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    private final Map.Entry b;
    private final zu c;

    private q(Map.Entry entry, zu zuVar) {
        this.b = entry;
        this.c = zuVar;
    }

    public static Runnable a(Map.Entry entry, zu zuVar) {
        return new q(entry, zuVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((av) this.b.getKey()).a(this.c);
    }
}
