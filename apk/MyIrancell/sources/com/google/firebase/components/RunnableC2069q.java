package com.google.firebase.components;

import java.util.Map;
import p000.C3542zu;
import p000.InterfaceC0437av;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2069q implements Runnable {

    /* renamed from: b */
    private final Map.Entry f8840b;

    /* renamed from: c */
    private final C3542zu f8841c;

    private RunnableC2069q(Map.Entry entry, C3542zu c3542zu) {
        this.f8840b = entry;
        this.f8841c = c3542zu;
    }

    /* renamed from: a */
    public static Runnable m10577a(Map.Entry entry, C3542zu c3542zu) {
        return new RunnableC2069q(entry, c3542zu);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InterfaceC0437av) this.f8840b.getKey()).mo3193a(this.f8841c);
    }
}
