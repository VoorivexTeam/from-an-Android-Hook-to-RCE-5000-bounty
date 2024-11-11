package p000;

import android.content.Context;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0863e;

/* renamed from: fo */
/* loaded from: classes.dex */
public abstract class AbstractC2480fo extends C0863e<C0859a.d.C3561d> {

    /* renamed from: j */
    private static final C0859a.g<C3446xp> f10141j = new C0859a.g<>();

    /* renamed from: k */
    private static final C0859a.a<C3446xp, C0859a.d.C3561d> f10142k;

    /* renamed from: l */
    private static final C0859a<C0859a.d.C3561d> f10143l;

    static {
        C2520go c2520go = new C2520go();
        f10142k = c2520go;
        f10143l = new C0859a<>("SmsRetriever.API", c2520go, f10141j);
    }

    public AbstractC2480fo(Context context) {
        super(context, f10143l, (C0859a.d) null, C0863e.a.f5691c);
    }

    /* renamed from: h */
    public abstract AbstractC2871ks<Void> mo11795h();
}
