package p000;

import android.database.Cursor;
import java.util.Map;
import p000.C2995nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bn */
/* loaded from: classes.dex */
public final /* synthetic */ class C0486bn implements C2995nn.b {

    /* renamed from: a */
    private final Map f2816a;

    private C0486bn(Map map) {
        this.f2816a = map;
    }

    /* renamed from: a */
    public static C2995nn.b m3434a(Map map) {
        return new C0486bn(map);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14350a(this.f2816a, (Cursor) obj);
    }
}
