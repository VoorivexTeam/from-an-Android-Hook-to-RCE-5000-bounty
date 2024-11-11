package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: wm */
/* loaded from: classes.dex */
final /* synthetic */ class C3403wm implements C2995nn.b {

    /* renamed from: a */
    private final long f13962a;

    /* renamed from: b */
    private final AbstractC3266tl f13963b;

    private C3403wm(long j, AbstractC3266tl abstractC3266tl) {
        this.f13962a = j;
        this.f13963b = abstractC3266tl;
    }

    /* renamed from: a */
    public static C2995nn.b m16383a(long j, AbstractC3266tl abstractC3266tl) {
        return new C3403wm(j, abstractC3266tl);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14345a(this.f13962a, this.f13963b, (SQLiteDatabase) obj);
    }
}
