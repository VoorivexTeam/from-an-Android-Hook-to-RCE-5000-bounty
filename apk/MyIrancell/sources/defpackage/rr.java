package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.places.a;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class rr {
    public static a a(Context context, Intent intent) {
        u.a(intent, "intent must not be null");
        u.a(context, "context must not be null");
        return (a) c.a(intent, "selected_place", PlaceEntity.CREATOR);
    }
}
