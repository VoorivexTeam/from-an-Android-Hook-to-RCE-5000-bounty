package defpackage;

import defpackage.nn;

/* loaded from: classes.dex */
final /* synthetic */ class fn implements nn.d {
    private final sn a;

    private fn(sn snVar) {
        this.a = snVar;
    }

    public static nn.d a(sn snVar) {
        return new fn(snVar);
    }

    @Override // nn.d
    public Object a() {
        return this.a.getWritableDatabase();
    }
}
