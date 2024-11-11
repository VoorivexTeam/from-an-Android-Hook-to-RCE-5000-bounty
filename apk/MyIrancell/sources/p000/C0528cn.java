package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cn */
/* loaded from: classes.dex */
public final /* synthetic */ class C0528cn implements C2995nn.d {

    /* renamed from: a */
    private final SQLiteDatabase f3028a;

    private C0528cn(SQLiteDatabase sQLiteDatabase) {
        this.f3028a = sQLiteDatabase;
    }

    /* renamed from: a */
    public static C2995nn.d m3697a(SQLiteDatabase sQLiteDatabase) {
        return new C0528cn(sQLiteDatabase);
    }

    @Override // p000.C2995nn.d
    /* renamed from: a */
    public Object mo3698a() {
        return C2995nn.m14361b(this.f3028a);
    }
}
