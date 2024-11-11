package p000;

import android.content.Context;
import java.io.File;
import p000.C3161rc;

/* renamed from: tc */
/* loaded from: classes.dex */
public final class C3257tc extends C3161rc {

    /* renamed from: tc$a */
    /* loaded from: classes.dex */
    class a implements C3161rc.a {

        /* renamed from: a */
        final /* synthetic */ Context f13301a;

        /* renamed from: b */
        final /* synthetic */ String f13302b;

        a(Context context, String str) {
            this.f13301a = context;
            this.f13302b = str;
        }

        @Override // p000.C3161rc.a
        /* renamed from: a */
        public File mo15258a() {
            File cacheDir = this.f13301a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f13302b != null ? new File(cacheDir, this.f13302b) : cacheDir;
        }
    }

    public C3257tc(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C3257tc(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
