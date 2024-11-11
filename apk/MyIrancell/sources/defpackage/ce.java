package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ce implements od<Uri, InputStream> {
    private final Context a;

    /* loaded from: classes.dex */
    public static class a implements pd<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.pd
        public od<Uri, InputStream> a(sd sdVar) {
            return new ce(this.a);
        }
    }

    public ce(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean a(i iVar) {
        Long l = (Long) iVar.a(cf.d);
        return l != null && l.longValue() == -1;
    }

    @Override // defpackage.od
    public od.a<InputStream> a(Uri uri, int i, int i2, i iVar) {
        if (wa.a(i, i2) && a(iVar)) {
            return new od.a<>(new zh(uri), xa.b(this.a, uri));
        }
        return null;
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return wa.c(uri);
    }
}
