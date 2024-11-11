package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: in */
/* loaded from: classes.dex */
final /* synthetic */ class C2601in implements C2995nn.b {

    /* renamed from: a */
    private final C2995nn f10656a;

    /* renamed from: b */
    private final AbstractC3266tl f10657b;

    /* renamed from: c */
    private final AbstractC3089pl f10658c;

    private C2601in(C2995nn c2995nn, AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl) {
        this.f10656a = c2995nn;
        this.f10657b = abstractC3266tl;
        this.f10658c = abstractC3089pl;
    }

    /* renamed from: a */
    public static C2995nn.b m12493a(C2995nn c2995nn, AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl) {
        return new C2601in(c2995nn, abstractC3266tl, abstractC3089pl);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14344a(this.f10656a, this.f10657b, this.f10658c, (SQLiteDatabase) obj);
    }
}
