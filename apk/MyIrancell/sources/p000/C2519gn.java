package p000;

import android.database.Cursor;
import p000.C2995nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gn */
/* loaded from: classes.dex */
public final /* synthetic */ class C2519gn implements C2995nn.b {

    /* renamed from: a */
    private static final C2519gn f10334a = new C2519gn();

    private C2519gn() {
    }

    /* renamed from: a */
    public static C2995nn.b m12035a() {
        return f10334a;
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
