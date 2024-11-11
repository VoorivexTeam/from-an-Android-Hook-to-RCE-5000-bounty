package com.comviva.webaxn.utils;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.comviva.webaxn.utils.v0 */
/* loaded from: classes.dex */
public class C0748v0 {

    /* renamed from: b */
    private static C0748v0 f5191b;

    /* renamed from: a */
    private HashMap<String, String> f5192a;

    private C0748v0(Context context) {
    }

    /* renamed from: a */
    public static C0748v0 m6082a(Context context) {
        if (f5191b == null) {
            f5191b = new C0748v0(context);
        }
        return f5191b;
    }

    /* renamed from: a */
    public void m6083a() {
        if (f5191b != null) {
            f5191b = null;
        }
        HashMap<String, String> hashMap = this.f5192a;
        if (hashMap != null) {
            hashMap.clear();
            this.f5192a = null;
        }
    }
}
