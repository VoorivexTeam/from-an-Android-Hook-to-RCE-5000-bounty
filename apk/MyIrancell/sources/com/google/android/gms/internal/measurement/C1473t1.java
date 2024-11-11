package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* loaded from: classes.dex */
public final class C1473t1 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f6905a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1473t1(Map<String, Map<String, String>> map) {
        this.f6905a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String m8475a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.f6905a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return map.get(str3);
    }
}
