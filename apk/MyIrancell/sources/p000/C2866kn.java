package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.C2995nn;

/* renamed from: kn */
/* loaded from: classes.dex */
final /* synthetic */ class C2866kn implements C2995nn.b {

    /* renamed from: a */
    private final String f11766a;

    private C2866kn(String str) {
        this.f11766a = str;
    }

    /* renamed from: a */
    public static C2995nn.b m13743a(String str) {
        return new C2866kn(str);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14347a(this.f11766a, (SQLiteDatabase) obj);
    }
}
