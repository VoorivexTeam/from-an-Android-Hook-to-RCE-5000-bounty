package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.c;

@Deprecated
/* loaded from: classes.dex */
public class qr extends rr {

    /* loaded from: classes.dex */
    public static class a extends sr {
        public a() {
            super("com.google.android.gms.location.places.ui.PICK_PLACE");
            this.a.putExtra("gmscore_client_jar_version", c.f);
        }

        @Override // defpackage.sr
        public Intent a(Activity activity) {
            return super.a(activity);
        }
    }

    public static com.google.android.gms.location.places.a a(Context context, Intent intent) {
        return rr.a(context, intent);
    }
}
