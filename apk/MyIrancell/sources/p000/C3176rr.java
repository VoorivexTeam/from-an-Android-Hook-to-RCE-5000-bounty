package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.C1054c;
import com.google.android.gms.location.places.InterfaceC1601a;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rr */
/* loaded from: classes.dex */
public class C3176rr {
    /* renamed from: a */
    public static InterfaceC1601a m15292a(Context context, Intent intent) {
        C1057u.m7287a(intent, "intent must not be null");
        C1057u.m7287a(context, "context must not be null");
        return (InterfaceC1601a) C1054c.m7280a(intent, "selected_place", PlaceEntity.CREATOR);
    }
}
