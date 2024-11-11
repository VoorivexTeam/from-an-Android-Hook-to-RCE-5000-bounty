package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: mn */
/* loaded from: classes.dex */
final /* synthetic */ class C2949mn implements C2995nn.b {

    /* renamed from: a */
    private final C2995nn f12175a;

    /* renamed from: b */
    private final AbstractC3266tl f12176b;

    private C2949mn(C2995nn c2995nn, AbstractC3266tl abstractC3266tl) {
        this.f12175a = c2995nn;
        this.f12176b = abstractC3266tl;
    }

    /* renamed from: a */
    public static C2995nn.b m14171a(C2995nn c2995nn, AbstractC3266tl abstractC3266tl) {
        return new C2949mn(c2995nn, abstractC3266tl);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14341a(this.f12175a, this.f12176b, (SQLiteDatabase) obj);
    }
}
