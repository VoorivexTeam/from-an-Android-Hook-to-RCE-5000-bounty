package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.w */
/* loaded from: classes.dex */
public class C1061w {

    /* renamed from: a */
    private final Resources f6266a;

    /* renamed from: b */
    private final String f6267b;

    public C1061w(Context context) {
        C1057u.m7286a(context);
        Resources resources = context.getResources();
        this.f6266a = resources;
        this.f6267b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    @Nullable
    /* renamed from: a */
    public String m7303a(String str) {
        int identifier = this.f6266a.getIdentifier(str, "string", this.f6267b);
        if (identifier == 0) {
            return null;
        }
        return this.f6266a.getString(identifier);
    }
}
