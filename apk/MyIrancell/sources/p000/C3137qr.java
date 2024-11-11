package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.location.places.InterfaceC1601a;

@Deprecated
/* renamed from: qr */
/* loaded from: classes.dex */
public class C3137qr extends C3176rr {

    /* renamed from: qr$a */
    /* loaded from: classes.dex */
    public static class a extends C3220sr {
        public a() {
            super("com.google.android.gms.location.places.ui.PICK_PLACE");
            this.f13142a.putExtra("gmscore_client_jar_version", C0993c.f6046f);
        }

        @Override // p000.C3220sr
        /* renamed from: a */
        public Intent mo15131a(Activity activity) {
            return super.mo15131a(activity);
        }
    }

    /* renamed from: a */
    public static InterfaceC1601a m15130a(Context context, Intent intent) {
        return C3176rr.m15292a(context, intent);
    }
}
