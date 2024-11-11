package p000;

import android.database.Cursor;
import java.util.List;
import p000.C2995nn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: an */
/* loaded from: classes.dex */
public final /* synthetic */ class C0027an implements C2995nn.b {

    /* renamed from: a */
    private final List f121a;

    /* renamed from: b */
    private final AbstractC3266tl f122b;

    private C0027an(List list, AbstractC3266tl abstractC3266tl) {
        this.f121a = list;
        this.f122b = abstractC3266tl;
    }

    /* renamed from: a */
    public static C2995nn.b m218a(List list, AbstractC3266tl abstractC3266tl) {
        return new C0027an(list, abstractC3266tl);
    }

    @Override // p000.C2995nn.b
    /* renamed from: a */
    public Object mo219a(Object obj) {
        return C2995nn.m14349a(this.f121a, this.f122b, (Cursor) obj);
    }
}
