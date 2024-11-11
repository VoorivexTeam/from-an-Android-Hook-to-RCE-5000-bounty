package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;

/* loaded from: classes.dex */
public abstract class fo extends e<a.d.C0043d> {
    private static final a.g<xp> j = new a.g<>();
    private static final a.AbstractC0041a<xp, a.d.C0043d> k;
    private static final a<a.d.C0043d> l;

    static {
        go goVar = new go();
        k = goVar;
        l = new a<>("SmsRetriever.API", goVar, j);
    }

    public fo(Context context) {
        super(context, l, (a.d) null, e.a.c);
    }

    public abstract ks<Void> h();
}
