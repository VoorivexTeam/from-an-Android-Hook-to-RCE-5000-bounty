package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: xm */
/* loaded from: classes.dex */
final /* synthetic */ class C3443xm implements C2995nn.b {

    /* renamed from: a */
    private final C2995nn f14057a;

    /* renamed from: b */
    private final AbstractC3266tl f14058b;

    private C3443xm(C2995nn c2995nn, AbstractC3266tl abstractC3266tl) {
        this.f14057a = c2995nn;
        this.f14058b = abstractC3266tl;
    }

    /* renamed from: a */
    public static C2995nn.b m16501a(C2995nn c2995nn, AbstractC3266tl abstractC3266tl) {
        return new C3443xm(c2995nn, abstractC3266tl);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14362b(this.f14057a, this.f14058b, (SQLiteDatabase) obj);
    }
}
