package defpackage;

import android.content.Context;
import defpackage.rc;
import java.io.File;

/* loaded from: classes.dex */
public final class tc extends rc {

    /* loaded from: classes.dex */
    class a implements rc.a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // rc.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public tc(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public tc(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
