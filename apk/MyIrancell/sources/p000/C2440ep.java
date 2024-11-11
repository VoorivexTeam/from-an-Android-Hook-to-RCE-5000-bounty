package p000;

import android.content.Context;

/* renamed from: ep */
/* loaded from: classes.dex */
public class C2440ep {

    /* renamed from: b */
    private static C2440ep f10028b = new C2440ep();

    /* renamed from: a */
    private C2397dp f10029a = null;

    /* renamed from: a */
    public static C2397dp m11628a(Context context) {
        return f10028b.m11629b(context);
    }

    /* renamed from: b */
    private final synchronized C2397dp m11629b(Context context) {
        if (this.f10029a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f10029a = new C2397dp(context);
        }
        return this.f10029a;
    }
}
